package com.company.entity;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    private static final Logger logger = LoggerFactory.getLogger(OrderTest.class);

    @Test
    void testGetIdOrder() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
//        String workingDir = System.getProperty("user.dir");
//        System.out.println(workingDir);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        assertEquals(6, order.getIdOrder());
    }

    @Test
    void testSetIdOrder() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        order.setIdOrder(1);
        assertEquals(6, order.getIdOrder());
    }

    @Test
    void testSetIdOrderIfEmpty() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(0, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        order.setIdOrder(1);
        assertEquals(1, order.getIdOrder());
    }

    @Test
    void testGetIdUser() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        assertEquals(6, order.getIdUser());
    }

    @Test
    void testSetIdUser() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        order.setIdUser(1);
        assertEquals(6, order.getIdUser());
    }

    @Test
    void testSetIdUserIfEmpty() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 0, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        order.setIdUser(1);
        assertEquals(1, order.getIdUser());
    }

    @Test
    void testGetIdProduct() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        assertEquals(6, order.getIdProduct());
    }

    @Test
    void testSetIdProduct() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        order.setIdProduct(1);
        assertEquals(6, order.getIdProduct());
    }

    @Test
    void testSetIdProductIfEmpty() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 0, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        order.setIdProduct(1);
        assertEquals(1, order.getIdProduct());
    }

    @Test
    void testGetIndex() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        assertEquals(6, order.getIndex());
    }

    @Test
    void testSetIndex() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        order.setIndex(1);
        assertEquals(6, order.getIndex());
    }

    @Test
    void testSetIndexIfEmpty() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 0, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        order.setIndex(1);
        assertEquals(1, order.getIndex());
    }

    @Test
    void testGetDateTime() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        assertEquals("2022-04-16 06:40:00", order.getDateTime());
    }

    @Test
    void testSetDateTime() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        order.setDateTime("2022-04-09 03:25:00");
        assertEquals("2022-04-16 06:40:00", order.getDateTime());
    }

    @Test
    void testSetDateTimeIfEmpty() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        order.setDateTime("2022-04-09 03:25:00");
        assertEquals("2022-04-09 03:25:00", order.getDateTime());
    }

    @Test
    void testGetDeliveryAddress() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        assertEquals("Odessa, Texas", order.getDeliveryAddress());
    }

    @Test
    void testSetDeliveryAddress() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        order.setDeliveryAddress("Odessa, Primorskiy");
        assertEquals("Odessa, Texas", order.getDeliveryAddress());
    }

    @Test
    void testSetDeliveryAddressIfEmpty() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "", 10000, "Rejected", "Hello, Moto!");
        order.setDeliveryAddress("Odessa, Primorskiy");
        assertEquals("Odessa, Primorskiy", order.getDeliveryAddress());
    }

    @Test
    void testGetAmount() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        assertEquals(10000, order.getAmount());
    }

    @Test
    void testDetAmount() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        order.setAmount(7200);
        assertEquals(10000, order.getAmount());
    }

    @Test
    void testSetAmountIfEmpty() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 0, "Rejected", "Hello, Moto!");
        order.setAmount(7200);
        assertEquals(7200, order.getAmount());
    }

    @Test
    void testGetStatus() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        assertEquals("Rejected", order.getStatus());
    }

    @Test
    void testSetStatus() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        order.setStatus("New");
        assertEquals("New", order.getStatus());
    }

    @Test
    void testGetReview() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        assertEquals("Hello, Moto!", order.getReview());
    }

    @Test
    void testSetReview() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Order order = new Order(6, 6, 6, 6, "2022-04-16 06:40:00", "Odessa, Texas", 10000, "Rejected", "Hello, Moto!");
        order.setReview("Hi! I wanna buy a guitar!");
        assertEquals("Hi! I wanna buy a guitar!", order.getReview());
    }

    @Test
    void testEquals() {
    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
    }
}