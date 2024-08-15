package com.trabalho.resources.entidades;

import com.trabalho.resources.estruturas.Hash_Map;
import com.trabalho.resources.estruturas.LS_Encadeada;

public class Pessoa {
    /*
    Docente|Discente|Funcionario|Desconhecido
    Matricula
    */
    private String nome;
    private String matricula;  
    private TipoPessoa tipo;

    public enum TipoPessoa {
        DOCENTE, DISCENTE, FUNCIONARIO, DESCONHECIDO
    }

    public Pessoa(String nome, String matricula, TipoPessoa tipo) {
        this.nome = nome;
        this.matricula = matricula;
        this.tipo = tipo;

        Hash_Map hash_pessoa = new Hash_Map(5);
        hash_pessoa.adicionar(nome);
        hash_pessoa.adicionar(matricula);
        hash_pessoa.adicionar(tipo.toString());





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
