package com.Cave;

import com.Dragon.Dragon;
import com.Treasure.Treasure;

import java.util.ArrayList;
import java.util.List;

public class Cave {

    private Dragon dragon;
    private Treasure[] treasures;

    public Cave(Treasure[] treasures, Dragon dragon) {
        this.treasures = treasures;
        this.dragon = dragon;
    }

    public void viewTreasures() {

        for (Treasure treasure : treasures) {
            System.out.println(treasure.toString());
        }

    }

    public Treasure searchmMostValuableTreasure() {

        int maxCost = 0;
        String nameTreasure = "";

        for (Treasure treasure : treasures) {
            if (treasure.getCostTreasure() > maxCost) {
                maxCost = treasure.getCostTreasure();
                nameTreasure = treasure.getNameTreasure();
            }
        }
        return new Treasure(nameTreasure, maxCost);
    }

    public List<Treasure> treasureSelection(int cost) {

        List<Treasure> selectedTreasures = new ArrayList<>();
        int sizeTreasures = this.treasures.length;
        for (Treasure treasure : this.treasures) {
            if (cost - treasure.getCostTreasure() > 0) {
                selectedTreasures.add(treasure);
                cost -= treasure.getCostTreasure();
                sizeTreasures--;
            } else {
                break;
            }
        }
        Treasure[] treasures = new Treasure[sizeTreasures];
        for (int i = 0; i < treasures.length; i++) {
            String nameTreasure = this.treasures[this.treasures.length - sizeTreasures + i].getNameTreasure();
            int costTreasure = this.treasures[this.treasures.length - sizeTreasures + i].getCostTreasure();
            treasures[i] = new Treasure(nameTreasure, costTreasure);
        }

        this.treasures = treasures;
        return selectedTreasures;
    }
}
