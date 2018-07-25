package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PortalLoggedInAsAdminMinProfil {
	private static WebElement element = null;
	

	//MIN PROFIL - KNAPPEN
	public static final String MinProfilButton = "body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuMyProfileInternalUser > a"; {
	}
	public static WebElement MinProfilButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuMyProfileInternalUser > a"));
		return element;
	}

	//MIN PROFIL - INSTÄLLNINGAR
	public static final String MinProfilButton_Inställningar = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"; {
	}
	public static WebElement MinProfilButton_Inställningar(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[1]/div/a"));
		return element;
	}

	//MIN PROFIL - SWAMID-KONTO
	public static final String MinProfilButton_SWAMID_KONTO = "//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"; {
	}
	public static WebElement MinProfilButton_SWAMID_KONTO(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/div/aside/section[1]/div/div/ul/li[2]/div/a"));
		return element;
	}




}




