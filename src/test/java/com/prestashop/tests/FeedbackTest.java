package com.prestashop.tests;

import BaseConfiguration.BaseTest;
import com.prestashop.pages.FeedbackPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FeedbackTest extends BaseTest {

    @Test
    public void openFeedbackPage() {
        mainPage.openMainPage();
        mainPage.clickFeedback();
        Assert.assertEquals(feedbackPage.getCustomerServiceField(), "CUSTOMER SERVICE - CONTACT US");
    }

    @Test
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
