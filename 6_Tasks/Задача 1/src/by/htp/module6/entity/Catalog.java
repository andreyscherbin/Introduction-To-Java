package by.htp.module6.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Catalog implements Serializable {

    private static final long serialVersionUID = 2L;

    private List<Book> books;

    {
        books = new ArrayList<Book>();
    }

    public Catalog(){

    }

   public void setBooks(List<Book> books){

        this.books = books;
   }

   public List<Book> getBooks(){

        return books;
   }

   public boolean addBook(Book book){

        return books.add(book);
   }

   public boolean removeBook(Book book){

        return books.remove(book);
   }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((books == null) ? 0 : books.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Catalog catalog = (Catalog) obj;

        if (books == null) {
            if (catalog.books != null)
                return false;
        } else if (!books.equals(catalog.books))
            return false;
        return true;
    }

    @Override
    public String toString() {

        return "Books: " + books;
    }

}
