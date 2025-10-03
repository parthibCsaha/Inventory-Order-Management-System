package com.inventory.inventoryandordermanagement.service;

import com.inventory.inventoryandordermanagement.dto.StockTransactionRequest;
import com.inventory.inventoryandordermanagement.dto.StockTransactionResponse;

import java.util.List;

public interface StockService {

    StockTransactionResponse adjustStock(Long productId, StockTransactionRequest request);
    List<StockTransactionResponse> getTransactionsForProduct(Long productId);


}
