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

public class MeriterOchUtmärkelserAddNewPriserOchUtmärkelser extends BeforeAfterTestBrowsers {



	String TestCaseInfo = "Loggar in som en projektledare och lägger till en Priser och Utmärkelser";


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

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserLäggTill_Css(driver).click();
	}

	@Test (dependsOnMethods={"LäggTill"})
	public void År() {

		Select År = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserÅr_Id)));
		Random randomOptionÅr = new Random();  
		int startOptionÅr = 0;
		int endOptionÅr = År.getOptions().size(); 
		int numberÅr = startOptionÅr + randomOptionÅr .nextInt(endOptionÅr - startOptionÅr);  
		År.selectByIndex(numberÅr);
	}

	@Test (dependsOnMethods={"År"})
	public void Land() {

		Select Land = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserLand_Id)));
		Random randomOptionLand = new Random();  
		int startOptionLand = 1;
		int endOptionLand = Land.getOptions().size(); 
		int numberLand = startOptionLand + randomOptionLand .nextInt(endOptionLand - startOptionLand);  
		Land.selectByIndex(numberLand);
	}

	@Test (dependsOnMethods={"Land"})
	public void NamnPåPriset() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserNamnPåPriset_Id(driver).sendKeys("Ett bra namn");

	}

	@Test (dependsOnMethods={"NamnPåPriset"})
	public void Utfärdare() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserUtfärdare_Id(driver).sendKeys("En bra utfärdare");

	}

	@Test (dependsOnMethods={"Utfärdare"})
	public void Beskrivning() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserBeskrivning_Id(driver).sendKeys("En bra beskrivning");
	}
	
	@Test (dependsOnMethods={"Beskrivning"})
	public void Spara() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserSpara_Id(driver).click();
	}
}
