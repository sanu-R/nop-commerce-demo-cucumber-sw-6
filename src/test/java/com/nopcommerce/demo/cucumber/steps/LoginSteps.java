package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();

    }

    @Then("I verify that {string} message display")
    public void iVerifyThatMessageDisplay(String message) {
        Assert.assertEquals("Text not found","Welcome, Please Sign In!",new LoginPage().verifyWelcomeMessage());
    }

    @And("I enter emailId {string}")
    public void iEnterEmailId(String email) {
new LoginPage().enterEmail(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLogin();
    }
    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmail(email);
    }


    @Then("I verify the error message")
    public void iVerifyTheErrorMessage() {
        Assert.assertEquals("Message not displayed","Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found",new LoginPage().verifyErrorMessage());
    }

    @Then("click on login button")
    public void clickOnLoginButton() {
    }


}
