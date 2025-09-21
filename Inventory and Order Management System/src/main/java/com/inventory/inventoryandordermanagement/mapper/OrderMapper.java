package com.inventory.inventoryandordermanagement.mapper;

import com.inventory.inventoryandordermanagement.dto.OrderRequest;
import com.inventory.inventoryandordermanagement.dto.OrderResponse;
import com.inventory.inventoryandordermanagement.entity.Order;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {OrderItemMapper.class})
public interface OrderMapper {

    Order toEntity(OrderRequest dto);
    OrderResponse toResponse(Order entity);

}
