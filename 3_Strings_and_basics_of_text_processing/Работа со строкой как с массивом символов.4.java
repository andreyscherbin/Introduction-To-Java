package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * В строке найти количество чисел.
     */
    public static void main(String[] args) {

        int numberCounter = 0;
        Scanner in = new Scanner(System.in);
        char[] string;
        string = "word!@1#1%1$%^&(*)".toCharArray();
        for (int i = 0; i < string.length; i++) {
            if (string[i] >= 48 && string[i] <= 57) {
                numberCounter++;
                while (i < string.length && string[i] >= 48 && string[i] <= 57) {
                    i++;
                }
            }
        }
        System.out.println(numberCounter);
    }
}
