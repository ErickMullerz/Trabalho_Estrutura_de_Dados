package com.trabalho.resources.entidades;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.trabalho.controller.Cadastros;
import com.trabalho.resources.estruturas.LS_Encadeada;

public class Camera extends Cadastros{
    /*   
    Ip
    Latitude e Longitude
    Path da imagem
    */

    private String ip;
    private String latitude;
    private String longitude;
    private String imagePath;
    private LS_Encadeada lista_camera = new LS_Encadeada();

    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("ddMMyyyy_HHmmss");


    public Camera(String ip, String latitude, String longitude) {
        LocalDateTime h = LocalDateTime.now();
        this.ip = ip;
        this.latitude = latitude;
        this.longitude = longitude;
        this.imagePath = "C:\\Users\\UFRB\\OneDrive\\imagens\\"+ busca_latitude(latitude)+"_"+ h.format(myFormatObj)+".jpg";

        Lista_Camera();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public LS_Encadeada getLista_Camera() {
        return lista_camera;
    }

    public void setLista_Camera(LS_Encadeada lista_Camera) {
        this.lista_camera = lista_Camera;
    }

    public void Lista_Camera(){
        lista_camera.inserirListaObj("Camera: ");
        lista_camera.inserirListaObj("IP: " + this.ip);
        lista_camera.inserirListaObj("Latitude: " + this.latitude);
        lista_camera.inserirListaObj("Longitude: " + this.longitude);
        lista_camera.inserirListaObj("Path da Imagem: " + this.imagePath);
    }
    

    
    @Override
    public String toString() {
        return "Camera [ip=" + ip + ", latitude=" + latitude + ", longitude=" + longitude + ", imagePath=" + imagePath + "]";
    }
}
