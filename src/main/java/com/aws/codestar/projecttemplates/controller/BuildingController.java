package com.aws.codestar.projecttemplates.controller;

import com.aws.codestar.projecttemplates.Entity.Building;
import com.aws.codestar.projecttemplates.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/buildings")
public class BuildingController {

    @Autowired
    private BuildingService buildingservice;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Building> getAllBuildings(){
        return buildingservice.getAllBuildings();
    }



}
