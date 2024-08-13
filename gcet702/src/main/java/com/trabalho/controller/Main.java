package com.trabalho.controller;

import com.trabalho.resources.entidades.Camera;
import com.trabalho.resources.entidades.Carro;
import com.trabalho.resources.entidades.Evento;
import com.trabalho.resources.entidades.Pessoa;
import com.trabalho.resources.estruturas.Arvore_Avl;
import com.trabalho.resources.estruturas.HashPessoa;
import com.trabalho.resources.estruturas.ListaCarro;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Inicialização
        Arvore_Avl arvoreEventos = new Arvore_Avl();
        HashPessoa hashPessoas = new HashPessoa();
        ListaCarro listaCarros = new ListaCarro();

        // Cameras
        Camera camera1 = new Camera("192.168.1.10", -23.5558, -46.6396, "/images/camera1.png");
        Camera camera2 = new Camera("192.168.1.11", -23.1234, -46.1234, "/images/camera2.png");
        

        // Pessoas
        Pessoa pessoa1 = new Pessoa("Maria DB", "12345", Pessoa.TipoPessoa.DISCENTE);
        Pessoa pessoa2 = new Pessoa("Alexa A", "54321", Pessoa.TipoPessoa.DISCENTE);
        Pessoa pessoa3 = new Pessoa("João C", "", Pessoa.TipoPessoa.DESCONHECIDO);

        hashPessoas.addPessoa(pessoa1);
        hashPessoas.addPessoa(pessoa2);
        hashPessoas.addPessoa(pessoa3);

        // Carros
        Carro carro1 = new Carro("ABC-1234", true);
        Carro carro2 = new Carro("XYZ-5678", false);
        Carro carro3 = new Carro("QWE-9012", true);

        listaCarros.addCarro(carro1);
        listaCarros.addCarro(carro2);
        listaCarros.addCarro(carro3);

        // Eventos
        try {
            Evento evento1 = new Evento(new Date(), pessoa1, carro1, camera1);
            arvoreEventos.inserir(evento1);
            Thread.sleep(1000);
            Evento evento2 = new Evento(new Date(), pessoa2, carro2, camera1);
            arvoreEventos.inserir(evento2);
            Thread.sleep(1000);
            Evento evento3 = new Evento(new Date(), pessoa3, carro3, camera2);
            arvoreEventos.inserir(evento3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 
        System.out.println("Pessoas registradas:");
        hashPessoas.printAll();

        System.out.println("Carros registrados:");
        listaCarros.printAll();

        System.out.println("Eventos registrados na árvore AVL:");
        arvoreEventos.mostraArvore();
    }
}