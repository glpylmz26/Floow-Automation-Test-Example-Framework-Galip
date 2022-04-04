package com.thefloow.java_selenium_example.pages;

import com.thefloow.java_selenium_example.common.BasePage;
import com.thefloow.java_selenium_example.common.HasCart;
import com.thefloow.java_selenium_example.common.UnimplementedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Represents the cart page (/cart.html)
 */
public class CartPage extends BasePage implements HasCart {
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
        return  product.isDisplayed();
    }

    public void removeItemFromCart(String productName) {
        WebElement productRemoveButton = driver.findElement(By.xpath("//div[.='" +productName+ "']/../..//button"));
        productRemoveButton.click();
    }

    public int getNumberOfItemsInCartList() {
        List<WebElement> listOfProduct = driver.findElements(By.xpath("//div[@class='cart_item']"));
        return listOfProduct.size();
    }
}
