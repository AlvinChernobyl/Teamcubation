package br.com.teamcubation.exercicios.estruturadados;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<String> comandos = new ArrayDeque<>();

        while (true) {
            System.out.println("Digite um comando (ou 'CTRL + Z' para desfazer):");
            String comando = sc.nextLine();

            if (comando.equalsIgnoreCase("CTRL + Z")) {
                if (!comandos.isEmpty()) {
                    String ultimoComando = comandos.pop();
                    System.out.println("Último comando desfeito: " + ultimoComando);
                } else {
                    System.out.println("Não há comandos para desfazer.");
                }
            } else {
                comandos.push(comando);
            }
        }
    }
}
