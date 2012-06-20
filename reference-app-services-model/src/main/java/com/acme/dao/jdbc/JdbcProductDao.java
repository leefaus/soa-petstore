package com.acme.dao.jdbc;

import com.acme.dao.ProductDao;
import com.acme.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("productDao")
public class JdbcProductDao extends JdbcDao implements ProductDao {
    @Override
    public List<Product> retrieveProductsForCategory(String categoryId) {
        return null;
    }

    @Override
    public String deleteProduct(String productId) {
        return null;
    }

    @Override
    public Product modifyProduct(Product product) {
        return null;
    }

    @Override
    public Product retrieveProduct(String productId) {
        return null;
    }
}
