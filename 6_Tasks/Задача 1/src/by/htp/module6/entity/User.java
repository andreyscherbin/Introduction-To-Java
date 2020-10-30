package by.htp.module6.entity;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 3L;

    private String name;
    private String password;
    private String email;
    private Catalog catalog;

    public User() {

    }

    public User(String name, String password, String email) {

        this.name = name;
        this.password = password;
        this.email = email;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setCatalog(Catalog catalog) {

        this.catalog = catalog;
    }

    public String getName() {

        return name;
    }

    public String getPassword() {

        return password;
    }

    public String getEmail() {

        return email;
    }

    public Catalog getCatalog() {

        return catalog;
    }

    public void viewCatalog() {

        for (Book book : catalog.getBooks()) {
            System.out.println(book);
        }
    }

    public boolean findBook(Book book) {

        for (Book b : catalog.getBooks()) {
            if (b.equals(book))
                return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((catalog == null) ? 0 : catalog.hashCode());

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
        User user = (User) obj;

        if (name == null) {
            if (user.name != null)
                return false;
        } else if (!name.equals(user.name))
            return false;
        if (password == null) {
            if (user.password != null)
                return false;
        } else if (!password.equals(user.password))
            return false;
        if (email == null) {
            if (user.email != null)
                return false;
        } else if (!email.equals(user.email))
            return false;
        if (catalog == null) {
            if (user.catalog != null)
                return false;
        } else if (!catalog.equals(user.catalog))
            return false;
        return true;
    }

    @Override
    public String toString() {

        return "Name: " + name + "Password: " + password + "Email : " + email;
    }

}
