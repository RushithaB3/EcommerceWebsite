package com.ecommerce.ecommerceapplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //this annotation tells Spring to treat this as database entity
public class Product {

    @Id //Marks the 'id' field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto-generated ID
    private Long id;

    private String name; //Product name
    private String description; //Product description
    private double price; //Product price
    private String imageUrl; //URl of the product image

    //Getters and setters (you can also use Lombok to generate these automatically)


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
