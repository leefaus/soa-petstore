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
    private static final String SELECT_PRODUCT_SQL =
            "SELECT product.id, product.\"productId\", product.name, product.description, " +
                    "category.id as \"category.id\", category.\"categoryId\" as \"category.categoryId\", " +
                    "category.name as \"category.name\", category.description as \"category.description\" " +
                    "FROM product " +
                    "LEFT OUTER JOIN category ON product.category = category.\"categoryId\" ";

    private static final String GET_PRODUCT_SQL = SELECT_PRODUCT_SQL +
            "WHERE \"productId\" = :productId";

    private static final String FIND_PRODUCT_BY_CATEGORY_SQL = SELECT_PRODUCT_SQL +
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
