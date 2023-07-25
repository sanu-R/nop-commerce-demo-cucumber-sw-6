package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {
    /**
     * Register Text, male female radio, Firstname, lastname, Date of Birth drop downs, email,
     * Password, Confirm Password, Register Button, "First name is required.","Last name is required.",
     * "Email is required.","Password is required.", "Password is required." error message,
     * "Your registration completed" message, "CONTINUE" button
     * Locators and it's actions
     */
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement reg;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement checkRegister;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='field-validation-error']")
    WebElement errorMessage;
    @CacheLookup
    @FindBy(xpath = "//div[@id='gender']")
    WebElement genderButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameEnter;
    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameEnter;
    @CacheLookup
    @FindBy(css = "div[class='master-wrapper-content'] select:nth-child(1)")
    WebElement day;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement month;
    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement year;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement mail;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement rPassword;
    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement conPassword;
    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement pressRegButton;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement regComplete;

    public void clickOnRegister() {
        clickOnElement(reg);
    }

    public String checkRegister() {
        return getTextFromElement(checkRegister);
    }

    public void enterOnRegisterButton() {
        clickOnElement(registerButton);
    }

    public String verifyTheErrorMessage() {
     return   getTextFromElement(errorMessage);
    }

    public void clickOnRadioGender(String gender) {
        clickOnElement(genderButton);
    }

    public void enterYourDetails(String firstName ) {
        sendTextToElement(firstNameEnter, firstName);


    }
public void enterLastNameInField(String lastName){
    sendTextToElement(lastNameEnter, lastName);
}

    public void enterBirthDetails(int number, String birthMonth,String num) {
        selectByIndexFromDropDown(day, number);
        selectByVisibleTextFromDropDown(month, birthMonth);
     selectByVisibleTextFromDropDown(year, num);
    }

    public void enterYourEmailToEmailField(String email) {
        sendTextToElement(mail, email);
        log.info("enter your email.."+ mail);
    }

    public void writeYourPassword(String password) {
        sendTextToElement(rPassword, password);
        log.info("write your password.."+rPassword);
    }

    public void rewriteYourPasswordToPasswordField(String passwordC) {
        sendTextToElement(conPassword, passwordC);
        log.info("enter password.."+ conPassword);
    }

    public void pressLastRegisterField() {
        clickOnElement(pressRegButton);
        log.info("click on register .."+ pressRegButton);
    }

    public String yourRegHasCompleted() {
        String text4 = getTextFromElement(regComplete);
        log.info("your register has completed..."+regComplete);
        return text4;

    }

}
