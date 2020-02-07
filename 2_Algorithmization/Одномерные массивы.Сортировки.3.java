package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an. Требуется переставить элементы
     * так, чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
     * элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
     * повторяется. Написать алгоритм сортировки выбором.
     */
    public static void main(String[] args) {

        int size = 0;
        int[] array;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.printf("Enter size = ");
        size = in.nextInt();
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter array[%d] = ", i);
            array[i] = in.nextInt();

        }
        for (int i = 0; i < size; i++) {
            int max_index = 0;
            int max = 0;
            for (int j = i; j < size; j++) {
                if (array[j] > max) {
                    max = array[j];
                    max_index = j;
                }
            }
            array[max_index] = array[i];
            array[i] = max;
        }
        for (int i = 0; i < size; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }
}
