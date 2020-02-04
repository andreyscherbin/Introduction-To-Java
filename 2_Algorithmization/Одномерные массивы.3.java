package com.company;

import java.util.Scanner;

public class Main {

    /*
     * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
     * положительных и нулевых элементов.
     */
    public static void main(String[] args) {

        int N = 0, negative = 0, positive = 0, zero = 0;
        double[] a;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        N = in.nextInt();
        a = new double[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("Enter a[%d]: ", i);
            a[i] = in.nextDouble();
        }
        for (int i = 0; i < N; i++) {
            if (a[i] > 0) {
                positive++;
            } else if (a[i] < 0) {
                negative++;
            } else if (a[i] == 0) {
                zero++;
            }
        }
        System.out.printf("positive = %d, negative = %d, zero = %d", positive, negative, zero);

    }
}
