package com.acme.dao.jdbc;

import com.acme.dao.CategoryDao;
import com.acme.mapper.CategoryRowMapper;
import com.acme.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository("categoryDao")
public class JdbcCategoryDao extends NamedParameterJdbcDaoSupport implements CategoryDao {
    private final static String FIND_ALL_CATEGORIES_SQL = "SELECT * FROM CATEGORY";
    private final static String FIND_CATEGORY_BY_ID_SQL = "SELECT * FROM CATEGORY WHERE categoryId = :categoryId";

    @Autowired
    public JdbcCategoryDao(DataSource dataSource) {
        setDataSource(dataSource);
    }

    public List<Category> findAllCategories() {
        return getNamedParameterJdbcTemplate().query(FIND_ALL_CATEGORIES_SQL,
                (SqlParameterSource) null, new CategoryRowMapper());
    }

    public Category findCategoryById(String categoryId) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource("categoryId", categoryId);

        return getNamedParameterJdbcTemplate().queryForObject(FIND_CATEGORY_BY_ID_SQL,
                paramSource, new CategoryRowMapper());
    }
}
