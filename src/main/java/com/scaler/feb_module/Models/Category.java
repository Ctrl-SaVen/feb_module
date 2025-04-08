package com.scaler.feb_module.Models;

import jakarta.persistence.Entity;

@Entity
public class Category extends base_model{
//    private long id;
    private String tilte;

    public String getTilte()
    {
        return tilte;
    }

    public void setTilte(String tilte)
    {
        this.tilte = tilte;
    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public Category(String tilte) {
        this.tilte = tilte;
//        this.id = id;
    }

    public Category() {
    }
}
