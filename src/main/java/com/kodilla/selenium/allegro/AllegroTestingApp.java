package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");    // [1]

        ChromeOptions options = new ChromeOptions();
        options.setBinary(new File("C:\\chrome-win64\\chrome.exe"));
        // For use with ChromeDriver:
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://kodilla.com/pl/test/form");

        WebElement dayCombo = driver.findElementByXPath("//*[@id=\"day\"]");
        Select daySelect = new Select(dayCombo);
        daySelect.selectByIndex(15);

        WebElement monthCombo = driver.findElementByXPath("//*[@id=\"month\"]");
        Select monthSelect = new Select(monthCombo);
        monthSelect.selectByValue("7");

        WebElement yearCombo = driver.findElementByXPath("//*[@id=\"year\"]");
        Select yearSelect = new Select(yearCombo);
        yearSelect.selectByValue("1996");
    }
}
