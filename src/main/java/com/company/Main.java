package com.company;

import com.company.dao.order.DAOOrderImpl;
import com.company.dao.product.DAOProductImpl;
import com.company.dao.shoppingcart.DAOShoppingCartImpl;
import com.company.entity.Order;
import com.company.entity.Product;
import com.company.entity.ShoppingCart;
import com.company.entity.User;
import com.company.dao.user.DAOUserImpl;

import java.sql.*;
import java.util.List;
import java.util.logging.Logger;

public class Main {

    //private static final Logger logger = Logger.getGlobal();

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //logger.info("Logger works");

        //DAOOrderImpl

        DAOOrderImpl daoOrderImpl = new DAOOrderImpl();
        Order order = new Order();

        List<Order> orders = daoOrderImpl.getAllOrders();
        for (Order e: orders)
        {
            System.out.println(e);
        }

        System.out.println(daoOrderImpl.getByIdOrder(1));

        //DAOProductImpl

        DAOProductImpl daoProductImpl = new DAOProductImpl();
        Product product = new Product();

        List<Product> products = daoProductImpl.getAllProducts();
        for (Product e: products)
        {
            System.out.println(e);
        }

        System.out.println(daoProductImpl.getByIdProduct(2));

        //DAOShoppingCartImpl

        DAOShoppingCartImpl daoShoppingCartImpl = new DAOShoppingCartImpl();
        ShoppingCart shoppingCart = new ShoppingCart();

        List<ShoppingCart> shoppingCarts = daoShoppingCartImpl.getAllShoppingCarts();
        for (ShoppingCart e: shoppingCarts)
        {
            System.out.println(e);
        }

        System.out.println(daoShoppingCartImpl.getByIdShoppingCart(3));

        //DAOUserImpl

        DAOUserImpl daoUserImpl = new DAOUserImpl();
        User user = new User();

        List<User> users = daoUserImpl.getAllUsers();
        for (User e: users)
        {
            System.out.println(e);
        }

        System.out.println(daoUserImpl.getByIdUser(users.get(users.size()-1).getIdUser()));

        /*
        daoUserImpl.getByIdUser(user.getIdUser());
        System.out.println(user);
        daoUserImpl.addUser(user);
        daoUserImpl.deleteUser(user.getIdUser());
        daoUserImpl.update(user);

        for (User e: users)
        {
            System.out.println(e);
        }
*/
        //System.out.println(user.getById(int idUser));
        //DBWorker worker = new DBWorker();
        //String query = "select * from User where idUser = 2";

        //1) всех пользователей записать или добавить в коллекцию users
        //2) метод getAllUsers()

        //getAllUsers
       // String query = "select * from user";
        //List<User> users = new ArrayList<>();

        //users.add(1, user1);

//реализовать все методы в DAOUSERImpl
    }
}