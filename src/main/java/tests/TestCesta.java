package tests;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import actions.KeepCesta;
import utils.DriverFactory;

public class TestCesta extends DriverFactory {
    static WebDriver driver;
    @Before
    public void inicializa() {
        aberturaPagina();
    }
    @After
    public void finaliza() {
    	closeNavegator();
    }

    @Test
    public void minhaCestaProdutoHome_1() {
        KeepCesta.filtrarProduto();
        KeepCesta.escolhaCEP();
        KeepCesta.escolheGarantia();
        KeepCesta.resumoPedido();
    }    
}
