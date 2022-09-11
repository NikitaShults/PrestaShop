package com.prestashop.tests;

import base.configuration.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAddressTest extends BaseTest {

    @Test
    public void correctAddressFilling() {
        logInStep.partToCreatingAnAccount();
        createAnAccountStep.fillDataManAccount();
        createAnAccountStep.subscribeToNewsletterAndOffers();
        createAnAccountPage.clickRegister();
        myAddressPage.clickAddressButton();
        myAddressStep.fillDataAddress();
        myAddressPage.clickSave();
        Assert.assertTrue(myAddressesPage.getMyAddressesMessage().isDisplayed());
    }

    @Test
    public void withoutZipCode(){
        logInStep.partToCreatingAnAccount();
        createAnAccountStep.fillDataManAccount();
        createAnAccountStep.subscribeToNewsletterAndOffers();
        createAnAccountPage.clickRegister();
        myAddressPage.clickAddressButton();
        myAddressStep.fillWithoutZipCode();
        myAddressPage.clickSave();
        Assert.assertEquals(myAddressPage.getErrorMessage(),"There is 1 error");
    }
}
