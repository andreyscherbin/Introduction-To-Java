package com.Gift;

import com.AbstractProduct.AbstractProduct;
import com.Candy.Candy;
import com.Wrapper.Wrapper;

public class Gift implements AbstractProduct {

    private int cost;
    private Wrapper wrapper;
    private Candy[] candies;

    public Gift(int cost) {

        switch (cost) {
            case 10:
                wrapper = new Wrapper("Красный");
                candies = new Candy[10];
                for (int i = 0; i < candies.length; i++) {
                    candies[i] = new Candy("Коровка");
                }
                break;

            case 100:
                wrapper = new Wrapper("Зеленый");
                candies = new Candy[100];
                for (int i = 0; i < candies.length; i++) {
                    candies[i] = new Candy("Мармеладка");
                }
                break;

            case 1000:
                wrapper = new Wrapper("Голубой");
                candies = new Candy[1000];
                for (int i = 0; i < candies.length; i++) {
                    candies[i] = new Candy("Шоколапка");
                }
                break;

            default:
                this.cost = 0;
                this.wrapper = null;
                this.candies = null;
                break;
        }
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Цена подарка: " + cost + " Название конфет: " + candies[0].getName() + " Цвет упаковки: " + wrapper.getColor();
    }

    @Override
    public void info() {
        System.out.println("Этот продукт называется подарком");
    }
}
