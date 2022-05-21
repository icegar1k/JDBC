package com.company.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private static final Logger logger = LogManager.getLogger(OrderTest.class);

    @Test
    void testGetIdUser() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        User user = new User(6, "Boris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
        assertEquals(6, user.getIdUser());
    }

    @Test
    void testSetIdUser() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        User user = new User(6, "Boris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
        user.setIdUser(1);
        assertEquals(1, user.getIdUser());
    }

//    @Test
//    void testSetIdUserIfEmpty() {
//        LocalDateTime dt1 = LocalDateTime.now();
//        LocalDateTime dt2 = LocalDateTime.now();
//        logger.info("TEST {} {}", dt1, dt2);
//        User user = new User(0, "Boris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
//        user.setIdUser(1);
//        assertEquals(1, user.getIdUser());
//    }

    @Test
    void testGetName() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        User user = new User(6, "Boris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
        assertEquals("Boris", user.getName());
    }

    @Test
    void testSetName() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        User user = new User(6, "Boris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
        user.setName("Vladimir");
        assertEquals("Vladimir", user.getName());    }

//    @Test
//    void testSetNameIfEmpty() {
//        LocalDateTime dt1 = LocalDateTime.now();
//        LocalDateTime dt2 = LocalDateTime.now();
//        logger.info("TEST {} {}", dt1, dt2);
//        User user = new User(6, null, "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
//        user.setName("Vladimir");
//        assertEquals("Vladimir", user.getName());    }

    @Test
    void testGetSurname() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        User user = new User(6, "Boris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
        assertEquals("Johnson", user.getSurname());
    }

    @Test
    void testSetSurname() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        User user = new User(6, "Boris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
        user.setSurname("Zelenskiy");
        assertEquals("Zelenskiy", user.getSurname());    }

//    @Test
//    void testSetSurnameIfEmpty() {
//        LocalDateTime dt1 = LocalDateTime.now();
//        LocalDateTime dt2 = LocalDateTime.now();
//        logger.info("TEST {} {}", dt1, dt2);
//        User user = new User(6, "Boris", null, "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
//        user.setSurname("Zelenskiy");
//        assertEquals("Zelenskiy", user.getSurname());    }

    @Test
    void testGetLogin() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        User user = new User(6, "Boris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
        assertEquals("borya1964", user.getLogin());
    }

    @Test
    void testSetLogin() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        User user = new User(6, "Boris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
        user.setLogin("zelya1978");
        assertEquals("zelya1978", user.getLogin());    }

//    @Test
//    void testSetLoginIfEmpty() {
//        LocalDateTime dt1 = LocalDateTime.now();
//        LocalDateTime dt2 = LocalDateTime.now();
//        logger.info("TEST {} {}", dt1, dt2);
//        User user = new User(6, "Boris", "Johnson", null, "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
//        user.setLogin("zelya1978");
//        assertEquals("zelya1978", user.getLogin());    }

    @Test
    void testGetStatus() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        User user = new User(6, "Boris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
        assertEquals("Online", user.getStatus());
    }

    @Test
    void testSetStatus() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        User user = new User(6, "Boris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
        user.setStatus("Online");
        assertEquals("Online", user.getStatus());    }

    @Test
    void testGetRegistrationDateTime() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        User user = new User(6, "Boris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
        assertEquals("1964-06-19 00:00:00", user.getRegistrationDateTime());
    }

    @Test
    void testSetRegistrationDateTime() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        User user = new User(6, "Boris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
        user.setRegistrationDateTime("1978-01-25 00:00:00");
        assertEquals("1978-01-25 00:00:00", user.getRegistrationDateTime());    }

//    @Test
//    void testSetRegistrationDateTimeIfEmpty() {
//        LocalDateTime dt1 = LocalDateTime.now();
//        LocalDateTime dt2 = LocalDateTime.now();
//        logger.info("TEST {} {}", dt1, dt2);
//        User user = new User(6, "Boris", "Johnson", "borya1964", "Online", null, "2019-07-24 12:00:00", 57);
//        user.setRegistrationDateTime("1978-01-25 00:00:00");
//        assertEquals("1978-01-25 00:00:00", user.getRegistrationDateTime());    }

    @Test
    void testGetLastOrderDateTime() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        User user = new User(6, "Boris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
        assertEquals("2019-07-24 12:00:00", user.getLastOrderDateTime());
    }

    @Test
    void testSetLastOrderDateTime() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        User user = new User(6, "Boris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
        user.setLastOrderDateTime("2019-05-20 12:00:00");
        assertEquals("2019-05-20 12:00:00", user.getLastOrderDateTime());    }

    @Test
    void testGetIndexOfProductsPurchased() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        User user = new User(6, "Boris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
        assertEquals(57, user.getIndexOfProductsPurchased());
    }

    @Test
    void testSetIndexOfProductsPurchased() {
        LocalDateTime dt1 = LocalDateTime.now();
        LocalDateTime dt2 = LocalDateTime.now();
        logger.info("TEST {} {}", dt1, dt2);
        User user = new User(6, "Boris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
        user.setIndexOfProductsPurchased(100500);
        assertEquals(100500, user.getIndexOfProductsPurchased());    }

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