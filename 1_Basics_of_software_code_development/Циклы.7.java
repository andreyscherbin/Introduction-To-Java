package com.company;

import java.util.Scanner;

public class Main {

    /*
     * Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы
     * и самого числа. m и n вводятся с клавиатуры.
     */
    public static void main(String[] args) {

        int m = 0, n = 0, number = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of the variables m,n: ");
        m = in.nextInt();
        n = in.nextInt();
        for (int i = m; i <= n; i++) {
            System.out.printf("Делители числа %d равны ", i);
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.printf("%d ", j);
                }
            }
            System.out.println();
        }
    }
}
