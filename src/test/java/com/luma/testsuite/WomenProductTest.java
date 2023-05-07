package com.luma.testsuite;

import com.luma.customelisteners.CustomListeners;
import com.luma.pages.HomePage;
import com.luma.pages.WomenTopPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)

public class WomenProductTest extends BaseTest {
    WomenTopPage womenTopPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        homePage = new HomePage();
        womenTopPage = new WomenTopPage();

    }

    @Test(groups = {"smoke", "regression"})
    public void verifyTheSortByProductNameFilter() throws InterruptedException {
        Thread.sleep(1000);
//        * Mouse Hover on Women Menu
        homePage.hoverMouseOnWomenMenu();
//                * Mouse Hover on Tops
        homePage.mouseHoverOnWomenTopMenu();
//                * Click on Jackets
        homePage.clickOnWomenJacketMenu();

//* Select Sort By filter “Product Name”
        womenTopPage.productSorter("Product Name ");
//* Verify the products name display in
//        alphabetical order

        Assert.assertEquals(womenTopPage.listBeforeSorting(), womenTopPage.listAfterSorting());
    }

}
