package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр
     */
    public static String arrayOfDigits(int number1, int number2) {

        double value1 = number1;
        double value2 = number2;
        double digit = 0;
        int numberOfDigitsNumber1 = 0;
        int numberOfDigitsNumber2 = 0;
        while (value1 > 0) {
            value1 /= 10;
            number1 /= 10;
            digit = (value1 - number1) * 10;
            value1 = number1;
            numberOfDigitsNumber1++;
        }
        while (value2 > 0) {
            value2 /= 10;
            number2 /= 10;
            digit = (value2 - number2) * 10;
            value2 = number2;
            numberOfDigitsNumber2++;
        }
        if (numberOfDigitsNumber1 > numberOfDigitsNumber2) {
            return "1 > 2";
        } else {
            return "2 > 1";
        }
    }

    public static void main(String[] args) {

        int number1 = 0, number2 = 0;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter number1 = ");
        number1 = in.nextInt();
        System.out.printf("Enter number2 = ");
        number2 = in.nextInt();
        System.out.printf("%s", arrayOfDigits(number1, number2));
    }
}
