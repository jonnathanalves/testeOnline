package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import uimaps.SiteMap;

public class SitePage {
  private SiteMap elementos;
  WebDriver driver;
  
  public SitePage(WebDriver driver) {
    this.driver = driver;
    elementos = new SiteMap();
  }
  
  public void preencherPesquisa(String valor) throws Exception {
    driver.findElement(elementos.pesquisa).sendKeys(valor);
    Thread.sleep(2000);
  }
  
  public void clicarPesquisar() throws Exception {
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", driver.findElement(elementos.botaoPesquisar));
    driver.findElement(elementos.botaoPesquisar).click();
    Thread.sleep(2000);
  }
  
  public void validaCampo(String texto) throws Exception {
    driver.findElement(elementos.campo(texto)).isDisplayed();
    Thread.sleep(2000);
  }
  
  public void escolheProduto(String texto) throws Exception {
    driver.findElement(elementos.produto(texto)).click();
    Thread.sleep(2000);
  }
  
  public void addProdutoCarrinho() throws Exception {
    driver.findElement(elementos.botaoComprar).click();
    Thread.sleep(2000);
  }
  
  public void validaCarrinho(String texto) throws Exception {
    driver.findElement(elementos.texto(texto)).isDisplayed();
    Thread.sleep(2000);
  }
}
