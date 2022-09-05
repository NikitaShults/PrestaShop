package com.prestashop.tests;

import BaseConfiguration.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAnAccountTest extends BaseTest {


    @Test
    public void createManAccount() {
        mainPage.openMainPage();
        mainPage.clickLogIn();
        logInPage.setEmail();
        logInPage.clickCreateAccount();
        createAnAccountPage.selectManButton();
        createAnAccountPage.setFirstName("Nikita");
        createAnAccountPage.setLastName("Shults");
        createAnAccountPage.setPassword("222333444");
        createAnAccountPage.setDay("28");
        createAnAccountPage.setMonth("1");
        createAnAccountPage.setYear("1998");
        createAnAccountPage.selectNewsletterCheckbox();
        createAnAccountPage.selectOffersCheckbox();
        createAnAccountPage.clickRegister();
        Assert.assertEquals(myAccountPage.getSuccessfulMessage(), "Your account has been created.");
    }

    @Test
    public void createGirlAccount() {
        mainPage.openMainPage();
        mainPage.clickLogIn();
        logInPage.setEmail();
        logInPage.clickCreateAccount();
        createAnAccountPage.selectGirlButton();
        createAnAccountPage.setFirstName("Inga");
        createAnAccountPage.setLastName("Shults");
        createAnAccountPage.setPassword("222333444");
        createAnAccountPage.setDay("11");
        createAnAccountPage.setMonth("2");
        createAnAccountPage.setYear("2000");
        createAnAccountPage.clickRegister();
        Assert.assertEquals(myAccountPage.getSuccessfulMessage(), "Your account has been created.");
    }

    @Test
    public void registrationWithoutFirstName() {
        mainPage.openMainPage();
        mainPage.clickLogIn();
        logInPage.setEmail();
        logInPage.clickCreateAccount();
        createAnAccountPage.selectGirlButton();
        createAnAccountPage.setFirstName("");
        createAnAccountPage.setLastName("Shults");
        createAnAccountPage.setPassword("222333444");
        createAnAccountPage.setDay("11");
        createAnAccountPage.setMonth("2");
        createAnAccountPage.setYear("2000");
        createAnAccountPage.clickRegister();
        Assert.assertTrue(createAnAccountPage.getErrorMessage().isDisplayed());
    }

    @Test
    public void registrationWithoutPassword() {
        mainPage.openMainPage();
        mainPage.clickLogIn();
        logInPage.setEmail();
        logInPage.clickCreateAccount();
        createAnAccountPage.selectManButton();
        createAnAccountPage.setFirstName("Nikita");
        createAnAccountPage.setLastName("Shults");
        createAnAccountPage.setPassword("");
        createAnAccountPage.setDay("28");
        createAnAccountPage.setMonth("1");
        createAnAccountPage.setYear("1998");
        createAnAccountPage.clickRegister();
        Assert.assertTrue(createAnAccountPage.getErrorMessage().isDisplayed());
    }
}