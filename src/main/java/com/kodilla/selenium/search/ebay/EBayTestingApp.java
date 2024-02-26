package com.kodilla.selenium.search.ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");    // [1]

        ChromeOptions options = new ChromeOptions();
        options.setBinary(new File("C:\\chrome-win64\\chrome.exe"));
        // For use with ChromeDriver:
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.ebay.com/ ");

        WebElement inputField = driver.findElementByName("_nkw");
        inputField.sendKeys("Laptop");
        inputField.submit();
    }
}
