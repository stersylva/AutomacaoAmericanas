package functions;

import static utils.PaginaBase.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonFunctions {
    private WebDriver driver;

    public CommonFunctions(WebDriver driver) {
        this.driver = driver;
    }

    /************************** Campos de texto  *****************************/
    public String obterValorNoCampoXpath(String xpathCampo) {
    	WebDriverWait wait = new WebDriverWait(getDriver(), 60);
    	WebElement validarCampo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathCampo)));
    	return validarCampo.getAttribute("value");
    }

    public void escreveXpath(String xpath, String descricao) {
        driver.findElement(By.xpath(xpath)).sendKeys(descricao);
    }

    /************************** Click  *****************************/
    public void clicarBotao(String xpathBotao) {
    	WebDriverWait wait = new WebDriverWait(getDriver(), 60);
    	WebElement botao = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathBotao)));
    	botao.click();
    }
    /************* validacoes ***********************************/
    public String verificaProduto(String texto) {
    	WebDriverWait wait = new WebDriverWait(getDriver(), 60);
    	WebElement validacao = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(texto)));
    	return validacao.getText();
    }

}
