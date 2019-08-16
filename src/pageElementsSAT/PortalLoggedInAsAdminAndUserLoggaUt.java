package pageElementsSAT;

import org.openqa.selenium.By;

public class PortalLoggedInAsAdminAndUserLoggaUt {

	//LOGGA UT
	public static By LoggaUtButton(){

		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > div > a");
		return element;
	}



}
