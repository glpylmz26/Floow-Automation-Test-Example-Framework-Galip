package com.thefloow.java_selenium_example.pages;

import com.thefloow.java_selenium_example.common.BasePage;
import com.thefloow.java_selenium_example.common.HasCart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * All methods related to interacting with the product list page go here (/inventory.html)
 */
public class ProductListPage extends BasePage implements HasCart {

    public ProductListPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Check if the Product List page is currently being displayed
     *
     * @return true if the Product List page title is displayed
     */
    public boolean hasLoaded() {
        WebElement productsTitle = driver.findElement(By.xpath("//*[text()='Products']"));
        return productsTitle.isDisplayed();
    }

    /**
     * Adds a named product to the users shopping cart
     *
     * @param productName The name of the product to add to cart
     */
    public void addProductToCart(String productName) {
        WebElement product = getProductCardByName(productName);
        WebElement addCartButton = product.findElement(By.xpath(".//*[text()='Add to cart']"));
        addCartButton.click();
    }

    /**
     * Check whether a 'remove' button is displayed for a named product. Likely to throw exception if one is not
     * present. Use productHasAddButton to check the opposite.
     *
     * @param productName The name of the product to check whether a remove button is present for
     * @return true if remove button is displayed
     */
    public boolean productHasRemoveButton(String productName) {
        WebElement product = getProductCardByName(productName);
        WebElement removeProductButton = product.findElement(By.xpath("//*[text()='Remove']"));
        return removeProductButton.isDisplayed();
    }


    /**
     * Check whether an 'Add to cart' button is displayed for a named product. Likely to throw an exception if one is
     * not present. Use productHasRemoveButton to check the opposite.
     *.
     * @param productName The name of the product to check whether an add button is present for
     * @return true is add to cart button is displayed
     */
    public boolean productHasAddButton(String productName) {
        WebElement product = getProductCardByName(productName);
        WebElement button = product.findElement(By.xpath(".//*[text()='Add to cart']"));
        return button.isDisplayed();
    }

    /**
     * Removes a named product from the users cart
     *
     * @param productName The name of the product to remove
     */
    public void removeProductFromCart(String productName) {
        WebElement product = getProductCardByName(productName);
        WebElement removeProductButton = product.findElement(By.xpath(".//*[text()='Remove']"));
        removeProductButton.click();
    }

    private WebElement getProductCardByName(String productName) {
        return driver.findElement(By.xpath("//*[text()='" + productName + "']/ancestor::div[@class='inventory_item']"));
    }
}
