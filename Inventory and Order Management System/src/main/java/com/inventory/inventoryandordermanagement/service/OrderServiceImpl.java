package com.inventory.inventoryandordermanagement.service;

import com.inventory.inventoryandordermanagement.dto.OrderRequest;
import com.inventory.inventoryandordermanagement.dto.OrderResponse;
import com.inventory.inventoryandordermanagement.entity.Order;
import com.inventory.inventoryandordermanagement.exception.ResourceNotFoundException;
import com.inventory.inventoryandordermanagement.mapper.OrderMapper;
import com.inventory.inventoryandordermanagement.repo.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Override
    public OrderResponse createOrder(OrderRequest request) {
        Order order = orderMapper.toEntity(request);
        return orderMapper.toResponse(orderRepository.save(order));
    }

    @Override
    public OrderResponse updateOrderStatus(Long orderId, String status) {
        Order order = orderRepository.findById(orderId)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id " + orderId));
        order.setStatus(status);
        return orderMapper.toResponse(orderRepository.save(order));
    }

    @Override
    public OrderResponse getOrderById(Long id) {
        return orderRepository.findById(id)
                .map(orderMapper::toResponse)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found with id " + id));
    }

    @Override
    public List<OrderResponse> getOrdersByCustomer(Long customerId) {
        return orderRepository.findByCustomerId(customerId)
                .stream().map(orderMapper::toResponse).toList();
    }
}
