package com.acme.steps;

import com.acme.model.Product;
import com.acme.services.ProductService;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.table.DataTable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

@SuppressWarnings("UnusedDeclaration")
public class ProductSteps {
    @Autowired
    private ProductService serviceClient;

    private Product[] products;

    @Given("^I have a Product service$")
    public void I_have_a_Product_service() {
        assertNotNull(serviceClient);
    }

    @When("^I request products in the category \"([^\"]*)\"$")
    public void I_request_products_in_the_category(String id) {
        List<Product> productList = serviceClient.retrieveProductsForCategory(id);
        products = productList.toArray(new Product[productList.size()]);
    }

    @When("^I request the product \"([^\"]*)\"$")
    public void I_request_the_category(String id) {
        products = new Product[] { serviceClient.retrieveProduct(id) };
    }

    @Then("^I should receive a response with the product$")
    public void I_should_receive_a_response_with_the_product(DataTable table) {
        TableStepUtils.verifyTable(table, products);
    }

    @Then("^I should receive a response with the products$")
    public void I_should_receive_a_response_with_the_products(DataTable table) {
        TableStepUtils.verifyTable(table, products);
    }

}
