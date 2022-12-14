package com.prestashop.pages;

import base.configuration.BasePage;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Locale;

@Log4j2
public class FeedbackPage extends BasePage {


    public FeedbackPage(WebDriver driver) {
        super(driver);
    }

    private By customerServiceField = By.cssSelector(".page-heading.bottom-indent");
    private By subjectHeadingField = By.id("id_contact");
    private By emailAddressField = By.id("email");
    private By orderReferenceField = By.id("id_order");
    private By sendButton = By.xpath("//span[contains(text(),'Send')]");
    private By messageField = By.id("message");
    private By successfulMessageField = By.cssSelector(".alert.alert-success");

    FakeValuesService fakeValuesService = new FakeValuesService(
            new Locale("en-GB"), new RandomService());

    public WebElement getSendButton() {
        return driver.findElement(sendButton);
    }

    public String getCustomerServiceField() {
        return driver.findElement(customerServiceField).getText();
    }

    public String getSuccessfulMessageField() {
        return driver.findElement(successfulMessageField).getText();
    }

    public void choiceSubjectHeadingParameter(String value) {
        log.info("Select subject heading");
        driver.findElement(subjectHeadingField).click();
        WebElement subjectHeadingSelect = driver.findElement(By.xpath(String.format("//option[@value='%s']", value)));
        subjectHeadingSelect.click();
    }

    public void setEmail() {
        String email = fakeValuesService.bothify("??????####@mail.ru");
        log.info("Set {} email", email);
        driver.findElement(emailAddressField).sendKeys(email);
    }

    public void setOrderReference() {
        String orderNumber = fakeValuesService.bothify("####");
        log.info("Set {} order reference", orderNumber);
        driver.findElement(orderReferenceField).sendKeys(orderNumber);
    }

    public void setMessage() {
        String message = fakeValuesService.bothify("??????????");
        log.info("Set {} message", message);
        driver.findElement(messageField).sendKeys(message);
    }

    public void clickSendButton() {
        log.info("Click Send");
        getSendButton().click();
    }
}