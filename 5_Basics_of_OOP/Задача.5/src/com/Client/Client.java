package com.Client;

import com.AbstractFactory.AbstractFactory;
import com.AbstractProduct.AbstractProduct;

public class Client {

    private AbstractFactory abstractFactory;
    private AbstractProduct abstractProduct;

    public AbstractProduct getGift(int cost){
        abstractProduct = abstractFactory.createProduct(cost);
        return abstractProduct;
    }

    public void setAbstractFactory(AbstractFactory factory){
        abstractFactory = factory;
    }
}
