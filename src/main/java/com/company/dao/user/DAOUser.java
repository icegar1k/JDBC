package com.company.dao.user;

import com.company.entity.User;

import java.util.List;

public interface DAOUser {
    public void addUser (User user);
    public List<User> getAllUsers();
    public User getByIdUser(int idUser);
    public void updateUser(User user);
    public void deleteUser (int idUser);
}