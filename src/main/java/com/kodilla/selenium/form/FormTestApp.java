package com.kodilla.selenium.form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class FormTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");    // [1]

        ChromeOptions options = new ChromeOptions();
        options.setBinary(new File("C:\\chrome-win64\\chrome.exe"));
        // For use with ChromeDriver:
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://kodilla.com/pl/test/form");

        WebElement yearCombo = driver.findElement(By.xpath("//*[@id=\"birthday_wrapper\"]/select[3]"));
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByIndex(5);

    }
}
