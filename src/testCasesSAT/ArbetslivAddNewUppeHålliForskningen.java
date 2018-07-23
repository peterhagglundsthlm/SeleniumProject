package testCasesSAT;


import org.testng.annotations.Test;

import Utility.UserCredentials;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsUserMinProfil;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class ArbetslivAddNewUppeHålliForskningen extends BeforeAfterTestBrowsers {
	String TestCaseInfo = "Loggar in som en projektledare och lägger till ett Uppehåll i forskningen";


	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome_Xpath(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.jagtestarprismaSATuserName, UserCredentials.jagtestarprismaSATpassword);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Xpath);
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickArbetsliv() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void UppehållIForskningenLäggTill() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenLäggTill_Css(driver).click();
	}

	@Test (dependsOnMethods={"UppehållIForskningenLäggTill"})
	public void StartDatum() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenStartDatum_Name(driver).sendKeys("2017-05-19");
	}

	@Test (dependsOnMethods={"StartDatum"})
	public void SlutDatum() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenSlutDatum_Name(driver).sendKeys("2018-06-17");
	}

	@Test (dependsOnMethods={"SlutDatum"})
	public void Beskrivning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenBeskrivning_Id(driver).sendKeys("test");
	}
	
	@Test (dependsOnMethods={"Beskrivning"})
	public void SparaVal() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenSpara_Id(driver).click();
	}
}
