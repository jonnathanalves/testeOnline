package uimaps;

import org.openqa.selenium.By;

public class SiteMap {
  
  public By pesquisa = By.xpath("//input[@name='conteudo']");
  public By botaoPesquisar = By.xpath("//button[@id='h_search-btn']");  
  public By botaoComprar = By.xpath("//span[text()='Comprar']");  
  
  public By campo(String name) {
    return By.xpath("//h1[text()= '" + name + "']");
  }
  
  public By texto(String name) {
    return By.xpath("//a[contains(text(),'" + name + "')]");
  }
  
  public By produto(String texto) {
    return By.xpath("//h2[contains(text(),'"+texto+"')]");
  }
}
