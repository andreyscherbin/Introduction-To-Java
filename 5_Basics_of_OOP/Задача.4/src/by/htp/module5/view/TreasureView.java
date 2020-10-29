package by.htp.module5.view;

import by.htp.module5.entity.Treasure;
import by.htp.module5.logic.TreasureLogic;

import java.util.List;

public class TreasureView {

    public void print(Treasure treasure) {

        System.out.println("Treasure: " + treasure.toString());
    }

    public void print(List<Treasure> treasures) {

        for (Treasure treasure : treasures) {
            System.out.println("Treasure: " + treasure.toString());
        }
    }

    public void print(String error){

        System.out.println(error);
    }

}
