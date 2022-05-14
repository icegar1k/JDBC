package com.company.dao.order;

import com.company.entity.Order;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class DAOOrderImplTest {

    DAOOrderImpl daoOrderImpl = new DAOOrderImpl();
    Order testVladimir = new Order(4, 5, 6, "2022-04-09 03:25:00", "Odessa, Primorskiy", 7200, "TestNew", "qwer");
    List<Order> testOrders = daoOrderImpl.getAllOrders();
    Order testOrder = testOrders.get(testOrders.size()-1);
    Order testUpdateVladimir = new Order(5, 4, 7, "2022-04-09 03:25:00", "Odessa, Primorskiy", 7200, "TestUpdateNew", "7200.00");

    @org.junit.jupiter.api.Order(1)
    @Test
    void testAddOrder() {
        daoOrderImpl.addOrder(testVladimir);
        testOrders = daoOrderImpl.getAllOrders();
        assertTrue(testOrders.contains(testVladimir));
    }

    @org.junit.jupiter.api.Order(2)
    @Test
    void testGetAllOrders() {
        assertTrue(testOrders.contains(testVladimir));
    }

    @org.junit.jupiter.api.Order(3)
    @Test
    void testGetByIdOrder() {
        assertEquals(testOrder, daoOrderImpl.getByIdOrder(testOrder.getIdOrder()));
    }

    @org.junit.jupiter.api.Order(4)
    @Test
    void testUpdateOrder() {
        daoOrderImpl.updateOrder(testVladimir);
        testOrders = daoOrderImpl.getAllOrders();
        assertTrue(testOrders.contains(testVladimir));
    }

    @org.junit.jupiter.api.Order(5)
    @Test
    void testDeleteOrder() {
        daoOrderImpl.deleteOrder(testOrder.getIdOrder());
        testOrders = daoOrderImpl.getAllOrders();
        assertFalse(testOrders.contains(testVladimir));
    }
}