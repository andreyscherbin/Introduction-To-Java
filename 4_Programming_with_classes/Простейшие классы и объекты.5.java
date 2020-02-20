package com.company;

import java.util.Scanner;

public class Main {

    /*
     * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
     * на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными
     * значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее
     * состояние. Написать код, демонстрирующий все возможности класса.
     */
    private static class DecimalCounter {

        private int value;
        private int range;

        DecimalCounter() {
            super();
            value = 0;
            range = 255;
        }

        DecimalCounter(int value, int range) {
            this.value = value;
            this.range = range;
        }

        private void increment() {
            value++;
            if (value > range) {
                value = 0;
            }
        }

        private void decrement() {
            value--;
            if (value < 0 - range) {
                value = 0;
            }
        }

        private int getValue() {
            return value;
        }

    }

    public static void main(String[] args) {

        DecimalCounter counter = new DecimalCounter();
        System.out.println("Конструктор по умолчанию значение счетчика = " + counter.getValue());
        counter.increment();
        while (counter.getValue() > 0) {
            System.out.println("Значение счетчика =" + counter.getValue());
            counter.increment();
        }
        counter.decrement();
        while (counter.getValue() < 0) {
            System.out.println("Значение счетчика =" + counter.getValue());
            counter.decrement();
        }
        counter = new DecimalCounter(1024, 2048);
        System.out.println("Конструктор c параметрами значение счетчика = " + counter.getValue());
        counter.increment();
        while (counter.getValue() > 0) {
            System.out.println("Значение счетчика =" + counter.getValue());
            counter.increment();
        }
        counter.decrement();
        while (counter.getValue() < 0) {
            System.out.println("Значение счетчика =" + counter.getValue());
            counter.decrement();
        }
    }
}
