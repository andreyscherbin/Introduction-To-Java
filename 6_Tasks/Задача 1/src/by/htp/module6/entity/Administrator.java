package by.htp.module6.entity;

import java.io.Serializable;

public class Administrator extends User implements Serializable {

    private static final long serialVersionUID = 4L;

    public Administrator(){

    }

    public Administrator(String name, String password, String email) {

        super(name,password,email);
    }

    public boolean addBook(Book book){

        return super.getCatalog().addBook(book);
    }

    public boolean removeBook(Book book){

        return super.getCatalog().removeBook(book);
    }

    @Override
    public int hashCode() {

        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {

        return super.equals(obj);
    }

    @Override
    public String toString() {

        return super.toString();
    }
}
