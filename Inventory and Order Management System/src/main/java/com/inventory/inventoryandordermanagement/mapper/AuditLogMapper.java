package com.inventory.inventoryandordermanagement.mapper;

import com.inventory.inventoryandordermanagement.dto.AuditLogDto;
import com.inventory.inventoryandordermanagement.entity.AuditLog;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuditLogMapper {

    AuditLog toDto(AuditLog auditLog);
    AuditLog toEntity(AuditLogDto dto);

}
