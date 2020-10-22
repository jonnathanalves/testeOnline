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
  
  public void clicaPartic() throws Exception {
    driver.findElement(elementos.clicaFulano).click();
    Thread.sleep(2000);
  }
  
  
  public void clicaVote() throws Exception {
	    driver.findElement(elementos.clicaVote).click();
	    Thread.sleep(2000);
  }
  
  public void clicaVotaNovamente() throws Exception {
	    driver.findElement(elementos.clicaVotaNovamente).click();
	    Thread.sleep(2000);
}
  public void clicaBotaozinho() throws Exception {
	    driver.findElement(elementos.clicaBotaozinho).click();
	    Thread.sleep(2000);
}
}
