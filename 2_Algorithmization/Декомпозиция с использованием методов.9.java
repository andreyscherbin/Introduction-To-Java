package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Даны числа X,Y,Z,T - длины сторон четырехугольника. Написать метод(методы) вычисления его плодащи, если угол
     * между двумя сторонами длиной X и Y - прямой.
     */
    public static double area(int X, int Y, int Z, int T) {

        //поделим четырехугольник на 2 треугольника - прямоугольный и обычный
        //площадь обычного найдем по формуле Герона используя гипотенузу прямоугольного треугольника
        //Формула Герона - S = sqrt(p*(p-a)(p-b)(p-c)).
        double areaRectangular = 0, areaTriangle = 0, areaQuadrangle = 0;
        double hypotenuse = sqrt(pow(X, 2) + pow(Y, 2)), p = (hypotenuse + Z + T) / 2;
        areaRectangular = 1 / 2 * X * Y;
        areaTriangle = sqrt(p * (p - Z) * (p - T) * (p - hypotenuse));
        areaQuadrangle = areaRectangular + areaTriangle;
        return areaQuadrangle;
    }

    public static void main(String[] args) {

        int X = 0, Y = 0, Z = 0, T = 0;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter X = ");
        X = in.nextInt();
        System.out.printf("Enter Y = ");
        Y = in.nextInt();
        System.out.printf("Enter Z = ");
        Z = in.nextInt();
        System.out.printf("Enter T = ");
        T = in.nextInt();
        System.out.printf("area quadRangle = %f", area(X, Y, Z, T));
    }
}
