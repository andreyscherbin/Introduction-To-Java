package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

    /*
     * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных
     * Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
     * из этих двух переменных.
     */
    private class Test1 {

        private int a, b;

        private void print() {
            System.out.printf("a = %d, b = %d", a, b);
        }

        private void increment() {
            a++;
            b++;
        }

        private void decrement() {
            a--;
            b--;
        }

        private int getSumm() {
            return a + b;
        }

        private String findMax() {
            if (a > b) {
                return "a>b";
            } else if (a < b) {
                return "a<b";
            }
            return "a==b";
        }
    }

    public void main(String[] args) {

        Test1 test = new Test1();
        test.decrement();
        test.increment();
        test.decrement();
        test.print();
        System.out.printf(" %s", test.findMax());
        System.out.printf(" summ = %d", test.getSumm());
    }
}
