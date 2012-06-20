package com.acme.services;

import com.acme.dao.ProductDao;
import com.acme.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;
import java.util.List;

@WebService(endpointInterface = "com.acme.services.ProductService",
        name = "ProductService",
        serviceName = "ProductService",
        portName = "ProductPortType",
        targetNamespace = "http://acme.com/services",
        wsdlLocation = "xml/productservices.wsdl")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    @Override
    public List<Product> retrieveProductsForCategory(String categoryId) {
        return productDao.findProductsForCategory(categoryId);
    }

    @Override
    public String deleteProduct(String productId) {
        return productDao.deleteProduct(productId);
    }

    @Override
    public Product modifyProduct(Product product) {
        return productDao.modifyProduct(product);
    }

    @Override
    public Product retrieveProduct(String productId) {
        return productDao.retrieveProduct(productId);
    }
}
