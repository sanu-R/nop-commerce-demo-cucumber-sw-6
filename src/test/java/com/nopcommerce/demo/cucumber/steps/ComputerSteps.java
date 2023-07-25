package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ComputerSteps {
    @And("Click on Computer tab")
    public void clickOnComputerTab() {
        new HomePage().clickOnComputer();
    }

    @When("I verify computer text")
    public void iVerifyComputerText() {
        Assert.assertEquals("Computer text is not displayed","Computer",new ComputerPage().verifyComputerText());
    }

    @When("I click on desktops link")
    public void iClickOnDesktopsLink() {
        new DesktopsPage().desktopLinkClick();

    }

    @Then("I verify desktops link")
    public void iVerifyDesktopsLink() {
        Assert.assertEquals("Desktops text not displayed","Desktops",new DesktopsPage().verifyTheDesktopsText());
    }

    @When("I click  on computer tab")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputer();
    }

    @And("I click on product name Build your own computer")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new BuildYourOwnComputerPage().clickOnBuildYourOwnComputer();
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectOnProcessor(processor);
    }
    @And("I select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHdd(hdd);

    }

    @And("I select OS {string}")
    public void iSelectOS(String os ) {
        new BuildYourOwnComputerPage().selectOsForComputer(os);
    }

    @And("I select Software {string}")
    public void iSelectSoftware(String software ) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("I click on add to cart Button")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCart();
    }

    @And("I verify message The product has been added to your shopping cart")
    public void iVerifyMessageTheProductHasBeenAddedToYourShoppingCart() {
        Assert.assertEquals("Message is not displayed","The product has been added to your shopping cart",new BuildYourOwnComputerPage().verifyShoppingCartText());
    }
}
