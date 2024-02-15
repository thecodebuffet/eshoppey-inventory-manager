package org.eshoppey.inventorymanager.controller;

import jdk.jfr.ContentType;
import org.eshoppey.inventorymanager.model.Product;
import org.eshoppey.inventorymanager.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping(path="/product")
    public Product createProduct(@RequestBody Product product){
        Product savedProduct = productService.saveProduct(product);
        return savedProduct;
    }
}
