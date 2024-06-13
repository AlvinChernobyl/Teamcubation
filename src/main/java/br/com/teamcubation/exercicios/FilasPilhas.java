package br.com.teamcubation.exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class FilasPilhas {
    public static void main(String[] args) {
        String[] fila = new String[5];
        int inicio = 0;
        int fim = 0;

        do {
            System.out.println("Digite um dado:");

            String entrada = (new Scanner(System.in)).nextLine();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            if (entrada.equalsIgnoreCase("remover")) {
                if (inicio < fim) {
                    System.out.println(fila[inicio]);
                    fila[inicio] = null;
                    inicio++;

                    if (inicio == fila.length / 2) {
                        fila = Arrays.copyOfRange(fila, inicio, fim);
                        fim -= inicio;
                        inicio = 0;
                    }
                } else {
                    System.out.println("A fila está vazia.");
                }
            } else {
                if (fim == fila.length) {
                    fila = Arrays.copyOf(fila, fila.length + 5);
                }
                fila[fim] = entrada;
                fim++;
            }

            System.out.println(Arrays.toString(fila));
        } while (true);
    }

}
