package driverAndCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoggedInAsUserSwitchLanguage {

	public static WebElement SwitchLanguageToEnglishLoggedInPage(WebDriver driver) {

		if (driver.getPageSource().contains("Min Profil"))
		{
			driver.get(
					"https://testaprisma.vr.se/Localization/SelectLanguage?languageName=EN&returnUrl=%2F");
		}
		
		return null; 
	}

	public static WebElement SwitchLanguageToSwedishLoggedInPage(WebDriver driver) {

		if (driver.getPageSource().contains("My Profile"))
		{
			driver.get(
					"https://testaprisma.vr.se/Localization/SelectLanguage?languageName=SV&returnUrl=%2F");
		} 
		
		return null;
	}
}

