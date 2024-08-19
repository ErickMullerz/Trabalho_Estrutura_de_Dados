

package com.trabalho.controller;
import com.trabalho.resources.estruturas.Hash_Map;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

import com.trabalho.resources.entidades.Camera;
import com.trabalho.resources.entidades.Carro;
import com.trabalho.resources.entidades.Evento;
import com.trabalho.resources.entidades.Pessoa;
import com.trabalho.resources.entidades.Pessoa.TipoPessoa;
import com.trabalho.resources.estruturas.Arvore_Avl;
import com.trabalho.resources.estruturas.LS_Encadeada;

public class Main {
  static Arvore_Avl arvore;

  public static void main(String[] args) {
      int comando = 1;
      Scanner s = new Scanner(System.in);

      do {
          LocalDateTime hour = LocalDateTime.now();
          int camera;
          String nome, placa;
          boolean ev = false;
          String esc;
          Camera cam = null;

          System.out.println("Digite: ");
          System.out.println("[0] para sair \n[1] para escolher método de inserção\n");
          comando = s.nextInt(); 
          s.nextLine();

          if (comando == 1) {
              System.out.println("[1] Para inserir Evento com Pessoa \n[2] Para inserir Evento com Carro \n[3] Para inserir Evento com carro e pessoa\n");
              comando = s.nextInt();
              s.nextLine();

              System.out.println("Selecione a câmera:\n [1] Portão 1 \n[2] Portão 2 \n[3] Portão 3\n");
              camera = s.nextInt();
              s.nextLine();

              if (camera == 1) {
                  cam = new Camera("Camera_Portao_1");
              } else if (camera == 2) {
                  cam = new Camera("Camera_Portao_2");
              } else {
                  cam = new Camera("Camera_Portao_3");
              }

              System.out.println("Evento de Entrada(e) ou Saida(s):\n");
              esc = s.nextLine();

              if (esc.equals("e")) {
                  ev = true;
              } else if (esc.equals("s")) {
                  ev = false;
              }

              Evento evento = new Evento(ev, hour);

              if (comando == 1) {
                  System.out.println("Insira o Nome da Pessoa:\n");
                  nome = s.nextLine();
                  Pessoa pessoa = new Pessoa(nome);
                  arvore.inserir_nome(arvore.raiz, evento.getEvento(), hour, cam.getLista_Camera(), pessoa.getHash_pessoa());

              } else if (comando == 2) {
                  System.out.println("Insira a Placa do Carro:\n");
                  placa = s.nextLine();
                  Carro carro = new Carro(placa);
                  arvore.inserir(arvore.raiz, evento.getEvento(), hour, cam.getLista_Camera(), carro.getLista_carro());

              } else if (comando == 3) {
                  System.out.println("Insira o Nome da Pessoa:\n");
                  nome = s.nextLine();
                  System.out.println("Insira a Placa do Carro:\n");
                  placa = s.nextLine();
                  Pessoa pessoa = new Pessoa(nome);
                  Carro carro = new Carro(placa);
                  arvore.inserir(arvore.raiz, evento.getEvento(), hour, cam.getLista_Camera(), pessoa.getHash_pessoa(), carro.getLista_carro());
              }
          }
      } while (comando != 0);
  }
}





