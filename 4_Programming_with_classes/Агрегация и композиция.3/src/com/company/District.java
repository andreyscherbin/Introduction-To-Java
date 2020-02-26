package com.company;

public class District {

    private String nameDistrict;
    private Town[] towns;

    District(String nameDistrict, Town[] towns) {
        this.towns = towns;
        this.nameDistrict = nameDistrict;
    }

    public int getAreaDistrict() {
        int areaDistrict = 0;
        for (Town town : towns) {
            areaDistrict += town.getAreaTown();
        }
        return areaDistrict;
    }
}
