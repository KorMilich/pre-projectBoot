package com.web.spring_boot.preprojectBoot.service;

import com.web.spring_boot.preprojectBoot.dao.UserDao;
import com.web.spring_boot.preprojectBoot.user.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;


    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);

    }

    @Override
    @Transactional
    public User getUser(long id) {
        return userDao.getUser(id);
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        userDao.deleteUser(id);

    }

    @Transactional
    @Override

    public void updateUser(Long id, User user) {
        userDao.updateUser(id, user);
    }


}
