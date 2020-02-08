package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Вычислить площадь правильного шестиугольника со стороной a, используя метод вычисления площади
     * треугольника
     */
    public static double area(int a) {

        double S = 0;
        S = sqrt(3) / 4 * pow(a, 2);
        return S;
    }

    public static void main(String[] args) {

        int a = 0;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter a = ");
        a = in.nextInt();
        System.out.printf("area = %f\n", area(a));
    }
}
