package com.example.payment.repository.payment;

import com.example.payment.entity.Order;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PaymentAdapterJpa implements PaymentAdapterInterFace {
    private final PaymentRepository paymentRepository;

    public List<Order> getOrderList(final long userIdx) {

        return paymentRepository.getOrderList(userIdx);
    }
}
