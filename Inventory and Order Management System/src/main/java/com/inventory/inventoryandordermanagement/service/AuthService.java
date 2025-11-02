package com.inventory.inventoryandordermanagement.service;

import com.inventory.inventoryandordermanagement.dto.AuthRequest;
import com.inventory.inventoryandordermanagement.dto.AuthResponse;

public interface AuthService {
    AuthResponse login(AuthRequest request);
}
