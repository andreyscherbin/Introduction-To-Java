package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    /*
     * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет
     * ли он прямоугольным
     */
    public static void main(String[] args) {

        int angle1 = 0, angle2 = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of the angle1: ");
        angle1 = in.nextInt();
        System.out.print("Enter the value of the angle2: ");
        angle2 = in.nextInt();
        if ((angle1 + angle2) >= 180) {
            System.out.println("Such a triangle does not exist.");
        } else {
            System.out.println("Such a triangle exists and ...");
            if ((angle1 + angle2) == 90 || angle1 == 90 || angle2 == 90) {
                System.out.println("it's a rectangle");
            } else {
                System.out.println("Not a rectangle");
            }
        }
    }
}
