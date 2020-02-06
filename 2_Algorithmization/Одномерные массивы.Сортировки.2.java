package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Даны две последовательности a1 <=a2 <=... <=an и b1 <= b2 <= ... <= bm. Образовать из них новую
     * последовательность чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив
     * не использовать.
     */
    public static void main(String[] args) {

        int size1 = 0, size2 = 0, maxSize = 100, k = 0;
        int[] array1, array2;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.printf("Enter size1 = ");
        size1 = in.nextInt();
        System.out.printf("Enter size2 = ");
        size2 = in.nextInt();
        array1 = new int[maxSize];
        array2 = new int[maxSize];
        for (int i = 0; i < size1; i++) {
            array1[i] = random.nextInt(10);
        }
        for (int i = 0; i < size2; i++) {
            array2[i] = random.nextInt(10);
        }
        //сортируем пузырьком 1 массив
        for (int i = 0; i < size1 - 1; i++) {
            for (int j = 0; j < size1 - i - 1; j++) {
                if (array1[j] > array1[j + 1]) {
                    int var = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = var;
                }
            }
        }
        //сортируем пузырьком 2 массив
        for (int i = 0; i < size2 - 1; i++) {
            for (int j = 0; j < size2 - i - 1; j++) {
                if (array2[j] > array2[j + 1]) {
                    int var = array2[j];
                    array2[j] = array2[j + 1];
                    array2[j + 1] = var;
                }
            }
        }
        for (int i = 0; i < maxSize; i++) {
            System.out.printf("%d ", array1[i]);
        }
        System.out.println();
        for (int i = 0; i < maxSize; i++) {
            System.out.printf("%d ", array2[i]);
        }
        System.out.printf("\nEnter k = ");
        k = in.nextInt();
        for (int i = 0; i < size2; i++) {
            for (int j = 0; j < size1 - k; j++) {
                array1[size1 - j + i] = array1[size1 - 1 - j + i];
            }
        }
        for (int i = 0; i < size2; i++) {
            array1[k + i] = array2[i];
        }
        //сортируем пузырьком конечный массив
        for (int i = 0; i < size2 + size1 - 1; i++) {
            for (int j = 0; j < size2 + size1 - i - 1; j++) {
                if (array1[j] > array1[j + 1]) {
                    int var = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = var;
                }
            }
        }
        for (int i = 0; i < maxSize; i++) {
            System.out.printf("%d ", array1[i]);
        }
        System.out.println();

    }
}
