package by.htp.module4.logic;

import by.htp.module4_1.entity.Test1;

public class Test1Logic {

    public boolean increment(Test1 object) {

        object.setA(object.getA() + 1);
        object.setB(object.getB() + 1);
        return true;
    }

    public boolean decrement(Test1 object) {

        object.setA(object.getA() - 1);
        object.setB(object.getB() - 1);
        return true;
    }

    public int getSum(Test1 object) {
        return object.getA() + object.getB();
    }

    public String findMax(Test1 object) {

        if (object.getA() > object.getB()) {
            return "a > b";
        } else if (object.getA() < object.getB()) {
            return "a < b";
        }
        return "a == b";
    }
}
