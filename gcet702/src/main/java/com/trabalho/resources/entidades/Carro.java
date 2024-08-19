package com.trabalho.resources.entidades;

import com.trabalho.resources.estruturas.LS_Encadeada;

public class Carro {
    /*
    Cadastrado|Não Cadastrado
    */
    private String placa;
    private boolean registrado;
    private LS_Encadeada lista_carro = new LS_Encadeada();

    public Carro(String placa, boolean registrado) {
        this.placa = placa;
        this.registrado = registrado;

        Lista_Carro();
    }

    public Carro(String placa) {
        this.placa = placa;
        
        this.registrado = busca_placa(placa);

        Lista_Carro();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isRegistrado() {
        return registrado;
    }

    public void setRegistrado(boolean registrado) {
        this.registrado = registrado;
    }

    
    public LS_Encadeada getLista_carro() {
        return lista_carro;
    }

    public void setLista_carro(LS_Encadeada lista_carro) {
        this.lista_carro = lista_carro;
    }

    public void Lista_Carro(){

        lista_carro.inserirListaObj("Carro: ");
        lista_carro.inserirListaObj("Placa: " + this.placa);
        System.out.println("");
        if(!registrado){
            lista_carro.inserirListaObj("Não Registrado");
        }
        else{
            lista_carro.inserirListaObj("Registrado");
        }
    
    }


    @Override
    public String toString() {
        return "Carro [placa=" + placa + ", registrado=" + registrado + "]";
    }
}
