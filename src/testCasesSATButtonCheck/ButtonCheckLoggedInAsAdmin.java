package testCasesSATButtonCheck;



import org.openqa.selenium.By;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsAdmin;
import pageElementsSAT.PortalLoggedInAsAdminBeredningsgrupper;
import pageElementsSAT.PortalLoggedInAsAdminFinansiär;
import pageElementsSAT.PortalLoggedInAsAdminFormulär;
import pageElementsSAT.PortalLoggedInAsAdminIntressentregister;
import pageElementsSAT.PortalLoggedInAsAdminMinProfil;
import pageElementsSAT.PortalLoggedInAsAdminPortalAdministration;


public class ButtonCheckLoggedInAsAdmin extends BeforeAfterTestBrowsers {

	@Test 
	public void LoginAsAdminUser() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsAdminMinProfil.MinProfilButton));
		
	}

	@Test (dependsOnMethods={"LoginAsAdminUser"})
	public void ClickMyProfileButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER MIN PROFIL
		PortalLoggedInAsAdminMinProfil.MinProfilButton(driver).click();
		PortalLoggedInAsAdminMinProfil.MinProfilButton_Inställningar(driver).click();
		PortalLoggedInAsAdminMinProfil.MinProfilButton_SWAMID_KONTO(driver).click();
	}

	@Test (dependsOnMethods={"ClickMyProfileButton"})
	public void ClickIntressentregisterButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER INTRESSENTREGISTER
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Personkonto(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Organisationskonto(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_OrganisationsAnsökningar(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Beredningsgruppsmedlemmar(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Granskarpool(driver).click();
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Arbetsgivare(driver).click();	
	}

	@Test (dependsOnMethods={"ClickIntressentregisterButton"})
	public void ClickBeredningsgrupperButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER BEREDNINGSGRUPPER
		PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton(driver).click();
		PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton_Beredningsgrupper(driver).click();
		PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton_Arvodeshantering(driver).click();

	}


	@Test (dependsOnMethods={"ClickBeredningsgrupperButton"})
	public void ClickFormulärButton() {


		PortalLoggedInAsAdminFormulär.FormulärButton(driver).click();
	}

	@Test (dependsOnMethods={"ClickFormulärButton"})
	public void FormulärKarolinskaInstitutet() {

		//KAROLINSKA
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsAdminFormulär.KarolinskaInstitutet));
		PortalLoggedInAsAdminFormulär.KarolinskaInstitutet(driver).click();
		PortalLoggedInAsAdminFormulär.KarolinskaInstitutetFormulär(driver).click();
		PortalLoggedInAsAdminFormulär.KarolinskaInstitutetSidmallar(driver).click();
		PortalLoggedInAsAdminFormulär.KarolinskaAvsnittsmallar(driver).click();
		PortalLoggedInAsAdminFormulär.KarolinskaUnderhållstabeller(driver).click();
		PortalLoggedInAsAdminFormulär.KarolinskaDataInställningar(driver).click();
		PortalLoggedInAsAdminFormulär.KarolinskaKontroller(driver).click();

	}

	@Test (dependsOnMethods={"FormulärKarolinskaInstitutet"})
	public void FormulärFormas() {


		//FORMAS
		PortalLoggedInAsAdminFormulär.Formas(driver).click();
		PortalLoggedInAsAdminFormulär.FormasFormulär(driver).click();
		PortalLoggedInAsAdminFormulär.FormasSidmallar(driver).click();
		PortalLoggedInAsAdminFormulär.FormasAvsnittsmallar(driver).click();
		PortalLoggedInAsAdminFormulär.FormasUnderhållstabeller(driver).click();
		PortalLoggedInAsAdminFormulär.FormasDatainställningar(driver).click();
		PortalLoggedInAsAdminFormulär.FormasKontroller(driver).click();

	}

	@Test (dependsOnMethods={"FormulärFormas"})
	public void FormulärVetenskapsrådet() {

		//VETENSKAPSRÅDET
		PortalLoggedInAsAdminFormulär.Vetenskapsrådet(driver).click();
		PortalLoggedInAsAdminFormulär.VetenskapsrådetFormulär(driver).click();
		PortalLoggedInAsAdminFormulär.VetenskapsrådetSidmallar(driver).click();
		PortalLoggedInAsAdminFormulär.VetenskapsrådetAvsnittsmallar(driver).click();
		PortalLoggedInAsAdminFormulär.VetenskapsrådetUnderhållstabeller(driver).click();
		PortalLoggedInAsAdminFormulär.VetenskapsrådetDataInställningar(driver).click();
		PortalLoggedInAsAdminFormulär.VetenskapsrådetKontroller(driver).click();

	}

	@Test (dependsOnMethods={"FormulärVetenskapsrådet"})
	public void FormulärForte() {

		//FORTE
		PortalLoggedInAsAdminFormulär.Forte(driver).click();
		PortalLoggedInAsAdminFormulär.ForteFormulär(driver).click();
		PortalLoggedInAsAdminFormulär.ForteSidmallar(driver).click();
		PortalLoggedInAsAdminFormulär.ForteAvsnittsmallar(driver).click();
		PortalLoggedInAsAdminFormulär.ForteUnderhållstabeller(driver).click();
		PortalLoggedInAsAdminFormulär.ForteDatainställningar(driver).click();
		PortalLoggedInAsAdminFormulär.ForteKontroller(driver).click();

	}

	@Test (dependsOnMethods={"FormulärForte"})
	public void FormulärSkolfi() {

		//SKOLFI
		PortalLoggedInAsAdminFormulär.Skolfi(driver).click();
		PortalLoggedInAsAdminFormulär.SkolfiFormulär(driver).click();
		PortalLoggedInAsAdminFormulär.SkolfiSidmallar(driver).click();
		PortalLoggedInAsAdminFormulär.SkolfiAvsnittsmallar(driver).click();
		PortalLoggedInAsAdminFormulär.SkolfiUnderhållstabeller(driver).click();
		PortalLoggedInAsAdminFormulär.SkolfiDatainställningar(driver).click();
		PortalLoggedInAsAdminFormulär.SkolfiKontroller(driver).click();

	}

	@Test (dependsOnMethods={"FormulärSkolfi"})
	public void FormulärEPN() {

		//EPN
		PortalLoggedInAsAdminFormulär.EPN(driver).click();
		PortalLoggedInAsAdminFormulär.EPNFormulär(driver).click();
		PortalLoggedInAsAdminFormulär.EPNSidmallar(driver).click();
		PortalLoggedInAsAdminFormulär.EPNAvsnittsmallar(driver).click();
		PortalLoggedInAsAdminFormulär.EPNUnderhållstabeller(driver).click();
		PortalLoggedInAsAdminFormulär.EPNDatainställningar(driver).click();
		PortalLoggedInAsAdminFormulär.EpnKontroller(driver).click();

	}

	@Test (dependsOnMethods={"FormulärEPN"})
	public void ClickFinansiärButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER FINANSIÄR
		PortalLoggedInAsAdminFinansiär.FinansiärButton(driver).click();

	}

	@Test (dependsOnMethods={"ClickFinansiärButton"})
	public void FinansiärKarolinskaInstitutet() {

		//KAROLINSKA INSTITUTET
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsAdminFinansiär.KarolinskaInstitutet));
		
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutet(driver).click();
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetFinansiärsinställningar(driver).click();
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetGranskarpoolinställningar(driver).click();
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetInternaAnvändare(driver).click();
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetArvodesinställningar(driver).click();
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetSINKAdministration(driver).click();
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetSöknycklar(driver).click();
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetOrganisationskontoansökningar(driver).click();
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetOrganisationskonton(driver).click();
		PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetInternaFörfråningar(driver).click();

	}

	@Test (dependsOnMethods={"FinansiärKarolinskaInstitutet"})
	public void FinansiärFormas() {

		//FORMAS
		PortalLoggedInAsAdminFinansiär.Formas(driver).click();
		PortalLoggedInAsAdminFinansiär.FormasFinansiärsinställningar(driver).click();
		PortalLoggedInAsAdminFinansiär.FormasGranskarpoolinställningar(driver).click();
		PortalLoggedInAsAdminFinansiär.FormasInternaAnvändare(driver).click();
		PortalLoggedInAsAdminFinansiär.FormasArvodesinställningar(driver).click();
		PortalLoggedInAsAdminFinansiär.FormasSINKAdministration(driver).click();
		PortalLoggedInAsAdminFinansiär.FormasSöknycklar(driver).click();
		PortalLoggedInAsAdminFinansiär.FormasOrganisationskontoansökningar(driver).click();
		PortalLoggedInAsAdminFinansiär.FormasOrganisationskonton(driver).click();
		PortalLoggedInAsAdminFinansiär.FormasInternaFörfråningar(driver).click();

	}

	@Test (dependsOnMethods={"FinansiärFormas"})
	public void FinansiärVetenskapsrådet() {


		//VETENSKAPSRÅDET
		PortalLoggedInAsAdminFinansiär.Vetenskapsrådet(driver).click();
		PortalLoggedInAsAdminFinansiär.VetenskapsrådetFinansiärsinställningar(driver).click();
		PortalLoggedInAsAdminFinansiär.VetenskapsrådetGranskarpoolinställningar(driver).click();
		PortalLoggedInAsAdminFinansiär.VetenskapsrådetInternaAnvändare(driver).click();
		PortalLoggedInAsAdminFinansiär.VetenskapsrådetArvodesinställningar(driver).click();
		PortalLoggedInAsAdminFinansiär.VetenskapsrådetSINKAdministration(driver).click();
		PortalLoggedInAsAdminFinansiär.VetenskapsrådetSöknycklar(driver).click();
		PortalLoggedInAsAdminFinansiär.VetenskapsrådetOrganisationskontoansökningar(driver).click();
		PortalLoggedInAsAdminFinansiär.VetenskapsrådetOrganisationskonton(driver).click();
		PortalLoggedInAsAdminFinansiär.VetenskapsrådetInternaFörfråningar(driver).click();

	}

	@Test (dependsOnMethods={"FinansiärVetenskapsrådet"})
	public void FinansiärForte() {

		//FORTE
		PortalLoggedInAsAdminFinansiär.Forte(driver).click();
		PortalLoggedInAsAdminFinansiär.ForteFinansiärsinställningar(driver).click();
		PortalLoggedInAsAdminFinansiär.ForteGranskarpoolinställningar(driver).click();
		PortalLoggedInAsAdminFinansiär.ForteInternaAnvändare(driver).click();
		PortalLoggedInAsAdminFinansiär.ForteArvodesinställningar(driver).click();
		PortalLoggedInAsAdminFinansiär.ForteSINKAdministration(driver).click();
		PortalLoggedInAsAdminFinansiär.ForteSöknycklar(driver).click();
		PortalLoggedInAsAdminFinansiär.ForteOrganisationskontoansökningar(driver).click();
		PortalLoggedInAsAdminFinansiär.ForteOrganisationskonton(driver).click();
		PortalLoggedInAsAdminFinansiär.ForteInternaFörfråningar(driver).click();

	}

	@Test (dependsOnMethods={"FinansiärForte"})
	public void FinansiärSkolfi() {

		//SKOLFI
		PortalLoggedInAsAdminFinansiär.Skolfi(driver).click();
		PortalLoggedInAsAdminFinansiär.SkolfiFinansiärsinställningar(driver).click();
		PortalLoggedInAsAdminFinansiär.SkolfiGranskarpoolinställningar(driver).click();
		PortalLoggedInAsAdminFinansiär.SkolfiInternaAnvändare(driver).click();
		PortalLoggedInAsAdminFinansiär.SkolfiArvodesinställningar(driver).click();
		PortalLoggedInAsAdminFinansiär.SkolfiSINKAdministration(driver).click();
		PortalLoggedInAsAdminFinansiär.SkolfiSöknycklar(driver).click();
		PortalLoggedInAsAdminFinansiär.SkolfiOrganisationskontoansökningar(driver).click();
		PortalLoggedInAsAdminFinansiär.SkolfiOrganisationskonton(driver).click();
		PortalLoggedInAsAdminFinansiär.SkolfiInternaFörfråningar(driver).click();

	}

	@Test (dependsOnMethods={"FinansiärSkolfi"})
	public void FinansiärEPN() {

		//EPN
		PortalLoggedInAsAdminFinansiär.EPN(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNFinansiärsinställningar(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNGranskarpoolinställningar(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNInternaAnvändare(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNArvodesinställningar(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNSINKAdministration(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNSöknycklar(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNOrganisationskontoansökningar(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNOrganisationskonton(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNInternaFörfråningar(driver).click();
		PortalLoggedInAsAdminFinansiär.EPNAvgiftskategorier(driver).click();
	}

	
	@Test (dependsOnMethods={"FinansiärEPN"})
	public void ClickPortaladministrationButton() {

		////KLICKAR PÅ ALLA RUBRIKER UNDER PORTALADMINISTRAION
		PortalLoggedInAsAdminPortalAdministration.PortaladministrationButton(driver).click();

		PortalLoggedInAsAdminPortalAdministration.Webbplatinställningar(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Portalanvändare(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Finansiärer(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Underhållstabeller(driver).click();
		PortalLoggedInAsAdminPortalAdministration.HierarkiskaUnderhållstabeller(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Språk(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Meddelanden(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Driftstatus(driver).click();
		PortalLoggedInAsAdminPortalAdministration.Statistik(driver).click();
	}

	@Test (dependsOnMethods={"ClickPortaladministrationButton"})
	public void Logout() {

		//LOGGAR UT
		PortalLoggedInAsAdmin.LoggaUt(driver).click();

	}


}


