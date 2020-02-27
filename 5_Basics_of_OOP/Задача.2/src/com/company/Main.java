package com.company;

public class Main {

    public static void main(String[] args) {

        Payment pay = new Payment("Первая покупка");
        pay.setPayment();
        pay.printCheque();
    }
}

