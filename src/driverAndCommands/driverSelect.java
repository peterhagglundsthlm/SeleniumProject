package driverAndCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class driverSelect {
	
	
  public static Select DropDown(WebDriver driver, By By) {
	  
	  return new Select (driver.findElement(By));  
  }
}
