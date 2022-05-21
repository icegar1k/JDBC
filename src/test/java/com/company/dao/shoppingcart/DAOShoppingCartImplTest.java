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
    ShoppingCart testNewShoppingCart = new ShoppingCart(4, 5, "Ibanez RG370AHMZ BMT", "ABC005", 16800, 6, 100800);
    List<ShoppingCart> testShoppingCarts = daoShoppingCartImpl.getAllShoppingCarts();
    ShoppingCart testShoppingCart = testShoppingCarts.get(testShoppingCarts.size()-1);

    @Order(1)
    @Test
    void testAddShoppingCart() {
        System.out.println("BeforeAdd");
        System.out.println(testNewShoppingCart);
        daoShoppingCartImpl.addShoppingCart(testNewShoppingCart);
        testShoppingCarts = daoShoppingCartImpl.getAllShoppingCarts();
        testNewShoppingCart = testShoppingCarts.get(testShoppingCarts.size()-1);
        System.out.println("AfterAdd");
        System.out.println(testNewShoppingCart);
        assertTrue(testShoppingCarts.contains(testNewShoppingCart));
    }

    @Order(2)
    @Test
    void testGetAllShoppingCarts() {
        assertTrue(testShoppingCarts.contains(testNewShoppingCart));
    }

    @Order(3)
    @Test
    void testGetByIdShoppingCart() {
        assertEquals(testShoppingCart, daoShoppingCartImpl.getByIdShoppingCart(testShoppingCart.getIdShoppingCart()));
    }

    @Order(4)
    @Test
    void testUpdateShoppingCart() {
        testNewShoppingCart = testShoppingCarts.get(testShoppingCarts.size()-1);
        System.out.println("testUpdate");
        testNewShoppingCart.setName("Updated");
        System.out.println(testNewShoppingCart);
        daoShoppingCartImpl.updateShoppingCart(testNewShoppingCart);
        System.out.println(daoShoppingCartImpl.getByIdShoppingCart(testNewShoppingCart.getIdShoppingCart()));
        assertEquals(testNewShoppingCart, daoShoppingCartImpl.getByIdShoppingCart(testNewShoppingCart.getIdShoppingCart()));
    }

    @Order(5)
    @Test
    void testDeleteShoppingCart() {
        testNewShoppingCart = testShoppingCarts.get(testShoppingCarts.size()-1);
        daoShoppingCartImpl.deleteShoppingCart(testNewShoppingCart.getIdShoppingCart());
        testShoppingCarts = daoShoppingCartImpl.getAllShoppingCarts();
        assertFalse(testShoppingCarts.contains(testNewShoppingCart));
    }
}