package actions;

import functions.CommonFunctions;
import org.junit.Assert;
import tests.TestCesta;
import tests.pages.CepPage;
import tests.pages.CestaPage;
import tests.pages.FiltrarProdutoPage;
import tests.pages.GarantiaPage;

public class KeepCesta extends TestCesta {
    public static CommonFunctions function;
    public static FiltrarProdutoPage filtrarProdutoPage;
    public static CepPage cepPage;
    public static GarantiaPage garantiaPage;
    public static CestaPage cestaPage;
    

    public static void filtrarProduto() {
        filtrarProdutoPage = new FiltrarProdutoPage(getDriver());
        
        Assert.assertEquals("https://www.americanas.com.br/",  getDriver().getCurrentUrl());

        filtrarProdutoPage.setProdutoCampoPesquisa("ps4");
        
        Assert.assertEquals("ps4", filtrarProdutoPage.obterValorCampoPesquisa());
        
        filtrarProdutoPage.clicarBotaoPesquisa();
        Assert.assertEquals("https://www.americanas.com.br/busca/ps4",  getDriver().getCurrentUrl());
        filtrarProdutoPage.clicarProdutoHome();
                
    }
    
    public static void escolhaCEP() {
    	cepPage = new CepPage(getDriver());
    	
    	cepPage.setCEP("55610280");
    	
    	Assert.assertEquals("55610-280", cepPage.verificaCampoCep());

        cepPage.clicarBototaoCepOK();
        cepPage.clicarBotaoComprar();
    }

    public static void escolheGarantia() {
    	garantiaPage = new GarantiaPage(getDriver());
    	
        garantiaPage.clicarGarantia();
        garantiaPage.clicarBotaoContinuarGarantia();
    }

    public static void resumoPedido() {
    	cestaPage = new CestaPage(getDriver());
    	
        Assert.assertEquals("Console Playstation 4 1 Tb Hits Bundle Edição 5.1 - PS4", cestaPage.verificaCesta());
        cestaPage.clicarBotaoContinuarCesta();
    }


}
