package com.thefloow.java_selenium_example.common;

import com.thefloow.java_selenium_example.pages.CartPage;
import com.thefloow.java_selenium_example.pages.LoginPage;
import com.thefloow.java_selenium_example.pages.ProductListPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * All tests must inherit from this base test in order to properly set up test lifecycle stages
 */
public abstract class BaseTest {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected ProductListPage productListPage;
    protected CartPage cartPage;

    // Define test lifecycle stages
    @BeforeAll
    public static void baseBeforeAll() {
        // Download appropriate driver
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void baseBeforeEach() throws InterruptedException {
        // Start the browser
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);

        // Instantiate pages
        loginPage = new LoginPage(driver);
        productListPage = new ProductListPage(driver);
        cartPage = new CartPage(driver);

        // Set up for the next test case...
        loginPage.get();
    }

    @AfterEach
    public void baseAfterEach() {
        // Close the driver if it's open
        if(driver != null) {
            driver.quit();
        }
    }

    @AfterAll
    public static void baseAfterAll() {

    }
}
