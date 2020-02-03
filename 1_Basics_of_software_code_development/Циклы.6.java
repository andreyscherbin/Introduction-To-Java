package com.company;

import java.util.Scanner;

public class Main {

    /*
     * Вывести на экран соответствия между символами и их численными обозначениями в память компьютера
     */
    public static void main(String[] args) {

        char character = 0;
        for (int i = 0; i <= 255; i++) {
            character = (char) i;
            System.out.printf("Character %c Number %d\n", character, (int) character);
        }

    }
}
