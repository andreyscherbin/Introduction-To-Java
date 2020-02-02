package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    /*
     * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
     * Поменять местами дробную и целую части числа и вывести полученное значение числа
     */
    public static void main(String[] args) {

        double x = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of the variable x: ");
        x = in.nextDouble();
        double z = (int) x / 1000.0 + (x - (int) x) * 1000;
        System.out.printf("The value  is: %f \n", z);
    }
}
