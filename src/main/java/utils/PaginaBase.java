package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PaginaBase {
    static WebDriver driver;

    public void PaginaBase(WebDriver driver) {
        this.driver = driver;
    }
    public void PaginaBase() {
        this.driver = new FirefoxDriver();
    }
    public void navegateTo(String url) {
        driver.navigate().to(url);
    }
    public static WebDriver getDriver() {
        return driver;
    }
    public void closeNavegator() {
        getDriver().close();
    }
}
