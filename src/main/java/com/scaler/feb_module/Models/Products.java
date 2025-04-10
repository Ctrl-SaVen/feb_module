package com.scaler.feb_module.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Products extends base_model{
//    private long id;
    private String title;
    private String description;
    private String imageUrl;
    private double price;
    @ManyToOne
    private Category category;

//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public Products() {
    }

    public Products(Category category, double price, String imageUrl, String description, String title) //,long id) {
    {  this.category = category;
        this.price = price;
        this.imageUrl = imageUrl;
        this.description = description;
        this.title = title;
//        this.id = id;
    }
}
