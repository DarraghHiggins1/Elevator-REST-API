package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.Entity.User;
import com.aws.codestar.projecttemplates.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userservice;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<User>  getAllUsers(){
        return userservice.getAllUsers();
    }



}
