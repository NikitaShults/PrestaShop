package com.prestashop.pages;

import BaseConfiguration.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {


    public MainPage(WebDriver driver) {
        super(driver);
    }

    private By feedbackButton = By.id("contact-link");
    private By logInButton = By.className("login");

    public WebElement getLogInButton() {
        return driver.findElement(logInButton);
    }

    public WebElement getFeedbackButton() {
        return driver.findElement(feedbackButton);
    }


    public void openMainPage() {
        driver.get("http://prestashop.qatestlab.com.ua/ru/");
    }

    public void clickFeedback() {
        getFeedbackButton().click();
    }

    public void clickLogIn() {
        getLogInButton().click();
    }
}