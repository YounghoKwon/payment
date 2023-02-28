package com.example.payment.repository.product;

import com.example.payment.entity.Product;

import java.util.List;

public class ProductAdapterProxy implements ProductAdapterInterFace {
    @Override
    public List<Product> getProductInfoListByidxList(List<Long> productIdxList) {
        return  List.of(
                new Product(1L, 3000),
                new Product(2L, 1500)
        );
    }
}
