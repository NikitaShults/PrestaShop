package com.prestashop.pages;

import BaseConfiguration.BasePage;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Locale;

public class LogInPage extends BasePage {

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    private By authenticationField = By.className("page-heading");
    private By createAccountField = By.id("email_create");
    private By createAccountButton = By.cssSelector(".icon-user.left");

    FakeValuesService fakeValuesService = new FakeValuesService(
            new Locale("en-GB"), new RandomService());


    public String getAuthenticationField() {
        return driver.findElement(authenticationField).getText();
    }

    public void setEmail() {
        String email = fakeValuesService.bothify("??????####@mail.ru");
        driver.findElement(createAccountField).sendKeys(email);
    }

    public WebElement getCreateAccountButton() {
        return driver.findElement(createAccountButton);
    }

    public void clickCreateAccount() {
        getCreateAccountButton().click();
    }
}