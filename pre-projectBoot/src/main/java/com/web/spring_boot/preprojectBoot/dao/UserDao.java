package com.web.spring_boot.preprojectBoot.dao;

import com.web.spring_boot.preprojectBoot.user.User;


import java.util.List;


public interface UserDao {

    public List<User> getAllUser();

    public void saveUser(User user);

    public User getUser(long id);


    public void deleteUser(long id);


    public void updateUser(Long id, User user);
}
