package com.acme;

import com.acme.model.Category;
import com.acme.services.CategoryService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SampleClient {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext(
                new String[]{"classpath*:spring/client-context.xml"});
        CategoryService client = (CategoryService) context.getBean("categoryClient");

        Category reply = client.retrieveCategory("1234");
        System.out.println("List Size: " + reply.getName());
        System.exit(0);
    }
}
