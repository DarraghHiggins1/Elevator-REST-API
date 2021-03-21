package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.Entity.Elevator;
import com.aws.codestar.projecttemplates.service.ElevatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/elevator")
public class ElevatorController {

    @Autowired
    private ElevatorService elevatorservice;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Elevator> getAlElevators(){
        return elevatorservice.getAlElevators();
    }



}
