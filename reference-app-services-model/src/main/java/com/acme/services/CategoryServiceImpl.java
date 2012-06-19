package com.acme.services;

import com.acme.model.Category;

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

    @Override
    public List<Category> findAllCategories() {
        return null;
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
