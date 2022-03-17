package com.thefloow.java_selenium_example.common;

import org.openqa.selenium.WebDriver;

/**
 * Represents the concept of a webpage that we want to interact with, specifically one within saucedemo.com
 */
public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getBaseUrl() {
        return "https://www.saucedemo.com/";
    }
}
