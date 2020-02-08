package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
     * которое меньше максимального элемента массива, но больше всех других элементов).
     */
    public static void searchElement(int[] A, int N) {

        int maxElement = 0, indexMaxElement = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] > maxElement) {
                maxElement = A[i];
                indexMaxElement = i;
            }
        }
        maxElement = 0;
        for (int i = 0; i < N; i++) {
            if (i != indexMaxElement) {
                if (A[i] > maxElement) {
                    maxElement = A[i];
                }
            }
        }
        System.out.printf("second max element = %d", maxElement);
    }

    public static void main(String[] args) {

        int N = 0;
        int[] A;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter N = ");
        N = in.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("Enter A[%d] = ", i);
            A[i] = in.nextInt();
        }
        searchElement(A, N);
    }
}
