package org.seleniumdemo.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumdemo.pageobject.*;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class ShoppingTest {/*
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        String browserName = System.getProperty("browserName");

        if (browserName != null && browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
            driver = new ChromeDriver();

        } else {
            driver = new ChromeDriver();
        }

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void addShortsToCartValidatePriceAndCleanCart() throws Exception {
        PáginaEntradaFilmaffinity homePage = new PáginaEntradaFilmaffinity(this.driver);
        CategoryPage categoryPage = new CategoryPage(driver);
        PaginaImagen subCategoryPage = new PaginaImagen(driver);
        ProductDetailPage productDetailPage = new ProductDetailPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        homePage.loadHomePage();
        homePage.goToWomenSubcategory();

        categoryPage.goToTopSubCategory();

        String productName = "Faded Short Sleeve T-shirts";
        subCategoryPage.goToProductDetails(productName);

        productDetailPage.addProductToCart();
        String totalPrice = checkoutPage.getTotalPrice();
        assertEquals("$18.51", totalPrice);

        checkoutPage.cleanShoppingCart();
        boolean isCartEmpty = checkoutPage.isShoppingCartEmpty();
        assertTrue(isCartEmpty);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }*/
}
