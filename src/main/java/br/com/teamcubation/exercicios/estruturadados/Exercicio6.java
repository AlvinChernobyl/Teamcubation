package br.com.teamcubation.exercicios.estruturadados;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> contagemNomes = new HashMap<>();

        System.out.println("Digite os nomes (ou 'fim' para encerrar):");
        String nome;
        while (!(nome = scanner.nextLine()).equals("fim")) {
            if (contagemNomes.containsKey(nome)) {
                contagemNomes.put(nome, contagemNomes.get(nome) + 1);
            } else {
                contagemNomes.put(nome, 1);
            }
        }

        System.out.println("Nomes não duplicados:");
        contagemNomes.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .forEach(entry -> System.out.println(entry.getKey()));

        System.out.println("Quantidade de vezes que cada nome foi duplicado:");
        contagemNomes.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " vezes."));

        scanner.close();
    }

}