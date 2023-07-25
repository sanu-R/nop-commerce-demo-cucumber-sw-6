package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class RegisterSteps {
    @When("I click on Register link")
    public void iClickOnRegisterLink() {
        new RegisterPage().clickOnRegister();
    }

    @Then("I verify {string} text")
    public void iVerifyText(String text) {
        Assert.assertEquals("Message not displayed", "REGISTER", new RegisterPage().checkRegister());

    }


    @Then("Click on {string} button")
    public void clickOnButton(String register) {
        new RegisterPage().enterOnRegisterButton();
    }

    @And("Verify the error message {string}")
    public void verifyTheErrorMessage(String message) {
        Assert.assertEquals("Text not displayed", "First name is required.", new RegisterPage().verifyTheErrorMessage());
        Assert.assertEquals("Text not displayed", "Last name is required.", new RegisterPage().verifyTheErrorMessage());
        Assert.assertEquals("Text not displayed", "Email is required.", new RegisterPage().verifyTheErrorMessage());
        Assert.assertEquals("Text not displayed", "Password is required.", new RegisterPage().verifyTheErrorMessage());
        Assert.assertEquals("Text not displayed","Password is required.",new RegisterPage().verifyTheErrorMessage());
    }

    @And("I select gender {string}")
    public void iSelectGender(String gender) {
        new RegisterPage().clickOnRadioGender(gender);
    }
    @And("I enter firstname {string}")
    public void iEnterFirstname(String firstName) {
        new RegisterPage().enterYourDetails(firstName);
    }
    @And("I enter lastname {string}")
    public void iEnterLastname(String lastName) {
        new RegisterPage().enterLastNameInField(lastName);
    }

    @And("I select day of birth {string}")
    public void iSelectDayOfBirth(int number,String birthMonth,String num) {
        new RegisterPage().enterBirthDetails(number,birthMonth,num);
    }




    @And("I enter email")
    public void iEnterEmail(String email) {
        new RegisterPage().enterYourEmailToEmailField(email);
    }

    @And("I enter password")
    public void iEnterPassword(String password) {
        new RegisterPage().writeYourPassword(password);
    }
    @And("I enter Confirm Password {string}")
    public void iEnterConfirmPassword(String passwordC) {
        new RegisterPage().rewriteYourPasswordToPasswordField(passwordC);
    }


    @And("I click on {string} button")
    public void iClickOnButton(String register) {
        new RegisterPage().pressLastRegisterField();
    }

    @Then("I verify message {string}")
    public void iVerifyMessage(String message) {
        Assert.assertEquals("Text is not displayed","Your registration completed",new RegisterPage().yourRegHasCompleted());


    }



}
