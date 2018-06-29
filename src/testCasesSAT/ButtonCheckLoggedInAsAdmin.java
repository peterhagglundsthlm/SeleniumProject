package testCasesSAT;


import org.testng.annotations.Test;
import Utility.UserCredentials;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsAdmin;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class ButtonCheckLoggedInAsAdmin extends BeforeAfterTestBrowsers {

	@Test 
	public void LoginAsAdminUser() {

		//Loggar in som användare kkprisma@yahoo.com
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.KristoferKlarinAdminUserNameSAT, UserCredentials.KristoferKlarinAdminPasswordSAT);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, PortalLoggedInAsAdmin.LoggaUt_Xpath);
		
	}

	@Test (dependsOnMethods={"LoginAsAdminUser"})
	public void ClickMyProfileButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER MIN PROFIL
		PortalLoggedInAsAdmin.MinProfilButton_Xpath(driver).click();
		PortalLoggedInAsAdmin.MinProfilButton_Inställningar_Xpath(driver).click();
		PortalLoggedInAsAdmin.MinProfilButton_SWAMID_KONTO_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickMyProfileButton"})
	public void ClickIntressentregisterButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER INTRESSENTREGISTER
		PortalLoggedInAsAdmin.IntressentregisterButton_Xpath(driver).click();
		PortalLoggedInAsAdmin.IntressentregisterButton_Personkonto_Xpath(driver).click();
		PortalLoggedInAsAdmin.IntressentregisterButton_Organisationskonto_Xpath(driver).click();
		PortalLoggedInAsAdmin.IntressentregisterButton_OrganisationsAnsökningar_Xpath(driver).click();
		PortalLoggedInAsAdmin.IntressentregisterButton_Beredningsgruppsmedlemmar_Xpath(driver).click();
		PortalLoggedInAsAdmin.IntressentregisterButton_Granskarpool_Xpath(driver).click();
		PortalLoggedInAsAdmin.IntressentregisterButton_Arbetsgivare_Xpath(driver).click();	
	}

	@Test (dependsOnMethods={"ClickIntressentregisterButton"})
	public void ClickBeredningsgrupperButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER BEREDNINGSGRUPPER
		PortalLoggedInAsAdmin.BeredningsgrupperButton_Xpath(driver).click();
		PortalLoggedInAsAdmin.BeredningsgrupperButton_Beredningsgrupper_Xpath(driver).click();
		PortalLoggedInAsAdmin.BeredningsgrupperButton_Arvodeshantering_Xpath(driver).click();

	}

	//FORTSÄTT HÄRIFRÅN PÅ MÅNDAG! GÅ IGENOM ALLA KNAPPAR OCH SÅ
	@Test (dependsOnMethods={"ClickBeredningsgrupperButton"})
	public void ClickFormulärButton() {

		//KLICKAR PÅ FORMULÄR
		PortalLoggedInAsAdmin.FormulärButton_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickFormulärButton"})
	public void ClickFinansiärButton() {

		//KLICKAR PÅ FINANSIÄR
		PortalLoggedInAsAdmin.FinansiärButton_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickFinansiärButton"})
	public void ClickPortaladministrationButton() {

		//KLICKAR PÅ PORTALADMINISTRATION
		PortalLoggedInAsAdmin.PortaladministrationButton_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickPortaladministrationButton"})
	public void Logout() {

		//LOGGAR UT
		PortalLoggedInAsAdmin.LoggaUt_Xpath(driver).click();

	}


}


