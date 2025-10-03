package com.inventory.inventoryandordermanagement.service;

import com.inventory.inventoryandordermanagement.dto.OrderRequest;
import com.inventory.inventoryandordermanagement.dto.OrderResponse;
import java.util.List;

public interface OrderService {

    OrderResponse createOrder(OrderRequest request);
    OrderResponse updateOrderStatus(Long orderId, String status);
    OrderResponse getOrderById(Long id);
    List<OrderResponse> getOrdersByCustomer(Long customerId);

}
