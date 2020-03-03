package com.Main;

import com.Cave.Cave;
import com.Dragon.Dragon;
import com.Treasure.Treasure;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
                    dragon.viewTreasures();
                    break;

                case 2:
                    dragon.searchmMostValuableTreasure();
                    break;

                case 3:
                    int cost = 0;
                    System.out.println("Введите сумму набора сокровищ");
                    cost = scan.nextInt();
                    dragon.treasureSelection(cost);

                default:
                    System.out.prinltn("Повторите ввод");
                    break;
            }
        }
        System.out.println("До свидания!");
        fileTreasures.close();
    }
}
