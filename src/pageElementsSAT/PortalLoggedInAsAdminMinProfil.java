package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalLoggedInAsAdminMinProfil {
	private static WebElement element = null;
	


	//MIN PROFIL - KNAPPEN
	public static By MinProfilButton(){
		
		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuMyProfileInternalUser > a");
		return element;
	}
	
	//MIN PROFIL - INSTÄLLNINGAR
	public static By MinProfilButton_Inställningar(){
		
		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a");
		return element;
	}

	//MIN PROFIL - SWAMID-KONTO
	public static By MinProfilButton_SWAMID_KONTO(){
		
		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a");
		return element;
	}




}




