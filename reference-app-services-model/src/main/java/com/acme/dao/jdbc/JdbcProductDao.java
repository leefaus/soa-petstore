package com.acme.dao.jdbc;

import com.acme.dao.ProductDao;
import com.acme.mapper.ProductRowMapper;
import com.acme.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository("productDao")
public class JdbcProductDao extends NamedParameterJdbcDaoSupport implements ProductDao {
    private static final String GET_PRODUCT_SQL =
            "SELECT id, productId, category as categoryId, name, description " +
                    "FROM product " +
                    "WHERE productId = :productId";
    private static final String FIND_PRODUCT_BY_CATEGORY_SQL =
            "SELECT id, productId, category as categoryId, name, description " +
                    "FROM product " +
                    "WHERE category = :categoryId";

    private final ProductRowMapper rowMapper = new ProductRowMapper();

    @Autowired
    public JdbcProductDao(DataSource dataSource) {
        setDataSource(dataSource);
    }

    @Override
    public String deleteProduct(String productId) {
        return null;
    }

    @Override
    public Product modifyProduct(Product product) {
        return null;
    }

    @Override
    public Product retrieveProduct(String productId) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource("productId", productId);

        List<Product> products = getNamedParameterJdbcTemplate().query(GET_PRODUCT_SQL, paramSource, rowMapper);

        return DataAccessUtils.singleResult(products);
    }

    @Override
    public List<Product> findProductsForCategory(String categoryId) {
        MapSqlParameterSource paramSource = new MapSqlParameterSource("categoryId", categoryId);

        return getNamedParameterJdbcTemplate().query(FIND_PRODUCT_BY_CATEGORY_SQL, paramSource, rowMapper);
    }
}
