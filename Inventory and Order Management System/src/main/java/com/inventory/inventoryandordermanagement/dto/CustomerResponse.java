package com.inventory.inventoryandordermanagement.dto;

public record CustomerResponse(
        Long id,
        String name,
        String email,
        String phone,
        String address
) {}
