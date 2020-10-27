package by.htp.module4.entity;

import java.io.Serializable;

public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int yearPublishing;
    private int numberPages;
    private int price;
    private String bindingType;

    public Book() {
    }

    public Book(int id, String title, String author, String publishingHouse, int yearPublishing, int numberPages, int price, String bindingType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearPublishing = yearPublishing;
        this.numberPages = numberPages;
        this.price = price;
        this.bindingType = bindingType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public int getId() {
        return id;
    }

    public String getTittle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public int getPrice() {
        return price;
    }

    public String getBindingType() {
        return bindingType;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (o == null) return false;
        if (!(o instanceof Book)) {
            return false;
        }

        Book book = (Book) o;

        return book.id == id &&
                book.title.equals(title) &&
                book.author.equals(author) &&
                book.publishingHouse.equals(publishingHouse) &&
                book.yearPublishing == yearPublishing &&
                book.numberPages == numberPages &&
                book.price == price &&
                book.bindingType.equals(bindingType);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + title.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + publishingHouse.hashCode();
        result = 31 * result + yearPublishing;
        result = 31 * result + numberPages;
        result = 31 * result + price;
        result = 31 * result + bindingType.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return this.getTittle();

    }
}
