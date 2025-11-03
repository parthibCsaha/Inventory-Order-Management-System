package com.inventory.inventoryandordermanagement.mapper;

import com.inventory.inventoryandordermanagement.dto.StockTransactionRequest;
import com.inventory.inventoryandordermanagement.dto.StockTransactionResponse;
import com.inventory.inventoryandordermanagement.entity.StockTransaction;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StockTransactionMapper {

    StockTransaction toEntity(StockTransactionRequest dto);
    StockTransactionResponse toResponse(StockTransaction entity);

}
