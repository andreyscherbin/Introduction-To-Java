package by.htp.module6.main;

import by.htp.module6.entity.Administrator;
import by.htp.module6.entity.Book;
import by.htp.module6.entity.Catalog;
import by.htp.module6.entity.User;
import by.htp.module6.logic.FileBook;
import by.htp.module6.logic.FileUser;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    /*  Задание 1: Создать консольное приложение "Учет книг в домашней библиотеке"
    
    Общие требования к заданию:
    
    - Система учитывает книги как в электронном, так и в бумажном варианте.
    - Существующие роли: пользователь, администратор.
    - Пользователь может просматривать книги в каталоге книг, осуществлять поиск книг в каталоге.
    - Администратор может модифицировать каталог.
    - *При добавлении описания книги в каталог оповещение о ней рассылается e-mail всем пользователям
    - **При просмотре каталога желательно реализовать постраничный просмотр
    - ***Пользователь может предложить добавить книгу в библиотеку, переслав её администратору на e-mail.
    - Каталог хранится в текстовом файле
    - Данные аутенфикации пользователи хранятся в текстовом файле. Пароль не хранится в открытом виде    
    */
    
    
    public static void main(String[] args) throws IOException {

        FileBook fileBook = new FileBook();
        FileUser fileUser = new FileUser();
        User user = null;
        Administrator admin = null;

        String name, password;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите логин");
        name = scan.next();
        System.out.println("Введите пароль");
        password = scan.next();
        for (User u : fileUser.readFile("user.txt")) {
            if (u.getName().equals(name) && u.getPassword().equals(password)) {
                user = new User(name, password, u.getEmail());
            }
        }

        //Демонстрация работы в режиме пользователя
        if (user != null && !user.getName().equals("Admin")) {
            Catalog catalog = new Catalog();
            catalog.setBooks(fileBook.readFile("books.txt"));
            user.setCatalog(catalog);
            user.viewCatalog();
            System.out.println(user.findBook(new Book("Философия JAVA", "Брюс Эккель", true)));
        } else {

        //Демонстрация работы в режиме администратора
            admin = new Administrator(user.getName(),user.getPassword(), user.getEmail());
            Catalog catalog = new Catalog();
            catalog.setBooks(fileBook.readFile("books.txt"));
            admin.setCatalog(catalog);
            admin.addBook(new Book("Effective Java", "Джошуа Блох", true));
            admin.viewCatalog();
        }
    }
}
