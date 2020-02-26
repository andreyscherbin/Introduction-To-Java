package com.company;

public class Region {

    private String nameRegion;
    private Town regionalCentr;
    private District[] districts;

    Region(String nameRegion, Town regionalCentr, District[] districts) {
        this.nameRegion = nameRegion;
        this.regionalCentr = regionalCentr;
        this.districts = districts;
    }

    public int getAreaRegion() {
        int areaRegion = 0;
        for (District district : districts) {
            areaRegion += district.getAreaDistrict();
        }
        return areaRegion;
    }

    public String getNameRegion() {
        return nameRegion;
    }
}
