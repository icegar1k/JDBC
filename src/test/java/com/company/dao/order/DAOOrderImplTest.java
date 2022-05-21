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
    Order testNewOrder = new Order(4, 5, 6, "2022-04-09 03:30:00", "Odessa, Texas", 84000, "Test", "Disgusting! I’ll sue you!");
    List<Order> testOrders = daoOrderImpl.getAllOrders();
    Order testOrder = testOrders.get(testOrders.size()-1);

    @org.junit.jupiter.api.Order(1)
    @Test
    void testAddOrder() {
        System.out.println("BeforeAdd");
        System.out.println(testNewOrder);
        daoOrderImpl.addOrder(testNewOrder);
        testOrders = daoOrderImpl.getAllOrders();
        testNewOrder = testOrders.get(testOrders.size()-1);
        System.out.println("AfterAdd");
        System.out.println(testNewOrder);
        assertTrue(testOrders.contains(testNewOrder));
    }

    @org.junit.jupiter.api.Order(2)
    @Test
    void testGetAllOrders() {
        assertTrue(testOrders.contains(testNewOrder));
    }

    @org.junit.jupiter.api.Order(3)
    @Test
    void testGetByIdOrder() {
        assertEquals(testOrder, daoOrderImpl.getByIdOrder(testOrder.getIdOrder()));
    }

    @org.junit.jupiter.api.Order(4)
    @Test
    void testUpdateOrder() {
        testNewOrder = testOrders.get(testOrders.size()-1);
        System.out.println("testUpdate");
        testNewOrder.setStatus("Updated");
        System.out.println(testNewOrder);
        daoOrderImpl.updateOrder(testNewOrder);
        System.out.println(daoOrderImpl.getByIdOrder(testNewOrder.getIdOrder()));
        assertEquals(testNewOrder, daoOrderImpl.getByIdOrder(testNewOrder.getIdOrder()));
    }

    @org.junit.jupiter.api.Order(5)
    @Test
    void testDeleteOrder() {
        testNewOrder = testOrders.get(testOrders.size()-1);
        daoOrderImpl.deleteOrder(testNewOrder.getIdOrder());
        testOrders = daoOrderImpl.getAllOrders();
        assertFalse(testOrders.contains(testNewOrder));
    }
}