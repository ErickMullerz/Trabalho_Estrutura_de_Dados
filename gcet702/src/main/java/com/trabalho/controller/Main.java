package com.trabalho.controller;

import java.util.StringTokenizer;

import com.trabalho.resources.estruturas.LS_Encadeada;

public class Main {
    public static void main(String[] args) {
        LS_Encadeada lista = new LS_Encadeada();
        lista.adicionarElementoInicio(5);
        lista.adicionarElementoInicio(7);
        lista.adicionarElementoInicio(9);
        lista.adicionarElementoInicio(2);
        lista.adicionarElementoInicio(3);
        lista.adicionarElementoInicio(4);        
        lista.percorrer(lista.primeiro);


        System.out.println("Joao da Silva Santos".hashCode());
        System.out.println(Math.abs("Joao da Silva Santos".hashCode()%13));
    }
}