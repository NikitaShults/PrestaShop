package com.prestashop.pages;

import base.configuration.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {


    public MainPage(WebDriver driver) {
        super(driver);
    }

    private By feedbackButton = By.id("contact-link");
    private By logInButton = By.className("login");
    private By searchField = By.id("search_query_top");
    private By searchButton = By.cssSelector(".btn.btn-default.button-search");

    public WebElement getLogInButton() {
        return driver.findElement(logInButton);
    }

    public WebElement getFeedbackButton() {
        return driver.findElement(feedbackButton);
    }

    public WebElement getSearchButton() {
        return driver.findElement(searchButton);
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

    public void setThing(String Thing) {
        driver.findElement(searchField).sendKeys(Thing);
    }

    public void clickSearch(){
        getSearchButton().click();
    }
}