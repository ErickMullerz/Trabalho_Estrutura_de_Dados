package estruturas;

public class LS_Encadeada {
    Nodo primeiro;
    
    public LS_Encadeada(){
    
    
    }
    
    public void adicionarElementoInicio(int v){
        Nodo novo = new Nodo();
        novo.val = v;
        
        if(primeiro == null){
            primeiro = novo;
        }
        else{
            novo.prox = primeiro;
            primeiro = novo;
        }
    }

    public void excluir(int n, Nodo aux){
        
        Nodo ant = null;
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
    
    public void percorrer(Nodo aux){
        if(aux != null){
            System.out.print(aux.val + " ");
            percorrer(aux.prox);
        }
    
    }
}
