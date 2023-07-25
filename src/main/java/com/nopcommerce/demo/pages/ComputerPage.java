package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ComputerPage extends Utility {
    /**
     * Comuters text, DesktopsLink, NotebooksLink, SoftwareLink Locators
     * and create appropriate methods for it.
     */
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//li[@class='active last']//a[normalize-space()='Computers']")
    WebElement computerText;


    public String verifyComputerText() {
        String text1 = getTextFromElement(computerText);
        log.info("verify computer.." + computerText);
        return text1;


    }

}


