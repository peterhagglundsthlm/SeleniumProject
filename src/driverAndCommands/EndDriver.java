package driverAndCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EndDriver {

	public static WebElement DriverQuit(WebDriver driver){

		driver.quit();
		return null;
	}
	public static WebElement DriverClose(WebDriver driver){

		driver.close();
		return null;
	}

}