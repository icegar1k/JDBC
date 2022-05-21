package com.company.dao.user;

import com.company.entity.User;
import org.junit.jupiter.api.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class DAOUserImplTest {

    DAOUserImpl daoUserImpl = new DAOUserImpl();
    User testNewUser = new User("Vladolf ", "Putler ", "putya1952", "Offline", "1952-10-07 00:00:00", "2022-02-24 04:00:00", 0);
    List<User> testUsers = daoUserImpl.getAllUsers();
    User testUser = testUsers.get(testUsers.size()-1);

    @Order(1)
    @Test
    void testAddUser() {
        System.out.println("BeforeAdd");
        System.out.println(testNewUser);
        daoUserImpl.addUser(testNewUser);
        testUsers = daoUserImpl.getAllUsers();
        testNewUser = testUsers.get(testUsers.size()-1);
        System.out.println("AfterAdd");
        System.out.println(testNewUser);
        assertTrue(testUsers.contains(testNewUser));
    }

    @Order(2)
    @Test
    void testGetAllUsers() {
        assertTrue(testUsers.contains(testNewUser));
        }

    @Order(3)
    @Test
    void testGetByIdUser() {
        assertEquals(testUser, daoUserImpl.getByIdUser(testUser.getIdUser()));
    }

    @Order(4)
    @Test
    void testUpdateUser() {
        testNewUser = testUsers.get(testUsers.size()-1);
        System.out.println("testUpdate");
        testNewUser.setName("Updated");
        System.out.println(testNewUser);
        daoUserImpl.updateUser(testNewUser);
        System.out.println(daoUserImpl.getByIdUser(testNewUser.getIdUser()));
        assertEquals(testNewUser, daoUserImpl.getByIdUser(testNewUser.getIdUser()));
    }

    @Order(5)
    @Test
    void testDeleteUser() {
        testNewUser = testUsers.get(testUsers.size()-1);
        daoUserImpl.deleteUser(testNewUser.getIdUser());
        testUsers = daoUserImpl.getAllUsers();
        assertFalse(testUsers.contains(testNewUser));
    }
  }