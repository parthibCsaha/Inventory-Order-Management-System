package com.inventory.inventoryandordermanagement.mapper;

import com.inventory.inventoryandordermanagement.dto.InventoryAlertResponse;
import com.inventory.inventoryandordermanagement.entity.InventoryAlert;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface InventoryAlertMapper {

    InventoryAlertResponse toResponse(InventoryAlert entity);

}
