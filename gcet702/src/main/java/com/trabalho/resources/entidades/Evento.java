package com.trabalho.resources.entidades;

import java.time.LocalDateTime;

public class Evento {
    /*
    Entrada|Saida
    Data|hora
    
    */
    private boolean evento; 
    private LocalDateTime horario;

    public Evento(boolean evento, LocalDateTime horario){
        this.evento = evento;
        this.horario = horario;
    }
    

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public String getEvento() {
      if(!evento){
        return "Saida";
      }
      else{
        
        return "Entrada";
    }
    }


    public void setEvento(boolean evento) {
        this.evento = evento;
    }

}
