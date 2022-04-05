package com.thefloow.java_selenium_example.pages;

import com.thefloow.java_selenium_example.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductViewPage extends BasePage {
    public ProductViewPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getProductCardByName(String productName) {
        return driver.findElement(By.xpath("//div[.='" + productName + "']/../../.."));
    }

    public boolean isProductDetailDisplayed(String productName) {
        return getProductCardByName(productName).isDisplayed();
    }

    public void addProductToCart(String productName) {
        WebElement product = getProductCardByName(productName);
        WebElement addCartButton = product.findElement(By.xpath(".//*[text()='Add to cart']"));
        addCartButton.click();
    }

    public boolean productHasRemoveButton(String productName) {
        WebElement product = getProductCardByName(productName);
        WebElement removeProductButton = product.findElement(By.xpath("//*[text()='Remove']"));
        return removeProductButton.isDisplayed();
    }

    public boolean productHasAddButton(String productName) {
        WebElement product = getProductCardByName(productName);
        WebElement button = product.findElement(By.xpath(".//*[text()='Add to cart']"));
        return button.isDisplayed();
    }

    public void removeProductFromCart(String productName) {
        WebElement product = getProductCardByName(productName);
        WebElement removeProductButton = product.findElement(By.xpath(".//*[text()='Remove']"));
        removeProductButton.click();
    }

    public void clickOnTheProductForDetail(String productName){
        driver.findElement(By.xpath("//div[.='"+productName+"']")).click();
    }



}

