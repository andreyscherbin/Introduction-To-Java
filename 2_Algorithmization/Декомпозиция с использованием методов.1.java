package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
     * натуральных чисел: (НОК(А,B) = A*B/НОД(А,В))
     */
    public static int NOD(int a, int b) {

        for (int i = a; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 0;
    }

    public static int NOK(int a, int b) {

        for (int i = a; ; i++) {
            if (i % a == 0 && i % b == 0) {
                return i;
            }
        }
    }

    public static void main(String[] args) {

        int A = 0, B = 0;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.printf("Enter A = ");
        A = in.nextInt();
        System.out.printf("Enter B = ");
        B = in.nextInt();
        System.out.printf("NOD = %d\n", NOD(A, B));
        System.out.printf("NOK = %d", NOK(A, B));
    }
}
