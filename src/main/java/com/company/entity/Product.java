package com.company.entity;

import java.util.Objects;

public class Product {
    private int idProduct;
    private String name;
    private String model;
    private String description;
    private int cost;

    public Product() {
    }

    public Product(int idProduct,
                   String name,
                   String model,
                   String description,
                   int cost) {

        this.idProduct = idProduct;
        this.name = name;
        this.model = model;
        this.description = description;
        this.cost = cost;
    }

    public Product(String name,
                   String model,
                   String description,
                   int cost) {

        this.name = name;
        this.model = model;
        this.description = description;
        this.cost = cost;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
            this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
            this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return cost == product.cost && Objects.equals(name, product.name) && Objects.equals(model, product.model) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProduct, name, model, description, cost);
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                '}';
    }
}