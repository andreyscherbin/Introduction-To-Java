package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    /*
     * Заданы размеры A,B прямоугольного отверстия и размеры x,y,z кирпича. Определить, пройдет ли кирпич
     * через отверстие.
     */
    public static void main(String[] args) {

        int A = 0, B = 0, x = 0, y = 0, z = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value of the variable A: ");
        A = in.nextInt();
        System.out.print("Enter the value of the variable B: ");
        B = in.nextInt();
        System.out.print("Enter the value of the variable x: ");
        x = in.nextInt();
        System.out.print("Enter the value of the variable y: ");
        y = in.nextInt();
        System.out.print("Enter the value of the variable z: ");
        z = in.nextInt();
        if ((x <= B && y <= A) || (z <= B && y <= A) || (x <= B && z <= A)) {
            System.out.println("The brick will fit");
        } else {
            System.out.println("The brick will not fit");
        }
    }
}
