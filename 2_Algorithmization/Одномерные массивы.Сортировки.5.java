package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Сортировка вставками. Дана последовательность чисел a1,a2,...,an. Требуется переставить числа в порядке
     * возрастания. Делается это следующим образом. Пусть a1,a2,...,ai - упорядоченная последовательность, т.е
     * a1 <= a2 <= ... <= an. Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
     * последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n
     * не будут перебраны.Примечание. Место помещения очередного элемента в отсортированную часть производить с помо
     * щью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
     */

    public static int binSearch(int[] array, int key, int size) {
        int m = 0;
        int l = -1;
        int r = size;
        while (l < r - 1) {
            m = (l + r) / 2;
            if (key > array[m]) {
                r = m;
            } else {
                l = m;
            }
        }
        return r;
    }

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
        for (int i = 1; i < size; i++) {
            int index = binSearch(array, array[i], i);
            for (int j = i; j > index; j--) {
                int var = array[j];
                array[j] = array[j - 1];
                array[j - 1] = var;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }
}
