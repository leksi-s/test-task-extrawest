package test;

import org.example.PageObjects.MainPageElements;
import org.testng.annotations.Test;

public class ComfyTest extends TestInit{
    @Test
    public void orderTest(){
        getMainPage();
        MainPageElements mainPage = new MainPageElements(driver);
        mainPage.getSearchField().sendKeys("iphone 15");
        mainPage.getSearchButton().click();
    }
}
