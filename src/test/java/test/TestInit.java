package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class TestInit {
    public ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    WebDriver driver;
    public WebDriver getThreadLocalDriver() {
        return threadLocalDriver.get();
    }
    @BeforeMethod
    public void setup()  {
        WebDriverManager.chromedriver().setup();
        threadLocalDriver.set(new ChromeDriver());
        driver = getThreadLocalDriver();
    }

    public void getMainPage(){
        getThreadLocalDriver().get("https://comfy.ua/ua/");
    }


}
