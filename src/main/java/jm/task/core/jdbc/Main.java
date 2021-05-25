package jm.task.core.jdbc;


import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;


public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/userdb";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        UserDao dao = new UserDaoJDBCImpl();

        // Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        UserServiceImpl us = new UserServiceImpl();

  //      dao.cleanUsersTable();
//        us.dropUsersTable();
          us.createUsersTable();
//        us.saveUser("'John'", "'Wisdom'", (byte) 35);
//        us.saveUser("'Alice'", "'Brown'", (byte) 27);
//        us.saveUser("'Robert'", "'Edison'", (byte) 25);
//        us.saveUser("'Andy'", "'Hampsteen'", (byte) 32);

       //  us.removeUserById(3);

//        List<User> usersList = us.getAllUsers();
//
//        for (User user : usersList) {
//            System.out.println(user.toString());
//        }


    }
}