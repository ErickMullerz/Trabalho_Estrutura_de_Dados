
package com.trabalho.resources.estruturas;

import com.trabalho.resources.entidades.Evento;

public class Arvore_Avl {
    private class Nodo {
        Evento evento;
        Nodo esquerda, direita;
        int altura;

        Nodo(Evento evento) {
            this.evento = evento;
            altura = 1;
        }
    }

    private Nodo raiz;

    public Arvore_Avl() {
        raiz = null;
    }

    // obter a altura da árvore
    private int altura(Nodo n) {
        return n == null ? 0 : n.altura;
    }

    private int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Rotação à direita da subárvore enraizada em y
    private Nodo rotacaoDireita(Nodo y) {
        Nodo x = y.esquerda;
        Nodo T2 = x.direita;

        // rotação
        x.direita = y;
        y.esquerda = T2;

        // alturas
        y.altura = max(altura(y.esquerda), altura(y.direita)) + 1;
        x.altura = max(altura(x.esquerda), altura(x.direita)) + 1;

        return x;
    }

    // Rotação à esquerda da subárvore enraizada em x
    private Nodo rotacaoEsquerda(Nodo x) {
        Nodo y = x.direita;
        Nodo T2 = y.esquerda;

        // rotação
        y.esquerda = x;
        x.direita = T2;

        // alturas
        x.altura = max(altura(x.esquerda), altura(x.direita)) + 1;
        y.altura = max(altura(y.esquerda), altura(y.direita)) + 1;

        return y;
    }

    // Ofator de balanceamento do nó
    private int getBalance(Nodo n) {
        return n == null ? 0 : altura(n.esquerda) - altura(n.direita);
    }

    // insrir um evento e retornar a nova raiz da subárvore
    public void inserir(Evento evento) {
        raiz = inserirRec(raiz, evento);
    }

    private Nodo inserirRec(Nodo Nodo, Evento evento) {
        // 1. Inserção
        if (Nodo == null)
            return new Nodo(evento);

        if (evento.getDataHora().before(Nodo.evento.getDataHora()))
            Nodo.esquerda = inserirRec(Nodo.esquerda, evento);
        else if (evento.getDataHora().after(Nodo.evento.getDataHora()))
            Nodo.direita = inserirRec(Nodo.direita, evento);
        else
            return Nodo;

        // 2. Atualiza a altura deste nó 
        Nodo.altura = 1 + max(altura(Nodo.esquerda), altura(Nodo.direita));

        // 3. Obtém o fator de balanceamento deste nó para verificar se ele ficou desbalanceado
        int balanceamento = getBalance(Nodo);

        // Se o nó ficou desbalanceado, existem 4 casos ?

        // Esquerda-Esquerda
        if (balanceamento > 1 && evento.getDataHora().before(Nodo.esquerda.evento.getDataHora()))
            return rotacaoDireita(Nodo);

        // Direita-Direita
        if (balanceamento < -1 && evento.getDataHora().after(Nodo.direita.evento.getDataHora()))
            return rotacaoEsquerda(Nodo);

        // Esquerda-Direita
        if (balanceamento > 1 && evento.getDataHora().after(Nodo.esquerda.evento.getDataHora())) {
            Nodo.esquerda = rotacaoEsquerda(Nodo.esquerda);
            return rotacaoDireita(Nodo);
        }

        // Direita-Esquerda
        if (balanceamento < -1 && evento.getDataHora().before(Nodo.direita.evento.getDataHora())) {
            Nodo.direita = rotacaoDireita(Nodo.direita);
            return rotacaoEsquerda(Nodo);
        }
        return Nodo;
    }

    public void mostraArvore() {
        preOrdenar(raiz);
    }

    private void preOrdenar(Nodo Nodo) {
        if (Nodo != null) {
            System.out.println(Nodo.evento);
            preOrdenar(Nodo.esquerda);
            preOrdenar(Nodo.direita);
        }
    }
}
