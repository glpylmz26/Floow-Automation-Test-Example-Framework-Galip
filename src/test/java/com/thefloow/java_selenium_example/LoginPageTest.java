package com.thefloow.java_selenium_example;

import com.thefloow.java_selenium_example.common.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTest extends BaseTest {
    @Test
    @DisplayName("User can log in")
    public void userCanLogIn() throws InterruptedException {
        loginPage.logIn("standard_user", "secret_sauce");
        assertTrue(productListPage.hasLoaded(), "Product list page title not found after login");
    }
}
