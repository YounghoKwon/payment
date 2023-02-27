package com.example.payment.entity;


import java.util.List;

public class Order {

    private Long idx;
    private Long userIdx;
    private String orderNumber;
    private String totalPrice;
    private Long usedPoint;
    private Long orderPrice;
    private Long delivery;
    private List<OrderProduct> orderProductList;

}
