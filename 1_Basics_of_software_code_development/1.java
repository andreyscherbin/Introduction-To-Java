package com.company;

import java.util.Scanner;

public class Main {

    /*
     * Найдите значение функции z = ((a-3)*b/2)+c
     */
    public static void main(String[] args) {
	
     int a = 0, b = 0, c = 0;
     Scanner in = new Scanner(System.in);
     System.out.print("Enter the value of the variable a: ");
     a = in.nextInt();	
     System.out.print("Enter the value of the variable b: ");
     b = in.nextInt();
     System.out.print("Enter the value of the variable c: ");
     c = in.nextInt();
     int z = ((a-3)*b/2)+c;
     System.out.printf("The value of the function is: %d \n", z);
	 
    }
}
