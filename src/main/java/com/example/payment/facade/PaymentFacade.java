package com.example.payment.facade;

import com.example.payment.controller.request.OrderRequest;
import com.example.payment.entity.Order;
import com.example.payment.service.PaymentService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PaymentFacade {

    private PaymentService paymentService;

    public void order(final OrderRequest orderRequest) {
        Order order = new Order();
        paymentService.insert(order);
    }
}
