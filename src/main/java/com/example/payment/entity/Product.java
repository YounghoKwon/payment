package com.example.payment.entity;

import java.math.BigDecimal;

public class Product {

    private Long idx;
    private Money price;

    public Product(Long idx, long price) {
        this.idx = idx;
        this.price = new Money(BigDecimal.valueOf(price));
    }

}
