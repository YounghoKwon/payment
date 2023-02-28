package com.example.payment.repository.payment;

import com.example.payment.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PaymentRepository {
    void save(Order order);
    List<Order> getOrderList(long userIdx);
}
