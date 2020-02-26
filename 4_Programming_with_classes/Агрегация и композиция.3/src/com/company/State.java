package com.company;

public class State {

    private String nameState;
    private Town capital;
    private Region[] regions;

    State(String nameState, Town capital, Region[] regions) {
        this.nameState = nameState;
        this.capital = capital;
        this.regions = regions;
    }

    public String getNameCapital() {
        return capital.getNameTown();
    }

    public int getCountRegions() {
        return regions.length;
    }

    public int getAreaState() {
        int areaState = 0;
        for (Region region : regions) {
            areaState += region.getAreaRegion();
        }
        return areaState;
    }

    public void printNameRegions() {
        for (Region region : regions) {
            System.out.println(region.getNameRegion());
        }
    }
}
