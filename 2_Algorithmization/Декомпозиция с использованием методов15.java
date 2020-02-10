package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например
     * 1234,5789). Для решения задачи использовать декомпозицию.
     */
    public static void increasingSequence(int n) {

        for (int i = (int) pow(10, n - 1); i <= pow(10, n) - 1; i++) {
            int j = i;
            boolean flagIncreasingSequence = true, firstIteration = true;
            double value = j;
            double digit = 0;
            double max = 0;
            while (value > 0) {
                value /= 10;
                j /= 10;
                digit = (value - j) * 10;
                value = j;
                if (firstIteration) {
                    max = digit;
                    firstIteration = false;
                } else if ((int) Math.round(digit) >= (int) Math.round(max)) {
                    flagIncreasingSequence = false;
                } else {
                    max = digit;
                }
            }
            if (flagIncreasingSequence) {
                System.out.printf("%d \n", i);
            }
        }
    }

    public static void main(String[] args) {

        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter n = ");
        n = in.nextInt();
        increasingSequence(n);
    }
}
