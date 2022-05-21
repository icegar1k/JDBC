package com.company.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private static final Logger logger = LogManager.getLogger(OrderTest.class);

    @Test
    void testGetIdProduct() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Product product = new Product(6, "Ibanez", "GRGR221PA AQB", "Electric", 10656);
        assertEquals(6, product.getIdProduct());
    }

    @Test
    void testSetIdProduct() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Product product = new Product(6, "Ibanez", "GRGR221PA AQB", "Electric", 10656);
        product.setIdProduct(1);
        assertEquals(1, product.getIdProduct());
    }

//    @Test
//    void testSetIdProductIfEmpty() {
//        LocalDateTime dt1 = LocalDateTime.now();
//        LocalDateTime dt2 = LocalDateTime.now();
//        logger.info("TEST {} {}", dt1, dt2);
//        Product product = new Product(0, "Ibanez", "GRGR221PA AQB", "Electric", 10656);
//        product.setIdProduct(1);
//        assertEquals(1, product.getIdProduct());
//    }

    @Test
    void testGetName() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Product product = new Product(6, "Ibanez", "GRGR221PA AQB", "Electric", 10656);
        assertEquals("Ibanez", product.getName());
    }

    @Test
    void testSetName() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Product product = new Product(6, "Ibanez", "GRGR221PA AQB", "Electric", 10656);
        product.setName("Fender");
        assertEquals("Fender", product.getName());
    }

//    @Test
//    void testSetNameIfEmpty() {
//        LocalDateTime dt1 = LocalDateTime.now();
//        LocalDateTime dt2 = LocalDateTime.now();
//        logger.info("TEST {} {}", dt1, dt2);
//        Product product = new Product(6, null, "GRGR221PA AQB", "Electric", 10656);
//        product.setName("Fender");
//        assertEquals("Fender", product.getName());
//    }

    @Test
    void testGetModel() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Product product = new Product(6, "Ibanez", "GRGR221PA AQB", "Electric", 10656);
        assertEquals("GRGR221PA AQB", product.getModel());
    }

    @Test
    void testSetModel() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Product product = new Product(6, "Ibanez", "GRGR221PA AQB", "Electric", 10656);
        product.setModel("CD-60 V3 WN SUNBURST");
        assertEquals("CD-60 V3 WN SUNBURST", product.getModel());
    }

//    @Test
//    void testSetModelIfEmpty() {
//        LocalDateTime dt1 = LocalDateTime.now();
//        LocalDateTime dt2 = LocalDateTime.now();
//        logger.info("TEST {} {}", dt1, dt2);
//        Product product = new Product(6, "Ibanez", null, "Electric", 10656);
//        product.setModel("CD-60 V3 WN SUNBURST");
//        assertEquals("CD-60 V3 WN SUNBURST", product.getModel());
//    }

    @Test
    void testGetDescription() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Product product = new Product(6, "Ibanez", "GRGR221PA AQB", "Electric", 10656);
        assertEquals("Electric", product.getDescription());
    }

    @Test
    void testSetDescription() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Product product = new Product(6, "Ibanez", "GRGR221PA AQB", "Electric", 10656);
        product.setDescription("Acoustic");
        assertEquals("Acoustic", product.getDescription());
    }

    @Test
    void testGetCost() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Product product = new Product(6, "Ibanez", "GRGR221PA AQB", "Electric", 10656);
        assertEquals(10656, product.getCost());
    }

    @Test
    void testSetCost() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        Product product = new Product(6, "Ibanez", "GRGR221PA AQB", "Electric", 10656);
        product.setCost(7200);
        assertEquals(7200, product.getCost());
    }

//    @Test
//    void testEquals() {
//    }
//
//    @Test
//    void testHashCode() {
//    }
//
//    @Test
//    void testToString() {
//    }
}