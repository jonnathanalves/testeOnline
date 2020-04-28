package scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.SitePage;


public class CT01 {
  WebDriver driver;
  SitePage page;
  
  
  @Before
  public void before() {
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    page = new SitePage(driver);
  }
  
  @Test
  public void script() throws Exception {
    driver.manage().window().maximize();
    // Navegar na url 
    driver.get("https://www.submarino.com.br/");
    //Pesquisar produto
    page.preencherPesquisa("Gift Card Digital Netflix");
    page.clicarPesquisar(); 
    //Valida produto pesquisado
    page.validaCampo("Gift Card Digital Netflix");
    //Adiciona produto no carrinho
    page.escolheProduto("Gift Card Digital Netflix");  
    page.addProdutoCarrinho(); 
    //Valida produto no carrinho
    page.validaCarrinho("Gift Card Digital Netflix"); 
  }
  
  @After
  public void after() {
    driver.quit();
    
  }
  
}
