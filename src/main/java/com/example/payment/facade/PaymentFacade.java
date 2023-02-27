package com.example.payment.facade;

import com.example.payment.controller.request.OrderRequest;
import com.example.payment.entity.Order;
import com.example.payment.entity.Product;
import com.example.payment.service.PaymentService;
import com.example.payment.service.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class PaymentFacade {

    private final PaymentService paymentService;
    private final ProductService productService;

    public void order(final OrderRequest orderRequest) {
        final List<Product> productInfoList = productService.getProductInfoList(
            orderRequest.getProductIdxList());
        Order order = new Order();
        paymentService.insert(order);
    }
}
