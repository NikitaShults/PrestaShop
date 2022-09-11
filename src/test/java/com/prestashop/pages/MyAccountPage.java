package com.prestashop.pages;

import base.configuration.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    private By successfulRegistrationField = By.cssSelector(".alert.alert-success");


    public String getSuccessfulMessage() {
        return driver.findElement(successfulRegistrationField).getText();
    }

}