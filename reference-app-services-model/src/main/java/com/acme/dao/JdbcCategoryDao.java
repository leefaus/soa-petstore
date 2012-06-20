package com.acme.dao;

import com.acme.mapper.CategoryRowMapper;
import com.acme.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository("categoryDao")
public class JdbcCategoryDao {
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcCategoryDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Category> findAllCategories() {
        String sql = "SELECT * FROM CATEGORY";
        List<Category> categories = jdbcTemplate.query(sql, new CategoryRowMapper());
        return categories;
    }
}
