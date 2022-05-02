package com.acme;

import com.acme.model.Category;
import com.acme.model.Product;
import com.acme.services.CategoryService;
import com.acme.services.ProductService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SampleClient {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath*:spring/client-context.xml");

        dumpCategories(context);
        dumpProducts(context);

        System.exit(0);
    }

    private static void dumpCategories(ApplicationContext context) {
        CategoryService client = (CategoryService) context.getBean("categoryClient");

        List<Category> categories = client.findAllCategories();
        System.out.println("Categories found: " + categories.size());
        for (Category category : categories) {
            System.out.println("Found category: " + category.toString());
        }
        System.out.println("");

        Category category = client.retrieveCategory("DOGS");
        System.out.println("Category DOGS: " + category.toString());
        System.out.println("");
    }

    private static void dumpProducts(ApplicationContext context) {
        ProductService client = (ProductService) context.getBean("productClient");

        List<Product> products = client.retrieveProductsForCategory("FISH");
        System.out.println("Products found: " + products.size());
        for (Product product : products) {
            System.out.println("Found product: " + product.toString());
        }
        System.out.println("");

        Product product = client.retrieveProduct("K9-BD-01");
        System.out.println("Product K9-BD-01 = " + product);
        System.out.println("");
    }
}
