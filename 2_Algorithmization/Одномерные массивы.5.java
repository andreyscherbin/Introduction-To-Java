package com.company;

import java.util.Scanner;

public class Main {

    /*
     * Даны целые числа a1,a2,...,an. Вывести на печать только те числа, для которых ai > i.
     */
    public static void main(String[] args) {

        int N = 0;
        int[] a;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        N = in.nextInt();
        a = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("Enter a[%d]: ", i);
            a[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (a[i] > i) {
                System.out.printf("a[%d] = %d\n", i, a[i]);
            }
        }
    }
}
