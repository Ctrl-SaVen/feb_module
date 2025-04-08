package com.scaler.feb_module.dto;


import com.scaler.feb_module.Models.Category;
import com.scaler.feb_module.Models.Products;
import lombok.Getter;
import lombok.Setter;

public class fakestoreDto
{

//private long id;
private String title;
private double price;
private String image;
private String description;
private String category;

    @Override
    public String toString() {
        return "fakestoreDto{" +
//                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


//    Products products = new Products();
    public Products getProducts()
    {

    Products products = new Products();
//    products.setId(id);
    products.setTitle(title);
    products.setPrice(price);
    products.setDescription(description);
    products.setImageUrl(image);

    Category cat = new Category();
    cat.setTilte(category);

    products.setCategory(cat);


return products;
}







/*
"id": 0,
"title": "string",
"price": 0.1,
"description": "string",
"category": "string",
"image": "http://example.com"
}*/

}
