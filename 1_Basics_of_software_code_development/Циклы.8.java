package com.company;

import java.util.Scanner;

public class Main {

    /*
     * Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
     */
    public static void main(String[] args) {

        double number1 = 0, number2 = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of the numbers number1,number2: ");
        number1 = in.nextDouble();
        number2 = in.nextDouble();
        for (int i = 0; (int) number1 != 0; i++) {
            number1 /= 10;
            double digit1 = ((number1 - (int) number1) * 10);
            for (double j = number2; (int) j != 0; ) {
                j /= 10;
                double digit2 = ((j - (int) j) * 10);
                if ((int) digit1 == (int) digit2) {
                    System.out.printf("%f \n",digit1);
                }
                j = (int) j;
            }
            number1 = (int) number1;
            System.out.println();
        }
    }
}
