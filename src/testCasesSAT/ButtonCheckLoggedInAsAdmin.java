package testCasesSAT;


import org.testng.annotations.Test;
import Utility.UserCredentials;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsAdminMinProfil;
import pageObjectsSAT.PortalLoggedInAsAdminPortalAdministration;
import pageObjectsSAT.PortalLoggedInAsAdmin;
import pageObjectsSAT.PortalLoggedInAsAdminBeredningsgrupper;
import pageObjectsSAT.PortalLoggedInAsAdminFinansiär;
import pageObjectsSAT.PortalLoggedInAsAdminFormulär;
import pageObjectsSAT.PortalLoggedInAsAdminIntressentregister;
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
		PortalLoggedInAsAdminMinProfil.MinProfilButton_CSS(driver).click();
		PortalLoggedInAsAdminMinProfil.MinProfilButton_Inställningar_Xpath(driver).click();
		PortalLoggedInAsAdminMinProfil.MinProfilButton_SWAMID_KONTO_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickMyProfileButton"})
	public void ClickIntressentregisterButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER INTRESSENTREGISTER
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_CSS(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Personkonto_Xpath(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Organisationskonto_Xpath(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_OrganisationsAnsökningar_Xpath(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Beredningsgruppsmedlemmar_Xpath(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Granskarpool_Xpath(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Arbetsgivare_Xpath(driver).click();	
	}

	@Test (dependsOnMethods={"ClickIntressentregisterButton"})
	public void ClickBeredningsgrupperButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER BEREDNINGSGRUPPER
		PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton_CSS(driver).click();
		PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton_Beredningsgrupper_Xpath(driver).click();
		PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton_Arvodeshantering_Xpath(driver).click();

	}

	//FORTSÄTT HÄRIFRÅN PÅ MÅNDAG! GÅ IGENOM ALLA KNAPPAR OCH SÅ
	@Test (dependsOnMethods={"ClickBeredningsgrupperButton"})
	public void ClickFormulärButton() {

		//KLICKAR PÅ FORMULÄR
		PortalLoggedInAsAdminFormulär.FormulärButton_CSS(driver).click();
	}

	@Test (dependsOnMethods={"ClickFormulärButton"})
	public void ClickFinansiärButton() {

		//KLICKAR PÅ FINANSIÄR
		PortalLoggedInAsAdminFinansiär.FinansiärButton_CSS(driver).click();
	}

	@Test (dependsOnMethods={"ClickFinansiärButton"})
	public void ClickPortaladministrationButton() {

		//KLICKAR PÅ PORTALADMINISTRATION
		PortalLoggedInAsAdminPortalAdministration.PortaladministrationButton_CSS(driver).click();

	}

	@Test (dependsOnMethods={"ClickPortaladministrationButton"})
	public void Logout() {

		//LOGGAR UT
		PortalLoggedInAsAdmin.LoggaUt_Xpath(driver).click();

	}


}


