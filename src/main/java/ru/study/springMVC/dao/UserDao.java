package ru.study.springMVC.dao;

import ru.study.springMVC.model.User;

import java.util.List;

/**
 * Created by Anton on 29.10.2017.
 */
public interface UserDao {
    public void addUser(User user);

    public void updateUser(User user);

    public void deleteUser(long id);

    public User getUserById(long id);

    public List<User> getUserList();
}
