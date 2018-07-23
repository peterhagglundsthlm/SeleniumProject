package pageObjectsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsAdminPortalAdministration {
	private static WebElement element = null;


	//PORTALADMINISTRATION
	public static final String PortaladministrationButton_CSS = "body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(4) > a"; {
	}
	public static WebElement PortaladministrationButton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(4) > a"));
		return element;
	}

	//PORTALADMINISTRATION - WEBBPLATSINSTÄLLNINGAR
	public static final String Webbplatinställningar_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > div > a"; {
	}
	public static WebElement Webbplatinställningar_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - PORTALANVÄNDARE
	public static final String Portalanvändare_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > div > a"; {
	}
	public static WebElement Portalanvändare_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - FINANSIÄRER
	public static final String Finansiärer_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > div > a"; {
	}
	public static WebElement Finansiärer_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - UNDERHÅLLSTABELLER
	public static final String Underhållstabeller_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > div > a"; {
	}
	public static WebElement Underhållstabeller_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - HIERARKISKA UNDERHÅLLSTABELLER
	public static final String HierarkiskaUnderhållstabeller_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > div > a"; {
	}
	public static WebElement HierarkiskaUnderhållstabeller_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - SPRÅK
	public static final String Språk_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > div > a"; {
	}
	public static WebElement Språk_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - MEDDELANDEN
	public static final String Meddelanden_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(8) > div > a"; {
	}
	public static WebElement Meddelanden_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(8) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - DRIFTSTATUS
	public static final String Driftstatus_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(9) > div > a"; {
	}
	public static WebElement Driftstatus_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(9) > div > a"));
		return element;
	}

	//PORTALADMINISTRATION - STATISTIK
	public static final String Statistik_CSS = "#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(10) > div > a"; {
	}
	public static WebElement Statistik_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(10) > div > a"));
		return element;
	}



}
