package com.company;

import java.util.Scanner;

public class Main {

    /*
     * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
     * являются простыми числами.
     */
    public static void main(String[] args) {

        int N = 0, divider = 2;
        boolean flagPrimeNumber = true;
        double[] a;
        double sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        N = in.nextInt();
        a = new double[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("Enter a[%d]: ", i);
            a[i] = in.nextDouble();
        }
        for (int i = 0; i < N; i++) {
            if (i > 1) {
                divider = 2;
                flagPrimeNumber = true;
                while (divider != i) {
                    if (i % divider != 0) {
                        divider++;
                    } else if (i % divider == 0) {
                        flagPrimeNumber = false;
                        break;
                    }
                }
                if (flagPrimeNumber) {
                    sum += a[i];
                }
            }
        }
        System.out.printf("sum = %f", sum);
    }
}
