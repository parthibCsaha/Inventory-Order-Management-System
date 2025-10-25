package com.inventory.inventoryandordermanagement.dto;

import java.time.Instant;

public record AuditLogDto(
        Long id,
        Long userId,
        String entityName,
        Long entityId,
        String actionType, // could be Enum string
        String oldValue,
        String newValue,
        Instant timestamp
) {}
