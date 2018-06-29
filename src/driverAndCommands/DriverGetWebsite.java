package driverAndCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverGetWebsite {

	public static WebElement OpenSatPortal(WebDriver driver){

		String URLSAT = "https://testaprisma.vr.se/";
		driver.get(URLSAT);
		return null;

	}
	public static WebElement OpenProdTestPortal(WebDriver driver){

		String URLProdTest = "https://193.10.44.119:444/Start";
		driver.get(URLProdTest);
		return null;
	}

	public static WebElement OpenProduktionPortal(WebDriver driver){

		String URLProd = "https://prisma.research.se/";
		driver.get(URLProd);
		return null;
	}
}