package com.example.myapplication;

public class Policia {
    private int cel;
    private int id;
    private int placa;

    public Policia(int cel,int id,int plac){
        this.id = id;
        this.placa=plac;
        this.cel=cel;

    }

    public int getPlaca(){
        return this.placa;
    }

    public int setPlaca(int plac){
        this.placa=plac;
        return this.placa;
    }

    public int getCel(){
        return this.cel;
    }

    public void setCel(int cel) {
        this.cel = cel;
    }

    public int getCedula() {
        return id;
    }

    public void setCedula(int id) {
        this.id = id;
    }
}
