package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DesktopsPage extends Utility {
    /**Desktops text, Sortby, Display, selectProductList Locators and it's actions
    */
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());

    @CacheLookup
    @FindBy(css = "h2[class='title'] a[title='Show products in category Desktops']")
    WebElement desktops;
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement desktopsText;
    public void desktopLinkClick(){
       clickOnElement(desktops);
       log.info("click on desktop.."+ desktops);

    }
   public String verifyTheDesktopsText(){
       String test2 = getTextFromElement(desktopsText);
       log.info("verify the desktop text.." +desktopsText);
        return test2;
   }











}










