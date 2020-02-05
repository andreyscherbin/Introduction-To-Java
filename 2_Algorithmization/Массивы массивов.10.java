package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    /*
     * Найти положительные элементы главной диагонали квадратной матрицы.
     */
    public static void main(String[] args) {

        int n = 0;
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            if (matrix[i][i] > 0) {
                System.out.printf("%d ", matrix[i][i]);
            }
        }
    }
}
