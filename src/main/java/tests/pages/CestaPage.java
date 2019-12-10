package tests.pages;

import org.openqa.selenium.WebDriver;

import functions.CommonFunctions;

public class CestaPage {
	private CommonFunctions function;
    
    public CestaPage(WebDriver driver) {
        function = new CommonFunctions(driver);
    }
	
	public String verificaCesta() {
        return function.verificaProduto("//h2//a");
    }
    public void clicarBotaoContinuarCesta() {
        function.clicarBotao("//div[@class='basket-summary']//button[@id='buy-button']");
    }

}
