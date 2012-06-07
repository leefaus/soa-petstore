package com.acme.services;

import com.acme.model.Category;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "com.acme.services.CategoryService",
        name = "CategoryService",
        serviceName = "CategoryService",
        portName = "CategoryPortType",
        targetNamespace = "http://acme.com/services",
        wsdlLocation = "xml/categoryservices.wsdl")
public class CategoryServiceImpl implements CategoryService {

    @Override
    public List<Category> findAllCategories() {
        Category c1 = new Category();
        c1.setCategoryId("1");
        c1.setName("Birds");
        c1.setDescription("Bird Description");
        Category c2 = new Category();
        c2.setCategoryId("2");
        c2.setName("Cats");
        c2.setDescription("Cat Description");
        Category c3 = new Category();
        c3.setCategoryId("3");
        c3.setName("Dogs");
        c3.setDescription("Dog Description");
        ArrayList<Category> al = new ArrayList<Category>();
        al.add(c1);
        al.add(c2);
        al.add(c3);
        return al;
    }
}
