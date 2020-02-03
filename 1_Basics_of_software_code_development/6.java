package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    /*
     * Для данной области составить линейную программу, которая печатает true, если точка с координатами (x,y)
     * принадлежит закрашенной области, и false - в противном случае:
     */
    public static void main(String[] args) {

        int x = 0, y = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of the variable x: ");
        x = in.nextInt();
        System.out.print("Enter the value of the variable y: ");
        y = in.nextInt();
        if (y >= 0) {
            if (y > 4 || x > 2 || x < -2) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        } else if (y <= 0) {
            if (y < -3 || x > 4 || x < -4) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
        }
    }
}
