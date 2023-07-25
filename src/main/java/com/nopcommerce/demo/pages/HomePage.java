package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    /**
     * All Menu (Seven menu), LoginLink, registerLink, nopcommerce logo, My account link and LogOut link locatores
     * and create appropriate methods for it
     */
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computer;

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("click on login link..." + loginLink);
    }

    public void clickOnComputer() {
        clickOnElement(computer);
        log.info("click on computer.." + computer);
    }
}
