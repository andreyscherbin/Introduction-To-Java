package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Сформировать случайную матрицу m X n, состоящую из нулей и единиц, причем в каждом столбце
     * число единиц равно номеру столбца.
     */
    public static void main(String[] args) {

        int m = 0, n = 0;
        int[][] matrix;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.printf("Enter m = ");
        m = in.nextInt();
        System.out.printf("Enter n = ");
        n = in.nextInt();
        matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }
        for (int j = 0; j < n; j++) {
            int counter = 0;
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] == 1) {
                    counter++;
                }
            }
            if (counter > j + 1) {
                for (int i = 0; i < m && counter > j + 1; i++) {
                    if (matrix[i][j] == 1) {
                        matrix[i][j] = 0;
                        counter--;
                    }
                }
            }
            if (counter < j + 1) {
                for (int i = 0; i < m && counter < j + 1; i++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][j] = 1;
                        counter++;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
