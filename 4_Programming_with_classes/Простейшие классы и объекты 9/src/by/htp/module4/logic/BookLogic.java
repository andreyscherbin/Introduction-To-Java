package by.htp.module4.logic;

import by.htp.module4.entity.Book;

import java.util.List;
import java.util.ArrayList;

public class BookLogic {

    public List<Book> findBookListAuthor(String author, List<Book> books) {

        List<Book> findBooks = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getAuthor() == author) {
                findBooks.add(book);
            }
        }
        return findBooks;
    }

    public List<Book> findBookPublishingHouse(String publishingHouse, List<Book> books) {

        List<Book> findBooks = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getPublishingHouse() == publishingHouse) {
                findBooks.add(book);
            }
        }
        return findBooks;
    }

    public List<Book> findBookYearPublishing(int yearPublishing, List<Book> books) {

        List<Book> findBooks = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getYearPublishing() > yearPublishing) {
                findBooks.add(book);
            }
        }
        return findBooks;
    }
}
