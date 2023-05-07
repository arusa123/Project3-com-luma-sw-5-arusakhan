package com.luma.testsuite;

import com.luma.customelisteners.CustomListeners;
import com.luma.pages.GearBagPage;
import com.luma.pages.HomePage;
import com.luma.pages.ShoppingCartPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)

public class GearProductsTest extends BaseTest {
    HomePage homePage;
    GearBagPage gearBagPage;
    ShoppingCartPage shoppingCartPage;


    @BeforeMethod(alwaysRun = true)
    public void setBrowser() {
        gearBagPage = new GearBagPage();
        homePage = new HomePage();
        shoppingCartPage = new ShoppingCartPage();
    }


    @Test(groups = {"smoke", "regression"})
    public void userShouldAddProductSuccessFullyToShoppinCart() throws InterruptedException {
        // Mouse Hover on Gear Menu
        homePage.hoverMouseOnGearMenu();
        homePage.clickOnBagMenu();
        // Click on Product Name ‘Overnight Duffle’
        gearBagPage.clickOnNightDuffleBag();
        //Verify the text ‘Overnight Duffle’
        Assert.assertEquals(gearBagPage.verifyTheBagText(), "Overnight Duffle", "The bag name is incorrect");
        //* Change Qty 3
        gearBagPage.changeTheQuanityOfTheBag("3");
        //* Click on ‘Add to Cart’ Button.
        gearBagPage.clickOnAddToCartButton();
        //* Verify the text ‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(gearBagPage.bagAddedToCartSuccessfullyMessage(), "You added Overnight Duffle to your shopping cart.");
        //* Click on ‘shopping cart’ Link into message
        gearBagPage.clickOnShoppingCartLink();
        //* Verify the product name ‘bag’
        Assert.assertEquals(shoppingCartPage.verifyTheProdutsName(), "Overnight Duffle", "The Bag Name is incorrect");
        //* Verify the Qty is ‘3’
        Assert.assertEquals(shoppingCartPage.getQuantityOfProduct(), "3", "Wrong quantity");
        //* Verify the product price ‘$135.00’
        Assert.assertEquals(shoppingCartPage.getPriceOfTheProduct(), "$135.00", "Incorrect price");
        //* Change Qty to ‘5’
        shoppingCartPage.changeTheQuanitytOfTheBag("5");
        //* Click on ‘Update Shopping Cart’ button
        shoppingCartPage.updateTheShoppingCart();
        Thread.sleep(1000);
        //* Verify the product price ‘$225.00’
        Assert.assertEquals(shoppingCartPage.UpdatedProductPrice(), "$225.00", "Wrong price");
    }
}
