package com.inventory.inventoryandordermanagement.service;

import com.inventory.inventoryandordermanagement.dto.CustomerRequest;
import com.inventory.inventoryandordermanagement.dto.CustomerResponse;
import com.inventory.inventoryandordermanagement.entity.Customer;
import com.inventory.inventoryandordermanagement.exception.ResourceNotFoundException;
import com.inventory.inventoryandordermanagement.mapper.CustomerMapper;
import com.inventory.inventoryandordermanagement.repo.CustomerRepository;
import com.inventory.inventoryandordermanagement.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    @Override
    public CustomerResponse createCustomer(CustomerRequest request) {
        Customer customer = customerMapper.toEntity(request);
        Customer saved = customerRepository.save(customer);
        return customerMapper.toResponse(saved);
    }

    @Override
    public CustomerResponse updateCustomer(Long id, CustomerRequest request) {
        Customer existing = customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + id));
        customerMapper.updateEntity(request, existing);
        Customer updated = customerRepository.save(existing);
        return customerMapper.toResponse(updated);
    }

    @Override
    @Transactional(readOnly = true)
    public CustomerResponse getCustomer(Long id) {
        Customer customer = customerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found with id: " + id));
        return customerMapper.toResponse(customer);
    }

    @Override
    @Transactional(readOnly = true)
    public List<CustomerResponse> getAllCustomers() {
        return customerRepository.findAll()
                .stream()
                .map(customerMapper::toResponse)
                .toList();
    }

    @Override
    public void deleteCustomer(Long id) {
        if (!customerRepository.existsById(id)) {
            throw new ResourceNotFoundException("Customer not found with id: " + id);
        }
        customerRepository.deleteById(id);
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElseThrow(null);
    }
}
