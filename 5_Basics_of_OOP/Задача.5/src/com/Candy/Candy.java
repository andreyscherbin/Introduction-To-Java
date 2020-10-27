package com.Candy;

import com.Wrapper.Wrapper;

public class Candy {

    private String name;

    public Candy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Wrapper)) {
            return false;
        }

        Candy candy = (Candy) o;

        return candy.name.equals(name);
    }

    //Idea from effective Java : Item 9
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        return result;
    }
}
