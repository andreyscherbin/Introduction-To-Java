package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры
     * числа N
     */
    public static void arrayOfDigits(int N) {

        int copyN = N;
        double value = N;
        double digit = 0;
        int sizeArray = 0;
        while (value > 0) {
            value /= 10;
            N /= 10;
            digit = (value - N) * 10;
            value = N;
            sizeArray++;
        }
        double[] arrayOfDigits = new double[sizeArray];
        value = copyN;
        N = copyN;
        digit = 0;
        int i = 0;
        while (value > 0) {
            value /= 10;
            N /= 10;
            digit = (value - N) * 10;
            value = N;
            arrayOfDigits[i] = digit;
            i++;
        }
        for (int j = 0; j < sizeArray; j++) {
            System.out.printf("arrayOfDigits[%d] = %f \n", j, arrayOfDigits[j]);
        }
    }

    public static void main(String[] args) {

        int N;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter N = ");
        N = in.nextInt();
        arrayOfDigits(N);
    }
}
