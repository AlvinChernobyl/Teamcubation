package br.com.teamcubation.exercicios.lacorepeticao;

import java.util.Scanner;

public class VerificarNumeroPrimo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para verificar se é primo: ");
        int numero = sc.nextInt();
        sc.close();

        boolean ehPrimo = true;
        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
}
