package com.Dragon;

import com.Cave.Cave;
import com.Treasure.Treasure;

import java.util.ArrayList;
import java.util.List;

public class Dragon {

    private Cave cave;

    public Dragon() {
        cave = null;
    }

    public Dragon(Cave cave) {
        this.cave = cave;
    }

    public void setCave(Cave cave) {
        this.cave = cave;
    }

    public Cave getCave() {
        return cave;
    }

    public void viewTreasures() {

        cave.viewTreasures();
    }

    public void searchmMostValuableTreasure() {

        Treasure mostValuableTreasure = cave.searchmMostValuableTreasure();
        System.out.println("Самое ценное сокровище: " + mostValuableTreasure.toString());
    }

    public void treasureSelection(int cost) {

        List<Treasure> selectedTreasures = cave.treasureSelection(15000);
        for (Treasure treasure : selectedTreasures) {
            System.out.println(treasure.toString());
        }
    }
}
