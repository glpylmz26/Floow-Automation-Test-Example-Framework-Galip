package com.thefloow.java_selenium_example;

import com.thefloow.java_selenium_example.common.BaseTest;
import com.thefloow.java_selenium_example.common.HasCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ProductViewPageTest extends BaseTest implements HasCart {

    // PDP is Product Detail Page
    @Test
    @DisplayName("User can add the product to cart from PDP - standard_user")
    public void userCanAddProductsToCartFromPDPForStandardUser() {
        loginPage.logIn("standard_user", "secret_sauce");
        String product = "Sauce Labs Backpack";
        productViewPage.clickOnTheProductForDetail(product);
        assertTrue(productViewPage.isProductDetailDisplayed(product));
        assertTrue(productViewPage.productHasAddButton(product));
        productViewPage.addProductToCart(product);
        assertTrue(getNumberOfItemsInCart(driver) > 0);
        assertTrue(productViewPage.productHasRemoveButton(product));
        productViewPage.removeProductFromCart(product);
        assertTrue(productViewPage.productHasAddButton(product));
        openCart(driver);
        assertTrue(cartIsOpened(driver));
    }

    @Test
    @DisplayName("User can add the product to cart from PDP - problem_user")
    public void userCanAddProductsToCartFromPDPForProblemUser(){
        loginPage.logIn("problem_user", "secret_sauce");
        String product = "Sauce Labs Backpack";
        productViewPage.clickOnTheProductForDetail(product);
        assertTrue(productViewPage.isProductDetailDisplayed(product),"Added product is NOT Displayed");
        assertTrue(productViewPage.productHasAddButton(product));
        productViewPage.addProductToCart(product);
        assertTrue(getNumberOfItemsInCart(driver) > 0);
        assertTrue(productViewPage.productHasRemoveButton(product));
        productViewPage.removeProductFromCart(product);
        assertTrue(productViewPage.productHasAddButton(product));
        openCart(driver);
        assertTrue(cartIsOpened(driver));
    }

    @Test
    @DisplayName("User can add the product to cart from PDP - problem_user")
    public void userCanAddProductsToCartFromPDPForProblemUser2(){
        loginPage.logIn("problem_user", "secret_sauce");
        String product = "Sauce Labs Backpack";
        productViewPage.clickOnTheProductForDetail(product);
        assertTrue(productViewPage.productHasAddButton(product));
        productViewPage.addProductToCart(product);
        assertTrue(getNumberOfItemsInCart(driver) > 0);
        assertTrue(productViewPage.productHasRemoveButton(product));
        productViewPage.removeProductFromCart(product);
        assertTrue(productViewPage.productHasAddButton(product));
        openCart(driver);
        assertTrue(cartIsOpened(driver));
    }

}
