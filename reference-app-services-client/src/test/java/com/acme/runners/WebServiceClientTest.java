package com.acme.runners;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "classpath:features",
        glue = {"com.acme.steps"},
        format = {"pretty", "html:target/cucumber-html-report"})
public class WebServiceClientTest {
}
