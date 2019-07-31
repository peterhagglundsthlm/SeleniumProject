package driverAndCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoggedInAsUserSwitchLanguage {
	


	public static WebElement SwitchLanguageToEnglishLoggedInPage(WebDriver driver) {

		
		if (driver.getPageSource().contains("Min profil"))
		{
			String hrefEn = "/Localization/SelectLanguage?languageName=EN&returnUrl=%2F";
			driver.get("https://testaprisma.vr.se" + hrefEn);
		}
		else {
			
		}
		return null;
	}
	
	public static WebElement SwitchLanguageToSwedishLoggedInPage(WebDriver driver) {

		
		if (driver.getPageSource().contains("My profile"))
		{

			String hrefSWE = "/Localization/SelectLanguage?languageName=SV&returnUrl=%2F";
			driver.get("https://testaprisma.vr.se" + hrefSWE);
		}
		else {
		
		}
		return null;


	}
}

