package com.acme.dao;

import com.acme.model.Category;

import java.util.List;

public interface CategoryDao {
    List<Category> findAllCategories();
}
