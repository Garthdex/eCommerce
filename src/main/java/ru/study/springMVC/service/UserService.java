package ru.study.springMVC.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.study.springMVC.dao.UserDao;
import ru.study.springMVC.model.User;

import java.util.List;

/**
 * Created by Anton on 29.10.2017.
 */
@Service
public class UserService {

    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    public void addUser(User user) {
        this.userDao.addUser(user);
    }

    @Transactional
    public User updateUser(User user) {
        this.userDao.updateUser(user);

        return user;
    }

    @Transactional
    public User deleteUser(long id) {
        User user = getUserById(id);
        this.userDao.deleteUser(id);

        return user;
    }

    @Transactional
    public User getUserById(long id) {
        return this.userDao.getUserById(id);
    }

    @Transactional
    public List<User> getUserList() {
        return this.userDao.getUserList();
    }
}
