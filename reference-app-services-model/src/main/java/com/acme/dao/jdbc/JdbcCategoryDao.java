package com.acme.dao.jdbc;

import com.acme.dao.CategoryDao;
import com.acme.mapper.CategoryRowMapper;
import com.acme.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository("categoryDao")
public class JdbcCategoryDao extends JdbcDaoSupport implements CategoryDao {
    private final static String FIND_ALL_CATEGORIES_SQL = "SELECT * FROM CATEGORY";
    private final static String FIND_CATEGORY_BY_ID_SQL = "SELECT * FROM CATEGORY WHERE \"categoryId\" = ?";

    @Autowired
    public JdbcCategoryDao(DataSource dataSource) {
        setDataSource(dataSource);
    }

    public List<Category> findAllCategories() {
        return getJdbcTemplate().query(FIND_ALL_CATEGORIES_SQL,
                new CategoryRowMapper());
    }

    public Category findCategoryById(String categoryId) {
        return getJdbcTemplate().queryForObject(FIND_CATEGORY_BY_ID_SQL,
                new CategoryRowMapper(), categoryId);
    }
}
