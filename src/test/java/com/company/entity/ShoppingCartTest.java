package com.company.entity;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    private static final Logger logger = LoggerFactory.getLogger(OrderTest.class);

    @Test
    void getIdShoppingCart() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 63936);
        assertEquals(6, shoppingCart.getIdShoppingCart());
    }

    @Test
    void setIdShoppingCart() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 63936);
        shoppingCart.setIdShoppingCart(1);
        assertEquals(6, shoppingCart.getIdShoppingCart());
    }

    @Test
    void setIdShoppingCartIfEmpty() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(0, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 63936);
        shoppingCart.setIdShoppingCart(1);
        assertEquals(1, shoppingCart.getIdShoppingCart());
    }

    @Test
    void getIdUser() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 63936);
        assertEquals(6, shoppingCart.getIdUser());
    }

    @Test
    void setIdUser() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 63936);
        shoppingCart.setIdUser(1);
        assertEquals(6, shoppingCart.getIdUser());
    }

    @Test
    void setIdUserIfEmpty() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 0, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 63936);
        shoppingCart.setIdUser(1);
        assertEquals(1, shoppingCart.getIdUser());
    }

    @Test
    void getIdProduct() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 63936);
        assertEquals(6, shoppingCart.getIdProduct());
    }

    @Test
    void setIdProduct() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 63936);
        shoppingCart.setIdProduct(1);
        assertEquals(6, shoppingCart.getIdProduct());
    }

    @Test
    void setIdProductIfEmpty() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 0, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 63936);
        shoppingCart.setIdProduct(1);
        assertEquals(1, shoppingCart.getIdProduct());
    }

    @Test
    void getName() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 63936);
        assertEquals("Ibanez GRGR221PA AQB", shoppingCart.getName());
    }

    @Test
    void setName() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 63936);
        shoppingCart.setName("Fender CD-60 V3 WN SUNBURST");
        assertEquals("Ibanez GRGR221PA AQB", shoppingCart.getName());
    }

    @Test
    void setNameIfEmpty() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "", "ABC006", 10656, 6, 63936);
        shoppingCart.setName("Fender CD-60 V3 WN SUNBURST");
        assertEquals("Fender CD-60 V3 WN SUNBURST", shoppingCart.getName());
    }

    @Test
    void getCode() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 63936);
        assertEquals("ABC006", shoppingCart.getCode());
    }

    @Test
    void setCode() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 63936);
        shoppingCart.setCode("ABC001");
        assertEquals("ABC006", shoppingCart.getCode());
    }

    @Test
    void setCodeIfEmpty() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "", 10656, 6, 63936);
        shoppingCart.setCode("ABC001");
        assertEquals("ABC001", shoppingCart.getCode());
    }

    @Test
    void getPrice() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 63936);
        assertEquals(10656, shoppingCart.getPrice());
    }

    @Test
    void setPrice() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 63936);
        shoppingCart.setPrice(7200);
        assertEquals(10656, shoppingCart.getPrice());
    }

    @Test
    void setPriceIfEmpty() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 0, 6, 63936);
        shoppingCart.setPrice(7200);
        assertEquals(7200, shoppingCart.getPrice());
    }

    @Test
    void getQuantity() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 63936);
        assertEquals(6, shoppingCart.getQuantity());
    }

    @Test
    void setQuantity() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 63936);
        shoppingCart.setQuantity(1);
        assertEquals(6, shoppingCart.getQuantity());
    }

    @Test
    void setQuantityIfEmpty() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 0, 63936);
        shoppingCart.setQuantity(1);
        assertEquals(1, shoppingCart.getQuantity());
    }

    @Test
    void getAmount() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 63936);
        assertEquals(63936, shoppingCart.getAmount());
    }

    @Test
    void setAmount() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 63936);
        shoppingCart.setAmount(7200);
        assertEquals(63936, shoppingCart.getAmount());
    }

    @Test
    void setAmountIfEmpty() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        ShoppingCart shoppingCart = new ShoppingCart(6, 6, 6, "Ibanez GRGR221PA AQB", "ABC006", 10656, 6, 0);
        shoppingCart.setAmount(7200);
        assertEquals(7200, shoppingCart.getAmount());
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