package com.trabalho.controller;

import com.trabalho.resources.estruturas.LS_Encadeada;

public class Main {
    public static void main(String[] args) {
        LS_Encadeada lista = new LS_Encadeada();
        
        lista.inserirListaObj("casa");     
        lista.percorrer_obj(lista.primeiro);


        System.out.println("Joao da Silva Santos".hashCode());
        System.out.println(Math.abs("Joao da Silva Santos".hashCode()%13));
    }
}