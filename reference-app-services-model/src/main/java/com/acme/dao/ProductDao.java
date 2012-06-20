package com.acme.dao;

import com.acme.model.Product;

import java.util.List;

public interface ProductDao {
    public List<Product> retrieveProductsForCategory(String categoryId);

    public String deleteProduct(String productId);

    public Product modifyProduct(Product product);

    public Product retrieveProduct(String productId);
}
