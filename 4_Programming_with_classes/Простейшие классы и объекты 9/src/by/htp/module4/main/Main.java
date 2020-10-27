package by.htp.module4.main;

import by.htp.module4.entity.Shop;
import by.htp.module4.entity.Book;
import by.htp.module4.logic.BookLogic;
import by.htp.module4.view.BookView;

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
    public static void main(String[] args) {

        BookLogic bookLogic = new BookLogic();
        BookView bookView = new BookView();
        Shop shop = new Shop();

        Book book1 = new Book(1, "Voina i mir", "Tolstoy", "Moscow", 1995, 2000, 50, "5");
        Book book2 = new Book(2, "Tri towariwa", "Remark", "Moscow", 1996, 500, 50, "3");
        Book book3 = new Book(1, "1984", "Oruel", "Moscow", 2000, 500, 50, "4");
        Book book4 = new Book(1, "Otwerwennie", "Victor Gygo", "Moscow", 1995, 2000, 50, "5");

        shop.addBook(book1);
        shop.addBook(book2);
        shop.addBook(book3);
        shop.addBook(book4);

        System.out.println(shop);

        bookView.print(bookLogic.findBookListAuthor("Remark", shop.getBooks()));
        bookView.print(bookLogic.findBookPublishingHouse("Moscow", shop.getBooks()));
        bookView.print(bookLogic.findBookYearPublishing(1966, shop.getBooks()));
    }
}
