package com.company.dao.order;

import com.company.entity.Order;

import java.util.List;

public interface DAOOrder {
    public void addOrder (Order order);
    public List<Order> getAllOrders();
    public Order getByIdOrder(int idOrder);
    public void updateOrder(Order order);
    public void deleteOrder (int idOrder);
}