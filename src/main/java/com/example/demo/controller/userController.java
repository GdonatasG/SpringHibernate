package com.example.demo.controller;

import com.example.demo.model.user;
import com.example.demo.model.userCRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
    @Autowired
    private userCRUD userCRUD;


    @GetMapping("/users")
    public @ResponseBody Iterable<user> getusers(){


        return userCRUD.findAll();
    }
}
