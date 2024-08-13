
package com.trabalho.resources.entidades;

import java.util.Date;

public class Evento {
    private Date dataHora;
    private Pessoa pessoa;
    private Carro carro;
    private Camera camera;

    public Evento(Date dataHora, Pessoa pessoa, Carro carro, Camera camera) {
        this.dataHora = dataHora;
        this.pessoa = pessoa;
        this.carro = carro;
        this.camera = camera;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Evento [dataHora=" + dataHora + ", pessoa=" + pessoa + ", carro=" + carro + ", camera=" + camera + "]";
    }
}