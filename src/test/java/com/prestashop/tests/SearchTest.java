package com.prestashop.tests;

import BaseConfiguration.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

    @Test
    public void unsuccessfulSearchForThingsInTheStore(){
        mainPage.openMainPage();
        mainPage.setThing("");
        mainPage.clickSearch();
        Assert.assertTrue(searchPage.getErrorMessage().isDisplayed());
    }

    @Test
    public void successfulSearchForThingsInTheStore(){
        mainPage.openMainPage();
        mainPage.setThing("dress");
        mainPage.clickSearch();
        Assert.assertTrue(searchPage.getDressOnSearchPage().isDisplayed());
    }

    @Test
    public void successfulSearchInTheStore() {
        mainPage.openMainPage();
        mainPage.setThing("dress");
        mainPage.clickSearch();
        Assert.assertTrue(searchPage.getSearchMessage().contains("DRESS"));
    }
}
