package com.example.payment.repository.product;

import com.example.payment.entity.Order;
import com.example.payment.entity.Product;

import java.util.List;

public interface ProductAdapterInterFace {
    List<Product> getProductInfoListByidxList(List<Long> productIdxList);
}
