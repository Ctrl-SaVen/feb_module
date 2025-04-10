package com.scaler.feb_module.Models;

import jakarta.persistence.Entity;

@Entity
public class Category extends base_model{
//    private long id;
    private String title;

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }
//
//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public Category(String title) {
        this.title = title;
//        this.id = id;
    }

    public Category() {
    }
}
