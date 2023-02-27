package com.example.payment.service;

import com.example.payment.entity.Order;
import com.example.payment.repository.PaymentRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public void insert(final Order order) {
    }

    public List<Order> getOrderList(final long userIdx) {
        return List.of(new Order());
    }
}
