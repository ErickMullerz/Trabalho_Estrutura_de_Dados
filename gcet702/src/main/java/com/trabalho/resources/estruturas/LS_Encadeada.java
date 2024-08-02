package com.trabalho.resources.estruturas;



public class LS_Encadeada {
    Nodo_LS primeiro;
    
    public LS_Encadeada(){
    
    
    }
    
    public void adicionarElementoInicio(int v){
        Nodo_LS novo = new Nodo_LS();
        novo.val = v;
        
        if(primeiro == null){
            primeiro = novo;
        }
        else{
            novo.prox = primeiro;
            primeiro = novo;
        }
    }

    public void excluir(int n, Nodo_LS aux){
        
        Nodo_LS ant = null;
        while(aux != null){            
            if(aux.val == n){
                if(aux == primeiro){
                    primeiro = aux.prox;
                }else{
                    ant.prox = aux.prox;                
                }
                break;
            }
            
            ant = aux;
            aux = aux.prox;
            
            if(aux == null){
                System.out.println("O valor não está na lista");
            }
        }
        
    }
    
    public void percorrer(Nodo_LS aux){
        if(aux != null){
            System.out.print(aux.val + " ");
            percorrer(aux.prox);
        }
    
    }
}
