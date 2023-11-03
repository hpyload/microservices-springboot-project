package com.oumellahni.paymentservice.service;

import com.oumellahni.paymentservice.model.PaymentRequest;
import com.oumellahni.paymentservice.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
