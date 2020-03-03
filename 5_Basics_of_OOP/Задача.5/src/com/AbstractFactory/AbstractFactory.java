package com.AbstractFactory;

import com.AbstractProduct.AbstractProduct;

public interface AbstractFactory {

    public AbstractProduct createProduct(int cost);
}
