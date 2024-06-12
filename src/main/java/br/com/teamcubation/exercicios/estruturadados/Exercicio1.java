package br.com.teamcubation.exercicios.estruturadados;

public class Exercicio1 {

    public static void main(String[] args) {
        int[] numeros = {5, 8, 2, 10, 15, 7, 3, 12, 6, 9};
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        double media = (double) soma / numeros.length;
        System.out.println("Média: " + media);
    }
}
