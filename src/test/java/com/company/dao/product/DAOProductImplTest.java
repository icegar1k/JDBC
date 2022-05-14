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
    Product testVladimir = new Product("TestFender", "CD-60 V3 WN SUNBURST", "Acoustic", 7200);
    List<Product> testProducts = daoProductImpl.getAllProducts();
    Product testProduct = testProducts.get(testProducts.size()-1);
    Product testUpdateVladimir = new Product("TestFender", "CD-60 V3 WN SUNBURST", "Acoustic", 7200);

    @Order(1)
    @Test
    void testAddProduct() {
        daoProductImpl.addProduct(testVladimir);
        testProducts = daoProductImpl.getAllProducts();
        assertTrue(testProducts.contains(testVladimir));
    }

    @Order(2)
    @Test
    void testGetAllProducts() {
        assertTrue(testProducts.contains(testVladimir));
    }

    @Order(3)
    @Test
    void testGetByIdProduct() {
        assertEquals(testProduct, daoProductImpl.getByIdProduct(testProduct.getIdProduct()));
    }

    @Order(4)
    @Test
    void testUpdateProduct() {
        daoProductImpl.updateProduct(testVladimir);
        testProducts = daoProductImpl.getAllProducts();
        assertTrue(testProducts.contains(testVladimir));
    }

    @Order(5)
    @Test
    void testDeleteProduct() {
        daoProductImpl.deleteProduct(testProduct.getIdProduct());
        testProducts = daoProductImpl.getAllProducts();
        assertFalse(testProducts.contains(testVladimir));
    }
}