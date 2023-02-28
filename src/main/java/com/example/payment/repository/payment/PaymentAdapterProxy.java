package com.example.payment.repository.payment;

import com.example.payment.entity.Order;

import java.util.List;

public class PaymentAdapterProxy implements PaymentAdapterInterFace {
    public List<Order> getOrderList(final long userIdx) {
        return List.of();
    }
}
