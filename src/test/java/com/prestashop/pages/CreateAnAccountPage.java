package com.prestashop.pages;

import BaseConfiguration.BasePage;
import com.prestashop.wrappers.Dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CreateAnAccountPage extends BasePage {

    public CreateAnAccountPage(WebDriver driver) {
        super(driver);
    }

    private By manButton = By.id("id_gender1");
    private By girlButton = By.id("id_gender2");
    private By firstNameField = By.id("customer_firstname");
    private By lastNameField = By.id("customer_lastname");
    private By passwordField = By.id("passwd");
    private By yearDropdown = By.id("cuselFrame-years");
    private By newsletterCheckbox = By.id("newsletter");
    private By offersCheckbox = By.id("optin");
    private By registerButton = By.xpath("//span[contains(text(),'Register')]");
    private By errorMessageField = By.cssSelector(".alert.alert-danger");

    Actions action = new Actions(driver);

    public void selectManButton() {
        driver.findElement(manButton).click();
    }

    public void selectGirlButton() {
        driver.findElement(girlButton).click();
    }

    public void setFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void setDay(String day) {
        new Dropdown(driver, "uniform-days").select(day);
    }

    public void setMonth(String month) {
        new Dropdown(driver, "uniform-months").select(month);
    }

    public void setYear(String year) {
        driver.findElement(yearDropdown).click();
        WebElement yearSelect = driver.findElement(By.xpath(String.format("//span[@val='%s']", year)));
        action.moveToElement(yearSelect).build().perform();
        yearSelect.click();
    }

    public void selectNewsletterCheckbox() {
        driver.findElement(newsletterCheckbox).click();
    }

    public void selectOffersCheckbox() {
        driver.findElement(offersCheckbox).click();
    }

    public WebElement getRegisterButton() {
        return driver.findElement(registerButton);
    }

    public void clickRegister() {
        getRegisterButton().click();
    }

    public WebElement getErrorMessage() {
        return driver.findElement(errorMessageField);
    }
}