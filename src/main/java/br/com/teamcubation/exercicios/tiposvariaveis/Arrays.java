package br.com.teamcubation.exercicios.tiposvariaveis;

public class Arrays {

    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};

        System.out.print("Números: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();

        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }

        System.out.println("Soma: " + soma);
    }
}
