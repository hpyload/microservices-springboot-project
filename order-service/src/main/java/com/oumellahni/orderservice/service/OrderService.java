package com.oumellahni.orderservice.service;

import com.oumellahni.orderservice.model.OrderRequest;
import com.oumellahni.orderservice.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}