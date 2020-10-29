package by.htp.module5.logic;

import by.htp.module5.interfaces.AbstractFactory;
import by.htp.module5.interfaces.AbstractProduct;
import by.htp.module5.entity.Gift;

public class GiftFactory implements AbstractFactory {

    private final static int[] priceList = {10, 100, 1000};

    @Override
    public AbstractProduct createProduct(int cost) {

        if (cost < priceList[0]) {
            return null;
        }

        AbstractProduct gift = null;

        for (int price : priceList) {
            if (cost >= price && cost == price) {
                gift = new Gift(price);
                break;
            }
        }
        return gift;
    }
}
