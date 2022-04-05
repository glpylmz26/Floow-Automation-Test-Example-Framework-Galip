package com.thefloow.java_selenium_example.pages;

import com.thefloow.java_selenium_example.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Represents the cart page (/cart.html)
 */
public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void clickContinueShopping() {
        driver.findElement(By.id("continue-shopping")).click();
    }

    public void clickCheckout() {
        driver.findElement(By.id("checkout")).click();
    }

    public boolean isItemInCart(String productName) {
        WebElement product = driver.findElement(By.xpath("//div[.='" + productName + "']"));
        return product.isDisplayed();
    }

    public void removeItemFromCart(String productName) {
        WebElement productRemoveButton = driver.findElement(By.xpath("//div[.='" + productName + "']/../..//button"));
        productRemoveButton.click();
    }

    public int getNumberOfItemsInCartList() {
        List<WebElement> listOfProduct = driver.findElements(By.xpath("//div[@class='cart_item']"));
        return listOfProduct.size();
    }
}
