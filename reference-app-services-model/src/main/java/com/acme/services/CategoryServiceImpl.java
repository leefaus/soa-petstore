package com.acme.services;

import com.acme.dao.CategoryDao;
import com.acme.model.Category;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.acme.services.CategoryService",
        name = "CategoryService",
        serviceName = "CategoryService",
        portName = "CategoryPortType",
        targetNamespace = "http://acme.com/services")
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    public CategoryDao categoryDao;

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
        Category cat = new Category();
        cat.setCategoryId("1234");
        cat.setName("Cat");
        cat.setDescription("Cat Fun!");
        return cat;
    }
}
