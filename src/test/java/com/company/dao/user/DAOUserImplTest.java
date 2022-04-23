package com.company.dao.user;

import com.company.entity.User;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DAOUserImplTest {

    @Test
    void getAllUsers() {
        List<User> users = new ArrayList<>();
        User boris = new User(1, "Boris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
        User loris = new User(2, "Loris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
        User moris = new User(3, "Moris", "Johnson", "borya1964", "Online", "1964-06-19 00:00:00", "2019-07-24 12:00:00", 57);
        users.add(boris);
        users.add(loris);
        users.add(moris);
    }

    @Test
    void getByIdUser() {
    }

    @Test
    void addUser() {
    }

    @Test
    void deleteUser() {
    }

    @Test
    void update() {
    }
}