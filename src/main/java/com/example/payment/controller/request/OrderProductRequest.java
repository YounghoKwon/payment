package com.example.payment.controller.request;

import lombok.Value;

@Value
public class OrderProductRequest {

    long productIdx;
    int qty;

}
