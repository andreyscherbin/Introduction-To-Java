package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
     * Крайние пробелы в строке удалить
     */
    public static void main(String[] args) {

        int i = 0;
        Scanner in = new Scanner(System.in);
        char[] string;

        string = "      HELLO        MY    FRIEND   HOW   ARE YOU".toCharArray();
        while (string[i] == ' ') {
            for (int j = i; j < string.length - 1; j++) {
                string[j] = string[j + 1];
            }
        }
        for (i = 1; i < string.length - 1; i++) {

            if (string[i] == ' ' && string[i + 1] == ' ') {
                for (int j = i; j < string.length - 1; j++) {
                    string[j] = string[j + 1];
                }
                i = i - 1;
            }
        }
        System.out.println(string);
    }
}
