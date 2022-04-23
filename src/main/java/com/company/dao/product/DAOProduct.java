package com.company.dao.product;

import com.company.entity.Product;

import java.util.List;

public interface DAOProduct {
    public List<Product> getAllProducts();
    public Product getByIdProduct(int idProduct);
    public void addProduct (Product product);
    public void deleteProduct (int idProduct);
    public void update(Product product);
}