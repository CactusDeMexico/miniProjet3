package com.pancarte.gotham.service;

import com.pancarte.gotham.model.User;

import java.util.List;

public interface UserService {

    public User findUserByEmail(String email);
    String queryUser();
    User findById(int id);

    public void saveUser(User user);
    List<User> findAll();


}
