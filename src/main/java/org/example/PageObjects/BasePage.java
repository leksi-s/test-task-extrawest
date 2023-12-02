package org.example.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }
    public WebElement waitForElementToBePresent(String xpath){
        Duration timeoutDuration = Duration.ofSeconds(20);
        return (new WebDriverWait(driver,timeoutDuration)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }
}
