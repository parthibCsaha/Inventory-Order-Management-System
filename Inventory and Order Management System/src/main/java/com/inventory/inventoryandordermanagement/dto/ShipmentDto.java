package com.inventory.inventoryandordermanagement.dto;

import java.time.LocalDate;

public record ShipmentDto(
        Long id,
        Long orderId,
        String trackingNumber,
        String carrier,
        String status,  // Enum as String
        LocalDate shippedDate,
        LocalDate expectedDeliveryDate
) {}
