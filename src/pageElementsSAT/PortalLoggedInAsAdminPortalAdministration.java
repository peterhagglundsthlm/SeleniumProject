package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsAdminPortalAdministration {
	private static WebElement element = null;


	//PORTALADMINISTRATION
	public static final String PortaladministrationButton = "body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(4) > a"; {
	}
	public static WebElement PortaladministrationButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(4) > a"));
		return element;
	}

	//PORTALADMINISTRATION - WEBBPLATSINSTÄLLNINGAR
	public static final String Webbplatinställningar = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > div > a"; {
	}
	public static WebElement Webbplatinställningar(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - PORTALANVÄNDARE
	public static final String Portalanvändare = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > div > a"; {
	}
	public static WebElement Portalanvändare(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - FINANSIÄRER
	public static final String Finansiärer = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > div > a"; {
	}
	public static WebElement Finansiärer(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - UNDERHÅLLSTABELLER
	public static final String Underhållstabeller = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > div > a"; {
	}
	public static WebElement Underhållstabeller(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - HIERARKISKA UNDERHÅLLSTABELLER
	public static final String HierarkiskaUnderhållstabeller = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > div > a"; {
	}
	public static WebElement HierarkiskaUnderhållstabeller(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - SPRÅK
	public static final String Språk = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > div > a"; {
	}
	public static WebElement Språk(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - MEDDELANDEN
	public static final String Meddelanden = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(8) > div > a"; {
	}
	public static WebElement Meddelanden(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(8) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - DRIFTSTATUS
	public static final String Driftstatus = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(9) > div > a"; {
	}
	public static WebElement Driftstatus(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(9) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - STATISTIK
	public static final String Statistik = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(10) > div > a"; {
	}
	public static WebElement Statistik(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(10) > div > a"));
		return element;
	}



}
