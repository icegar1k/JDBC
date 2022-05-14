package com.company.dao.shoppingcart;

import com.company.entity.ShoppingCart;

import java.util.List;

public interface DAOShoppingCart {
    public void addShoppingCart (ShoppingCart shoppingCart);
    public List<ShoppingCart> getAllShoppingCarts();
    public ShoppingCart getByIdShoppingCart(int idShoppingCart);
    public void updateShoppingCart(ShoppingCart shoppingCart);
    public void deleteShoppingCart (int idShoppingCart);
}