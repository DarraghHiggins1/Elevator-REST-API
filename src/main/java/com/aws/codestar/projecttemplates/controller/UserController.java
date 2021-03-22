package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.Entity.User;
import com.aws.codestar.projecttemplates.service.UserService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final String MESSAGE_FORMAT = "SUCCESS %s";

    @Autowired
    private UserService userservice;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<User>  getAllUsers(){
        return userservice.getAllUsers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity  AddUser(  String username, String building){
        // @RequestParam(value = "name", defaultValue = "Darragh") String username,@RequestParam(value = "building", defaultValue = "Sea Road Offices") String building
         userservice.AddUser(username,building);
        return ResponseEntity.ok(createResponse("AddUser"));
    }


    private String createResponse(String name) {
        return new JSONObject().put("Output", String.format(MESSAGE_FORMAT, name)).toString();
    }

}
