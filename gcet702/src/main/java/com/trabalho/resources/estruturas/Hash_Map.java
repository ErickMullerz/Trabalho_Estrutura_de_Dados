package com.trabalho.resources.estruturas;

public class Hash_Map {
    private int tam;
    private LS_Encadeada[] vet;

    public Hash_Map(int tam) {
        System.out.println("Hash tamanho " + tam);
        this.setTam(tam);
        vet = new LS_Encadeada[tam];

        for (int i = 0; i < tam; i++) {
            vet[i] = null;
        }
    }

    public void adicionar(String nome) {
        int index = calcularIndice(nome.hashCode());

        if (vet[index] == null) {
            vet[index] = new LS_Encadeada();
        }
        
        vet[index].inserirListaObj(nome);
    }

    private int calcularIndice(int hash) {
        return Math.abs(hash) % getTam();
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public LS_Encadeada[] getVet() {
        return vet;
    }

    public void percorrer() {
        for (int i = 0; i < getTam(); i++) {
 ///           System.out.println("Index: " + i);
            LS_Encadeada l = getVet()[i];
           
            if (l != null ) {
//              System.out.println("Qtd elementos: " + l.getQtd());
                l.percorrer_obj(l.getPrimeiro());
            } else {
//                System.out.println("Vazio");
            }
            System.out.println();
        }
    }
}


