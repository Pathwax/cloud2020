package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
public class PaymentService {
    // 正常访问
    public String paymentInfo_OK(Integer id){
        return "线程池: "+Thread.currentThread().getName()+"   paymentInfo_OK,id: "+id+"\t"+"O(∩_∩)O";
    }
    // 异常访问
    public String paymentInfo_TimeOut(Integer id){
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: "+Thread.currentThread().getName()+"   paymentInfo_TimeOut,id: "+id+"\t"+"O(∩_∩)O"+"   耗时"+timeNumber+"秒钟";
    }
}
