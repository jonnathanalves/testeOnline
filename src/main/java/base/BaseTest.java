package base;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import uimaps.SiteMap;

public class BaseTest {
  static WebDriver driver;
  protected String errorMsg = "";
  
  public void executeStep(String stepResult, String stepLabel) throws Exception {
    if (!stepResult.trim().isEmpty()) {
      errorMsg = stepResult;
      takeScreenShot("stepLabel");
    }
    System.out.println("Step executado: " + stepLabel);
  }
  
  private void takeScreenShot(String fname) throws Exception {
    File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    String imageFileDir = System.getProperty("selenium.screenshot.dir");
    if (imageFileDir == null)
      imageFileDir = System.getProperty("java.io.tmpdir");
    FileUtils.copyFile(scrFile, new File(imageFileDir, fname));
}
}
