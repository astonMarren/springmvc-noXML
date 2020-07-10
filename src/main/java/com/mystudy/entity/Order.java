package com.mystudy.entity;

import org.springframework.stereotype.Component;

@Component
public class Order {
    private String orderId;
    private String userId;

    public Order() {
        System.out.println("=====Order Construct=====");
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
