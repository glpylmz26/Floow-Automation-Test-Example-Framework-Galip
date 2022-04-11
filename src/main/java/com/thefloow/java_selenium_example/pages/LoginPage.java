package com.thefloow.java_selenium_example.pages;

import com.thefloow.java_selenium_example.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * All methods related to interacting with the Login page go here
 */
public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Go to the login page
     */
    public void get() {
        driver.get(getBaseUrl());
    }

    /**
     * Logs a user in
     *
     * @param username the username to use while logging in
     * @param password the password to use while logging in
     */
    public void logIn(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("login-button"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        submitButton.click();
    }

    /**
     * Checks whether a given error message is currently being displayed
     *
     * @param expectedError The error message to be checked for
     * @return
     */
    public boolean isErrorDisplayed(String expectedError) {
        WebElement errorContainer = driver.findElement(By.className("error-message-container"));
        System.out.println(errorContainer.getText());
        return errorContainer.getText().equals(expectedError);
    }
}
