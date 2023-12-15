package com.example.application.activity1;

public class Recette {
    private String nom,desc;

    public Recette(String nom, String desc) {
        this.nom = nom;
        this.desc = desc;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
