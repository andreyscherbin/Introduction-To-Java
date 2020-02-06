package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить
     * их в один массив, включив второй между k-м и (k+1)-м элементами первого, при этом не используя дополнительный
     * массив.
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
        for (int i = 0; i < maxSize; i++) {
            System.out.printf("%d ", array1[i]);
        }
        System.out.println();
        for (int i = 0; i < maxSize; i++) {
            System.out.printf("%d ", array2[i]);
        }
        System.out.printf("Enter k = ");
        k = in.nextInt();
        for (int i = 0; i < size2; i++) {
            for (int j = 0; j < size1 - k; j++) {
                array1[size1 - j + i] = array1[size1 - 1 - j + i];
            }
        }
        for (int i = 0; i < size2; i++) {
            array1[k + i] = array2[i];
        }
        for (int i = 0; i < maxSize; i++) {
            System.out.printf("%d ", array1[i]);
        }
        System.out.println();
        for (int i = 0; i < maxSize; i++) {
            System.out.printf("%d ", array2[i]);
        }
    }
}
