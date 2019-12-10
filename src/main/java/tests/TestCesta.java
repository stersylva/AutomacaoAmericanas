package tests;


import actions.KeepCesta;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import utils.DriverFactory;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestCesta extends DriverFactory {
    static WebDriver driver;
    @Before
    public void inicializa() {
        aberturaPagina();
    }

    @Test
    public void minhaCestaProdutoHome() throws InterruptedException {
        KeepCesta.filtrarProduto();
        KeepCesta.escolheGarantia();
        KeepCesta.resumoPedido();
    }
}
