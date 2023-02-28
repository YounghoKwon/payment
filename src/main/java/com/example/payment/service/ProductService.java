package com.example.payment.service;

import com.example.payment.entity.Product;
import com.example.payment.repository.payment.PaymentAdapterProxy;
import com.example.payment.repository.product.ProductAdapterInterFace;
import com.example.payment.repository.product.ProductAdapterProxy;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductAdapterInterFace productAdapterInterFace;
    @Autowired
    public ProductService() {
        this.productAdapterInterFace = new ProductAdapterProxy();
    }

    public List<Product> getProductInfoList(final List<Long> productIdxList) {
        final List<Product> products = productAdapterInterFace.getProductInfoListByidxList(productIdxList);

        if (productIdxList.size() != products.size()) {
            throw new IllegalArgumentException("등록되지 않은 상품을 요청하셧습니다.");
        }
        return products;
    }
}
