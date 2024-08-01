package estruturas;

public class Nodo {
    public Nodo esq;
    public char info;
    public int infoNum;
    public Nodo dir;
    
    public Nodo(Nodo esquerda, char informacao, Nodo direita) 
    {
        esq = esquerda;
        this.info = informacao;
        dir = direita;
    }
    
    public Nodo(Nodo esquerda, int informacao, Nodo direita) 
    {
        esq = esquerda;
        infoNum = informacao;
        dir = direita;
    }
}
