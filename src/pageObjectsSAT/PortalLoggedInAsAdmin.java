package pageObjectsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsAdmin {
	private static WebElement element = null;

	//LOGGA UT
	public static final String LoggaUt_Xpath = "/html/body/div[5]/div[2]/div[2]/header/div/a"; {
	}
	public static WebElement LoggaUt_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/header/div/a"));
		return element;
	}



}
