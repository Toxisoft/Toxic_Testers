package com.toxisoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        WebDriver webDriver = WebDriverFactory.getWebDriver(WebDriverFactory.Browser.Firefox);
        webDriver.get("http://www.google.com");
        WebElement searchBox = webDriver.findElement(By.name("q"));
        searchBox.sendKeys("Elvira"); // send also a "\n"
        searchBox.submit();
    }
}