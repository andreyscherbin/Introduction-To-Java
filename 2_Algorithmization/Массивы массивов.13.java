package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
     */
    public static void main(String[] args) {

        int n = 0;
        int[][] matrix;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter n = ");
        n = in.nextInt();
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("matrix[%d][%d]= ", i, j);
                matrix[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        // по возрастанию пузырьком
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - 1; i++) {
                for (int z = 0; z < n - i - 1; z++) {
                    if (matrix[z][j] > matrix[z + 1][j]) {
                        int var = matrix[z][j];
                        matrix[z][j] = matrix[z + 1][j];
                        matrix[z + 1][j] = var;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        // по убыванию пузырьком
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - 1; i++) {
                for (int z = 0; z < n - i - 1; z++) {
                    if (matrix[z][j] < matrix[z + 1][j]) {
                        int var = matrix[z][j];
                        matrix[z][j] = matrix[z + 1][j];
                        matrix[z + 1][j] = var;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
