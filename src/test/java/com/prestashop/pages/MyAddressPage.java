package com.prestashop.pages;

import BaseConfiguration.BasePage;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Locale;

public class MyAddressPage extends BasePage {

    public MyAddressPage(WebDriver driver) {
        super(driver);
    }

    private By addressButton = By.cssSelector(".icon-building");
    private By firstNameField = By.id("firstname");
    private By lastNameField = By.id("lastname");
    private By addressField = By.id("address1");
    private By zipCodeField = By.id("postcode");
    private By cityField = By.id("city");
    private By countryDropdown = By.id("id_country");
    private By homePhoneField = By.id("phone");
    private By mobilePhoneField = By.id("phone_mobile");
    private By stateDropdown = By.id("id_state");
    private By aliasField = By.id("alias");
    private By saveAddressButton = By.xpath("//span[contains(text(),'Save')]");
    private By errorMessage = By.xpath("//p[contains(text(),'There is 1 error')]");

    Actions action = new Actions(driver);

    FakeValuesService fakeValuesService = new FakeValuesService(
            new Locale("en-GB"), new RandomService());

    public WebElement getAddressButton() {
        return driver.findElement(addressButton);
    }

    public void clickAddressButton() {
        getAddressButton().click();
    }

    public void setFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setAddressField(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void setZipCodeField() {
        String orderNumber = fakeValuesService.bothify("#####");
        driver.findElement(zipCodeField).sendKeys(orderNumber);
    }

    public void setCityField(String city) {
        driver.findElement(cityField).sendKeys(city);
    }

    public void selectCountry(String value) {
        driver.findElement(countryDropdown).click();
        WebElement countrySelect = driver.findElement(By.xpath(String.format("//option[@value='21']", value)));
        countrySelect.click();
    }

    public void setHomePhoneField() {
        String orderNumber = fakeValuesService.bothify("+############");
        driver.findElement(homePhoneField).sendKeys(orderNumber);
    }

    public void setMobilePhoneField() {
        String orderNumber = fakeValuesService.bothify("+############");
        driver.findElement(mobilePhoneField).sendKeys(orderNumber);
    }

    public void selectState(String state) {
        driver.findElement(stateDropdown).click();
        WebElement stateSelect = driver.findElement(By.xpath(String.format("//option[@value='3']", state)));
        stateSelect.click();
    }

    public void setAliasField(String alias) {
        driver.findElement(aliasField).sendKeys(alias);
    }

    public WebElement getSave() {
        return driver.findElement(saveAddressButton);
    }

    public void clickSave() {
        getSave().click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}