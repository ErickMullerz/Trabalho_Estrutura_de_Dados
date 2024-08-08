package com.trabalho.resources.estruturas;



public class LS_Encadeada {
    public Nodo_LS primeiro;
    public Nodo_LS ultimo;
    public int qtd = 0;
    
    public LS_Encadeada(){
    
    
    }
    
    public void adicionarElementoInicio(int v){
        Nodo_LS novo = new Nodo_LS();
        novo.val = v;
        
        if(primeiro == null){
            primeiro = novo;
            qtd++;
        }
        else{
            novo.prox = primeiro;
            primeiro = novo;
            qtd++;
        }
    }

    public void inserirListaObj(Object valor){
        Nodo_LS aux = new Nodo_LS();
        aux.obj = valor;
        setQtd(getQtd() + 1);
        
        if (getPrimeiro() == null) 
        {
            primeiro = aux;
            ultimo = aux;
        }
        else 
        {

            
            ultimo.prox = aux;
            ultimo = aux;
        } }   

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
    public void percorrer_obj(Nodo_LS aux){
        if(aux != null){
            System.out.print(aux.obj + " ");
            percorrer(aux.prox);
        }
    
    }
    public Nodo_LS getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Nodo_LS primeiro) {
        this.primeiro = primeiro;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
}
