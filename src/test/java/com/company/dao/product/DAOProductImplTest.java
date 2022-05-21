package com.company.dao.product;

import com.company.entity.Product;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class DAOProductImplTest {

    DAOProductImpl daoProductImpl = new DAOProductImpl();
    Product testNewProduct = new Product("Takamine", "GD30CE BLK", "Electric-acoustic", 16830);
    List<Product> testProducts = daoProductImpl.getAllProducts();
    Product testProduct = testProducts.get(testProducts.size()-1);

    @Order(1)
    @Test
    void testAddProduct() {
        System.out.println("BeforeAdd");
        System.out.println(testNewProduct);
        daoProductImpl.addProduct(testNewProduct);
        testProducts = daoProductImpl.getAllProducts();
        testNewProduct = testProducts.get(testProducts.size()-1);
        System.out.println("AfterAdd");
        System.out.println(testNewProduct);
        assertTrue(testProducts.contains(testNewProduct));
    }

    @Order(2)
    @Test
    void testGetAllProducts() {
        assertTrue(testProducts.contains(testNewProduct));
    }

    @Order(3)
    @Test
    void testGetByIdProduct() {
        assertEquals(testProduct, daoProductImpl.getByIdProduct(testProduct.getIdProduct()));
    }

    @Order(4)
    @Test
    void testUpdateProduct() {
        testNewProduct = testProducts.get(testProducts.size()-1);
        System.out.println("testUpdate");
        testNewProduct.setName("Updated");
        System.out.println(testNewProduct);
        daoProductImpl.updateProduct(testNewProduct);
        System.out.println(daoProductImpl.getByIdProduct(testNewProduct.getIdProduct()));
        assertEquals(testNewProduct, daoProductImpl.getByIdProduct(testNewProduct.getIdProduct()));
    }

    @Order(5)
    @Test
    void testDeleteProduct() {
        testNewProduct = testProducts.get(testProducts.size()-1);
        daoProductImpl.deleteProduct(testNewProduct.getIdProduct());
        testProducts = daoProductImpl.getAllProducts();
        assertFalse(testProducts.contains(testNewProduct));
    }
}