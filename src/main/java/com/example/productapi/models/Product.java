package com.example.productapi.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Product implements Serializable {
    @Id
    private long id;
    private String name;
    private String ProductImage;
    private double price;
    private String description;


    public Product() {
    }

    public Product(long id, String name, String productImage,
                   double price, String description) {
        this.id = id;
        this.name = name;
        ProductImage = productImage;
        this.price = price;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductImage() {
        return ProductImage;
    }

    public void setProductImage(String productImage) {
        ProductImage = productImage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ProductImage='" + ProductImage + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
