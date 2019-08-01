package driverAndCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoggedInAsUserSwitchLanguage {

	public static WebElement SwitchLanguageToEnglishLoggedInPage(WebDriver driver) {

		if (driver.getPageSource().contains("Min profil"))
		{
			String hrefEn = 
					"/Localization/SelectLanguage?languageName=EN&returnUrl=%2F";
			driver.get(
					"https://testaprisma.vr.se" + hrefEn);
		}
		else {Assert.fail();}
		return null; 
	}

	public static WebElement SwitchLanguageToSwedishLoggedInPage(WebDriver driver) {


		if (driver.getPageSource().contains("My profile"))
		{
			String hrefSWE = 
					"/Localization/SelectLanguage?languageName=SV&returnUrl=%2F";
			driver.get(
					"https://testaprisma.vr.se" + hrefSWE);
		} 
		else {Assert.fail();}
		return null;
	}
}

