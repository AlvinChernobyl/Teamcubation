package br.com.teamcubation.exercicios.poo;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro() {
            @Override
            public void exibirDetalhes() {

            }
        };
        livro.setTitulo("Dom Quixote");
        livro.setAutor("Miguel de Cervantes");
        livro.setAnoPublicacao(1605);

        Revista revista = new Revista("Veja", "Editora Abril", 2023, 100);

        System.out.println("--- Detalhes do Livro ---");
        livro.exibirDetalhes();

        System.out.println();

        System.out.println("--- Detalhes da Revista ---");
        revista.exibirDetalhes();
    }
}
