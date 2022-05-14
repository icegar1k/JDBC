package com.company.entity;

import java.util.List;
import java.util.Objects;

public class User
{
    private int idUser;
    private String name;
    private String surname;
    private String login;
    private String status;
    private String registrationDateTime;
    private String lastOrderDateTime;
    private int indexOfProductsPurchased;

    public User() {
    }

    public User(int idUser,
                String name,
                String surname,
                String login,
                String status,
                String registrationDateTime,
                String lastOrderDateTime,
                int indexOfProductsPurchased) {
        
        this.idUser = idUser;
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.status = status;
        this.registrationDateTime = registrationDateTime;
        this.lastOrderDateTime = lastOrderDateTime;
        this.indexOfProductsPurchased = indexOfProductsPurchased;
    }

    public User(String name,
                String surname,
                String login,
                String status,
                String registrationDateTime,
                String lastOrderDateTime,
                int indexOfProductsPurchased) {

        this.name = name;
        this.surname = surname;
        this.login = login;
        this.status = status;
        this.registrationDateTime = registrationDateTime;
        this.lastOrderDateTime = lastOrderDateTime;
        this.indexOfProductsPurchased = indexOfProductsPurchased;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
            this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
            this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
            this.login = login;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRegistrationDateTime() {
        return registrationDateTime;
    }

    public void setRegistrationDateTime(String registrationDateTime) {
            this.registrationDateTime = registrationDateTime;
    }

    public String getLastOrderDateTime() {
        return lastOrderDateTime;
    }

    public void setLastOrderDateTime(String lastOrderDateTime) {
        this.lastOrderDateTime = lastOrderDateTime;
    }

    public int getIndexOfProductsPurchased() {
        return indexOfProductsPurchased;
    }

    public void setIndexOfProductsPurchased(int indexOfProductsPurchased) {
        this.indexOfProductsPurchased = indexOfProductsPurchased;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return indexOfProductsPurchased == user.indexOfProductsPurchased && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(login, user.login) && Objects.equals(status, user.status) && Objects.equals(registrationDateTime, user.registrationDateTime) && Objects.equals(lastOrderDateTime, user.lastOrderDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUser, name, surname, login, status, registrationDateTime, lastOrderDateTime, indexOfProductsPurchased);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "idUser=" + idUser +
                ", name=" + name +
                ", surname=" + surname +
                ", login=" + login +
                ", status=" + status +
                ", registrationDateTime=" + registrationDateTime +
                ", lastOrderDateTime=" + lastOrderDateTime +
                ", indexOfProductsPurchased=" + indexOfProductsPurchased +
                '}';
    }
}