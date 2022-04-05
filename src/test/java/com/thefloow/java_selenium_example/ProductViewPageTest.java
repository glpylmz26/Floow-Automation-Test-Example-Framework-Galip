package com.thefloow.java_selenium_example;

import com.thefloow.java_selenium_example.common.BaseTest;
import com.thefloow.java_selenium_example.common.HasCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ProductViewPageTest extends BaseTest implements HasCart {
    @BeforeEach()
    public void productsBeforeEach() {
        loginPage.logIn("standard_user", "secret_sauce");
    }

    @Test
    @DisplayName("User can add the product to cart from view page")
    public void userCanAddProductsToCart() {
        String product = "Sauce Labs Backpack";
        productViewPage.clickOnTheProductForDetail(product);
        assertTrue(productViewPage.isProductDetailDisplayed(product));
        assertTrue(productViewPage.productHasAddButton(product));
        productViewPage.addProductToCart(product);
        assertEquals(1, getNumberOfItemsInCart(driver));
        assertTrue(productViewPage.productHasRemoveButton(product));
        productViewPage.removeProductFromCart(product);
        assertTrue(productViewPage.productHasAddButton(product));


    }
}
