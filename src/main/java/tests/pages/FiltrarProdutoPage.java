package tests.pages;

import org.openqa.selenium.WebDriver;

import functions.CommonFunctions;

public class FiltrarProdutoPage {

    private CommonFunctions function;


    public FiltrarProdutoPage(WebDriver driver) {
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
    
    
    
}
