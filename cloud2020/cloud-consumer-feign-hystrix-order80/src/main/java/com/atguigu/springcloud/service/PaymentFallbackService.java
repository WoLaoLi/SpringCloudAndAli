package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author: LiDeLin  18234780819@163.com
 * @date: 2020/3/14
 * @description :
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK , (┬＿┬)";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut , (┬＿┬)";
    }
}
