package br.com.teamcubation.exercicios.lacorepeticao;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos termos da sequência de Fibonacci você deseja imprimir: ");
        int n = sc.nextInt();
        sc.close();

        int anterior1 = 0, anterior2 = 1;

        System.out.println("Os " + n + " primeiros termos da sequência de Fibonacci são:");
        for (int i = 1; i <= n; i++) {
            System.out.print(anterior1 + " ");

            int proximo = anterior1 + anterior2;
            anterior1 = anterior2;
            anterior2 = proximo;
        }
    }
}
