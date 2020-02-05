package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    /*
     * Сформировать квадратную матрицу порядка N по правилу: A[I,J] = sin((I^2 - J^2)/N). Подсчитать количество
     * положительных элементов в ней.
     */
    public static void main(String[] args) {

        int n = 0, positiveCounter = 0;
        double[][] matrix;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = in.nextInt();
        matrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sin((pow(i, 2) - pow(j, 2)) / n);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > 0) positiveCounter++;
                System.out.printf("%f ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.printf("number of positive elements = %d", positiveCounter);
    }
}
