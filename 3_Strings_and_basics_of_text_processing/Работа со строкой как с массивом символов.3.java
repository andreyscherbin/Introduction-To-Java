package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * В строке найти количество цифр.
     */
    public static void main(String[] args) {

        int digitsCounter = 0;
        Scanner in = new Scanner(System.in);
        char[] string;
        string = "word!@4#%4$%^&(*)65".toCharArray();
        for (int i = 0; i < string.length; i++) {
            if (string[i] >= 48 && string[i] <= 57) {
                digitsCounter++;
            }
        }
        System.out.println(digitsCounter);
    }
}
