package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customelisteners.CustomListeners;
import com.luma.utilitlies.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {
    //declaring the elements variable
    @CacheLookup
    @FindBy(xpath = "(//div[@class='product-item-details'])[2]/strong/a")
    WebElement verifyTheProductName;

    @CacheLookup
    @FindBy(xpath = "//input[@class='input-text qty']")
    WebElement quantityField;

    @CacheLookup
    @FindBy(xpath = "//span[@data-bind='text: getValue()'][normalize-space()='$135.00']")
    WebElement verifyTheProductPrice;
    @CacheLookup
    @FindBy(xpath = "//button[@class='action update']")
    WebElement clickOnupdateShoppingCart;

    @CacheLookup
    @FindBy(xpath = "(//span[@class='cart-price'])[2]")
    WebElement verifytheUpdatedPrice;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement theSizeOfThePants;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement theColourOfThePants;

    //this method will verify the product name
    public String verifyTheProdutsName() {
        CustomListeners.test.log(Status.PASS, "Get the product name " + verifyTheProductName);
        Reporter.log("Get the product name " + verifyTheProductName.toString());
        return verifyTheProductName.getText();
    }

    //this method will verify the quanity of the bag
    public String getQuantityOfProduct() {
        String quantity = quantityField.getAttribute("value");
        CustomListeners.test.log(Status.PASS, "Get quantity " + quantity);
        Reporter.log("Get quantity " + quantity.toString());
        return quantity;
    }

    //this method will verify the product price
    public String getPriceOfTheProduct() {
        CustomListeners.test.log(Status.PASS, "Get Price " + verifyTheProductPrice);
        Reporter.log("Get Price " + verifyTheProductPrice.toString());
        return verifyTheProductPrice.getText();
    }

    //this method will change the quantity
    public void changeTheQuanitytOfTheBag(String qty) {
        quantityField.sendKeys(Keys.DELETE);
        CustomListeners.test.log(Status.PASS, "Change quantity " + quantityField);
        Reporter.log("Change quantity " + quantityField.toString());
        sendTextToElement(quantityField, qty);
    }

    //this method will update the shopping cart
    public void updateTheShoppingCart() {

        clickOnElement(clickOnupdateShoppingCart);
        CustomListeners.test.log(Status.PASS, "click on shopping cart " + clickOnupdateShoppingCart);
        Reporter.log("click on shopping cart " + clickOnupdateShoppingCart.toString());
    }

    //this method will verify the updated price
    public String UpdatedProductPrice() throws InterruptedException {
        Thread.sleep(500);
        // waitUntilVisibilityOfElementLocated(verifytheUpdatedPrice, 20);
        //  Reporter.log("Updated price " + verifytheUpdatedPrice.toString());
        //CustomListeners.test.log(Status.PASS, "Updated Price " + verifytheUpdatedPrice);
        return verifytheUpdatedPrice.getText();
    }

    public String getTheShoppingCartPageTitle() {
        CustomListeners.test.log(Status.PASS, "Get quantity " + shoppingCartText);
        Reporter.log("Get quantity " + shoppingCartText.toString());
        return shoppingCartText.getText();
    }

    public String getTheSizeOfThePants() {
        CustomListeners.test.log(Status.PASS, "Get the size of the pant " + shoppingCartText);
        Reporter.log("Get the size of the pant " + shoppingCartText.toString());
        return theSizeOfThePants.getText();
    }

    public String getTheColourOfThePants() {
        CustomListeners.test.log(Status.PASS, "Get the colour of the pants " + theColourOfThePants);
        Reporter.log("Get the colour of the pants " + theColourOfThePants.toString());
        return theColourOfThePants.getText();
    }


}
