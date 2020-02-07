package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию. Делается
     * это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1, то продвигаются
     * на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
     * Составить алгоритм этой сортировки.
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
        int j = 0;
        while (j < size - 1) {
            if (array[j] <= array[j + 1]) {
                j++;
                continue;
            } else {
                int var = array[j];
                array[j] = array[j + 1];
                array[j + 1] = var;
                j--;
                if (j < 0) {
                    j = 0;
                }
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
