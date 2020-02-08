package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
     */
    public static int NOD4(int A, int B, int C, int D) {

        for (int i = A; i > 0; i--) {
            if (A % i == 0 && B % i == 0 && C % i == 0 && D % i == 0) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int A = 0, B = 0, C = 0, D = 0;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.printf("Enter A = ");
        A = in.nextInt();
        System.out.printf("Enter B = ");
        B = in.nextInt();
        System.out.printf("Enter C = ");
        C = in.nextInt();
        System.out.printf("Enter D = ");
        D = in.nextInt();
        System.out.printf("NOD = %d\n", NOD4(A, B, C, D));

    }
}
