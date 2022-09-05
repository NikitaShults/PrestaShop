package com.prestashop.tests;

import BaseConfiguration.BaseTest;
import com.prestashop.utils.Retry;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FeedbackTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void openFeedbackPage() {
        mainPage.openMainPage();
        mainPage.clickFeedback();
        Assert.assertEquals(feedbackPage.getCustomerServiceField(), "CUSTOMER SERVICE - CONTACT US");
    }

    @Test(retryAnalyzer = Retry.class)
    public void successfulSendMessage() {
        mainPage.openMainPage();
        mainPage.clickFeedback();
        feedbackPage.choiceSubjectHeadingParameter("2");
        feedbackPage.setEmail();
        feedbackPage.setOrderReference();
        feedbackPage.setMessage();
        feedbackPage.clickSendButton();
        Assert.assertEquals(feedbackPage.getSuccessfulMessageField(), "Your message has been successfully sent to our team.");
    }
}