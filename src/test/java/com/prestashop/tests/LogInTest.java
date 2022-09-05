package com.prestashop.tests;

import BaseConfiguration.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

    @Test
    public void openLogInPage() {
        mainPage.openMainPage();
        mainPage.clickLogIn();
        Assert.assertEquals(logInPage.getAuthenticationField(), "AUTHENTICATION");
    }

    @Test
    public void createAccount() {
        mainPage.openMainPage();
        mainPage.clickLogIn();
        logInPage.setEmail();
        logInPage.clickCreateAccount();
    }
}