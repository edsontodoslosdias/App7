package com.example.app07;


///AYALA VEGA EDSON MIGUEL
//2019030333
//9-3
import java.io.Serializable;

public class Usuarios implements Serializable {
    private int idUser;
    private String user;
    private String contraseña;
    private String nombreCompleto;
    private String email;

    public Usuarios(int idUser, String user, String contraseña, String nombreCompleto, String email) {
        this.setIdUser(idUser);
        this.setUser(user);
        this.setContraseña(contraseña);
        this.setNombreCompleto(nombreCompleto);
        this.setEmail(email);
    }

    public Usuarios(){

    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

