package com.boot.backend.foodiesapi.service;

import com.boot.backend.foodiesapi.io.CartRequest;
import com.boot.backend.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
