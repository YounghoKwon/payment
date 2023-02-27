package com.example.payment.repository;

import com.example.payment.entity.Order;

public interface PaymentRepository {

    void save(Order order);

}
