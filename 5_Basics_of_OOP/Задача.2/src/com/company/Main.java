package com.company;

/*
    Создать класс Payment с внутренним класом, с помощью объектов которого можно сформировать покупку из
    нескольких товаров
*/
public class Main {

    public static void main(String[] args) {

        Payment pay = new Payment("Payment");
        pay.setPayment();
        pay.printCheque();
    }
}

