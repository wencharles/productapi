package com.bqshop.api.bqshopapis.productsapi;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity
public class ProductModel {
    @Id
    private String name;
    private double price;
    private String category;

    public ProductModel(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
