package com.example.myapplication;

public class Ciudadano {
    private String celular;
    private String id;
    private String nombre;

    public static Ciudadano civil[] = new Ciudadano[10];

    public Ciudadano(){
        this.celular="3215467896";
        this.id="1000435678";
    }

    public Ciudadano(String id,String tel){
        this.id=id;
        this.celular=tel;
        this.nombre = "Pepito Perez";
    }

    public String getCelular(){
        return this.celular;
    }

    public String setCelular(String tel){
        this.celular=tel;
        return this.celular;
    }

    public String getCedula() {
        return id;
    }

    public void setCedula(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
