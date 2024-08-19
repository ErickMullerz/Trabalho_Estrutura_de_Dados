

package com.trabalho.controller;
import com.trabalho.resources.estruturas.Hash_Map;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

import com.trabalho.resources.entidades.Camera;
import com.trabalho.resources.entidades.Carro;
import com.trabalho.resources.entidades.Evento;
import com.trabalho.resources.entidades.Pessoa;
import com.trabalho.resources.entidades.Pessoa.TipoPessoa;
import com.trabalho.resources.estruturas.Arvore_Avl;
import com.trabalho.resources.estruturas.LS_Encadeada;

public class Main {
    static Arvore_Avl arvore;
    public static void main(String[] args) {
        LS_Encadeada lista = new LS_Encadeada();
        
        lista.inserirListaObj("casa");     
        

        LocalDateTime hour = LocalDateTime.now();
        arvore = new Arvore_Avl();
        
        int n = 0;
        
        Pessoa p = new Pessoa("Alice","566161",TipoPessoa.DISCENTE);
        Camera c = new Camera("000000000000", "12°39'50.4''S", "39°05'59.8''W");
        Carro car = new Carro("X4861515", false);
        Carro carro = new Carro("QWE3I63");
        Evento e = new Evento(false, hour);
        Pessoa p_nome = new Pessoa("Camila Pereira Souza");

        while(n<10){
            
          arvore.raiz = arvore.inserir(arvore.raiz,e.getEvento(),e.getHorario() ,c.getLista_Camera(),p_nome.getHash_pessoa());
            
          n++; 
        }
        

        System.out.print("EM : ");
        arvore.exibiremordem(arvore.raiz);
        System.out.println();

       System.out.print("PRE : ");
        arvore.exibirpreordem(arvore.raiz);
        System.out.println();

        System.out.print("POS : ");
        arvore.exibirposordem(arvore.raiz);
        System.out.println();

     
      
    }
  }