package com.prestashop.tests;

import BaseConfiguration.BaseTest;
import com.prestashop.utils.Retry;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FeedbackTest extends BaseTest {

    @Test(retryAnalyzer = Retry.class)
    public void openFeedbackPage() {
        feedbackStep.openFeedbackPage();
        Assert.assertEquals(feedbackPage.getCustomerServiceField(), "CUSTOMER SERVICE - CONTACT US");
    }

    @Test(retryAnalyzer = Retry.class)
    public void successfulSendMessage() {
        feedbackStep.openFeedbackPage();
        feedbackStep.fillFieldFeedback();
        feedbackPage.clickSendButton();
        Assert.assertEquals(feedbackPage.getSuccessfulMessageField(), "Your message has been successfully sent to our team.");
    }
}