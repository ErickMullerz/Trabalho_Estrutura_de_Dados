package com.trabalho.resources.estruturas;

public class Arvore_Avl {

    public Nodo_avl raiz = null;
    
    public Nodo_avl inserir(Nodo_avl aux, int num ,  LS_Encadeada list ) {
       
        Nodo_avl novo;
        if (aux == null) 
        {
            novo = new Nodo_avl();
            novo.num = num;
            novo.list = list;
            novo.altd = 0;
            novo.alte = 0;
            novo.esq = null;
            novo.dir = null;
            aux = novo;
        } 
        else if (num < aux.num) 
        {
            aux.esq = inserir(aux.esq, num, list);
            if (aux.esq.altd > aux.esq.alte) {
                aux.alte = aux.esq.altd + 1;
            } else {
                aux.alte = aux.esq.alte + 1;
            }
        } else {
            aux.dir = inserir(aux.dir, num, list);
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
            System.out.println(" ");
            aux.list.percorrer_obj(aux.list.primeiro);
            exibiremordem(aux.dir);
        }
    }
 
    public void exibirpreordem(Nodo_avl aux) {
        if (aux != null) {
            System.out.println(" ");
            aux.list.percorrer_obj(aux.list.primeiro);
            exibirpreordem(aux.esq);
            exibirpreordem(aux.dir);
        }
    }
 
    public void exibirposordem(Nodo_avl aux) {
        if (aux != null) {
            exibirposordem(aux.esq);
            exibirposordem(aux.dir);
            System.out.println(" ");
            aux.list.percorrer_obj(aux.list.primeiro);
            
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
