package com.Wrapper;

public class Wrapper {

    private String color;

    public Wrapper(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Wrapper)) {
            return false;
        }

        Wrapper wrapper = (Wrapper) o;

        return wrapper.color.equals(color);
    }

    //Idea from effective Java : Item 9
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + color.hashCode();
        return result;
    }
}
