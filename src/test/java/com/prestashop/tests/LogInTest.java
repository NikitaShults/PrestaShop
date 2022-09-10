package com.prestashop.tests;

import base.configuration.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

    @Test
    public void openLogInPage() {
        logInStep.openLogInPage();
        Assert.assertEquals(logInPage.getAuthenticationField(), "AUTHENTICATION");
    }

    @Test
    public void createAccount() {
        logInStep.openLogInPage();
        logInPage.setEmail();
        logInPage.clickCreateAccount();
    }
}