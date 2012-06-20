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
        ArrayList<Category> categories = new ArrayList<Category>();
        Category category = new Category();
        category.setCategoryId("1");
        category.setName("Cat");
        category.setDescription(";alskdjfa;lsdkfj");
        categories.add(category);
        Category category1 = new Category();
        category1.setCategoryId("2");
        category1.setName("Dog");
        category1.setDescription("lkasdjf;asldkfj");
        categories.add(category1);
        return categories;
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
