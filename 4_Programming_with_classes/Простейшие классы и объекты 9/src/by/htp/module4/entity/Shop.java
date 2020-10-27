package by.htp.module4.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Shop implements Serializable {

    private static final long serialVersionUID = 2L;

    private List<Book> books;

    {
        books = new ArrayList<Book>();
    }

    public Shop() {

    }

    public Shop(List<Book> books) {

        this.books = books;

    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (o == null)
            return false;
        if (!(o instanceof Shop)) {
            return false;
        }

        Shop shop = (Shop) o;

        if (shop.books == books) {
            return true;
        }

        return shop.books.equals(books);

    }

    @Override
    public int hashCode() {

        int result = 17;

        result = 31 * result + ((books == null) ? 0 : books.hashCode());
        return result;
    }

    @Override
    public String toString() {

        StringBuilder string = new StringBuilder();
        String delimeter = "\n";
        for (Book book : books) {
            string.append(book.toString());
            string.append(delimeter);

        }
        return string.toString();
    }
}
