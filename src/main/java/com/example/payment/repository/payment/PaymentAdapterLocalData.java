package com.example.payment.repository.payment;

import com.example.payment.entity.Order;

import java.util.ArrayList;
import java.util.List;

public class PaymentAdapterLocalData implements PaymentAdapterInterFace {

    private final List<Order> orderList = new ArrayList<>();

    public List<Order> getOrderList(final long userIdx) {
        return orderList;
    }
}
