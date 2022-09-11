package com.prestashop.steps;

import base.configuration.BaseStep;
import com.prestashop.pages.LogInPage;
import com.prestashop.pages.MainPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class LogInStep extends BaseStep {

    public LogInStep(WebDriver driver) {
        super(driver);
    }

    @Step("Open Log In Page")
    public void openLogInPage(){

        MainPage mainPage = new MainPage(driver);

        mainPage.openMainPage();
        mainPage.clickLogIn();
    }

    @Step("Path to creating an account")
    public void partToCreatingAnAccount(){

        MainPage mainPage = new MainPage(driver);
        LogInPage logInPage = new LogInPage(driver);

        mainPage.openMainPage();
        mainPage.clickLogIn();
        logInPage.setEmail();
        logInPage.clickCreateAccount();
    }
}
