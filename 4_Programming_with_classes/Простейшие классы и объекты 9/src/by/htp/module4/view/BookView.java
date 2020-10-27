package by.htp.module4.view;

import by.htp.module4.entity.Book;

import java.util.List;

public class BookView {

    public void print(List<Book> books) {

        for (Book book : books) {
            System.out.println(book);
        }
    }
}
