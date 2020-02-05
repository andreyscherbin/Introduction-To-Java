package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    /*
     * В числовой матрице поменять местами два столбца любых столбца,т.е все элементы одного столбца поставить
     * на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
     * пользователь с клавиатуры.
     */
    public static void main(String[] args) {

        int n = 0, column1 = 0, column2 = 0;
        int[][] matrix;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = in.nextInt();
        System.out.print("Enter column1: ");
        column1 = in.nextInt();
        System.out.print("Enter column2: ");
        column2 = in.nextInt();
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
            int temp = matrix[i][column1];
            matrix[i][column1] = matrix[i][column2];
            matrix[i][column2] = temp;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
