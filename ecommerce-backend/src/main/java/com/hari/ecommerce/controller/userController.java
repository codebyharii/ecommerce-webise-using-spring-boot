package com.hari.ecommerce.controller;

import java.util.List;

import com.hari.ecommerce.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hari.ecommerce.serviece.uesrService;

@RestController
@RequestMapping("/User")
@CrossOrigin("*")
public class userController {

    @Autowired
    private uesrService uesrService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user){
        return uesrService.registeruser(user);
    }

    @PostMapping("/login")
    public User loginUser(@RequestBody User user){
        return uesrService.loginUser(user.getEmail(), user.getPassword());
    }

    @GetMapping
    public List<User> getAllUser() {
        return uesrService.getAllUser();
    }

}
