package com.acme.dao.jdbc;

import com.acme.dao.CategoryDao;
import com.acme.mapper.CategoryRowMapper;
import com.acme.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository("categoryDao")
public class JdbcCategoryDao extends NamedParameterJdbcDaoSupport implements CategoryDao {
    @Autowired
    public JdbcCategoryDao(DataSource dataSource) {
        setDataSource(dataSource);
    }

    public List<Category> findAllCategories() {
        String sql = "SELECT * FROM CATEGORY";
        return getNamedParameterJdbcTemplate().query(sql, (SqlParameterSource) null, new CategoryRowMapper());
    }

    public Category findCategoryById(String id) {
        String sql = "SELECT * FROM CATEGORY WHERE id='" + id + "'";
        return getNamedParameterJdbcTemplate().queryForObject(sql, (SqlParameterSource) null, new CategoryRowMapper());
    }
}
