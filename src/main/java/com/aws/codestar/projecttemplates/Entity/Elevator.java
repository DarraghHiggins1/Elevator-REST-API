package com.aws.codestar.projecttemplates.Entity;

public class Elevator {

    private int id;
    private String name;
    private String floors;
    private int currentFloor;
    private String state;

    public Elevator(int id, String name, String floors, int currentfloor, String state){
        this.id = id;
        this.name = name;
        this.floors = floors;
        this.currentFloor = currentfloor;
        this.state = state;
    }

    public Elevator(){
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

    public String getFloors() {
        return floors;
    }

    public void setFloors(String floors) {
        this.floors = floors;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

