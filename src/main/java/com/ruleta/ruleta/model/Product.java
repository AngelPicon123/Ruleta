package com.ruleta.ruleta.model;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String imageUrl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagenUrl() {
        return imageUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imageUrl = imagenUrl;
    }
}
