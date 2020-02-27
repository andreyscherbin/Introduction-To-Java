package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Payment {

    private String name;
    private Product[] prodArray;
    private int cost;

    private class Product {

        private String productName;
        private int productCost;

        public Product() {
            productName = "";
            productCost = 0;
        }

        public Product(String productName, int productCost) {
            this.productName = productName;
            this.productCost = productCost;
        }

        public String getProductName() {
            return this.productName;
        }

        public int getProductCost() {
            return this.productCost;
        }
    }

    public Payment() {
        this.name = "";
        this.cost = 0;
    }

    public Payment(String name) {
        this.name = name;
    }

    public void setPayment() {
        cost = 0;
        System.out.print("Введите количество товаров, которое Вы хотите” + + “приобрести: ");
        Scanner scanner = new Scanner(System.in);
        int counterProducts = scanner.nextInt();
        prodArray = new Product[counterProducts];
        for (int i = 0; i < counterProducts; i++) {
            System.out.println("Товар " + (i + 1) + ": ");
            System.out.print("Наименование: ");
            String nameProduct = scanner.next();
            System.out.print("Цена: ");
            int costProduct = scanner.nextInt();
            prodArray[i] = new Product(nameProduct, costProduct);
            cost = cost + prodArray[i].productCost;
        }
    }

    public void printCheque() {

        System.out.println(" " + this.name);
        for (int i = 0; i < this.prodArray.length; i++) {
            System.out.printf("%3d", i + 1);
            System.out.printf("%15s",
                    this.prodArray[i].productName);
            System.out.printf("%10d",
                    this.prodArray[i].productCost);
            System.out.println();
        }
        System.out.print("Общая стоимость: ");
        System.out.printf("%11d", this.cost);
    }
}