package com.acme.steps;

import com.acme.model.Category;
import com.acme.services.CategoryService;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.table.DataTable;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CategorySteps {
    @Autowired
    private CategoryService serviceClient;

    private Category[] categories;

    @Given("^I have a Category service$")
    public void I_have_a_category_service() {
        assertNotNull(serviceClient);
    }

    @When("^I request a category with ID \"([^\"]*)\"$")
    public void I_request_a_category_with_ID(String id) {
        categories = new Category[] { serviceClient.retrieveCategory(id) };
    }

    @When("^I request all categories$")
    public void I_request_all_categories() {
        List<Category> allCategories = serviceClient.findAllCategories();
        categories = allCategories.toArray(new Category[allCategories.size()]);
    }

    @Then("^I should receive a response with the category$")
    public void I_should_receive_a_response_with_the_category(DataTable table) {
        verifyCategoryTable(table);
    }

    @Then("^I should receive a response with the categories$")
    public void I_should_receive_a_response_with_the_categories(DataTable table) {
        verifyCategoryTable(table);
    }

    private void verifyCategoryTable(DataTable table) {
        int expectedRows = table.asMaps().size();
        assertTrue("Expected at least " + expectedRows +
                " rows, but got only "+ categories.length + " rows.",
                expectedRows <= categories.length);

        int index = 0;
        for (Map<String, String> map : table.asMaps()) {
            Set<Map.Entry<String,String>> entries = map.entrySet();
            Category category = categories[index];
            for (Map.Entry<String, String> entry : entries) {
                BeanWrapper wrapper = PropertyAccessorFactory.forBeanPropertyAccess(category);

                String propertyName = entry.getKey();
                String propertyValue = entry.getValue();

                assertEquals(propertyValue, wrapper.getPropertyValue(propertyName).toString());

            }

            index++;
        }
    }
}
