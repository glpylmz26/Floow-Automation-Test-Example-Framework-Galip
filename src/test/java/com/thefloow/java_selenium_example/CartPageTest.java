package com.thefloow.java_selenium_example;

import com.thefloow.java_selenium_example.common.BaseTest;
import com.thefloow.java_selenium_example.common.HasCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartPageTest extends BaseTest implements HasCart {

    @Test
    @DisplayName("User can edit Cart Negative Scenario- standard_user")
    public void userCanEditCartNegative(){
        loginPage.logIn("standard_user", "secret_sauce");
        String product1 = "Sauce Labs Backpack";
        String product2 = "Sauce Labs Bike Light";
        productListPage.addProductToCart(product1);
        productListPage.addProductToCart(product2);
        openCart(driver);
        assertTrue(cartPage.isItemInCart(product1) && cartPage.isItemInCart(product2));
        assertEquals(2,cartPage.getNumberOfItemsInCartList(),"Amount of products doesn't match with expected");
        cartPage.removeItemFromCart(product1);
        assertEquals(1,cartPage.getNumberOfItemsInCartList(),"Amount of products doesn't match with expected");
        openCart(driver);
        assertEquals(1,cartPage.getNumberOfItemsInCartList(),"Amount of products doesn't match with expected");
        cartPage.clickContinueShopping();
        openCart(driver);
        cartPage.clickCheckout();
    }

    @Test
    @DisplayName("User can edit Cart Positive Scenario- standard_user")
    public void userCanEditCartPositive(){
        loginPage.logIn("standard_user", "secret_sauce");
        String product1 = "Sauce Labs Backpack";
        String product2 = "Sauce Labs Bike Light";
        productListPage.addProductToCart(product1);
        productListPage.addProductToCart(product2);
        openCart(driver);
        assertTrue(cartPage.isItemInCart(product1) && cartPage.isItemInCart(product2));
        assertEquals(2,cartPage.getNumberOfItemsInCartList(),"Amount of products doesn't match with expected");
        cartPage.removeItemFromCart(product1);
        assertEquals(1,cartPage.getNumberOfItemsInCartList(),"Amount of products doesn't match with expected");
        cartPage.clickContinueShopping();
        openCart(driver);
        cartPage.clickCheckout();
    }

    @Test
    @DisplayName("User can edit Cart - problem_user")
    public void userCanEditCartProblemUser(){
        loginPage.logIn("problem_user", "secret_sauce");
        String product1 = "Sauce Labs Backpack";
        String product2 = "Sauce Labs Bike Light";
        productListPage.addProductToCart(product1);
        productListPage.addProductToCart(product2);
        openCart(driver);
        assertTrue(cartPage.isItemInCart(product1) && cartPage.isItemInCart(product2));
        assertEquals(2,cartPage.getNumberOfItemsInCartList(),"Amount of products doesn't match with expected");
        cartPage.removeItemFromCart(product1);
        assertEquals(1,cartPage.getNumberOfItemsInCartList(),"Amount of products doesn't match with expected");
        openCart(driver);
        assertEquals(1,cartPage.getNumberOfItemsInCartList(),"Amount of products doesn't match with expected");
        cartPage.clickContinueShopping();
        openCart(driver);
        cartPage.clickCheckout();
    }

    @Test
    @DisplayName("User can edit Cart - performance_glitch_user")
    public void userCanEditCartPerformanceGlitchUser(){
        loginPage.logIn("performance_glitch_user", "secret_sauce");
        String product1 = "Sauce Labs Backpack";
        String product2 = "Sauce Labs Bike Light";
        productListPage.addProductToCart(product1);
        productListPage.addProductToCart(product2);
        openCart(driver);
        assertTrue(cartPage.isItemInCart(product1) && cartPage.isItemInCart(product2));
        assertEquals(2,cartPage.getNumberOfItemsInCartList(),"Amount of products doesn't match with expected");
        cartPage.removeItemFromCart(product1);
        assertEquals(1,cartPage.getNumberOfItemsInCartList(),"Amount of products doesn't match with expected");
        openCart(driver);
        assertEquals(1,cartPage.getNumberOfItemsInCartList(),"Amount of products doesn't match with expected");
        cartPage.clickContinueShopping();
        openCart(driver);
        cartPage.clickCheckout();
    }

}
