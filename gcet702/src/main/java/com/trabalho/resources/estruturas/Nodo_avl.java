package com.trabalho.resources.estruturas;

public class Nodo_avl {
    public Nodo_avl esq;
    public char info;
    public int infoNum;
    public Nodo_avl dir;
    
    public Nodo_avl(Nodo_avl esquerda, char informacao, Nodo_avl direita) 
    {
        esq = esquerda;
        this.info = informacao;
        dir = direita;
    }
    
    public Nodo_avl(Nodo_avl esquerda, int informacao, Nodo_avl direita) 
    {
        esq = esquerda;
        infoNum = informacao;
        dir = direita;
    }
}
