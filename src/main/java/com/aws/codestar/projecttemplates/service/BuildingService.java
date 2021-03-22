package com.aws.codestar.projecttemplates.service;

import com.aws.codestar.projecttemplates.Dao.BuildingDao;
import com.aws.codestar.projecttemplates.Entity.Building;
import com.aws.codestar.projecttemplates.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BuildingService {

    @Autowired
    @Qualifier("building")
    private BuildingDao buildingdao;


    public Collection<Building> getAllBuildings() {
        return this.buildingdao.getAllBuildings();
    }

    /*
    public Building getBuildingByUser(String userid) {
        return this.buildingdao.getBuildingByUser(userid);
    }
    */



}
