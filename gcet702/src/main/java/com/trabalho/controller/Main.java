

package com.trabalho.controller;
import com.trabalho.resources.estruturas.Hash_Map;
import com.trabalho.resources.entidades.Camera;
import com.trabalho.resources.entidades.Carro;
import com.trabalho.resources.entidades.Pessoa;
import com.trabalho.resources.entidades.Pessoa.TipoPessoa;
import com.trabalho.resources.estruturas.Arvore_Avl;
import com.trabalho.resources.estruturas.LS_Encadeada;

public class Main {
    static Arvore_Avl arvore;
    public static void main(String[] args) {
        LS_Encadeada lista = new LS_Encadeada();
        
        lista.inserirListaObj("casa");     
        

        //System.out.println("Joao da Silva Santos".hashCode());
        //System.out.println(Math.abs("Joao da Silva Santos".hashCode()%13));
        
        arvore = new Arvore_Avl();
        
        int n = 0;
        
        Pessoa p = new Pessoa("Alice","566161",TipoPessoa.DISCENTE);
        Camera c = new Camera("000000000000", "12°39'50.4''S", "39°05'59.8''W", "C:\\Users\\UFRB\\OneDrive\\imagens\\Cam");
        Carro car = new Carro("X4861515", false);
        while(n<10){
            
          arvore.raiz = arvore.inserir(arvore.raiz, n,c.getLista_Camera(),p.getHash_pessoa(),car.getLista_carro());
            
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