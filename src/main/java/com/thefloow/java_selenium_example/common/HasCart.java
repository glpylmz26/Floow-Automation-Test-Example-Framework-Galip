package com.thefloow.java_selenium_example.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Just a simple interface to add cart functionality to some pages, but not all of them.
 * Bodging multiple-inheritance into Java
 */
public interface HasCart {
    default int getNumberOfItemsInCart(WebDriver driver) {
        return Integer.parseInt(driver.findElement(By.className("shopping_cart_badge")).getText());
    }

    default void openCart(WebDriver driver) {
        driver.findElement(By.xpath("//div[starts-with(@class,'shopping_cart_')]")).click();
    }

    default boolean assertCartIsOpened(WebDriver driver){
        return driver.findElement(By.xpath("//span[.='Your Cart']")).isDisplayed();
    }
}
