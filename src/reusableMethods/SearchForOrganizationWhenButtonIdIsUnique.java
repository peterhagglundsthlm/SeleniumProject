package reusableMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchForOrganizationWhenButtonIdIsUnique {
	
  public static WebElement EnterKeyInputs(WebDriver driver, By By, String Organization) throws InterruptedException {
	  
	  driver.findElement((By)).sendKeys(Organization);

		Thread.sleep(500);

		driver.findElement((By)).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		driver.findElement((By)).sendKeys(Keys.ENTER);

		Thread.sleep(1000);
		
		driver.findElement((By)).sendKeys(Keys.TAB);
		
		driver.switchTo().activeElement().sendKeys(Keys.TAB);
		
		Thread.sleep(1000);
		
		driver.switchTo().activeElement().sendKeys(Keys.ENTER);
		
		return null;
	  
  }
}
