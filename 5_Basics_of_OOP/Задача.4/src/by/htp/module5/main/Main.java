package by.htp.module5.main;


import by.htp.module5.entity.Dragon;
import by.htp.module5.entity.Treasure;
import by.htp.module5.logic.TreasureFile;
import by.htp.module5.logic.TreasureLogic;
import by.htp.module5.view.TreasureView;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * Приложение должно быть объектно-, а не процедурно-ориентированным.
 * Каждый класс должен иметь отражающее смысл название и информативный состав.
 * Наследование должно применяться только тогда, когда это имеет смысл.
 * При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 * Классы должны быть грамотно разложены по пакетам.
 * Консольное меню должно быть минимальным.
 * Для хранения данных можно использовать файлы.
 *
 * Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
 * Реализовать возможность просмотра сокровищ, выбор самого дорого по стоимости сокровища и выбора сокровищ на заданную
 * сумму
 */

public class Main {

    public static void main(String[] args) {

        TreasureLogic treasureLogic = new TreasureLogic();
        TreasureView treasureView = new TreasureView();
        TreasureFile treasureFile = new TreasureFile();
        Dragon dragon = new Dragon();
        try {
            dragon.setTreasures(treasureFile.readFile("treasures.txt"));
        } catch (FileNotFoundException e) {
            treasureView.print("file not found");
        } catch (IOException e) {
            treasureView.print("close file error");
        }

        int inputNumber = 0;
        String inputString = "";
        Scanner scan = new Scanner(System.in);

        while (!"4".equals(inputString)) {
            System.out.println("1. Для просмотра сокровищ в пещере дракона введите 1");
            System.out.println("2. Для выбора самого дорого сокровища в пещере введите 2");
            System.out.println("3. Для выбора набора сокровищ на заданную сумму ввведите 3");
            System.out.println("4. Для выхода из приложения введите 4");
            inputString = scan.next();

            try {
                inputNumber = Integer.parseInt(inputString);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }

            switch (inputNumber) {
                case 1:
                    treasureView.print(dragon.getTreasures());
                    break;

                case 2:
                    treasureView.print(treasureLogic.searchMostValuableTreasure(dragon.getTreasures()));
                    break;

                case 3:
                    int cost = 0;
                    System.out.println("Введите сумму набора сокровищ");
                    cost = scan.nextInt();
                    treasureView.print(treasureLogic.treasureSelection(dragon.getTreasures(), cost));

                default:
                    System.out.println("Повторите ввод");
                    break;
            }
        }
        System.out.println("До свидания!");
    }
}
