package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;
public class UserServiceImpl implements UserService {

    UserDao ud = new UserDaoJDBCImpl();
    // UserDao ud = new UserDaoHibernateImpl();

    public void createUsersTable() throws ClassNotFoundException {
        ud.createUsersTable();
    }

    public void dropUsersTable() throws ClassNotFoundException {
        ud.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) throws ClassNotFoundException {
        ud.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) throws ClassNotFoundException {
        ud.removeUserById(id);
    }

    public List<User> getAllUsers() throws ClassNotFoundException {
        return ud.getAllUsers();
    }

    public void cleanUsersTable() throws ClassNotFoundException {
        ud.cleanUsersTable();
    }
}