package com.company.dao.shoppingcart;

import com.company.entity.ShoppingCart;

import java.util.List;

public interface DAOShoppingCart {
    public List<ShoppingCart> getAllShoppingCarts();
    public ShoppingCart getByIdShoppingCart(int idShoppingCart);
    public void addShoppingCart (ShoppingCart shoppingCart);
    public void deleteShoppingCart (int idShoppingCart);
    public void update(ShoppingCart shoppingCart);
}