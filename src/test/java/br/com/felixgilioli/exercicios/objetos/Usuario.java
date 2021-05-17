package br.com.felixgilioli.exercicios.objetos;

import java.time.LocalDate;

public class Usuario {

    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;

    public Usuario() {
    }
    public Usuario(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }
}
