package com.boot.backend.foodiesapi.service;

import com.boot.backend.foodiesapi.io.UserRequest;
import com.boot.backend.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
