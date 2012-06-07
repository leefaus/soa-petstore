package com.acme.services;

import com.acme.model.Product;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@WebService
public interface ProductService {

    @WebMethod
    @XmlElementWrapper(name="products")
    @XmlElement(name="product")
    public List<Product> retrieveProductsForCategory(String categoryId);

}
