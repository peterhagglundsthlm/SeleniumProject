package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PortalLoggedInAsAdminPortalAdministration {
	private static By element = null;


	//PORTALADMINISTRATION
	public static By PortaladministrationButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li:nth-child(4) > a");
		return element;
	}

	//PORTALADMINISTRATION - WEBBPLATSINSTÄLLNINGAR
	public static By Webbplatinställningar(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(2) > div > a");
		return element;
	}

	//PORTALADMINISTRATION - PORTALANVÄNDARE
	public static By Portalanvändare(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(3) > div > a");
		return element;
	}

	//PORTALADMINISTRATION - FINANSIÄRER
	public static By Finansiärer(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(4) > div > a");
		return element;
	}

	//PORTALADMINISTRATION - UNDERHÅLLSTABELLER
	public static By Underhållstabeller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(5) > div > a");
		return element;
	}

	//PORTALADMINISTRATION - HIERARKISKA UNDERHÅLLSTABELLER
	public static By HierarkiskaUnderhållstabeller(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(6) > div > a");
		return element;
	}

	//PORTALADMINISTRATION - SPRÅK
	public static By Språk(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(7) > div > a");
		return element;
	}

	//PORTALADMINISTRATION - MEDDELANDEN
	public static By Meddelanden(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(8) > div > a");
		return element;
	}

	//PORTALADMINISTRATION - DRIFTSTATUS
	public static By Driftstatus(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(9) > div > a");
		return element;
	}

	//PORTALADMINISTRATION - STATISTIK
	public static By Statistik(){

		By element = By.cssSelector("#mainContentBody > div > div > aside > section:nth-child(1) > div > div > ul > li:nth-child(10) > div > a");
		return element;
	}



}
