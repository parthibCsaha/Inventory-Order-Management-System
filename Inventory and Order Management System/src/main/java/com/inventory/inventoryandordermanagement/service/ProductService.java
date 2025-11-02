package com.inventory.inventoryandordermanagement.service;

import com.inventory.inventoryandordermanagement.dto.ProductRequest;
import com.inventory.inventoryandordermanagement.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    ProductResponse createProduct(ProductRequest request);
//    ProductResponse updateProduct(ProductRequest request);

    ProductResponse updateProduct(Long id, ProductRequest request);

    void deleteProduct(Long id);
    ProductResponse getProductById(Long id);
    List<ProductResponse> getAllProducts();

}
