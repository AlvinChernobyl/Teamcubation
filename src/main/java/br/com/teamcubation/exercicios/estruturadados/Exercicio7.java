package br.com.teamcubation.exercicios.estruturadados;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> notas = new HashMap<>();

        while (true) {
            System.out.println("Matéria e a nota (ou 'fim' para encerrar):");
            String entrada = scanner.nextLine();

            if (entrada.equals("fim")) {
                break;
            }

            String[] partes = entrada.split(":");
            String materia = partes[0].trim();
            double nota = Double.parseDouble(partes[1].trim());

            if (notas.containsKey(materia)) {
                nota = (notas.get(materia) + nota) / 2.0;
            }

            notas.put(materia, nota);
        }

        System.out.println("Notas finais:");
        notas.forEach((materia, nota) -> System.out.println(materia + ": " + nota));

        scanner.close();
    }
}
