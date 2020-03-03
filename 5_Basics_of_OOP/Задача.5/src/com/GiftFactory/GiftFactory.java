package com.GiftFactory;

import com.AbstractFactory.AbstractFactory;
import com.AbstractProduct.AbstractProduct;
import com.Gift.Gift;

public class GiftFactory implements AbstractFactory {

    private final static int[] priceList = {10, 100, 1000};

    @Override
    public AbstractProduct createProduct(int cost) {

        if (cost < priceList[0]) {
            return null;
        }

        AbstractProduct gift = null;

        for (int price : priceList) {
            if (cost >= price) {
                gift = new Gift(price);
                break;
            }
        }
        return gift;
    }
}
