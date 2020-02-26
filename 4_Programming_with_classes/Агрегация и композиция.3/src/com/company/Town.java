package com.company;

public class Town {

    private String nameTown;
    private int area;

    Town(String nameTown, int area) {
        this.nameTown = nameTown;
        this.area = area;
    }

    public String getNameTown() {
        return nameTown;
    }

    public int getAreaTown() {
        return area;
    }
}
