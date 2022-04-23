package com.company.dao.user;

import com.company.entity.User;

import java.util.List;

public interface DAOUser {
    public List<User> getAllUsers();
    public User getByIdUser(int idUser);
    public void addUser (User user);
    public void deleteUser (int idUser);
    public void update(User user);
}