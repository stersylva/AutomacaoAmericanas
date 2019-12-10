package tests.pages;

import functions.CommonFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utils.PaginaBase.getDriver;

public class CestaPage {

    private CommonFunctions function;
    private WebDriver driver;

    public CestaPage(WebDriver driver) {
        function = new CommonFunctions(driver);
    }
    public void setProdutoCampoPesquisa(String produto)  {
        function.escreveXpath("//*[@id='h_search-input']", produto);
    }
    public String obterValorCampoPesquisa() {
        return function.obterValorNoCampoXpath("//input[@id='h_search-input']");
    }
    public void clicarBotaoPesquisa() {
        function.clicarBotao("//button[@id='h_search-btn']");
    }
    public void clicarProdutoHome() {
        function.clicarBotao("//*[@id='content-middle']/div[6]/div/div/div/div[1]/div[1]/div/div[2]/a");
    }
    public void setCEP(String cep) {
        function.escreveXpath("//input[@id='freight-field']", cep);
    }
    public void clicarBototaoCepOK() {
        function.clicarBotao("//button[@id='freight-field-button']");
    }

    public void clicarBotaoComprar() {
        function.clicarBotao("//a[@id='btn-buy']");
    }
    public void clicarGarantia() {
        function.clicarBotao("//div[contains(@class,'garantia_estendida-option-1')]//label[@class='toggle-label']");
    }

    public void clicarBotaoContinuar() {
        function.clicarBotao("//button[@id='btn-continue']");
    }
    public String verificaCesta() {
        return function.verificaProduto("//a[@class='link-default clearfix']");
    }
    public void clicarBotaoContinuar2() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 60);
        WebElement teste = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='basket-summary']//button[@id='buy-button']")));
        teste.click();
    }
}
