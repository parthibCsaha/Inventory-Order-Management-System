package com.inventory.inventoryandordermanagement.service;

import com.inventory.inventoryandordermanagement.dto.SupplierRequest;
import com.inventory.inventoryandordermanagement.dto.SupplierResponse;

import java.util.List;

public interface SupplierService {
    SupplierResponse createSupplier(SupplierRequest request);
    SupplierResponse updateSupplier(Long id, SupplierRequest request);
    SupplierResponse getSupplier(Long id);
    List<SupplierResponse> getAllSuppliers();
    void deleteSupplier(Long id);
}
