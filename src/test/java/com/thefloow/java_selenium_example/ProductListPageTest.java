package com.thefloow.java_selenium_example;

import com.thefloow.java_selenium_example.common.BaseTest;
import com.thefloow.java_selenium_example.common.HasCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.*;

public class ProductListPageTest extends BaseTest implements HasCart {
    @BeforeEach()
    public void productsBeforeEach() {
        loginPage.logIn("standard_user", "secret_sauce");
    }

    @Test
    @DisplayName("User can add products to cart")
    public void userCanAddProductsToCart(){
        String product = "Sauce Labs Backpack";
        productListPage.addProductToCart(product);
        assertTrue(productListPage.productHasRemoveButton(product));
        assertTrue(getNumberOfItemsInCart(driver)>0);
        productListPage.removeProductFromCart(product);
        assertTrue(productListPage.productHasAddButton(product));

    }
}
