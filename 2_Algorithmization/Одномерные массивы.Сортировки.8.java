package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

import java.util.Random.*;

public class Main {

    /*
     * Даны дроби p1/q1,p2/q2,...,pn/qn(pi,qi - натуральные). Составить программу, которая приводит эти дроби
     * к общему знаменателю и упорядочивает их в порядке возрастания.
     */
    public static void sort(double[] pq, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (pq[j] > pq[j + 1]) {
                    double var = pq[j];
                    pq[j] = pq[j + 1];
                    pq[j + 1] = var;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%f ", pq[i]);
        }
        System.out.println();
    }

    public static int commonDenominator(int[] p, int[] q, int n) {
        int commonDenominator = 1;
        int[] helpArray;
        int sizeHelpArray = 0;
        boolean flag = true;
        helpArray = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (q[i] == helpArray[j]) {
                    flag = false;
                }
            }
            if (flag) {
                helpArray[sizeHelpArray] = q[i];
                sizeHelpArray++;
            }
            flag = true;
        }
        for (int i = 0; i < sizeHelpArray; i++) {
            commonDenominator *= helpArray[i];
        }
        System.out.printf("\ncommonDenominator = %d", commonDenominator);
        for (int i = 0; i < n; i++) {
            p[i] = p[i] * (commonDenominator / q[i]);
        }
        return commonDenominator;
    }

    public static void main(String[] args) {

        int n = 0;
        int[] p, q;
        double[] pq;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.printf("Enter size n = ");
        n = in.nextInt();
        p = new int[n];
        q = new int[n];
        pq = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter p[%d] = ", i);
            p[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter q[%d] = ", i);
            q[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            pq[i] = (double) p[i] / q[i];
        }
        sort(pq, n);
        int commonDenominator = commonDenominator(p, q, n);
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.printf("%d/%d ", p[i], commonDenominator);
        }
    }
}
