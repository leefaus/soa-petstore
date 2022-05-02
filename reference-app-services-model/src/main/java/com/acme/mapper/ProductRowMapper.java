package com.acme.mapper;

import com.acme.dao.jdbc.NestedBeanPropertyRowMapper;
import com.acme.model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper extends NestedBeanPropertyRowMapper<Product> {
    public ProductRowMapper() {
        super(Product.class);
    }

    @Override
    public Product mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
        return super.mapRow(resultSet, rowNumber);
    }
}
