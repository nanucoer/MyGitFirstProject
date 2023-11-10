package com.StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage {
    @Given("^open the browser$")
    public void open_the_browser() {
        System.out.println("open the browser name");
    }
    @When("^Enter any test in search$")
    public void enter_any_test_in_search() {
        System.out.println("Enter any test in search name");
    }
    @Then("^Verify the search result$")
    public void verify_the_search_result() {
        System.out.println("Verify the search result name");
    }
}
