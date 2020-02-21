package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    /*
     * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set и get методы и метод
     * toString(). Создать второй класс, агрегирующий массив типа Customer, c подходящими конструкторами и методами.
     * Задать критерии выбора данных и вывести эти данные на консоль.
     *
     * Класс Customer:id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
     * Найти и вывести:
     * a) Список покупателей в алфавитном порядке;
     * b) Список покупателей, у которых номер кредитной карточки находится в заданном интервале
     */

    private static class Shop {

        Customer[] customers;

        Shop(Customer[] customers) {
            this.customers = customers;
        }

        private void printCustomersListInAlphabetOrder() {

            for (int i = 0; i < customers.length; i++) {
                for (int j = 0; j < customers.length - i - 1; j++) {
                    if (customers[j].getName().charAt(0) > customers[j + 1].getName().charAt(0)) {
                        Customer var = customers[j];
                        customers[j] = customers[j + 1];
                        customers[j + 1] = var;
                    }
                }
            }
            for (Customer customer : customers) {
                System.out.println(customer.toString());
            }
        }

        private void printCustomersListInCreditCardNumberRange(int range1, int range2) {

            for (Customer customer : customers) {
                if (customer.getCreditCardNumber() >= range1 && customer.getCreditCardNumber() <= range2) {
                    System.out.println(customer.toString());
                }
            }
        }
    }

    private static class Customer {

        private int id;
        private String name;
        private String surname;
        private String middleName;
        private String address;
        private int creditCardNumber;
        private int bankAccountNumber;

        Customer(int id, String name, String surname, String middleName, String address, int creditCardNumber, int bankAccountNumber) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.middleName = middleName;
            this.address = address;
            this.creditCardNumber = creditCardNumber;
            this.bankAccountNumber = bankAccountNumber;
        }

        private void setId(int id) {
            this.id = id;
        }

        private void setName(String name) {
            this.name = name;
        }

        private void setSurname(String surname) {
            this.surname = surname;
        }

        private void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        private void setAddress(String address) {
            this.address = address;
        }

        private void setCreditCardNumber(int creditCardNumber) {
            this.creditCardNumber = creditCardNumber;
        }

        private void setBankAccountNumber(int bankAccountNumber) {
            this.bankAccountNumber = bankAccountNumber;
        }

        private int getId() {
            return this.id;
        }

        private String getName() {
            return this.name;
        }

        private String getSurname() {
            return this.surname;
        }

        private String getMiddleName() {
            return this.middleName;
        }

        private String getAddress() {
            return this.address;
        }

        private int getCreditCardNumber() {
            return this.creditCardNumber;
        }

        private int getBankAccountNumber() {
            return this.bankAccountNumber;
        }

        @Override
        public String toString() {
            return this.getName() + " " + this.getSurname() + " " + this.getMiddleName();

        }
    }

    public static void main(String[] args) {

        Customer[] customers = {new Customer(1, "andrey", "scherbin", "vasechkin", "yl.Puwkina", 1111, 777),
                new Customer(2, "petya", "orlov", "petichkin", "yl.Puwkina", 2222, 888),
                new Customer(3, "vasya", "molotov", "vasechkin", "yl.Petrova", 3333, 999),
                new Customer(4, "kolya", "lybimov", "krytov", "yl.Genadeva", 4444, 444),
                new Customer(5, "nikolay", "solniwkin", "hohlov", "yl.Pobedi", 5555, 333)};
        Shop shop = new Shop(customers);
        shop.printCustomersListInAlphabetOrder();
        shop.printCustomersListInCreditCardNumberRange(1000, 3000);
    }
}

