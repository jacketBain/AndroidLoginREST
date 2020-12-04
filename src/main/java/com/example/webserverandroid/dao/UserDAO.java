package com.example.webserverandroid.dao;

import com.example.webserverandroid.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, String> {
    User findByLogin(String login);
    boolean existsByLogin(String login);
}
