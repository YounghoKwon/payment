package com.example.payment.service;

import com.example.payment.entity.Product;
import java.util.List;

public class ProductService {

    public List<Product> getProductInfoList(final List<Long> productIdxList) {
        final List<Product> products = List.of(
            new Product(1L, 3000),
            new Product(2L, 1500)
        );
        if(productIdxList.size() != products.size()){
            throw new IllegalArgumentException("등록되지 않은 상품을 요청하셧습니다.");
        }
        return products;
    }
}