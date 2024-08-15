

package com.trabalho.resources.entidades;

import com.trabalho.resources.estruturas.Hash_Map;


public class Pessoa {
    /*
    Docente|Discente|Funcionario|Desconhecido
    Matricula
    */
    private String nome;
    private String matricula;  
    private TipoPessoa tipo;
    private Hash_Map hash_pessoa = new Hash_Map(5);

    
    

    public enum TipoPessoa {
        DOCENTE, DISCENTE, FUNCIONARIO, DESCONHECIDO
    }

    public Pessoa(String nome, String matricula, TipoPessoa tipo) {
        this.nome = nome;
        this.matricula = matricula;
        this.tipo = tipo;

       Hash_Pessoa();



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

    public void Hash_Pessoa() {

        hash_pessoa.adicionar( this.nome);
        hash_pessoa.adicionar( this.matricula);
        hash_pessoa.adicionar( this.tipo.toString());
        
        
        
    }

    

    public Hash_Map getHash_pessoa() {
        return hash_pessoa;
    }

    public void setHash_pessoa(Hash_Map hash_pessoa) {
        this.hash_pessoa = hash_pessoa;
    }


    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", matricula=" + matricula + ", tipo=" + tipo + "]";
    }   

}
