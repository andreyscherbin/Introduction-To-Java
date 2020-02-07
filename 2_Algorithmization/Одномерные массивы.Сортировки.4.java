package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= an. Требуется переставить числа
     * в порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1. Если ai > ai+1, то делается
     * перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
     * Составить алгоритм сортировки, подсчитывая при этом количество перестановок.
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
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }
}
