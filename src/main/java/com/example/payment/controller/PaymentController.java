package com.example.payment.controller;

import com.example.payment.controller.request.OrderRequest;
import com.example.payment.facade.PaymentFacade;
import java.util.function.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentFacade paymentFacade;

    @PostMapping("/order")
    public ResponseEntity<Object> order(@RequestBody OrderRequest orderRequest) {
        paymentFacade.order(orderRequest);
        return ResponseEntity.ok().build();
    }

}
