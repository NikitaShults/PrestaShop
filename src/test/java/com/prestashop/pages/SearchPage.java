package com.prestashop.pages;

import base.configuration.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    private By errorMessageField = By.cssSelector(".alert.alert-warning");
    private By dressOnSearchPage = By.cssSelector(".replace-2x.img-responsive");
    private By searchMessage = By.cssSelector(".lighter");

    public WebElement getErrorMessage() {
        return driver.findElement(errorMessageField);
    }

    public WebElement getDressOnSearchPage() {
        return driver.findElement(dressOnSearchPage);
    }

    public String getSearchMessage() {
        return driver.findElement(searchMessage).getText();
    }
}
