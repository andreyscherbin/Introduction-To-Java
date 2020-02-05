package com.company;

import java.util.Scanner;

public class Main {

    /*
     * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
     */
    public static void main(String[] args) {

        int N = 0;
        int[][] matrix;
        matrix = new int[N][N];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        N = in.nextInt();
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
        for (int i = 0; i < N; i++) {
            System.out.printf("%d ", matrix[i][i]);
        }
        System.out.println();
        for (int j = N - 1; j >= 0; j--) {
            System.out.printf("%d ", matrix[-j + N - 1][j]);
        }
    }
}
