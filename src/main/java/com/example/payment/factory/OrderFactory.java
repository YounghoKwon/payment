package com.example.payment.factory;

import com.example.payment.entity.Order;
import com.example.payment.entity.Product;
import com.example.payment.service.dto.OrderDto;
import java.util.List;
import lombok.Value;

@Value
public class OrderFactory {
    List<Order> orderList;
    List<Product> productInfoList;

    public static OrderDto create(){
        return new OrderDto();
    }
}
