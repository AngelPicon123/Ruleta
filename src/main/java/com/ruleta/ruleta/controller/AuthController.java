package com.ruleta.ruleta.controller;


import com.ruleta.ruleta.model.User;
import com.ruleta.ruleta.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public User login(@RequestBody User user){
        User existingUser = userService.findByUsername(user.getUsername());
        if(existingUser != null && existingUser.getPassword().equals(user.getPassword())){
            return existingUser;
        }
        throw new RuntimeException("Invalid credentials");
    }
}
