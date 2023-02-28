package com.example.payment.repository.payment;

import com.example.payment.entity.Order;

import java.util.List;

public interface PaymentAdapterInterFace {
    public List<Order> getOrderList(final long userIdx);
}
