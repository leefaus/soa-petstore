package com.acme.services;

import com.acme.model.Category;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@WebService(targetNamespace = "http://acme.com/services")
public interface CategoryService {
    @WebMethod
    @XmlElementWrapper(name="categories")
    @XmlElement(name="category")
    public List<Category> findAllCategories();

    @WebMethod
    public String deleteCategory(String categoryId);

    @WebMethod
    public Category modifyCategory(Category category);

    @WebMethod
    @XmlElement(name = "category")
    public Category retrieveCategory(String categoryId);
}
