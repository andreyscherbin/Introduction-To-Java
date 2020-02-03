package com.company;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    /*
     * Составить программу нахождения произведения квадратов первых двухсот чисел.
     */
    public static void main(String[] args) {

        BigInteger multiplication = BigInteger.valueOf(1);
        for (int i = 1; i <= 200; i++) {
            multiplication = multiplication.multiply(BigInteger.valueOf(i * i));
        }
        System.out.printf("multiplication of squares 1 to 200 = %d", multiplication);
    }
}
