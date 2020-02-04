package com.company;

import java.util.Scanner;

public class Main {

    /*
     * Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй
     * элемент (освободившиеся элементы заполнить нулями). Примечание. Допольниттельный массив не использовать
     */
    public static void main(String[] args) {

        int N = 0, number = 0;
        int[] a;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter N: ");
        N = in.nextInt();
        a = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.printf("enter a[%d] = ", i);
            a[i] = in.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if ((i + 1) % 2 == 0) {
                a[i] = 0;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.printf("a[%d] = %d\n", i + 1, a[i]);
        }
    }
}
