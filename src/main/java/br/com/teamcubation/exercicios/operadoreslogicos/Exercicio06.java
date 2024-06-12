package br.com.teamcubation.exercicios.operadoreslogicos;

public class Exercicio06 {

    public static void main(String[] args) {
        int titulosConsecutivos = 3;

        switch (titulosConsecutivos) {
            case 1:
                System.out.println("Campeão");
                break;
            case 2:
                System.out.println("Bicampeão");
                break;
            case 3:
                System.out.println("Tricampeão");
                break;
            case 4:
                System.out.println("Tetracampeão");
                break;
            case 5:
                System.out.println("Pentacampeão");
                break;
            default:
                System.out.println("Número de títulos fora do alcance suportado");
                break;
        }
    }
}
