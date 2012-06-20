package com.acme.mapper;

import com.acme.model.Product;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

public class ProductRowMapper extends BeanPropertyRowMapper<Product> {
    public ProductRowMapper() {
        super(Product.class);
    }
}
