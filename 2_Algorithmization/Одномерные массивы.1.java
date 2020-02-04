package com.company;

import java.util.Scanner;

public class Main {

    /*
     * В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K.
     */
    public static void main(String[] args) {

        int N = 0, K = 0, sum = 0;
        int[] A;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N,K: ");
        N = in.nextInt();
        K = in.nextInt();
        A = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("Enter A[%d]: ", i);
            A[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (A[i] % K == 0) {
                sum += A[i];
            }
        }
        System.out.printf("Sum = %d", sum);

    }
}
