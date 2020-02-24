package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    /*
     * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set и get методы и метод
     * toString(). Создать второй класс, агрегирующий массив типа Book, c подходящими конструкторами и методами. Задать
     * критерии выбора данных и вывести данные на консоль.
     *
     * Book: id, название, авторы, издательство, год издания, количество страниц, цена, тип переплета.
     * Найти и вывести:
     * a) Список книг заданного автора;
     * b) Список книг, выпущенных заданным издательством;
     * c) Список книг, выпущенных после заданного года.
     */

    private static class Shop {

        Book[] books;

        Shop(Book[] books) {
            this.books = books;
        }

        private void printBookListAuthor(String author) {

            for (Book book : books) {
                if (book.getAuthor() == author) {
                    System.out.println(book.toString());
                }
            }
        }

        private void printBookPublishingHouse(String publishingHouse) {

            for (Book book : books) {
                if (book.getPublishingHouse() == publishingHouse) {
                    System.out.println(book.toString());
                }
            }
        }

        private void printBookYearPublishing(int yearPublishing) {

            for (Book book : books) {
                if (book.getYearPublishing() > yearPublishing) {
                    System.out.println(book.toString());
                }
            }
        }
    }

    private static class Book {

        private int id;
        private String title;
        private String author;
        private String publishingHouse;
        private int yearPublishing;
        private int numberPages;
        private int price;
        private String bindingType;

        Book(int id, String title, String author, String publishingHouse, int yearPublishing, int numberPages, int price, String bindingType) {
            this.id = id;
            this.title = title;
            this.author = author;
            this.publishingHouse = publishingHouse;
            this.yearPublishing = yearPublishing;
            this.numberPages = numberPages;
            this.price = price;
            this.bindingType = bindingType;
        }

        private void setId(int id) {
            this.id = id;
        }

        private void setTitle(String title) {
            this.title = title;
        }

        private void setAuthor(String author) {
            this.author = author;
        }

        private void setPublishingHouse(String publishingHouse) {
            this.publishingHouse = publishingHouse;
        }

        private void setYearPublishing(int yearPublishing) {
            this.yearPublishing = yearPublishing;
        }

        private void setNumberPages(int numberPages) {
            this.numberPages = numberPages;
        }

        private void setPrice(int price) {
            this.price = price;
        }

        private void setBindingType(String bindingType) {
            this.bindingType = bindingType;
        }


        private int getId() {
            return id;
        }

        private String getTittle() {
            return title;
        }

        private String getAuthor() {
            return author;
        }

        private String getPublishingHouse() {
            return publishingHouse;
        }

        private int getYearPublishing() {
            return yearPublishing;
        }

        private int getNumberPages() {
            return numberPages;
        }

        private int getPrice() {
            return price;
        }

        private String getBindingType() {
            return bindingType;
        }

        @Override
        public String toString() {
            return this.getTittle();

        }
    }

    public static void main(String[] args) {

        Book[] books = {new Book(1, "Voina i mir", "Tolstoy", "Moscow", 1995, 2000, 50, "5"),
                new Book(2, "Tri towariwa", "Remark", "Moscow", 1996, 500, 50, "3"),
                new Book(1, "1984", "Oruel", "Moscow", 2000, 500, 50, "4"),
                new Book(1, "Otwerwennie", "Victor Gygo", "Moscow", 1995, 2000, 50, "5")};

        Shop shop = new Shop(books);
        shop.printBookListAuthor("Remark");
        shop.printBookPublishingHouse("Moscow");
        shop.printBookYearPublishing(1996);
    }
}

