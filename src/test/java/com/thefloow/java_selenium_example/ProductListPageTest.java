package com.thefloow.java_selenium_example;

import com.thefloow.java_selenium_example.common.BaseTest;
import com.thefloow.java_selenium_example.common.HasCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductListPageTest extends BaseTest implements HasCart {

    @Test
    @DisplayName("User can add products to cart - standard_user")
    public void userCanAddProductsToCartForStandartUser() {
        loginPage.logIn("standard_user", "secret_sauce");
        String product = "Sauce Labs Backpack";
        productListPage.addProductToCart(product);
        assertTrue(productListPage.productHasRemoveButton(product));
        assertTrue(getNumberOfItemsInCart(driver) > 0);
        productListPage.removeProductFromCart(product);
        assertTrue(productListPage.productHasAddButton(product));

    }

    @Test
    @DisplayName("User can add products to cart - problem_user")
    public void userCanAddProductsToCartForProblemUser() {
        loginPage.logIn("problem_user", "secret_sauce");
        String product = "Sauce Labs Backpack";
        productListPage.addProductToCart(product);
        assertTrue(productListPage.productHasRemoveButton(product));
        assertTrue(getNumberOfItemsInCart(driver) > 0);
        productListPage.removeProductFromCart(product);
        assertTrue(productListPage.productHasAddButton(product));
    }

    @Test
    @DisplayName("User can add products to cart - problem_user")
    public void userCanAddProductsToCartForProblemUser2() {
        loginPage.logIn("problem_user", "secret_sauce");
        String product = "Sauce Labs Bolt T-Shirt";
        productListPage.addProductToCart(product);
        assertTrue(productListPage.productHasRemoveButton(product));
        assertTrue(getNumberOfItemsInCart(driver) > 0);
        productListPage.removeProductFromCart(product);
        assertTrue(productListPage.productHasAddButton(product));
    }
}
