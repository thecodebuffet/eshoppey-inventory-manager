package org.eshoppey.inventorymanager.service;

import org.eshoppey.inventorymanager.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public Product saveProduct(Product product) {
        return product;
    }
}
