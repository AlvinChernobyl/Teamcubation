package br.com.teamcubation.exercicios.lacorepeticao;

import java.util.Scanner;

public class SomaNumerosAteNegativo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int numero;

        do {
            System.out.print("Digite um número (ou um número negativo para encerrar): ");
            numero = sc.nextInt();

            if (numero >= 0) {
                soma += numero;
            }
        } while (numero >= 0);

        sc.close();
        System.out.println("A soma dos números digitados é: " + soma);
    }
}
