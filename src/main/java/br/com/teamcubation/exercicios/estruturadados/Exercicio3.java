package br.com.teamcubation.exercicios.estruturadados;

public class Exercicio3 {

    public static void main(String[] args) {
        String[] nomes = {"Ana", "Carlos", "Maria", "Pedro", "João"};

        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = 0; j < nomes.length - i - 1; j++) {
                if (nomes[j].compareToIgnoreCase(nomes[j + 1]) > 0) {
                    String temp = nomes[j];
                    nomes[j] = nomes[j + 1];
                    nomes[j + 1] = temp;
                }
            }
        }

        System.out.println("Nomes:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }


}
