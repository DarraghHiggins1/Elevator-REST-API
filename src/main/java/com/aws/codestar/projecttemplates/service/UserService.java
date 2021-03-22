package com.aws.codestar.projecttemplates.service;

import com.aws.codestar.projecttemplates.Dao.UserDao;
import com.aws.codestar.projecttemplates.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

@Service
public class UserService {

    @Autowired
    @Qualifier("user")
    private UserDao userdao;


    public Collection<User> getAllUsers() {
        return this.userdao.getAllUsers();
    }

    public User getUserByID(@RequestParam(value = "name", defaultValue = "Dummy") String userid) {
        return this.userdao.getUserByID(userid);
    }

    public void AddUser(@RequestParam(value = "name", defaultValue = "Dummy") String username,@RequestParam(value = "buildings", defaultValue = "Dummy") String buildings) {
        this.userdao.AddUser(username,buildings);
    }





}
