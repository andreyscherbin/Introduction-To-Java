package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    /*
     * Найти max{min(a,b), min(c,d)}
     */
    public static void main(String[] args) {

        int a = 0, b = 0, c = 0, d = 0;
        int min1 = 0, min2 = 0, max = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of the variable a: ");
        a = in.nextInt();
        System.out.print("Enter the value of the variable b: ");
        b = in.nextInt();
        System.out.print("Enter the value of the variable c: ");
        c = in.nextInt();
        System.out.print("Enter the value of the variable d: ");
        d = in.nextInt();
        if (a < b) {
            min1 = a;
        } else if (b <= a) {
            min1 = b;
        }
        if (c < d) {
            min2 = c;
        } else if (d <= c) {
            min2 = d;
        }
        if (min1 > min2) {
            max = min1;
        } else if (min2 >= min1) {
            max = min2;
        }
        System.out.printf("max{min(%d,%d),min(%d,%d)} = %d", a, b, c, d, max);
    }
}
