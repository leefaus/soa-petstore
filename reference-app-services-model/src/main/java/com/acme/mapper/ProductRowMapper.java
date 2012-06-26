package com.acme.mapper;

import com.acme.model.Category;
import com.acme.model.Product;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper extends BeanPropertyRowMapper<Product> {
    public ProductRowMapper() {
        super(Product.class);
    }

    @Override
    public Product mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
        Product product = super.mapRow(resultSet, rowNumber);

        Category category = new Category();
        category.setId(resultSet.getInt("category.id"));
        category.setCategoryId(resultSet.getString("category.categoryId"));
        category.setName(resultSet.getString("category.name"));
        category.setDescription(resultSet.getString("category.description"));
        product.setCategory(category);

        return product;
    }
}
