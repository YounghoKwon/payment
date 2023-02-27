package com.example.payment.facade;

import com.example.payment.controller.request.OrderRequest;
import com.example.payment.entity.Order;
import com.example.payment.entity.Product;
import com.example.payment.factory.OrderFactory;
import com.example.payment.service.PaymentService;
import com.example.payment.service.ProductService;
import com.example.payment.service.dto.OrderDto;
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
        final List<Order> orderList = paymentService.getOrderList(orderRequest.getUserIdx());
        final OrderDto orderDto = new OrderFactory(orderList, productInfoList).create();
        paymentService.insert(orderDto.getOrder());
    }
}
