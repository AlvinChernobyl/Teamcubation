package br.com.teamcubation.exercicios.estruturadados;

public class Exercicio2 {

    public static void main(String[] args) {
        float[] alturas = {1.75f, 1.68f, 1.82f, 1.60f, 1.90f};
        float menor = alturas[0];
        float maior = alturas[0];

        for (int i = 1; i < alturas.length; i++) {
            if (alturas[i] < menor) {
                menor = alturas[i];
            }
            if (alturas[i] > maior) {
                maior = alturas[i];
            }
        }

        System.out.println("Maior altura: " + maior);
        System.out.println("Menor altura: " + menor);
    }
}

