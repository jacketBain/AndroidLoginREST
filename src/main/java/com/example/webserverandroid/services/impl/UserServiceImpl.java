package com.example.webserverandroid.services.impl;

import com.example.webserverandroid.dao.UserDAO;
import com.example.webserverandroid.model.User;
import com.example.webserverandroid.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public User getUserByLogin(String login) {
        return userDAO.findByLogin(login);
    }

    @Override
    public boolean isUserExists(String login) {
        return userDAO.existsByLogin(login);
    }
}
