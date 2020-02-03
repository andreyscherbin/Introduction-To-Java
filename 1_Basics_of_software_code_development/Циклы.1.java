package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    /*
     * Напишите программу, где пользователь вводит любое целое положительное число. А программа
     * суммирует все числа от 1 до введенного пользователем числа.
     */
    public static void main(String[] args) {

        int number = 0, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of the number: ");
        number = in.nextInt();
        for (int i = 1; i != number; i++) {
            sum = i + sum;
        }
        System.out.printf("The value of the amount is %d",sum);
    }
}
