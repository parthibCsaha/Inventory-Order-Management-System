package com.inventory.inventoryandordermanagement.dto;

public record AuthResponse(
        String token,
        String username,
        String role
) {}
