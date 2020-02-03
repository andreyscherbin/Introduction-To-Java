package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    /*
     * Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
     * Вывести данное значение длительности в часах, минутах и секундах в следущей форме:
     * HHч ММмин SSс.
     */
    public static void main(String[] args) {

        double seconds = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        seconds = in.nextDouble();
        double sec = seconds % 60;
        double minutes = (seconds / 60) % 60;
        double hours = (seconds / 60) / 60;
        System.out.printf("%dh %dmin %dsec \n", (int) hours, (int) minutes, (int) sec);
    }
}
