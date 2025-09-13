package com.inventory.inventoryandordermanagement.dto;

public record SupplierResponse(
        Long id,
        String name,
        String email,
        String phone,
        String address
) {}
