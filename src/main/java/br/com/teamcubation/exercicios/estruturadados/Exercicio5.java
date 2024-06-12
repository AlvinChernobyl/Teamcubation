package br.com.teamcubation.exercicios.estruturadados;

import java.util.*;

public class Exercicio5 {

    public static void main(String[] args) {
        String[] nomes = {"Ana", "Maria", "João", "Carlos", "Ana", "Pedro", "Maria"};

        Set<String> duplicados = new HashSet<>();
        Set<String> naoDuplicados = new HashSet<>();
        List<String> nomesRepetidos = new ArrayList<>();

        for (String nome : nomes) {
            if (!naoDuplicados.add(nome)) {
                duplicados.add(nome);
                nomesRepetidos.add(nome);
            }
        }

        System.out.println("Nomes duplicados:");
        for (String nome : duplicados) {
            System.out.println(nome);
        }

        System.out.println("Quantidade de vezes que cada nome foi duplicado:");
        for (String nome : nomesRepetidos) {
            System.out.println(nome + ": " + duplicados.stream().filter(n -> n.equals(nome)).count() + " vezes.");
        }
    }
}