package com.example.payment.service;

import com.example.payment.entity.Order;
import com.example.payment.repository.payment.PaymentAdapterInterFace;
import com.example.payment.repository.payment.PaymentAdapterLocalData;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentAdapterInterFace paymentAdapter;
    @Autowired
    public PaymentService() {
        this.paymentAdapter = new PaymentAdapterLocalData();
    }

    public void insert(final Order order) {
    }

    public List<Order> getOrderList(final long userIdx) {
        return paymentAdapter.getOrderList(userIdx);
    }
}
