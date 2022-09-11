package com.prestashop.pages;

import base.configuration.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAddressesPage extends BasePage {

    public MyAddressesPage(WebDriver driver) {
        super(driver);
    }

    private By myAddressesMessage = By.cssSelector(".page-heading");

    public WebElement getMyAddressesMessage() {
        return driver.findElement(myAddressesMessage);
    }
}
