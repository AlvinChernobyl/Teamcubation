package br.com.teamcubation.exercicios.lacorepeticao;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumerosAteRepetido {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        Set<Integer> numerosLidos = new HashSet<>();
        int numero;
        int contador = 0;

        do {
            System.out.print("Digite um número (ou um número repetido para encerrar): ");
            numero = sc.nextInt();
            contador++;

            if (!numerosLidos.add(numero)) {
                break; // Se o número já foi lido antes, encerra o loop
            }

        } while (true);

        sc.close();

        if (contador == 1) {
            System.out.println("Você digitou apenas um número.");
        } else {
            System.out.println("Você digitou " + (contador - 1) + " números antes de inserir um número repetido.");
        }
    }
}
