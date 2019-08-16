package testCasesSATButtonCheckAdmin;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsAdminAndUserLoggaUt;
import pageElementsSAT.PortalLoggedInAsAdminBeredningsgrupper;
import pageElementsSAT.PortalLoggedInAsAdminFinansiär;
import pageElementsSAT.PortalLoggedInAsAdminFormulär;
import pageElementsSAT.PortalLoggedInAsAdminIntressentregister;
import pageElementsSAT.PortalLoggedInAsAdminMinProfil;
import pageElementsSAT.PortalLoggedInAsAdminPortalAdministration;
import reusableMethods.CheckIfElementIsPresentOnPage;
import reusableMethods.DriverWaitExpectedConditions;


public class ButtonCheckLoggedInAsAdmin extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = 
				"Loggar in som en admin och testar att alla synliga knappar är klickbara";
	}

	@Test
	public void ClickMyProfileButton() {

		driver.findElement(
				PortalLoggedInAsAdminMinProfil.MinProfilButton()).click();

	}
	
	@Test (dependsOnMethods={"ClickMyProfileButton"})
	public void ClickInställningar() {
		
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminMinProfil.MinProfilButton_Inställningar());

		driver.findElement(
				PortalLoggedInAsAdminMinProfil.MinProfilButton_Inställningar()).click();

		CheckIfElementIsPresentOnPage.test(driver, By.id("OldPassword"));

		driver.findElement(
				PortalLoggedInAsAdminMinProfil.MinProfilButton_SWAMID_KONTO()).click();
		
	}

	@Test (dependsOnMethods={"ClickInställningar"})
	public void ClickIntressentregisterButton() {


		driver.findElement(
				PortalLoggedInAsAdminIntressentregister.IntressentregisterButton()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Personkonto());

		driver.findElement(
				PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Personkonto()).click();

		driver.findElement(
				PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Organisationskonto()).click();

		driver.findElement(
				PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_OrganisationsAnsökningar()).click();

		driver.findElement(
				PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Beredningsgruppsmedlemmar()).click();

		driver.findElement(
				PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Granskarpool()).click();

		driver.findElement(
				PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_Arbetsgivare()).click();
	}

	@Test (dependsOnMethods={"ClickIntressentregisterButton"})
	public void ClickBeredningsgrupperButton() {

		driver.findElement(
				PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton_Beredningsgrupper());

		driver.findElement(
				PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton_Beredningsgrupper()).click();
		driver.findElement(
				PortalLoggedInAsAdminBeredningsgrupper.BeredningsgrupperButton_Arvodeshantering()).click();
	}

	@Test (dependsOnMethods={"ClickBeredningsgrupperButton"})
	public void ClickFormulärButton() {

		driver.findElement(
				PortalLoggedInAsAdminFormulär.FormulärButton()).click();
	}

	@Test (dependsOnMethods={"ClickFormulärButton"})
	public void FormulärKarolinskaInstitutet() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFormulär.KarolinskaInstitutet());

		driver.findElement(
				PortalLoggedInAsAdminFormulär.KarolinskaInstitutet()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFormulär.KarolinskaInstitutetFormulär());

		driver.findElement(
				PortalLoggedInAsAdminFormulär.KarolinskaInstitutetFormulär()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.KarolinskaInstitutetSidmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.KarolinskaAvsnittsmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.KarolinskaUnderhållstabeller()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.KarolinskaDataInställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.KarolinskaKontroller()).click();
	}

	@Test (dependsOnMethods={"FormulärKarolinskaInstitutet"})
	public void FormulärFormas() {

		driver.findElement(
				PortalLoggedInAsAdminFormulär.Formas()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFormulär.FormasFormulär());

		driver.findElement(
				PortalLoggedInAsAdminFormulär.FormasFormulär()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.FormasSidmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.FormasAvsnittsmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.FormasUnderhållstabeller()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.FormasDatainställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.FormasKontroller()).click();
	}

	@Test (dependsOnMethods={"FormulärFormas"})
	public void FormulärVetenskapsrådet() {

		driver.findElement(
				PortalLoggedInAsAdminFormulär.Vetenskapsrådet()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFormulär.VetenskapsrådetFormulär());

		driver.findElement(
				PortalLoggedInAsAdminFormulär.VetenskapsrådetFormulär()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.VetenskapsrådetSidmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.VetenskapsrådetAvsnittsmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.VetenskapsrådetUnderhållstabeller()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.VetenskapsrådetDataInställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.VetenskapsrådetKontroller()).click();
	}

	@Test (dependsOnMethods={"FormulärVetenskapsrådet"})
	public void FormulärForte() {

		driver.findElement(
				PortalLoggedInAsAdminFormulär.Forte()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFormulär.ForteFormulär());

		driver.findElement(
				PortalLoggedInAsAdminFormulär.ForteFormulär()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.ForteSidmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.ForteAvsnittsmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.ForteUnderhållstabeller()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.ForteDatainställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.ForteKontroller()).click();
	}

	@Test (dependsOnMethods={"FormulärForte"})
	public void FormulärSkolfi() {

		driver.findElement(
				PortalLoggedInAsAdminFormulär.Skolfi()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFormulär.SkolfiFormulär());

		driver.findElement(
				PortalLoggedInAsAdminFormulär.SkolfiFormulär()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.SkolfiSidmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.SkolfiAvsnittsmallar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.SkolfiUnderhållstabeller()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.SkolfiDatainställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFormulär.SkolfiKontroller()).click();
	}

	@Test (dependsOnMethods={"FormulärSkolfi"})
	public void FormulärEPN() {

		//EPN
		/*PortalLoggedInAsAdminFormulär.EPN(driver).click();
		PortalLoggedInAsAdminFormulär.EPNFormulär(driver).click();
		PortalLoggedInAsAdminFormulär.EPNSidmallar(driver).click();
		PortalLoggedInAsAdminFormulär.EPNAvsnittsmallar(driver).click();
		PortalLoggedInAsAdminFormulär.EPNUnderhållstabeller(driver).click();
		PortalLoggedInAsAdminFormulär.EPNDatainställningar(driver).click();
		PortalLoggedInAsAdminFormulär.EpnKontroller(driver).click();
		 */
	}

	@Test (dependsOnMethods={"FormulärEPN"})
	public void ClickFinansiärButton() {

		driver.findElement(
				PortalLoggedInAsAdminFinansiär.FinansiärButton()).click();
	}

	@Test (dependsOnMethods={"ClickFinansiärButton"})
	public void FinansiärKarolinskaInstitutet() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFinansiär.KarolinskaInstitutet());

		driver.findElement(
				PortalLoggedInAsAdminFinansiär.KarolinskaInstitutet()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetFinansiärsinställningar());

		driver.findElement(
				PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetFinansiärsinställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetGranskarpoolinställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetInternaAnvändare()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetArvodesinställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetSINKAdministration()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetSöknycklar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetOrganisationskontoansökningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetOrganisationskonton()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.KarolinskaInstitutetInternaFörfråningar()).click();
	}

	@Test (dependsOnMethods={"FinansiärKarolinskaInstitutet"})
	public void FinansiärFormas() {

		driver.findElement(
				PortalLoggedInAsAdminFinansiär.Formas()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFinansiär.FormasFinansiärsinställningar());

		driver.findElement(
				PortalLoggedInAsAdminFinansiär.FormasFinansiärsinställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.FormasGranskarpoolinställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.FormasInternaAnvändare()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.FormasArvodesinställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.FormasSINKAdministration()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.FormasSöknycklar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.FormasOrganisationskontoansökningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.FormasOrganisationskonton()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.FormasInternaFörfråningar()).click();
	}

	@Test (dependsOnMethods={"FinansiärFormas"})
	public void FinansiärVetenskapsrådet() {

		driver.findElement(
				PortalLoggedInAsAdminFinansiär.Vetenskapsrådet()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFinansiär.VetenskapsrådetFinansiärsinställningar());

		driver.findElement(
				PortalLoggedInAsAdminFinansiär.VetenskapsrådetFinansiärsinställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.VetenskapsrådetGranskarpoolinställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.VetenskapsrådetInternaAnvändare()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.VetenskapsrådetArvodesinställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.VetenskapsrådetSINKAdministration()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.VetenskapsrådetSöknycklar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.VetenskapsrådetOrganisationskontoansökningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.VetenskapsrådetOrganisationskonton()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.VetenskapsrådetInternaFörfråningar()).click();
	}

	@Test (dependsOnMethods={"FinansiärVetenskapsrådet"})
	public void FinansiärForte() {

		driver.findElement(
				PortalLoggedInAsAdminFinansiär.Forte()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFinansiär.ForteFinansiärsinställningar());

		driver.findElement(
				PortalLoggedInAsAdminFinansiär.ForteFinansiärsinställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.ForteGranskarpoolinställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.ForteInternaAnvändare()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.ForteArvodesinställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.ForteSINKAdministration()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.ForteSöknycklar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.ForteOrganisationskontoansökningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.ForteOrganisationskonton()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.ForteInternaFörfråningar()).click();
	}

	@Test (dependsOnMethods={"FinansiärForte"})
	public void FinansiärSkolfi() {

		driver.findElement(
				PortalLoggedInAsAdminFinansiär.Skolfi()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminFinansiär.SkolfiFinansiärsinställningar());

		driver.findElement(
				PortalLoggedInAsAdminFinansiär.SkolfiFinansiärsinställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.SkolfiGranskarpoolinställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.SkolfiInternaAnvändare()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.SkolfiArvodesinställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.SkolfiSINKAdministration()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.SkolfiSöknycklar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.SkolfiOrganisationskontoansökningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.SkolfiOrganisationskonton()).click();
		driver.findElement(
				PortalLoggedInAsAdminFinansiär.SkolfiInternaFörfråningar()).click();
	}

	@Test (dependsOnMethods={"FinansiärSkolfi"})
	public void FinansiärEPN() {

		//EPN
		/*
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
		 */
	}

	@Test (dependsOnMethods={"FinansiärEPN"})
	public void ClickPortaladministrationButton() {

		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.PortaladministrationButton()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsAdminPortalAdministration.Webbplatinställningar());

		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.Webbplatinställningar()).click();
		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.Portalanvändare()).click();
		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.Finansiärer()).click();
		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.Underhållstabeller()).click();
		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.HierarkiskaUnderhållstabeller()).click();
		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.Språk()).click();
		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.Meddelanden()).click();
		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.Driftstatus()).click();
		driver.findElement(
				PortalLoggedInAsAdminPortalAdministration.Statistik()).click();
	}

	@Test (dependsOnMethods={"ClickPortaladministrationButton"})
	public void Logout() {

		driver.findElement(
				PortalLoggedInAsAdminAndUserLoggaUt.LoggaUtButton()).click();
	}
}


