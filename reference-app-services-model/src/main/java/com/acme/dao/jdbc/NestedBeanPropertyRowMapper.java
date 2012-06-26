package com.acme.dao.jdbc;

import org.springframework.beans.*;
import org.springframework.dao.DataRetrievalFailureException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.support.JdbcUtils;
import org.springframework.util.Assert;

import java.beans.PropertyDescriptor;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class NestedBeanPropertyRowMapper<T> extends BeanPropertyRowMapper<T> {
    public NestedBeanPropertyRowMapper(Class<T> mappedClass) {
        super(mappedClass);
    }

    @Override
    public T mapRow(ResultSet rs, int rowNumber) throws SQLException {
        Assert.state(this.getMappedClass() != null, "Mapped class was not specified");
        T mappedObject = BeanUtils.instantiate(this.getMappedClass());
        BeanWrapper bw = PropertyAccessorFactory.forBeanPropertyAccess(mappedObject);
        initBeanWrapper(bw);

        ResultSetMetaData rsmd = rs.getMetaData();
        int columnCount = rsmd.getColumnCount();

        for (int index = 1; index <= columnCount; index++) {
            String column = JdbcUtils.lookupColumnName(rsmd, index);
            PropertyDescriptor pd = bw.getPropertyDescriptor(column);
            if (pd != null) {
                try {
                    Object value = getColumnValue(rs, index, pd);
                    if (logger.isDebugEnabled() && rowNumber == 0) {
                        logger.debug("Mapping column '" + column + "' to property '" +
                                pd.getName() + "' of type " + pd.getPropertyType());
                    }
                    try {
                        bw.setPropertyValue(column, value);
                    } catch (TypeMismatchException e) {
                        if (value == null && isPrimitivesDefaultedForNullValue()) {
                            logger.debug("Intercepted TypeMismatchException for row " + rowNumber +
                                    " and column '" + column + "' with value " + value +
                                    " when setting property '" + pd.getName() + "' of type " + pd.getPropertyType() +
                                    " on object: " + mappedObject);
                        } else {
                            throw e;
                        }
                    }
                } catch (NotWritablePropertyException ex) {
                    throw new DataRetrievalFailureException(
                            "Unable to map column " + column + " to property " + pd.getName(), ex);
                }
            }
        }

        return mappedObject;
    }
}
