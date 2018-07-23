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

public class MeriterOchUtm‰rkelserAddNewPriserOchUtm‰rkelser extends BeforeAfterTestBrowsers {



	String TestCaseInfo = "Loggar in som en projektledare och l‰gger till en Priser och Utm‰rkelser";


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
	public void ClickMeriterOchUtm‰rkelser() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtm‰rkelser"})
	public void L‰ggTill() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserL‰ggTill_Css(driver).click();
	}

	@Test (dependsOnMethods={"L‰ggTill"})
	public void ≈r() {

		Select ≈r = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelser≈r_Id)));
		Random randomOption≈r = new Random();  
		int startOption≈r = 0;
		int endOption≈r = ≈r.getOptions().size(); 
		int number≈r = startOption≈r + randomOption≈r .nextInt(endOption≈r - startOption≈r);  
		≈r.selectByIndex(number≈r);
	}

	@Test (dependsOnMethods={"≈r"})
	public void Land() {

		Select Land = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserLand_Id)));
		Random randomOptionLand = new Random();  
		int startOptionLand = 1;
		int endOptionLand = Land.getOptions().size(); 
		int numberLand = startOptionLand + randomOptionLand .nextInt(endOptionLand - startOptionLand);  
		Land.selectByIndex(numberLand);
	}

	@Test (dependsOnMethods={"Land"})
	public void NamnPÂPriset() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserNamnPÂPriset_Id(driver).sendKeys("Ett bra namn");

	}

	@Test (dependsOnMethods={"NamnPÂPriset"})
	public void Utf‰rdare() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserUtf‰rdare_Id(driver).sendKeys("En bra utf‰rdare");

	}

	@Test (dependsOnMethods={"Utf‰rdare"})
	public void Beskrivning() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserBeskrivning_Id(driver).sendKeys("En bra beskrivning");
	}
	
	@Test (dependsOnMethods={"Beskrivning"})
	public void Spara() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserSpara_Id(driver).click();
	}
}
