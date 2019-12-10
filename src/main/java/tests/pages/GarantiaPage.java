package tests.pages;

import org.openqa.selenium.WebDriver;

import functions.CommonFunctions;

public class GarantiaPage {
	
	private CommonFunctions function;
    
    public GarantiaPage(WebDriver driver) {
        function = new CommonFunctions(driver);
    }

	public void clicarGarantia() {
        function.clicarBotao("//div[contains(@class,'garantia_estendida-option-1')]//label[@class='toggle-label']");
    }

    public void clicarBotaoContinuarGarantia() {
        function.clicarBotao("//button[@id='btn-continue']");
    }

}
