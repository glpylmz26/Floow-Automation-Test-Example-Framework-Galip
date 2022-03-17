package com.thefloow.java_selenium_example.pages;

import com.thefloow.java_selenium_example.common.BasePage;
import com.thefloow.java_selenium_example.common.HasCart;
import com.thefloow.java_selenium_example.common.UnimplementedException;
import org.openqa.selenium.WebDriver;

/**
 * Represents the cart page (/cart.html)
 */
public class CartPage extends BasePage implements HasCart {
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void clickContinueShopping() {
        throw new UnimplementedException();
    }

    public void clickCheckout() {
        throw new UnimplementedException();
    }

    public boolean isItemInCart(String productName) {
        throw new UnimplementedException();
    }

    public void removeItemFromCart(String productName) {
        throw new UnimplementedException();
    }

    public int getNumberOfItemsInCartList() {
        throw new UnimplementedException();
    }



}
