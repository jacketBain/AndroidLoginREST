package com.example.webserverandroid.services;

import com.example.webserverandroid.model.User;

public interface UserService {
    User getUserByLogin(String login);
    boolean isUserExists(String login);
}
