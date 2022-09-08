package com.prestashop.tests;

import BaseConfiguration.BaseTest;
import com.prestashop.Account;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAnAccountTest extends BaseTest {


    @Test
    public void createManAccount() {
        logInStep.partToCreatingAnAccount();
        createAnAccountStep.fillDataManAccount();
        createAnAccountStep.subscribeToNewsletterAndOffers();
        createAnAccountPage.clickRegister();
        Assert.assertEquals(myAccountPage.getSuccessfulMessage(), "Your account has been created.");
    }

    @Test
    public void createGirlAccount() {
        logInStep.partToCreatingAnAccount();
        createAnAccountStep.fillDataGirlAccount(
                Account.builder()
                        .firstName("Nastya")
                        .lastName("Shults")
                        .password("223344")
                        .day("25")
                        .month("2")
                        .year("2000")
                        .build()
        );
        createAnAccountPage.clickRegister();
        Assert.assertEquals(myAccountPage.getSuccessfulMessage(), "Your account has been created.");
    }

    @Test
    public void registrationWithoutFirstName() {
        logInStep.partToCreatingAnAccount();
        createAnAccountStep.fillDataWithoutFirstName();
        createAnAccountPage.clickRegister();
        Assert.assertTrue(createAnAccountPage.getErrorMessage().isDisplayed());
    }

    @Test
    public void registrationWithoutPassword() {
        logInStep.partToCreatingAnAccount();
        createAnAccountStep.fillDataWithoutPassword();
        createAnAccountPage.clickRegister();
        Assert.assertTrue(createAnAccountPage.getErrorMessage().isDisplayed());
    }
}