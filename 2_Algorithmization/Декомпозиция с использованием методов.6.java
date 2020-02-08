package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Написать метод(методы). проверяющий, являются ли данные три числа взаимно простыми.
     */
    public static boolean isCoprimeNumbers(int A, int B, int C) {

        for (int i = A; i > 0; i--) {
            if (A % i == 0 && B % i == 0 && C % i == 0 && i != 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int A = 0, B = 0, C = 0;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter A = ");
        A = in.nextInt();
        System.out.printf("Enter B = ");
        B = in.nextInt();
        System.out.printf("Enter C = ");
        C = in.nextInt();
        System.out.printf("A,B,C isCoprimeNumbers? %b", isCoprimeNumbers(A, B, C));
    }
}
