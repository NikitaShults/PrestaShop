package com.prestashop.steps;

import BaseConfiguration.BaseStep;
import com.prestashop.pages.CreateAnAccountPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class CreateAnAccountStep extends BaseStep {

    public CreateAnAccountStep(WebDriver driver) {
        super(driver);
    }

    @Step("Filling in the data for creating a man account")
    public void fillDataManAccount() {

        CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage(driver);

        createAnAccountPage.selectManButton();
        createAnAccountPage.setFirstName("Nikita");
        createAnAccountPage.setLastName("Shults");
        createAnAccountPage.setPassword("222333444");
        createAnAccountPage.setDay("28");
        createAnAccountPage.setMonth("1");
        createAnAccountPage.setYear("1998");
    }

    @Step("Filling in the data for creating a girl account")
    public void fillDataGirlAccount() {

        CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage(driver);

        createAnAccountPage.selectGirlButton();
        createAnAccountPage.setFirstName("Inga");
        createAnAccountPage.setLastName("Shults");
        createAnAccountPage.setPassword("222333444");
        createAnAccountPage.setDay("11");
        createAnAccountPage.setMonth("2");
        createAnAccountPage.setYear("2000");
    }

    @Step("Filling in the data without first name")
    public void fillDataWithoutFirstName() {

        CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage(driver);

        createAnAccountPage.selectGirlButton();
        createAnAccountPage.setFirstName("");
        createAnAccountPage.setLastName("Shults");
        createAnAccountPage.setPassword("222333444");
        createAnAccountPage.setDay("11");
        createAnAccountPage.setMonth("2");
        createAnAccountPage.setYear("2000");
    }

    @Step("Filling in the data without first name")
    public void fillDataWithoutPassword() {

        CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage(driver);

        createAnAccountPage.selectManButton();
        createAnAccountPage.setFirstName("Nikita");
        createAnAccountPage.setLastName("Shults");
        createAnAccountPage.setPassword("");
        createAnAccountPage.setDay("28");
        createAnAccountPage.setMonth("1");
        createAnAccountPage.setYear("1998");
    }

    @Step("Subscribe to newsletter and offers")
    public void subscribeToNewsletterAndOffers() {

        CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage(driver);

        createAnAccountPage.selectNewsletterCheckbox();
        createAnAccountPage.selectOffersCheckbox();
    }
}