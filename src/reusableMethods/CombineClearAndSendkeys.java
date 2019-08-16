package reusableMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CombineClearAndSendkeys {
	
  public static WebElement ClearSend (WebDriver driver, By By, String KeysToSend) {
	  
	  driver.findElement(By).clear();
	  driver.findElement(By).sendKeys(KeysToSend);
	  
	return null;
  }
}
