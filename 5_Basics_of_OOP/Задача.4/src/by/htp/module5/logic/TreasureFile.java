package by.htp.module5.logic;

import by.htp.module5.entity.Treasure;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TreasureFile {

    public List<Treasure> readFile(String nameFile) throws IOException {

        FileReader fileTreasures = new FileReader(nameFile);
        Scanner scan = new Scanner(fileTreasures);
        int i = 0;
        List<Treasure> treasures = new ArrayList<Treasure>();

        while (scan.hasNextLine()) {

            String string = scan.nextLine();
            String[] strings = string.split("-");
            int costTreasure = Integer.parseInt(strings[1]);
            String nameTreasure = strings[0];
            treasures.add(new Treasure(nameTreasure, costTreasure));
            i++;
        }

        fileTreasures.close();
        return treasures;
    }

}
