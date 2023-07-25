package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    /**
     * Email, password, Login Button and "Welcome, Please Sign In!" text Locators
     * and create appropriate methods for it.
     */
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement verifyWelcomeText;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement eMail;
    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement passWord;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement login;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    public String verifyWelcomeMessage() {
        String text =getTextFromElement(verifyWelcomeText);
        log.info("Welcome message.." +verifyWelcomeText.toString());
        return text;

    }
    public void enterEmail(String email) {
        sendTextToElement(eMail, email);
        log.info("enter email.." + eMail);
    }

    public void enterPassword(String password) {
        sendTextToElement(passWord, password);
        log.info("enter password.."+passWord);
    }

    public void clickOnLogin() {
        clickOnElement(login);
        log.info("click on login.."+login);
    }

    public String verifyErrorMessage() {
        String text3 =getTextFromElement(errorMessage);
        log.info("verify error message.."+errorMessage);
        return text3;

    }
}
