package br.com.teamcubation.exercicios.poo;

import lombok.Data;

import lombok.Data;

@Data
public abstract class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro() {
    }

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public abstract void exibirDetalhes();
}

