package com.example.payment.service;

import com.example.payment.entity.Order;
import com.example.payment.repository.PaymentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public void insert(final Order order) {
        paymentRepository.save(order);

    }
}
