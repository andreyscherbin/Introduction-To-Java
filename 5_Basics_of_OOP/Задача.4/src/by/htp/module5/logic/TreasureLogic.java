package by.htp.module5.logic;

import by.htp.module5.entity.Treasure;

import java.util.ArrayList;
import java.util.List;


public class TreasureLogic {

    public Treasure searchMostValuableTreasure(List<Treasure> treasures) {

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

    public List<Treasure> treasureSelection(List<Treasure> treasures, int cost) {

        List<Treasure> selectedTreasures = new ArrayList<>();
        int sizeTreasures = treasures.size();
        for (Treasure treasure : treasures) {
            if (cost - treasure.getCostTreasure() > 0) {
                selectedTreasures.add(treasure);
                cost -= treasure.getCostTreasure();
                sizeTreasures--;
            } else {
                break;
            }
        }
        List<Treasure> treasures_new = new ArrayList<Treasure>();
        for (int i = 0; i < sizeTreasures; i++) {

            String nameTreasure = treasures.get(treasures.size() - sizeTreasures + i).getNameTreasure();
            int costTreasure = treasures.get(treasures.size() - sizeTreasures + i).getCostTreasure();
            Treasure treasure = new Treasure(nameTreasure, costTreasure);
            treasures_new.add(treasure);
        }

        treasures = treasures_new;

        return selectedTreasures;
    }
}
