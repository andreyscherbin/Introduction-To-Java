package com.Treasure;

public class Treasure {

    private String nameTreasure;
    private int costTreasure;

    public Treasure(String nameTreasure, int costTreasure) {
        this.nameTreasure = nameTreasure;
        this.costTreasure = costTreasure;
    }

    public String getNameTreasure() {
        return nameTreasure;
    }

    public int getCostTreasure() {
        return costTreasure;
    }

    @Override
    public String toString() {
        return "nameTreasure: " + nameTreasure + " costTreasure: " + costTreasure;
    }
}
