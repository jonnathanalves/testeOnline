package scenarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.SitePage;


public class CT2 {
  WebDriver driver;
  SitePage page;
  int i = 0;
  
  @Before
  public void before() {
    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
    driver = new ChromeDriver();
    page = new SitePage(driver);
  }
  
  @Test
  public void script() throws Exception {
    driver.manage().window().maximize();
    driver.get("https://afazenda.r7.com/a-fazenda-12");
    
    for(i=0; i < 1000; i++) {
    	driver.get("https://afazenda.r7.com/a-fazenda-12");
    	page.clicaPartic();
        page.clicaVote();
    }
  }
  
  @After
  public void after() {
	System.out.println(i);
    driver.quit();
  }
  
}
