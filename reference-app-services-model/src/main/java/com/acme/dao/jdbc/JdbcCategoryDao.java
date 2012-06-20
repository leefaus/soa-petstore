package com.acme.dao.jdbc;

import com.acme.dao.CategoryDao;
import com.acme.mapper.CategoryRowMapper;
import com.acme.model.Category;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("categoryDao")
public class JdbcCategoryDao extends JdbcDao implements CategoryDao {
    @Override
    public List<Category> findAllCategories() {
        String sql = "SELECT * FROM CATEGORY";
        List<Category> categories = jdbcTemplate.query(sql, new CategoryRowMapper());
        return categories;
    }
}
