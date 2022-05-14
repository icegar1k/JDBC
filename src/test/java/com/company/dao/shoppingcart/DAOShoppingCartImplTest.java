package com.company.dao.shoppingcart;

import com.company.entity.ShoppingCart;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class DAOShoppingCartImplTest {

    DAOShoppingCartImpl daoShoppingCartImpl = new DAOShoppingCartImpl();
    ShoppingCart testVladimir = new ShoppingCart(5, 4, "Fender CD-60 V3 WN SUNBURST", "ABC007", 7200, 1, 7200);
    List<ShoppingCart> testShoppingCarts = daoShoppingCartImpl.getAllShoppingCarts();
    ShoppingCart testShoppingCart = testShoppingCarts.get(testShoppingCarts.size()-1);
    ShoppingCart testUpdateVladimir = new ShoppingCart(4, 5, "Fender CD-60 V3 WN SUNBURST", "ABC008", 7200, 1, 7200);

    @Order(1)
    @Test
    void testAddShoppingCart() {
        System.out.println("BeforeAdd");
        System.out.println(testVladimir);
        daoShoppingCartImpl.addShoppingCart(testVladimir);
        testShoppingCarts = daoShoppingCartImpl.getAllShoppingCarts();
        testVladimir = testShoppingCarts.get(testShoppingCarts.size()-1);
        System.out.println("AfterAdd");
        System.out.println(testVladimir);
        assertTrue(testShoppingCarts.contains(testVladimir));
    }

    @Order(2)
    @Test
    void testGetAllShoppingCarts() {
        assertTrue(testShoppingCarts.contains(testVladimir));
    }

    @Order(3)
    @Test
    void testGetByIdShoppingCart() {
        assertEquals(testShoppingCart, daoShoppingCartImpl.getByIdShoppingCart(testShoppingCart.getIdShoppingCart()));
    }

    @Order(4)
    @Test
    void testUpdateShoppingCart() {
        testVladimir = testShoppingCarts.get(testShoppingCarts.size()-1);
        System.out.println("testUpdate");
        testVladimir.setName("Updated");
        System.out.println(testVladimir);
        daoShoppingCartImpl.updateShoppingCart(testVladimir);
        System.out.println(daoShoppingCartImpl.getByIdShoppingCart(testVladimir.getIdShoppingCart()));
        assertEquals(testVladimir, daoShoppingCartImpl.getByIdShoppingCart(testVladimir.getIdShoppingCart()));
    }

    @Order(5)
    @Test
    void testDeleteShoppingCart() {
        testVladimir = testShoppingCarts.get(testShoppingCarts.size()-1);
        daoShoppingCartImpl.deleteShoppingCart(testVladimir.getIdShoppingCart());
        testShoppingCarts = daoShoppingCartImpl.getAllShoppingCarts();
        assertFalse(testShoppingCarts.contains(testVladimir));
    }
}