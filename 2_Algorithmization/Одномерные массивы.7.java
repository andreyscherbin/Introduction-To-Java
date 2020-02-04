package com.company;

import java.util.Scanner;

public class Main {

    /*
     * Даны действительные числа a1,a2,...,an. Найти max(a1+a2n, a2 + a2n-1,...,an + an+1);
     */
    public static void main(String[] args) {

        int N = 0;
        double[] a;
        double max = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        N = in.nextInt();
        a = new double[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("enter a[%d] = ", i);
            a[i] = in.nextDouble();
        }
        max = a[0] + a[N - 1];
        for (int i = 1; i < N / 2; i++) {
            if (a[i] + a[N - 1 - i] > max) {
                max = a[i] + a[N - 1 - i];
            }
        }
        System.out.printf("max = %f", max);
    }
}
