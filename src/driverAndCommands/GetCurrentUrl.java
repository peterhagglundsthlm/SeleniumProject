package driverAndCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GetCurrentUrl {
	
	
	
  @Test
  public static WebElement GetUrlAndPrintInConsole(WebDriver driver, String InformationsText) {
	  
	  String CurrentUrl = driver.getCurrentUrl();
	  System.out.println(InformationsText + CurrentUrl);
	  return null;
  }
 
}
