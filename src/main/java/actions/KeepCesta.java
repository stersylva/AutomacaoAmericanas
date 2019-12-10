package actions;

import functions.CommonFunctions;
import org.junit.Assert;
import tests.TestCesta;
import tests.pages.CestaPage;

public class KeepCesta extends TestCesta {
    public static CommonFunctions function;
    public static CestaPage page;

    public static void filtrarProduto() {
        page = new CestaPage(getDriver());

        page.setProdutoCampoPesquisa("PS4");

        page.obterValorCampoPesquisa();
        page.clicarBotaoPesquisa();
        page.clicarProdutoHome();
        page.setCEP("55610280");
        page.clicarBototaoCepOK();
        page.clicarBotaoComprar();


    }

    public static void escolheGarantia() {
        page.clicarGarantia();
        page.clicarBotaoContinuar();
    }

    public static void resumoPedido() throws InterruptedException {
        Assert.assertEquals("Console Playstation 4 1 Tb Hits Bundle Edição 5.1 - PS4", page.verificaCesta());
        page.clicarBotaoContinuar2();
    }


}
