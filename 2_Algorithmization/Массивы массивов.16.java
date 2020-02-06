package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1,2,3,...,n^2
     * так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой. Построить
     * такой квадрат. Пример магического квадрата 3:
     */
    public static void main(String[] args) {

        int n = 0, magicNumber = 0, rowIndex = 0, columnIndex = 0, copyRowIndex = 0, copyColumnIndex = 0;
        int[][] matrix;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.printf("Enter n = ");
        n = in.nextInt();
        matrix = new int[n][n];
        if (n % 2 != 0) {
            //Определим магическое число по формуле n(n^2 + 1)/2
            magicNumber = (int) (n * (pow(n, 2) + 1) / 2);
            System.out.printf("magic number = %d\n", magicNumber);
            rowIndex = 0;
            columnIndex = n / 2;
            matrix[rowIndex][columnIndex] = 1;
            for (int i = 1; i < n * n; i++) {
                copyRowIndex = rowIndex;
                copyColumnIndex = columnIndex;
                rowIndex--;
                columnIndex++;
                if (rowIndex < 0) {
                    rowIndex = n - 1;
                }
                if (columnIndex >= n) {
                    columnIndex = 0;
                }
                if (matrix[rowIndex][columnIndex] != 0) {
                    rowIndex = copyRowIndex;
                    columnIndex = copyColumnIndex;
                    rowIndex++;
                    if (rowIndex >= n) {
                        rowIndex = 0;
                    }
                    matrix[rowIndex][columnIndex] = i + 1;
                } else {
                    matrix[rowIndex][columnIndex] = i + 1;
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
