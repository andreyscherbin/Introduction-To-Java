package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Даны натуральные числа K и N. Написать метод(методы) формирования массива A, элементами которого являются
     * числа, сумма цифр которых равна K и которые не большее N.
     */
    public static int[] array(int K, int N) {

        int[] array = new int[100];
        int sizeArray = 0;
        double summOfDigits = 0;
        for (int i = 0; i <= N; i++) {
            int j = i;
            summOfDigits = 0;
            double value = j;
            double digit = 0;
            while (value > 0) {
                value /= 10;
                j /= 10;
                digit = (value - j) * 10;
                value = j;
                summOfDigits += digit;
            }
            if (K == (int) Math.round(summOfDigits)) {
                sizeArray++;
                array[sizeArray - 1] = i;
            }
        }
        for (int i = 0; i < sizeArray; i++) {
            System.out.printf("%d ", array[i]);
        }
        return array;
    }

    public static void main(String[] args) {

        int K = 0, N = 0;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter K = ");
        K = in.nextInt();
        System.out.printf("Enter N = ");
        N = in.nextInt();
        int[] A = array(K, N);
    }
}
