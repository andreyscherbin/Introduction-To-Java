package com.company;

public class Main {

    /*
     * Создайте класс Test2 с двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
     * инициализирующий члены класса по умолчанию. Добавьте set и get методы для полей экземпляра класса.
     */
    private static class Test1 {

        private int A, B;

        Test1(int A, int B) {
            this.A = A;
            this.B = B;
        }

        Test1() {
            super();
        }

        private int getA() {
            return A;
        }

        private void setA(int A) {
            this.A = A;
        }

        private int getB() {
            return B;
        }

        private void setB(int B) {
            this.B = B;
        }
    }

    public static void main(String[] args) {

        Test1 test = new Test1();
        System.out.println(test.getA());
        System.out.println(test.getB());
        test = new Test1(5, 6);
        System.out.println(test.getA());
        System.out.println(test.getB());
        test.setA(10);
        test.setB(11);
        System.out.println(test.getA());
        System.out.println(test.getB());
    }
}
