package com.acme.steps;

import com.acme.model.Category;
import com.acme.services.CategoryService;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.table.DataTable;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertNotNull;

@SuppressWarnings("UnusedDeclaration")
public class CategorySteps {
    @Autowired
    private CategoryService serviceClient;

    private Category[] categories;

    @Given("^I have a Category service$")
    public void I_have_a_category_service() {
        assertNotNull(serviceClient);
    }

    @When("^I request the category \"([^\"]*)\"$")
    public void I_request_the_category(String id) {
        categories = new Category[] { serviceClient.retrieveCategory(id) };
    }

    @When("^I request all categories$")
    public void I_request_all_categories() {
        List<Category> allCategories = serviceClient.findAllCategories();
        categories = allCategories.toArray(new Category[allCategories.size()]);
    }

    @Then("^I should receive a response with the category$")
    public void I_should_receive_a_response_with_the_category(DataTable table) {
        TableStepUtils.verifyTable(table, categories);
    }

    @Then("^I should receive a response with the categories$")
    public void I_should_receive_a_response_with_the_categories(DataTable table) {
        TableStepUtils.verifyTable(table, categories);
    }
}
