package by.htp.module4.entity;

import java.io.Serializable;

public class Test1 implements Serializable {

    private static final long serialVersionUID = 1L;

    private int a;
    private int b;

    public Test1() {
        super();
    }

    public Test1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Test1)) {
            return false;
        }

        Test1 test1 = (Test1) o;

        return test1.a == a &&
                test1.b == b;

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + a;
        result = 31 * result + b;
        return result;
    }

    @Override
    public String toString() {
        return "A: " + a + " B: " + b;
    }
}
