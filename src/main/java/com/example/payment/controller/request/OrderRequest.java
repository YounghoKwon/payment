package com.example.payment.controller.request;

import java.util.List;
import java.util.stream.Collectors;
import lombok.Value;

@Value
public class OrderRequest {

    long userIdx;
    List<OrderProductRequest> orderProductList;

    public List<Long> getProductIdxList() {
        return orderProductList.stream()
            .map(OrderProductRequest::getProductIdx)
            .collect(Collectors.toList());
    }

}
