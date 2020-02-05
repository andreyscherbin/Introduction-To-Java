package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    /*
     * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец
     * содержит максимальную сумму.
     */
    public static void main(String[] args) {

        int n = 0, maxSumm = 0, columnIndexMaxSumm = 0;
        int[][] matrix;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = in.nextInt();
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Enter matrix[%d][%d] = ", i, j);
                matrix[i][j] = in.nextInt();
            }
        }
        for (int j = 0; j < n; j++) {
            int summ = 0;
            for (int i = 0; i < n; i++) {
                summ += matrix[i][j];
            }
            if (summ > maxSumm) {
                columnIndexMaxSumm = j;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.printf("columnIndexMaxSumm = %d", columnIndexMaxSumm);
    }
}
