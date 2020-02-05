package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк,
     * в которых число 5 встречается три и более раз.
     */
    public static void main(String[] args) {

        int[][] matrix;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        matrix = new int[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = random.nextInt(16);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            int counter = 0;
            for (int j = 0; j < 20; j++) {
                if (matrix[i][j] == 5) {
                    counter++;
                }
            }
            if (counter >= 3) {
                System.out.printf("%d ", i + 1);
            }
        }
    }
}
