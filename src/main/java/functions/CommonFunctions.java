package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonFunctions {
    private WebDriver driver;

    public CommonFunctions(WebDriver driver) {
        this.driver = driver;
    }

    /************************** Campos de texto  *****************************/
    public String obterValorNoCampoXpath(String xpathCampo) {
        return driver.findElement(By.xpath(xpathCampo)).getAttribute("value");
    }

    public void escreveXpath(String xpath, String descricao) {
        driver.findElement(By.xpath(xpath)).sendKeys(descricao);
    }

    /************************** Click  *****************************/
    public void clicarBotao(String xpathBotao) {
        driver.findElement(By.xpath(xpathBotao)).click();
    }
    /************* validacoes ***********************************/
    public String verificaProduto(String texto) {
        return driver.findElement(By.xpath(texto)).getText();
    }

}
