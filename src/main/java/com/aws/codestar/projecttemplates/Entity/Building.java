package com.aws.codestar.projecttemplates.Entity;

public class Building {

    private int id;
    private String name;
    private String location;
    private String elevators;

    public Building(int id, String name, String location, String elevators){
        this.id = id;
        this.name = name;
        this.location = location;
        this.elevators = elevators;
    }

    public Building(){
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getElevators() {
        return elevators;
    }

    public void setElevators(String elevators) {
        this.elevators = elevators;
    }
}

