package com.company;

import java.util.Scanner;

public class Main {

    /*
     * Сформировать квадратную матрицу порядка n по заданному образцу (n-четное).
     */
    public static void main(String[] args) {

        int n = 0;
        int[][] matrix;
        matrix = new int[n][n];
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Enter n: ");
            n = in.nextInt();
        } while (n % 2 != 0);
        matrix = new int[n][n];
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 1;
            }
            int var = i;
            while (var > 0) {
                matrix[i][n - var] = 0;
                matrix[i][var - 1] = 0;
                var--;
            }
        }
        for (int i = n - 1; i > n / 2; i--) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 1;
            }
            int var = n - i - 1;
            while (var > 0) {
                matrix[i][n - var] = 0;
                matrix[i][var - 1] = 0;
                var--;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
