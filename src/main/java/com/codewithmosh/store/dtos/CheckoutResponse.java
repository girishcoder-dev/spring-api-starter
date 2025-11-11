package com.codewithmosh.store.dtos;

import lombok.Data;

@Data
public class CheckoutResponse {

    private Long orderId;
    private String checkoutUrl;

    public CheckoutResponse(Long id, String url) {
        this.orderId = id;
        this.checkoutUrl = url;
    }
}
