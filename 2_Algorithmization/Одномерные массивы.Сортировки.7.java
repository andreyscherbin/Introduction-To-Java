package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Пусть даны две неубывающией последовательности действительных чисел a1 <= a2 <= ... <= an и b1 <= b2 <= ...
     * <= bm. Требуется указать те места, на которые нужно вставлять элементы последовательности b1 <= b2 <= ... <=
     * bm в первую последовательность так, что бы новая последовательность оставалась возрастающей.
     */
    public static int binSearch(int[] array, int key, int size) {
        int m = 0;
        int l = -1;
        int r = size;
        while (l < r - 1) {
            m = (l + r) / 2;
            if (key < array[m]) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

    public static void main(String[] args) {

        int n = 0, m = 0, maxSize = 100;
        int[] array1, array2;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.printf("Enter size n = ");
        n = in.nextInt();
        System.out.printf("Enter size m = ");
        m = in.nextInt();
        array1 = new int[maxSize];
        array2 = new int[maxSize];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter array1[%d] = ", i);
            array1[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            System.out.printf("Enter array2[%d] = ", i);
            array2[i] = in.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int index = binSearch(array1, array2[i], n);
            System.out.printf("%d ", index);
            for (int j = n + m - 2; j >= index; j--) {
                array1[j + 1] = array1[j];
            }
            array1[index] = array2[i];
            n++;
        }
        System.out.println();
        for (int i = 0; i < maxSize; i++) {
            System.out.printf("%d ", array1[i]);
        }
        System.out.println();
        for (int i = 0; i < maxSize; i++) {
            System.out.printf("%d ", array2[i]);
        }
    }
}
