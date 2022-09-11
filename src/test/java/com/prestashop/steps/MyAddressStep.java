package com.prestashop.steps;

import base.configuration.BaseStep;
import com.prestashop.pages.MyAddressPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class MyAddressStep extends BaseStep {

    public MyAddressStep(WebDriver driver) {
        super(driver);
    }

    @Step("Filling data to successfully add an address")
    public void fillDataAddress() {

        MyAddressPage myAddressPage = new MyAddressPage(driver);

        myAddressPage.setFirstName("Nikita");
        myAddressPage.setLastName("Shults");
        myAddressPage.setAddressField("Buren Street");
        myAddressPage.setZipCodeField();
        myAddressPage.setCityField("Maricopa County");
        myAddressPage.selectCountry("США");
        myAddressPage.setHomePhoneField();
        myAddressPage.setMobilePhoneField();
        myAddressPage.selectState("Arizona");
        myAddressPage.setAliasField("Buren Street");
    }

    @Step("Filling data without zip code")
    public void fillWithoutZipCode(){

        MyAddressPage myAddressPage = new MyAddressPage(driver);

        myAddressPage.setFirstName("Nikita");
        myAddressPage.setLastName("Shults");
        myAddressPage.setAddressField("Buren Street");
        myAddressPage.setCityField("Maricopa County");
        myAddressPage.selectCountry("21");
        myAddressPage.setHomePhoneField();
        myAddressPage.setMobilePhoneField();
        myAddressPage.selectState("Arizona");
        myAddressPage.setAliasField("Buren Street");

    }
}
