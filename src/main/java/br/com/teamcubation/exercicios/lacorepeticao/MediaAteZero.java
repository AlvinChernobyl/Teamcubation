package br.com.teamcubation.exercicios.lacorepeticao;

import java.util.Scanner;

public class MediaAteZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int contador = 0;
        int numero;

        do {
            System.out.print("Digite um número (ou zero para encerrar): ");
            numero = sc.nextInt();

            if (numero != 0) {
                soma += numero;
                contador++;
            }
        } while (numero != 0);

        sc.close();

        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média dos números digitados é: " + media);
        } else {
            System.out.println("Nenhum número foi digitado para calcular a média.");
        }
    }
}
