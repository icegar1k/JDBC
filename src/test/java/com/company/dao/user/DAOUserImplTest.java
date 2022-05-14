package com.company.dao.user;

import com.company.entity.User;
import org.junit.jupiter.api.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class DAOUserImplTest {

    DAOUserImpl daoUserImpl = new DAOUserImpl();
    User testVladimir = new User("TestVladimir", "Zelenskiy", "zelya1978", "Online", "1978-01-25 00:00:00", "2019-05-20 12:00:00", 100500);
    List<User> testUsers = daoUserImpl.getAllUsers();
    User testUser = testUsers.get(testUsers.size()-1);
    User testUpdateVladimir = new User("TestUpdateVladimir", "TestUpdateZelenskiy", "TestUpdateZelya1978", "TestUpdateOnline", "2008-01-25 00:00:00", "2022-05-20 12:00:00", 5100500);

    @Order(1)
    @Test
    void testAddUser() {
        daoUserImpl.addUser(testVladimir);
        testUsers = daoUserImpl.getAllUsers();
        assertTrue(testUsers.contains(testVladimir));
    }

    @Order(2)
    @Test
    void testGetAllUsers() {
        assertTrue(testUsers.contains(testVladimir));
        }

    @Order(3)
    @Test
    void testGetByIdUser() {
        assertEquals(testUser, daoUserImpl.getByIdUser(testUser.getIdUser()));
    }

    @Order(4)
    @Test
    void testUpdateUser() {
        daoUserImpl.updateUser(testVladimir);
        testUsers = daoUserImpl.getAllUsers();
        assertTrue(testUsers.contains(testVladimir));
    }

    @Order(5)
    @Test
    void testDeleteUser() {
        daoUserImpl.deleteUser(testUser.getIdUser());
        testUsers = daoUserImpl.getAllUsers();
        assertFalse(testUsers.contains(testVladimir));
    }
  }