package com.company;

import java.util.Scanner;

public class Main {

    /*
     * Дана последовательность целых чисел a1,a2,...,an. Образовать новую последовательность, выбросив из
     * исходной те члены, которые равны min(a1,a2,...,an).
     */
    public static void main(String[] args) {

        int N = 0;
        int[] a;
        int min = 0, overlap = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        N = in.nextInt();
        a = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("enter a[%d] = ", i);
            a[i] = in.nextInt();
        }
        min = a[0];
        for (int i = 1; i < N; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        for (int i = 0; i < N; i++) {
            if (a[i] == min) {
                overlap++;
                for (int j = i; j < N - 1; j++) {
                    a[j] = a[j + 1];
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.printf("a[%d] = %d\n", i, a[i]);
        }
    }
}
