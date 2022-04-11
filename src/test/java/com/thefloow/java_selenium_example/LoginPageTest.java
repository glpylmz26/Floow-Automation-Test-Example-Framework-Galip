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
    @DisplayName("User can not log in - locked out user")
    public void userCanNotLogInInvalidUsername(){
        loginPage.logIn("locked_out_user", "secret_sauce");
        String loginErrorMessage = "Epic sadface: Sorry, this user has been locked out.";
        assertTrue(loginPage.isErrorDisplayed(loginErrorMessage));
    }

    @Test
    @DisplayName("User can log in albeit late")
    public void userCanLogIn3(){
        loginPage.logIn("performance_glitch_user", "secret_sauce");
        assertTrue(productListPage.hasLoaded(), "Product list page title not found after login");
    }

    @Test
    @DisplayName("User can not log in - Invalid Password")
    public void userCanNotLogInInvalidPassword(){
        loginPage.logIn("standard_user", "password");
        String loginErrorMessage = "Epic sadface: Username and password do not match any user in this service";
        assertTrue(loginPage.isErrorDisplayed(loginErrorMessage));
    }

    @Test
    @DisplayName("User can not log in - Invalid Username")
    public void userCanNotLogInInvalidUserName(){
        loginPage.logIn("username", "secret_sauce");
        String loginErrorMessage = "Epic sadface: Username and password do not match any user in this service";
        assertTrue(loginPage.isErrorDisplayed(loginErrorMessage));
    }
}
