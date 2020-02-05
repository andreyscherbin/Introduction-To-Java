package com.company;

import java.util.Scanner;

public class Main {

    /*
     * Дана матрица. Вывести k-ю строку и p-ю столбец матрицы.
     */
    public static void main(String[] args) {

        int N = 0, k = 0, p = 0;
        int[][] matrix;
        matrix = new int[N][N];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        N = in.nextInt();
        System.out.print("Enter k: ");
        k = in.nextInt();
        System.out.print("Enter p: ");
        p = in.nextInt();
        matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("enter matrix[%d][%d] = ", i, j);
                matrix[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int j = 0; j < N; j++) {
            System.out.printf("%d ", matrix[k - 1][j]);
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", matrix[i][p - 1]);
        }
    }
}
