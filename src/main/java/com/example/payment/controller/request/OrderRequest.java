package com.example.payment.controller.request;

import com.example.payment.entity.Money;
import java.math.BigDecimal;
import lombok.Value;

@Value
public class OrderRequest {

    Money price;
    long productIdx;
    int qty;

    public OrderRequest(long price, long productIdx, int qty) {
        this.price = new Money(BigDecimal.valueOf(price));
        this.productIdx = productIdx;
        this.qty = qty;
    }

}
