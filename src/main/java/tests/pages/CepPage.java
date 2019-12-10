package tests.pages;

import org.openqa.selenium.WebDriver;

import functions.CommonFunctions;

public class CepPage {
	
	private CommonFunctions function;

    public CepPage(WebDriver driver) {
        function = new CommonFunctions(driver);
    }
    
	public void setCEP(String cep) {
        function.escreveXpath("//input[@id='freight-field']", cep);
    }
	
	public String verificaCampoCep() {
		return function.obterValorNoCampoXpath("//input[@id='freight-field']");
	}
	
	public void clicarBototaoCepOK() {
        function.clicarBotao("//button[@id='freight-field-button']");
    }

    public void clicarBotaoComprar() {
        function.clicarBotao("//a[@id='btn-buy']");
    }

}
