package com.acme.services;

import com.acme.dao.JdbcCategoryDao;
import com.acme.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;
@WebService(endpointInterface = "com.acme.services.CategoryService",
        name = "CategoryService",
        serviceName = "CategoryService",
        portName = "CategoryPortType",
        targetNamespace = "http://acme.com/services")
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    @Qualifier(value = "categoryDao")
    public JdbcCategoryDao categoryDao;

    @Override
    public List<Category> findAllCategories() {
        return categoryDao.findAllCategories();
    }

    @Override
    public String deleteCategory(String categoryId) {
        return null;
    }

    @Override
    public Category modifyCategory(Category category) {
        return null;
    }

    @Override
    public Category retrieveCategory(String categoryId) {
        return categoryDao.findCategoryById(categoryId);
    }
}
