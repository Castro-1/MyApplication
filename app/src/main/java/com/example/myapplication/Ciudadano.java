package com.example.myapplication;

public class Ciudadano {
    private int celular;
    private int id;

    public Ciudadano(int id,int tel){
        this.celular=tel;
    }

    public int getCelular(){
        return this.celular;
    }

    public int setCelular(int tel){
        this.celular=tel;
        return this.celular;
    }

    public int getCedula() {
        return id;
    }

    public void setCedula(int id) {
        this.id = id;
    }
}
