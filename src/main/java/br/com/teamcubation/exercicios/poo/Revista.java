package br.com.teamcubation.exercicios.poo;

import lombok.Data;

@Data
public class Revista extends Livro {

    private int edicao;

    public Revista(String titulo, String autor, int anoPublicacao, int edicao) {

        super(titulo, autor, anoPublicacao);
        this.edicao = edicao;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Revista:");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano de Publicação: " + getAnoPublicacao());
        System.out.println("Edição: " + edicao);
    }
}
