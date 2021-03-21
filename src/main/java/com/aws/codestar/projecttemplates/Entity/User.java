package com.aws.codestar.projecttemplates.Entity;

public class User {



    private int id;
    private String name;
    private String buildings;

    public User(int id, String name, String buildings){
        this.id = id;
        this.name = name;
        this.buildings = buildings;
    }

    public User(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBuildings() {
        return buildings;
    }

    public void setBuildings(String buildings) {
        this.buildings = buildings;
    }
}
