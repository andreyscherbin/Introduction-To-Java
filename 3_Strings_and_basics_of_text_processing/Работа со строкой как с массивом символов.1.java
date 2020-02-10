package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
     */
    public static void main(String[] args) {

        int counterUpperCase = 0;
        Scanner in = new Scanner(System.in);
        char[] string;
        string = "HelloMyFriendHowAreYou".toCharArray();
        for (int i = 0; i != string.length; i++) {
            if (string[i] >= 'A' && string[i] <= 'Z' && i != 0) {
                counterUpperCase++;
            }
        }
        char[] new_string = new char[string.length + counterUpperCase];
        for (int i = 0; i != string.length; i++) {
            new_string[i] = string[i];
        }
        string = new_string;
        for (int i = 0; i != string.length; i++) {
            if (string[i] >= 'A' && string[i] <= 'Z' && i != 0) {
                string[i] = (char) (string[i] + 32);
                for (int j = string.length - 2; j >= i; j--) {
                    string[j + 1] = string[j];
                }
                string[i] = '_';
            }
        }
        System.out.println(string);
    }
}
