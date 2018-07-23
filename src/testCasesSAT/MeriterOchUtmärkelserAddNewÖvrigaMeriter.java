package testCasesSAT;

import java.util.Random;


import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import Utility.UserCredentials;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsUserMinProfil;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class MeriterOchUtmärkelserAddNewÖvrigaMeriter extends BeforeAfterTestBrowsers {
	
	
	
	String TestCaseInfo = "Loggar in som en projektledare och lägger till en Övriga meriter";


	@Test
	public void LoginAsUser() {
		
		System.out.println("Testfall = " + TestCaseInfo);
		driver.manage().window().maximize();
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome_Xpath(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.jagtestarprismaSATuserName, UserCredentials.jagtestarprismaSATpassword);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Xpath);
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickMeriterOchUtmärkelser() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_Xpath(driver).click();
	}
	
	@Test (dependsOnMethods={"ClickMeriterOchUtmärkelser"})
	public void LäggTill() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterLäggTill_Css(driver).click();
	}
	
	@Test (dependsOnMethods={"LäggTill"})
	public void StartårAndSlutÅr() {

		Select Startår = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterStartår_Id)));
		Random randomOptionStartår = new Random();  
		int startOptionStartår = 0;
		int endOptionStartår = Startår.getOptions().size(); 
		int numberStartår = startOptionStartår + randomOptionStartår .nextInt(endOptionStartår - startOptionStartår);  
		Startår.selectByIndex(numberStartår);
		
		Select Slutår = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterSlutår_Id)));
		Slutår.selectByIndex(numberStartår + 1);
	}
	
	@Test (dependsOnMethods={"StartårAndSlutÅr"})
	public void TypAvMerit() {

	PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterTypAvMerit_Name(driver).sendKeys("Test123");
		
	}
	
	@Test (dependsOnMethods={"TypAvMerit"})
	public void Beskrivning() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterBeskrivning_Id(driver).sendKeys("En bra beskrivning");
	}
	
	@Test (dependsOnMethods={"Beskrivning"})
	public void Spara() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterSpara_Id(driver).click();
	}
}
