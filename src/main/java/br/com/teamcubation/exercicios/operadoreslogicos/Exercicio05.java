package br.com.teamcubation.exercicios.operadoreslogicos;

public class Exercicio05 {
    public static void main(String[] args) {
        String desempenho = "semifinal";

        switch (desempenho) {
            case "final":
                System.out.println("Irá para a Série D");
                break;
            case "semifinal":
                System.out.println("Irá para a Copa do Brasil");
                break;
            case "quartas":
                System.out.println("Irá para a Copa Regional");
                break;
            default:
                System.out.println("Desclassificado das competições");
                break;
        }
    }
}
