package br.com.teamcubation.exercicios.lacorepeticao;

import java.util.Scanner;

public class DivisoresDeUmNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        scanner.close();

        System.out.print("Os divisores de " + numero + " são: ");
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
