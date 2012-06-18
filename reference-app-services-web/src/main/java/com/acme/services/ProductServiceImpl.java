package com.acme.services;

import com.acme.model.Product;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.acme.services.ProductService",
        name = "ProductService",
        serviceName = "ProductService",
        portName = "ProductPortType",
        targetNamespace = "http://acme.com/services",
        wsdlLocation = "xml/productservices.wsdl")
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> retrieveProductsForCategory(String categoryId) {
        return null;
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
        return null;
    }
}
