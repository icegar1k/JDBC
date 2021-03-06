package com.company.entity;

import java.util.Objects;

public class ShoppingCart {
    private int idShoppingCart;
    private int idUser;
    private int idProduct;
    private String name;
    private String code;
    private int price;
    private int quantity;
    private int amount;

    public ShoppingCart() {
    }

    public ShoppingCart(int idShoppingCart,
                        int idUser,
                        int idProduct,
                        String name,
                        String code,
                        int price,
                        int quantity,
                        int amount) {

        this.idShoppingCart = idShoppingCart;
        this.idUser = idUser;
        this.idProduct = idProduct;
        this.name = name;
        this.code = code;
        this.price = price;
        this.quantity = quantity;
        this.amount = amount;
    }

    public ShoppingCart(int idUser,
                        int idProduct,
                        String name,
                        String code,
                        int price,
                        int quantity,
                        int amount) {

        this.idUser = idUser;
        this.idProduct = idProduct;
        this.name = name;
        this.code = code;
        this.price = price;
        this.quantity = quantity;
        this.amount = amount;
    }

    public int getIdShoppingCart() {
        return idShoppingCart;
    }

    public void setIdShoppingCart(int idShoppingCart) {
            this.idShoppingCart = idShoppingCart;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
            this.idUser = idUser;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
            this.code = code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
            this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
            this.quantity = quantity;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
            this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart that = (ShoppingCart) o;
        return idUser == that.idUser && idProduct == that.idProduct && price == that.price && quantity == that.quantity && amount == that.amount && Objects.equals(name, that.name) && Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idShoppingCart, idUser, idProduct, name, code, price, quantity, amount);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "idShoppingCart=" + idShoppingCart +
                ", idUser=" + idUser +
                ", idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", amount=" + amount +
                '}';
    }
}