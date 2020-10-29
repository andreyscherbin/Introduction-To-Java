package by.htp.module5.entity;

import by.htp.module5.interfaces.AbstractProduct;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Gift implements AbstractProduct, Serializable {

    private static final long serialVersionUID = 2L;

    private int cost;
    private Wrapper wrapper;
    private List<Candy> candies;

    {
        candies = new ArrayList<Candy>();

    }

    public Gift() {

    }

    public Gift(int cost) {

        switch (cost) {
            case 10:
                wrapper = new Wrapper("Красный");
                for (int i = 0; i < 10; i++) {

                    candies.add(new Candy("Коровка"));
                }
                break;
            case 100:
                wrapper = new Wrapper("Зеленый");
                for (int i = 0; i < 100; i++) {

                    candies.add(new Candy("Мармеладка"));
                }
                break;
            case 1000:
                wrapper = new Wrapper("Голубой");
                for (int i = 0; i < 1000; i++) {

                    candies.add(new Candy("Шоколапка"));
                }
                break;
            default:
                break;
        }
        this.cost = cost;
    }

    @Override
    public String info() {
        return "Этот продукт называется подарком";

    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Gift gift = (Gift) obj;

        if (cost != gift.cost)
            return false;
        if(wrapper == null){
            if(gift.wrapper != null)
                return false;
        } else if(!wrapper.equals(gift.wrapper))
            return false;
        if (candies == null) {
            if (gift.candies != null)
                return false;
        } else if (!candies.equals(gift.candies))
            return false;
        return true;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + ((wrapper == null) ? 0 : wrapper.hashCode());
        result = prime * result + cost;
        result = prime * result + ((candies == null) ? 0 : candies.hashCode());

        return result;
    }

    @Override
    public String toString() {

        return "Цена подарка: " + cost + " Название конфет: " + candies.get(0).getName() + " Цвет упаковки: " + wrapper.getColor();

    }
}
