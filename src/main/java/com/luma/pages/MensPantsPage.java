package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customelisteners.CustomListeners;
import com.luma.utilitlies.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MensPantsPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class='product details product-item-details']")
    WebElement cornusYogaPant;
    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-attribute size']/div[1]/div")
    WebElement cornusYogaPantsize;

    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-attribute color'])[1]/div/div[1]")
    WebElement blackPants;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='product-item-inner'])[1]/div/div[1]/form/button")
    WebElement addToCartButton;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement pantsAddedtoCartText;

    @CacheLookup
    @FindBy(linkText = "shopping cart")
    WebElement shoppingCartLink;
    @CacheLookup
    @FindBy(xpath = "(//a[contains(.,'Cronus Yoga Pant')])[2]")
    WebElement thePantsText;

    //this method will mouse hover on the product
    public void hoverMouseOnTheProduct() {
        CustomListeners.test.log(Status.PASS, "click on button " + cornusYogaPant);
        mouseHoverToElement(cornusYogaPant);
        Reporter.log("Mouse hover on yoga pants " + cornusYogaPant.toString());
    }

    //this method will click on the product size
    public void clickOnTheRequiredSize() {
        CustomListeners.test.log(Status.PASS, "click on yoga pant size " + cornusYogaPantsize);
        clickOnElement(cornusYogaPantsize);
        Reporter.log("click on yoga pant size " + cornusYogaPantsize.toString());
    }

    //this method will select the colour
    public void clickOnTheRequiredColour() {
        CustomListeners.test.log(Status.PASS, "click on black pants " + blackPants);
        clickOnElement(blackPants);
        Reporter.log("click on black pants " + blackPants.toString());
    }

    //this method will add the product to cart
    public void clickOnTheAddCartButton() {
        CustomListeners.test.log(Status.PASS, "click on add to cart button " + addToCartButton);
        clickOnElement(addToCartButton);
        Reporter.log("click on add to cart button " + addToCartButton.toString());
    }

    //this method will get the text
    public String getTheShoppingcartText() {
        CustomListeners.test.log(Status.PASS, "get shopping text " + pantsAddedtoCartText);
        Reporter.log("get shopping text " + pantsAddedtoCartText.toString());
        return getTextFromElement(pantsAddedtoCartText);
    }

    //this method will click on shopping cart link
    public void clickOnShoppingCartLink() {
        CustomListeners.test.log(Status.PASS, "Shopping cart link " + shoppingCartLink);
        clickOnElement(shoppingCartLink);
        Reporter.log("Shopping cart link " + pantsAddedtoCartText.toString());
    }

    public String getThePantsText() {
        CustomListeners.test.log(Status.PASS, "Pants text " + thePantsText);
        Reporter.log("get pants text " + thePantsText.toString());
        return getTextFromElement(thePantsText);
    }


}
