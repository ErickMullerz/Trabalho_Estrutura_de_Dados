
package com.trabalho.resources.entidades;

public class Carro {
    private String placa;
    private boolean registrado;

    public Carro(String placa, boolean registrado) {
        this.placa = placa;
        this.registrado = registrado;
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

    @Override
    public String toString() {
        return "Carro [placa=" + placa + ", registrado=" + registrado + "]";
    }
}
