package com.Main;

import com.Cave.Cave;
import com.Dragon.Dragon;
import com.Treasure.Treasure;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {

        FileReader fileTreasures = new FileReader("treasures.txt");
        Scanner scan = new Scanner(fileTreasures);
        int i = 0;
        Treasure[] treasures = new Treasure[100];

        while (scan.hasNextLine()) {

            String string = scan.nextLine();
            String[] strings = string.split(" ");
            int costTreasure = Integer.parseInt(strings[1]);
            String nameTreasure = strings[0];
            treasures[i] = new Treasure(nameTreasure, costTreasure);
            i++;
        }
        Dragon dragon = new Dragon();
        Cave cave = new Cave(treasures, dragon);
        dragon.setCave(cave);

        int inputNumber = 0;
        String inputString = "";
        scan = new Scanner(System.in);

        while (!"4".equals(inputString)) {
            System.out.println("1. ��� ��������� �������� � ������ ������� ������� 1");
            System.out.println("2. ��� ������ ������ ������ ��������� � ������ ������� 2");
            System.out.println("3. ��� ������ ������ �������� �� �������� ����� �������� 3");
            System.out.println("4. ��� ������ �� ���������� ������� 4");
            inputString = scan.next();

            try {
                inputNumber = Integer.parseInt(inputString);
            } catch (NumberFormatException e) {
                System.out.println("�������� ����");
            }

            switch (inputNumber) {
                case 1:
                    dragon.viewTreasures();
                    break;
                case 2:
                    dragon.searchmMostValuableTreasure();
                    break;
                case 3:
                    int cost = 0;
                    System.out.println("������� ����� ������ ��������");
                    cost = scan.nextInt();
                    dragon.treasureSelection(cost);
            }
        }
        System.out.println("�� ��������!");
        fileTreasures.close();
    }
}
