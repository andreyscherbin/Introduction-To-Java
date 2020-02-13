package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Дан текст(строка). Найдите наибольшее количество подряд идущих пробелов в нем.
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String string;
        string = "HELLO MY FRIEND    HOW ARE   YOU";
        int maxSpaces = 0, i = 0, j = 0;
        int counterSpaces = 0;
        do {
            char ch = string.charAt(i);
            if (ch == ' ') {
                counterSpaces = 0;
                j = i;
                do {
                    j++;
                    counterSpaces++;
                    ch = string.charAt(j);
                } while (ch == ' ' && j < string.length() - 1);
                if (counterSpaces > maxSpaces) {
                    maxSpaces = counterSpaces;
                }
                i = j;
            }
            i++;
        } while (i < string.length() - 1);
        System.out.println(maxSpaces);
    }
}
