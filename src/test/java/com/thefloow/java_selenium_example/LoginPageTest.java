package com.thefloow.java_selenium_example;

import com.thefloow.java_selenium_example.common.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

public class LoginPageTest extends BaseTest {
    @Test
    @DisplayName("User can log in")
    public void userCanLogIn(){
        loginPage.logIn("standard_user", "secret_sauce");
        assertTrue(productListPage.hasLoaded(), "Product list page title not found after login");
    }

    @Test
    @DisplayName("User can not log in - Invalid Username")
    public void userCanNotLogInInvalidUsername(){
        loginPage.logIn("standard-user", "secret_sauce");
        String loginErrorMessage = "Epic sadface: Username and password do not match any user in this service";
        loginPage.isErrorDisplayed(loginErrorMessage);
    }

    @Test
    @DisplayName("User can not log in - Invalid Password")
    public void userCanNotLogInInvalidPassword(){
        loginPage.logIn("standard_user", "password");
        String loginErrorMessage = "Epic sadface: Username and password do not match any user in this service";
        loginPage.isErrorDisplayed(loginErrorMessage);
    }
}
