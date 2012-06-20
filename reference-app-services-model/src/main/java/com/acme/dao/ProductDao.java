package com.acme.dao;

import com.acme.model.Product;

import java.util.List;

public interface ProductDao {
    String deleteProduct(String productId);

    Product modifyProduct(Product product);

    Product retrieveProduct(String productId);

    List<Product> findProductsForCategory(String categoryId);
}
