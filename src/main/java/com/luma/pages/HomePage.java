package com.luma.pages;

import com.aventstack.extentreports.Status;
import com.luma.customelisteners.CustomListeners;
import com.luma.utilitlies.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

//    private WebDriverWait wait;
//    private WebDriver driver;
//
//    public HomePage(WebDriver driver) {
//        this.driver = driver;
//        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        PageFactory.initElements(driver, this);
//    }

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement womenMenu;
    @CacheLookup
    @FindBy(id = "ui-id-5")
    WebElement menMenu;
    @CacheLookup
    @FindBy(xpath = "//ul[@class='ui-menu ui-widget ui-widget-content ui-corner-all']/li[4]")
    WebElement gearMenu;
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']")
    WebElement womenTopMenu;
    @CacheLookup
    @FindBy(id = "ui-id-11")
    WebElement womenJacketMenu;
    @CacheLookup
    @FindBy(id = "ui-id-18")
    WebElement menBottomMenu;

    @CacheLookup
    @FindBy(linkText = "Pants")
    WebElement menPantsMenu;

    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement gearBagMenu;

    public void hoverMouseOnWomenMenu() {
        CustomListeners.test.log(Status.PASS, "Mouse hover on women menu" + womenMenu);
        mouseHoverToElement(womenMenu);
        Reporter.log("Mouse hover " + womenMenu.toString());
        //WebElement menu = wait.until(ExpectedConditions.visibilityOf(womenMenu));

    }

    public void mouseHoverOnWomenTopMenu() {
        Reporter.log("Select top " + womenTopMenu.toString());
        mouseHoverToElement(womenTopMenu);
        //CustomListeners.test.log(Status.PASS, "selecting top menu" + womenTopMenu);
    }

    public void clickOnWomenJacketMenu() {

        clickOnElement(womenJacketMenu);
        Reporter.log("Select jacket " + womenJacketMenu.toString());
        CustomListeners.test.log(Status.PASS, "selecting jacket " + womenJacketMenu);
    }

    public void hoverMouseOnMenMenu() {
        Reporter.log("Men menu" + menMenu.toString());
        mouseHoverToElement(menMenu);
        CustomListeners.test.log(Status.PASS, "Men menu " + menMenu);
    }

    public void hoverMouseOnMenBottom() {
        mouseHoverToElement(menBottomMenu);
        Reporter.log("Bottom menu" + menBottomMenu.toString());
        CustomListeners.test.log(Status.PASS, "Bottom menu " + menBottomMenu);
    }

    public void clickOnMenPantsMenu() {
        clickOnElement(menPantsMenu);
        Reporter.log("Pants menu" + menPantsMenu.toString());
        CustomListeners.test.log(Status.PASS, "Pants menu " + menPantsMenu);
    }

    public void hoverMouseOnGearMenu() {
        mouseHoverToElement(gearMenu);
        Reporter.log("Gear menu" + gearMenu.toString());
        CustomListeners.test.log(Status.PASS, "gear menu " + gearMenu);

    }

    public void clickOnBagMenu() {
        clickOnElement(gearBagMenu);
        Reporter.log("click on bag menu " + gearBagMenu.toString());
        CustomListeners.test.log(Status.PASS, "gear bag menu " + gearBagMenu);
    }

}
