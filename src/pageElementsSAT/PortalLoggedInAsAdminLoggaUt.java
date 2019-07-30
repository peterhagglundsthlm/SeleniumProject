package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsAdminLoggaUt {
	private static WebElement element = null;

	//LOGGA UT
	public static By LoggaUt(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > div > a");
		return element;
	}



}
