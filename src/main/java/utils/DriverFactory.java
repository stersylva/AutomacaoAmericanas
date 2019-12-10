package utils;

import org.openqa.selenium.WebDriver;

public class DriverFactory extends PaginaBase {

    static WebDriver driver;

    public void aberturaPagina() {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        PaginaBase();
        getDriver().get("https://www.americanas.com.br/");
        getDriver().manage().window().maximize();


    }

    public void fecharPagina() {
        getDriver().close();
    }

}
