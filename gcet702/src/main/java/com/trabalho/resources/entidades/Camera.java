package com.trabalho.resources.entidades;

import com.trabalho.resources.estruturas.LS_Encadeada;

public class Camera {
    /*   
    Ip
    Latitude e Longitude
    Path da imagem
    */

    private String ip;
    private double latitude;
    private double longitude;
    private String imagePath;

    public Camera(String ip, double latitude, double longitude, String imagePath) {
        this.ip = ip;
        this.latitude = latitude;
        this.longitude = longitude;
        this.imagePath = imagePath;
        LS_Encadeada lista_camera = new LS_Encadeada();
        lista_camera.inserirListaObj(ip);
        lista_camera.inserirListaObj(latitude);
        lista_camera.inserirListaObj(longitude);
        lista_camera.inserirListaObj(imagePath);
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    
    @Override
    public String toString() {
        return "Camera [ip=" + ip + ", latitude=" + latitude + ", longitude=" + longitude + ", imagePath=" + imagePath + "]";
    }
}
