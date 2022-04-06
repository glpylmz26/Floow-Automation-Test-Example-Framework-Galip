package com.thefloow.java_selenium_example;

import com.thefloow.java_selenium_example.common.BaseTest;
import com.thefloow.java_selenium_example.common.HasCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class ProductViewPageTest extends BaseTest implements HasCart {
    @BeforeEach()
    public void productsBeforeEach() {
        loginPage.logIn("standard_user", "secret_sauce");
    }

    @Test
    @DisplayName("User can add the product to cart from PDP")
    // PDP is Product Detail Page
    public void userCanAddProductsToCartFromPDP() {
        String product = "Sauce Labs Backpack";
        productViewPage.clickOnTheProductForDetail(product);
        assertTrue(productViewPage.isProductDetailDisplayed(product));
        assertTrue(productViewPage.productHasAddButton(product));
        productViewPage.addProductToCart(product);
        assertTrue(getNumberOfItemsInCart(driver) > 0);
        assertTrue(productViewPage.productHasRemoveButton(product));
        productViewPage.removeProductFromCart(product);
        assertTrue(productViewPage.productHasAddButton(product));
    }

    @Test
    @DisplayName("User can go back PLP and can go to Cart from PDP")
    // PDP is Product Detail Page
    // PLP is Product List Page
    public void userCanGoBackToListOrCanGoToCartFromPDP(){
        String product = "Sauce Labs Backpack";
        productViewPage.clickOnTheProductForDetail(product);
        assertTrue(productViewPage.isProductDetailDisplayed(product));
        productViewPage.clickOnTheBackToProductsButton();
        assertTrue(productListPage.hasLoaded());
        productViewPage.clickOnTheProductForDetail(product);
        openCart(driver);
        assertCartIsOpened(driver);

    }
}
