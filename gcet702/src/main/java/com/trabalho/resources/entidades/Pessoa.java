
package com.trabalho.resources.entidades;

public class Pessoa {
    private String nome;
    private String matricula;  // null if the person is unknown
    private TipoPessoa tipo;

    public enum TipoPessoa {
        DOCENTE, DISCENTE, FUNCIONARIO, DESCONHECIDO
    }

    public Pessoa(String nome, String matricula, TipoPessoa tipo) {
        this.nome = nome;
        this.matricula = matricula;
        this.tipo = tipo;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.tipo = TipoPessoa.DESCONHECIDO;
        this.matricula = null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }

    public void setTipo(TipoPessoa tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", matricula=" + matricula + ", tipo=" + tipo + "]";
    }
}
