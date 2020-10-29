package by.htp.module5.entity;

import java.io.Serializable;

public class Wrapper implements Serializable {

    private static final long serialVersionUID = 3L;

    private String color;

    public Wrapper(){

    }

    public Wrapper(String color) {

        this.color = color;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Wrapper wrapper = (Wrapper) obj;

        if (!wrapper.color.equals(color))
            return false;
        return true;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }

    @Override
    public String toString() {

        return "Name: " + color;

    }
}
