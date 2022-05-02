package com.acme.mapper;

import com.acme.model.Category;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

public class CategoryRowMapper extends BeanPropertyRowMapper<Category> {
    public CategoryRowMapper() {
        super(Category.class);
    }
}
