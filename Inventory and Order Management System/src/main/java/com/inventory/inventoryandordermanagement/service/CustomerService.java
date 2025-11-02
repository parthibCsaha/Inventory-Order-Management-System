package com.inventory.inventoryandordermanagement.service;

import com.inventory.inventoryandordermanagement.dto.CustomerRequest;
import com.inventory.inventoryandordermanagement.dto.CustomerResponse;

import java.util.List;

public interface CustomerService {
    CustomerResponse createCustomer(CustomerRequest request);
    CustomerResponse updateCustomer(Long id, CustomerRequest request);
    CustomerResponse getCustomer(Long id);
    List<CustomerResponse> getAllCustomers();
    void deleteCustomer(Long id);
}
