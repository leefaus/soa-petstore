package com.acme.services;

import com.acme.model.Product;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@WebService(targetNamespace = "http://acme.com/services")
public interface ProductService {

    @WebMethod
    @XmlElementWrapper(name="products")
    @XmlElement(name="product")
    public List<Product> retrieveProductsForCategory(String categoryId);

    @WebMethod
    public String deleteProduct(String productId);

    @WebMethod
    public Product modifyProduct(Product product);

    @WebMethod
    public Product retrieveProduct(String productId);

}
