package br.com.teamcubation.exercicios.estruturadados;

public class Exercicio4 {

    public static void main(String[] args) {
        int[] numeros = {2, 4, 3, 3, 8, 5, 6, 7, 0, 9};
        int[] contagem = new int[10];

        for (int num : numeros) {
            contagem[num]++;
        }

        for (int i = 0; i < contagem.length; i++) {
            if (contagem[i] > 1) {
                System.out.println("Número " + i + " aparece " + contagem[i] + " vezes.");
            }
        }
    }
}
