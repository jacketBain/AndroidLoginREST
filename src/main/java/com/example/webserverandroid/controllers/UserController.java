package com.example.webserverandroid.controllers;

import com.example.webserverandroid.dto.RequestDTO;
import com.example.webserverandroid.dto.UserDto;
import com.example.webserverandroid.model.User;
import com.example.webserverandroid.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/")
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping(value = "/index")
    public String index() {
        return "index.html";
    }


    @PostMapping("/auth")
    ResponseEntity<?> checkAuth(@RequestBody UserDto userDto) throws URISyntaxException {
        User user = new User();
        if (userService.isUserExists(userDto.getLogin())){
            user = userService.getUserByLogin(userDto.getLogin());
            if(user.getPassword().equals(userDto.getPassword()))
                return ResponseEntity.ok().body(new RequestDTO("Authorized"));
            else
                return ResponseEntity.badRequest().body(new RequestDTO("PasswordWrong"));
        }
        else
            return ResponseEntity.badRequest().body(new RequestDTO("UserWrong"));

    }
}
