package by.htp.module5.entity;

import java.io.Serializable;

public class Candy implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    public Candy() {

    }

    public Candy(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Candy candy = (Candy) obj;

        if (!candy.name.equals(name))
            return false;
        return true;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public String toString() {

        return "Name: " + name;

    }

}
