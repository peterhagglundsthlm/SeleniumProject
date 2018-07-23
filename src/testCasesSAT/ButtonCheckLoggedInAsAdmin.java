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

	String TestCaseInfo = "Loggar in som en admin och testar att alla synliga knappar är klickbara";

	@Test 
	public void LoginAsAdminUser() {

		System.out.println("Testfall = " + TestCaseInfo);

		//Loggar in som användare kkprisma@yahoo.com
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome_Xpath(driver).click();
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


	@Test (dependsOnMethods={"ClickBeredningsgrupperButton"})
	public void ClickFormulärButton() {


		PortalLoggedInAsAdminFormulär.FormulärButton_CSS(driver).click();
	}

	@Test (dependsOnMethods={"ClickFormulärButton"})
	public void FormulärKarolinskaInstitutet() {

		//KAROLINSKA
		DriverWaitExpectedConditions.WebDriverWaitForExpectedCssSelectorLocator(driver, PortalLoggedInAsAdminFormulär.KarolinskaInstitutet_CSS);
		PortalLoggedInAsAdminFormulär.KarolinskaInstitutet_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.KarolinskaInstitutetFormulär_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.KarolinskaInstitutetSidmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.KarolinskaAvsnittsmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.KarolinskaUnderhållstabeller_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.KarolinskaDataInställningar_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.KarolinskaKontroller_CSS(driver).click();

	}

	@Test (dependsOnMethods={"FormulärKarolinskaInstitutet"})
	public void FormulärFormas() {


		//FORMAS
		PortalLoggedInAsAdminFormulär.Formas_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.FormasFormulär_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.FormasSidmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.FormasAvsnittsmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.FormasUnderhållstabeller_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.FormasDatainställningar_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.FormasKontroller_CSS(driver).click();

	}

	@Test (dependsOnMethods={"FormulärFormas"})
	public void FormulärVetenskapsrådet() {

		//VETENSKAPSRÅDET
		PortalLoggedInAsAdminFormulär.Vetenskapsrådet_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.VetenskapsrådetFormulär_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.VetenskapsrådetSidmallar_CSSS(driver).click();
		PortalLoggedInAsAdminFormulär.VetenskapsrådetAvsnittsmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.VetenskapsrådetUnderhållstabeller_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.VetenskapsrådetDataInställningar_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.VetenskapsrådetKontroller_CSS(driver).click();

	}

	@Test (dependsOnMethods={"FormulärVetenskapsrådet"})
	public void FormulärForte() {

		//FORTE
		PortalLoggedInAsAdminFormulär.Forte_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.ForteFormulär_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.ForteSidmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.ForteAvsnittsmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.ForteUnderhållstabeller_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.ForteDatainställningar_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.ForteKontroller_CSS(driver).click();

	}

	@Test (dependsOnMethods={"FormulärForte"})
	public void FormulärSkolfi() {

		//SKOLFI
		PortalLoggedInAsAdminFormulär.Skolfi_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.SkolfiFormulär_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.SkolfiSidmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.SkolfiAvsnittsmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.SkolfiUnderhållstabeller_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.SkolfiDatainställningar_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.SkolfiKontroller_CSS(driver).click();

	}

	@Test (dependsOnMethods={"FormulärSkolfi"})
	public void FormulärEPN() {

		//EPN
		PortalLoggedInAsAdminFormulär.EPN_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.EPNFormulär_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.EPNSidmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.EPNAvsnittsmallar_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.EPNUnderhållstabeller_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.EPNDatainställningar_CSS(driver).click();
		PortalLoggedInAsAdminFormulär.EpnKontroller_CSS(driver).click();

	}

	@Test (dependsOnMethods={"FormulärEPN"})
	public void ClickFinansiärButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER FINANSIÄR
		PortalLoggedInAsAdminFinansiär.FinansiärButton_CSS(driver).click();

	}

	@Test (dependsOnMethods={"ClickFinansiärButton"})
	public void FinansiärKarolinskaInstitutet() {

		//KAROLINSKA INSTITUTET
		DriverWaitExpectedConditions.WebDriverWaitForExpectedCssSelectorLocator(driver, PortalLoggedInAsAdminFinansiär.KarolinskaInstitutet_CSS);
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutet_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetFinansiärsinställningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetGranskarpoolinställningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetInternaAnvändare_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetArvodesinställningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetSINKAdministration_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetSöknycklar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetOrganisationskontoansökningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetOrganisationskonton_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetInternaFörfråningar_CSS(driver).click();

	}

	@Test (dependsOnMethods={"FinansiärKarolinskaInstitutet"})
	public void FinansiärFormas() {

		//FORMAS
		PortalLoggedInAsAdminFinansiär.Formas_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.FormasFinansiärsinställningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.FormasGranskarpoolinställningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.FormasInternaAnvändare_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.FormasArvodesinställningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.FormasSINKAdministration_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.FormasSöknycklar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.FormasOrganisationskontoansökningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.FormasOrganisationskonton_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.FormasInternaFörfråningar_CSS(driver).click();

	}

	@Test (dependsOnMethods={"FinansiärFormas"})
	public void FinansiärVetenskapsrådet() {


		//VETENSKAPSRÅDET
		PortalLoggedInAsAdminFinansiär.Vetenskapsrådet_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.VetenskapsrådetFinansiärsinställningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.VetenskapsrådetGranskarpoolinställningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.VetenskapsrådetInternaAnvändare_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.VetenskapsrådetArvodesinställningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.VetenskapsrådetSINKAdministration_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.VetenskapsrådetSöknycklar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.VetenskapsrådetOrganisationskontoansökningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.VetenskapsrådetOrganisationskonton_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.VetenskapsrådetInternaFörfråningar_CSS(driver).click();

	}

	@Test (dependsOnMethods={"FinansiärVetenskapsrådet"})
	public void FinansiärForte() {

		//FORTE
		PortalLoggedInAsAdminFinansiär.Forte_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.ForteFinansiärsinställningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.ForteGranskarpoolinställningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.ForteInternaAnvändare_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.ForteArvodesinställningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.ForteSINKAdministration_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.ForteSöknycklar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.ForteOrganisationskontoansökningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.ForteOrganisationskonton_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.ForteInternaFörfråningar_CSS(driver).click();

	}

	@Test (dependsOnMethods={"FinansiärForte"})
	public void FinansiärSkolfi() {

		//SKOLFI
		PortalLoggedInAsAdminFinansiär.Skolfi_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.SkolfiFinansiärsinställningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.SkolfiGranskarpoolinställningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.SkolfiInternaAnvändare_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.SkolfiArvodesinställningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.SkolfiSINKAdministration_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.SkolfiSöknycklar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.SkolfiOrganisationskontoansökningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.SkolfiOrganisationskonton_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.SkolfiInternaFörfråningar_CSS(driver).click();

	}

	@Test (dependsOnMethods={"FinansiärSkolfi"})
	public void FinansiärEPN() {

		//EPN
		PortalLoggedInAsAdminFinansiär.EPN_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNFinansiärsinställningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNGranskarpoolinställningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNInternaAnvändare_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNArvodesinställningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNSINKAdministration_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNSöknycklar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNOrganisationskontoansökningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNOrganisationskonton_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNInternaFörfråningar_CSS(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNAvgiftskategorier_CSS(driver).click();
	}

	
	@Test (dependsOnMethods={"FinansiärEPN"})
	public void ClickPortaladministrationButton() {

		////KLICKAR PÅ ALLA RUBRIKER UNDER PORTALADMINISTRAION
		PortalLoggedInAsAdminPortalAdministration.PortaladministrationButton_CSS(driver).click();

		PortalLoggedInAsAdminPortalAdministration.Webbplatinställningar_CSS(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Portalanvändare_CSS(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Finansiärer_CSS(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Underhållstabeller_CSS(driver).click();
		PortalLoggedInAsAdminPortalAdministration.HierarkiskaUnderhållstabeller_CSS(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Språk_CSS(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Meddelanden_CSS(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Driftstatus_CSS(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Statistik_CSS(driver).click();
	}

	@Test (dependsOnMethods={"ClickPortaladministrationButton"})
	public void Logout() {

		//LOGGAR UT
		PortalLoggedInAsAdmin.LoggaUt_Xpath(driver).click();

	}


}


