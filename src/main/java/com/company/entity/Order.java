package com.company.entity;

import java.util.Objects;

public class Order {
    private int idOrder;
    private int idUser;
    private int idProduct;
    private int index;
    private String dateTime;
    private String deliveryAddress;
    private int amount;
    private String status;
    private String review;

    public Order() {
    }

    public Order(int idOrder,
                 int idUser,
                 int idProduct,
                 int index,
                 String dateTime,
                 String deliveryAddress,
                 int amount,
                 String status,
                 String review) {

        this.idOrder = idOrder;
        this.idUser = idUser;
        this.idProduct = idProduct;
        this.index = index;
        this.dateTime = dateTime;
        this.deliveryAddress = deliveryAddress;
        this.amount = amount;
        this.status = status;
        this.review = review;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        if (this.idOrder == 0) {
            this.idOrder = idOrder;
        }
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        if (this.idUser == 0) {
            this.idUser = idUser;
        }
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        if (this.idProduct == 0) {
            this.idProduct = idProduct;
        }
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        if (this.index == 0) {
            this.index = index;
        }
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        if (this.dateTime == null) {
            this.dateTime = dateTime;
        }
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        if (this.deliveryAddress == null) {
            this.deliveryAddress = deliveryAddress;
        }
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (this.amount == 0) {
            this.amount = amount;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return idOrder == order.idOrder && idUser == order.idUser && idProduct == order.idProduct && index == order.index && amount == order.amount && Objects.equals(dateTime, order.dateTime) && Objects.equals(deliveryAddress, order.deliveryAddress) && Objects.equals(status, order.status) && Objects.equals(review, order.review);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idOrder, idUser, idProduct, index, dateTime, deliveryAddress, amount, status, review);
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", idUser=" + idUser +
                ", idProduct=" + idProduct +
                ", index=" + index +
                ", dateTime='" + dateTime + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", review='" + review + '\'' +
                '}';
    }
}