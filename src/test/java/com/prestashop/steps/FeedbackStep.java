package com.prestashop.steps;

import base.configuration.BaseStep;
import com.prestashop.pages.FeedbackPage;
import com.prestashop.pages.MainPage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class FeedbackStep extends BaseStep {

    public FeedbackStep(WebDriver driver) {
        super(driver);
    }

    @Step("Open Feedback Page")
    public void openFeedbackPage(){

        MainPage mainPage = new MainPage(driver);

        mainPage.openMainPage();
        mainPage.clickFeedback();
    }

    @Step("Fill field Feedback")
    public void fillFieldFeedback(){

        FeedbackPage feedbackPage = new FeedbackPage(driver);

        feedbackPage.choiceSubjectHeadingParameter("2");
        feedbackPage.setEmail();
        feedbackPage.setOrderReference();
        feedbackPage.setMessage();
    }
}