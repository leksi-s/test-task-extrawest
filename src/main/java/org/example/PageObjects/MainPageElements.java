package org.example.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageElements extends BasePage{
    public MainPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchField(){
        return waitForElementToBePresent("//input[@name='q']");
    }
    public WebElement getSearchButton(){ return waitForElementToBePresent("//button[contains(@class, 'header-search-form')]");  }
}
