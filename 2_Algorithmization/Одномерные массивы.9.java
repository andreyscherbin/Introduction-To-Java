package com.company;

import java.util.Scanner;

public class Main {

    /*
     * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел
     * несколько, то определить наименьшее из них.
     */
    public static void main(String[] args) {

        int N = 0, number = 0;
        int[] a;
        int frequency = 0, maxFrequency = 1, minNumber = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        N = in.nextInt();
        a = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("enter a[%d] = ", i);
            a[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            number = a[i];
            frequency = 0;
            for (int j = 0; j < N; j++) {
                if (number == a[j]) {
                    frequency++;
                }
            }
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                minNumber = number;
            }
            if (frequency == maxFrequency) {
                if (number < minNumber) {
                    minNumber = number;
                }
            }
        }
        System.out.printf("maxFrequency = %d, minNumber = %d", maxFrequency, minNumber);
    }
}
