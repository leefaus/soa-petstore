package com.acme.dao;

import com.acme.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> retrieveProductsForCategory(String categoryId);

    String deleteProduct(String productId);

    Product modifyProduct(Product product);

    Product retrieveProduct(String productId);
}
