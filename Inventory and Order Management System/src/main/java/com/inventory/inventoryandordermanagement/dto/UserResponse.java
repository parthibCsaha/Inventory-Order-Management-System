package com.inventory.inventoryandordermanagement.dto;

import java.util.Set;

public record UserResponse(
        Long id,
        String username,
        String email,
        Set<String> roles
) {}
