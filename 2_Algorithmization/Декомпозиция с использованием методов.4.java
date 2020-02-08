package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими из пар
     * точек самое большое расстояние. Указание. Координаты точек занести в массив.
     */
    public static void maximumDistance(int[] x, int[] y, int n) {

        double maxDistance = 0;
        int point1 = 0, point2 = 0;
        //для вычисления расстояния между двумя точками воспользуемся формулой AB = sqrt((xb-xa)^2 + (yb-ya)^2).
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    double var = sqrt(pow(x[i] - x[j], 2) + pow(y[i] - y[j], 2));
                    if (var > maxDistance) {
                        maxDistance = var;
                        point1 = i;
                        point2 = j;
                    }
                }
            }
        }
        System.out.printf("point1 = %d, point2 = %d", point1, point2);
    }

    public static void main(String[] args) {

        int n = 0;
        int[] x, y;
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter n = ");
        n = in.nextInt();
        x = new int[n];
        y = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter point(x,y) = ");
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }
        maximumDistance(x, y, n);
    }
}
