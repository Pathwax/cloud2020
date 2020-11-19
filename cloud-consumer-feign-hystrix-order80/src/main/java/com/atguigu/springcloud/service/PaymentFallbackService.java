package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "--------PaymentFallbackService fall back-paymentInfo-ok, /(ㄒoㄒ)/~~";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "--------PaymentFallbackService fall back-paymentInfo-timeout,/(ㄒoㄒ)/~~";

    }
}
