package com.thefloow.java_selenium_example;

import com.thefloow.java_selenium_example.common.BaseTest;
import com.thefloow.java_selenium_example.common.HasCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartPageTest extends BaseTest implements HasCart {
    @BeforeEach()
    public void productsBeforeEach() {
        loginPage.logIn("standard_user", "secret_sauce");
    }

    @Test
    @DisplayName("User can edit Cart")
    public void userCanEditCart(){
        String product1 = "Sauce Labs Backpack";
        String product2 = "Sauce Labs Bike Light";
        productListPage.addProductToCart(product1);
        productListPage.addProductToCart(product2);
        openCart(driver);
        assertTrue(cartPage.isItemInCart(product1) && cartPage.isItemInCart(product2));
        assertEquals(2,cartPage.getNumberOfItemsInCartList());
        cartPage.removeItemFromCart(product1);
        assertEquals(1,cartPage.getNumberOfItemsInCartList());
    }

    @Test
    @DisplayName("User can go back to PLP/go to checkout from Cart")
    public void userCanGoBackPLPAndCheckoutFromCart(){
        openCart(driver);
        cartPage.clickContinueShopping();
        openCart(driver);
        cartPage.clickCheckout();
    }


}
