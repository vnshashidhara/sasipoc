package com.webDriver;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrappedDriver implements DriverSource{
    @Override
    public WebDriver newDriver() {

        System.setProperty("webdriver.chrome.driver", "src\\main\\java\\com\\webDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }

}
