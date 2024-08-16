package com.trabalho.resources.estruturas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Arvore_Avl {

    public Nodo_avl raiz = null;
    
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public Nodo_avl inserir(Nodo_avl aux,String evento, LocalDateTime num ,  LS_Encadeada list, Hash_Map hash ) {
       //Evento com Pessoa
        Nodo_avl novo;
        if (aux == null) 
        {
            novo = new Nodo_avl();
            novo.evento = evento;
            novo.data_horario = num.format(myFormatObj);
            novo.num = num.getSecond();
            novo.hash = hash;
            novo.list = list;
            novo.altd = 0;
            novo.alte = 0;
            novo.esq = null;
            novo.dir = null;
            aux = novo;
        } 
        else if (num.getMinute() < aux.num) 
        {
            aux.esq = inserir(aux.esq,evento, num, list,hash);
            if (aux.esq.altd > aux.esq.alte) {
                aux.alte = aux.esq.altd + 1;
            } else {
                aux.alte = aux.esq.alte + 1;
            }
        } else {
            aux.dir = inserir(aux.dir,evento, num, list,hash);
            if (aux.dir.altd > aux.dir.alte) {
                aux.altd = aux.dir.altd + 1;
            } else {
                aux.altd = aux.dir.alte + 1;
            }
        }
        
        aux = balanceamento(aux);
        
        return aux;
    }
    
    public Nodo_avl inserir(Nodo_avl aux,String evento, LocalDateTime num ,  LS_Encadeada list, LS_Encadeada list_carro ) {
        //Evento com carro
         Nodo_avl novo;
         if (aux == null) 
         {
             novo = new Nodo_avl();
             novo.evento = evento;
             novo.data_horario = num.format(myFormatObj);
             novo.num = num.getSecond();
             novo.list = list;
             novo.list_carro = list_carro;
             novo.altd = 0;
             novo.alte = 0;
             novo.esq = null;
             novo.dir = null;
             aux = novo;
         } 
         else if (num.getMinute() < aux.num) 
         {
             aux.esq = inserir(aux.esq,evento, num, list,list_carro);
             if (aux.esq.altd > aux.esq.alte) {
                 aux.alte = aux.esq.altd + 1;
             } else {
                 aux.alte = aux.esq.alte + 1;
             }
         } else {
             aux.dir = inserir(aux.dir,evento, num, list,list_carro);
             if (aux.dir.altd > aux.dir.alte) {
                 aux.altd = aux.dir.altd + 1;
             } else {
                 aux.altd = aux.dir.alte + 1;
             }
         }
         
         aux = balanceamento(aux);
         
         return aux;
     } 


    
    public Nodo_avl inserir(Nodo_avl aux,String evento, LocalDateTime num ,  LS_Encadeada list, Hash_Map hash ,LS_Encadeada list_carro ) {
       //Evento com Pessoa e Carro
        Nodo_avl novo;
        if (aux == null) 
        {
            novo = new Nodo_avl();
            novo.evento = evento;
            novo.data_horario = num.format(myFormatObj);
            novo.num = num.getSecond();
            novo.list = list;
            novo.hash = hash;
            novo.list_carro = list_carro;
            novo.altd = 0;
            novo.alte = 0;
            novo.esq = null;
            novo.dir = null;
            aux = novo;
        } 
        else if (num.getMinute() < aux.num) 
        {
            aux.esq = inserir(aux.esq,evento, num, list,hash,list_carro);
            if (aux.esq.altd > aux.esq.alte) {
                aux.alte = aux.esq.altd + 1;
            } else {
                aux.alte = aux.esq.alte + 1;
            }
        } else {
            aux.dir = inserir(aux.dir,evento, num, list,hash,list_carro);
            if (aux.dir.altd > aux.dir.alte) {
                aux.altd = aux.dir.altd + 1;
            } else {
                aux.altd = aux.dir.alte + 1;
            }
        }
        
        aux = balanceamento(aux);
        
        return aux;
    } 

    public Nodo_avl inserir_nome(Nodo_avl aux,String evento, LocalDateTime num ,  LS_Encadeada list, Hash_Map hash ) {
        //Evento com Pessoa
         Nodo_avl novo;
         if (aux == null) 
         {
             novo = new Nodo_avl();
             novo.evento = evento;
             novo.data_horario = num.format(myFormatObj);
             novo.num = num.getSecond();
             novo.hash = hash;
             novo.list = list;
             novo.altd = 0;
             novo.alte = 0;
             novo.esq = null;
             novo.dir = null;
             aux = novo;
         } 
         else if (num.getMinute() < aux.num) 
         {
             aux.esq = inserir(aux.esq,evento, num, list,hash);
             if (aux.esq.altd > aux.esq.alte) {
                 aux.alte = aux.esq.altd + 1;
             } else {
                 aux.alte = aux.esq.alte + 1;
             }
         } else {
             aux.dir = inserir(aux.dir,evento, num, list,hash);
             if (aux.dir.altd > aux.dir.alte) {
                 aux.altd = aux.dir.altd + 1;
             } else {
                 aux.altd = aux.dir.alte + 1;
             }
         }
         
         aux = balanceamento(aux);
         
         return aux;
     }
     

    public Nodo_avl balanceamento(Nodo_avl aux) 
    {
        int d, df;
        d = aux.altd - aux.alte;
        if (d == 2) {
            df = aux.dir.altd - aux.dir.alte;
            if (df >= 0) {
                aux = rotacao_esquerda(aux);
            } else {
                aux.dir = rotacao_direita(aux.dir);
                aux = rotacao_esquerda(aux);
            }
        } else if (d == -2) {
            df = aux.esq.altd - aux.esq.alte;
            if (df <= 0) {
                aux = rotacao_direita(aux);
            } else {
                aux.esq = rotacao_esquerda(aux.esq);
                aux = rotacao_direita(aux);
            }
        }
        return aux;
    }
 
    public Nodo_avl rotacao_esquerda(Nodo_avl aux) {
        
        Nodo_avl aux1, aux2;
        aux1 = aux.dir;
        aux2 = aux1.esq;
        aux.dir = aux2;
        aux1.esq = aux;
        
        if (aux.dir == null) {
            aux.altd = 0;
        } else if (aux.dir.alte > aux.dir.altd) {
            aux.altd = aux.dir.alte + 1;
        } else {
            aux.altd = aux.dir.altd + 1;
        }
 
        if (aux1.esq.alte > aux1.esq.altd) {
            aux1.alte = aux1.esq.alte + 1;
        } else {
            aux1.alte = aux1.esq.altd + 1;
        }
        return aux1;
    }
 
    public Nodo_avl rotacao_direita(Nodo_avl aux) {
        Nodo_avl aux1, aux2;
        aux1 = aux.esq;
        aux2 = aux1.dir;
        aux.esq = aux2;
        aux1.dir = aux;
        if (aux.esq == null) {
            aux.alte = 0;
        } else if (aux.esq.alte > aux.esq.altd) {
            aux.alte = aux.esq.alte + 1;
        } else {
            aux.alte = aux.esq.altd + 1;
        }
 
        if (aux1.dir.alte > aux1.dir.altd) {
            aux1.altd = aux1.dir.alte + 1;
        } else {
            aux1.altd = aux1.dir.altd + 1;
        }
        return aux1;
    }
 
    public void exibiremordem(Nodo_avl aux) {
        if (aux != null) {
            exibiremordem(aux.esq);
            System.out.println("");
            System.out.println(aux.evento);
            System.out.println(" ");
            System.out.println("");
            System.out.println("Horario: " + aux.data_horario);
            System.out.println(" ");
            aux.list.percorrer_obj(aux.list.primeiro);
            System.out.println(" ");
            if(aux.list_carro!=null){
                aux.list_carro.percorrer_obj(aux.list_carro.primeiro);
            }
            
            System.out.println("");
            if(aux.hash!=null){
                aux.hash.percorrer();    
            }
            exibiremordem(aux.dir);
        }
    }
 
    public void exibirpreordem(Nodo_avl aux) {
        if (aux != null) {
            System.out.println("");
            System.out.println(aux.evento);
            System.out.println(" ");
            System.out.println("");
            System.out.println("Horario: " + aux.data_horario);
            System.out.println(" ");
            aux.list.percorrer_obj(aux.list.primeiro);
            System.out.println(" ");
            if(aux.list_carro!=null){
                aux.list_carro.percorrer_obj(aux.list_carro.primeiro);
            }
            
            System.out.println("");
            if(aux.hash!=null){
                aux.hash.percorrer();    
            }
            exibirpreordem(aux.esq);
            exibirpreordem(aux.dir);
        }
    }
 
    public void exibirposordem(Nodo_avl aux) {
        if (aux != null) {

            exibirposordem(aux.esq);
            exibirposordem(aux.dir);
            System.out.println("");
            System.out.println(aux.evento);
            System.out.println("");
            System.out.println("Horario: " + aux.data_horario);
            System.out.println(" ");
            aux.list.percorrer_obj(aux.list.primeiro);
            System.out.println(" ");
            if(aux.list_carro!=null){
                aux.list_carro.percorrer_obj(aux.list_carro.primeiro);
            }
            
            System.out.println("");
            if(aux.hash!=null){
                aux.hash.percorrer();    
            }
            
            
        }
    }
 
    public int altura(Nodo_avl aux){
      
      int altura;  
      if (aux.altd>aux.alte){
          altura = aux.altd;
          System.out.println("Altura da arvore: ");
          return altura;
      }
      else{
          altura = aux.alte;
          System.out.println("Altura da arvore: ");
          
          return altura;
          
      }
    }
}
