package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Замените в строке все вхождения 'word' на 'letter'.
     */
    public static void main(String[] args) {

        int wordCounter = 0;
        Scanner in = new Scanner(System.in);
        char[] string;
        string = "wordword111wordword".toCharArray();
        for (int i = 0; i < string.length; i++) {
            if (i + 3 < string.length) {
                if (string[i] == 'w' && string[i + 1] == 'o' && string[i + 2] == 'r' && string[i + 3] == 'd') {
                    System.out.println("TRUE");
                    wordCounter++;
                }
            }
        }
        char[] new_string = new char[string.length + wordCounter * 2];
        for (int i = 0; i != string.length; i++) {
            new_string[i] = string[i];
        }
        string = new_string;
        for (int i = 0; i < string.length; i++) {
            if (i + 3 < string.length) {
                if (string[i] == 'w' && string[i + 1] == 'o' && string[i + 2] == 'r' && string[i + 3] == 'd') {
                    for (int z = 0; z < 2; z++) {
                        for (int j = string.length - 2; j >= i + 4; j--) {
                            string[j + 1] = string[j];
                        }
                    }
                    string[i] =     'l';
                    string[i + 1] = 'e';
                    string[i + 2] = 't';
                    string[i + 3] = 't';
                    string[i + 4] = 'e';
                    string[i + 5] = 'r';
                }
            }
        }
        System.out.println(string);
    }
}
