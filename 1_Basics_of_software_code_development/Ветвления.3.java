package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    /*
     * Даны три точки A(x1,y1), B(x2,y2) и C(x3,y3). Определить, будут ли они расположены на одной прямой
     */
    public static void main(String[] args) {

        int x1 = 0, x2 = 0, x3 = 0;
        int y1 = 0, y2 = 0, y3 = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of the variable x1,y1: ");
        x1 = in.nextInt();
        y1 = in.nextInt();
        System.out.print("Enter the value of the variable x2,y2: ");
        x2 = in.nextInt();
        y2 = in.nextInt();
        System.out.print("Enter the value of the variable x3,y3: ");
        x3 = in.nextInt();
        y3 = in.nextInt();
        if (x1 == x2 && x2 == x3 || y1 == y2 && y2 == y3) {
            System.out.println("Points lie on one straight line");
        }
        // Воспользуемся уравнением прямой по двум точкам
        // (x - x1) / (x2 - x1) = (y - y1) / (y2 - y1)
        else if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
            System.out.println("Points lie on one straight line");
        } else {
            System.out.println("Points don't lie on one straight line");
        }
    }
}
