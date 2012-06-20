package com.acme.mapper;

import com.acme.model.Category;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CategoryRowMapper implements RowMapper<Category> {

    @Override
    public Category mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Category category = new Category();
        category.setCategoryId(Long.toString(resultSet.getLong("id")));
        category.setName(resultSet.getString("name"));
        category.setDescription(resultSet.getString("description"));
        return category;
    }
}
