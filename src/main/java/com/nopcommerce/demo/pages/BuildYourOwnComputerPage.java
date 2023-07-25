package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BuildYourOwnComputerPage extends Utility {
    /**
     * Build your own computer Text, Processor Drop Down, Ram drop down,
     * HDD radios, os radio, software check boxes, Add To Card button, "The product has been added to your shopping cart"
     * message locators and it's actions
     */
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwn;
    @CacheLookup
    @FindBy(css = "#product_attribute_1")
    WebElement pro;
    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramDropdown;
    @CacheLookup
    @FindBy(xpath = "//input[@name='product_attribute_3']")
    WebElement selectHdd;

    @CacheLookup
    @FindBy(xpath = "//input[@name= 'product_attribute_4']")
    WebElement selectOs;
    @CacheLookup
    @FindBy(xpath = "//input[@name= 'product_attribute_5']")
    WebElement selectSoftware;
    @CacheLookup
    @FindBy(css = "#add-to-cart-button-1")
    WebElement addToCart;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Shopping cart']")
    WebElement verifyShoppingMessage;

    public void clickOnBuildYourOwnComputer() {

        clickOnElement(buildYourOwn);
        log.info("Click on Element.." +buildYourOwn);
    }

    public void selectOnProcessor(String processor) {
        selectByVisibleTextFromDropDown(pro, processor);
        log.info("Select on Processor.."+pro);
    }

    public void selectRam(String ram) {
        selectByVisibleTextFromDropDown(ramDropdown, ram);
        log.info("select Ram.." +ramDropdown);

    }

    public void selectHdd(String hdd) {
        mouseHoverToElementAndClick(selectHdd);
        log.info("select hdd.." + selectHdd);
    }

    public void selectOsForComputer(String os) {
        mouseHoverToElementAndClick(selectOs);
        log.info("select os ..." + selectOs);
    }

    public void selectSoftware(String software) {
        mouseHoverToElementAndClick(selectSoftware);
        log.info("select software.."+selectSoftware);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
        log.info("click on add to cart.." +addToCart);
    }

    public String verifyShoppingCartText() {
        String text= getTextFromElement(verifyShoppingMessage);
        log.info("varify shopping cart.." + verifyShoppingMessage);
        return text;


    }

}
