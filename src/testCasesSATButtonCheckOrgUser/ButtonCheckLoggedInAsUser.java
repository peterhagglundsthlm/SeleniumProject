package testCasesSATButtonCheckOrgUser;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationsuppgifter;
import pageElementsSAT.PortalLoggedInAsUserLoggaUt;
import pageElementsSAT.PortalLoggedInAsUserAnsökningarOchBidrag;
import pageElementsSAT.PortalLoggedInAsUserGranskning;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import reusableMethods.DriverWaitExpectedConditions;

public class ButtonCheckLoggedInAsUser extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en organisationsanvändare och testar att alla synliga knappar är klickbara";
		
	}

	@Test 
	public void ClickStartButton() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Start()).click();
	}

	@Test (dependsOnMethods={"ClickStartButton"})
	public void ClickPersonuppgifterButton() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Personuppgifter()).click();

	}

	@Test (dependsOnMethods={"ClickPersonuppgifterButton"})
	public void ClickUtbildningButton() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning()).click();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Forskarutbildning());
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Forskarutbildning()).click();
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivå()).click();


	}

	@Test (dependsOnMethods={"ClickUtbildningButton"})
	public void ClickArbetslivButton() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv()).click();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar());
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar()).click();
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Postdoktorvistelser()).click();
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Forskarutbyten()).click();
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningen()).click();
	}

	@Test (dependsOnMethods={"ClickArbetslivButton"})
	public void ClickPublikationerButton() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer()).click();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationer());
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationer()).click();
	}

	@Test (dependsOnMethods={"ClickPublikationerButton"})
	public void ClickMeriterOchUtmärkelserButton() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser()).click();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_Docentur());
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_Docentur()).click();
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersoner()).click();
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrens()).click();
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelser()).click();
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriter()).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtmärkelserButton"})
	public void ClickImmaterialrättButton() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialrätt()).click();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialrätt_Immaterialrätt());
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialrätt_Immaterialrätt()).click();
	}

	@Test (dependsOnMethods={"ClickImmaterialrättButton"})
	public void ClickGranskarkompetensIfVisible() {

		while (driver.getPageSource().contains("Granskarkompetens")) {
			driver.findElement(
					PortalLoggedInAsUserMinProfil.MinProfil_Granskarkompetens()).click();
			break;
		}
	}

	@Test (dependsOnMethods={"ClickGranskarkompetensIfVisible"})
	public void ClickAnsökningarOchBidrag() {

		driver.findElement(
				PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragButton()).click();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragUtlysningarButton());
		
		driver.findElement(
				PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragUtlysningarButton()).click();
		driver.findElement(
				PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragAnsokningar()).click();
		driver.findElement(
				PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragBidrag()).click();
		driver.findElement(
				PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragAnsökOmEtikprövning()).click();
		driver.findElement(
				PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragEtikprövningsansökningar()).click();
		driver.findElement(
				PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragÄndringsansökningar()).click();
	}

	@Test (dependsOnMethods={"ClickAnsökningarOchBidrag"})
	public void ClickGranskning() {

		driver.findElement(PortalLoggedInAsUserGranskning.GranskningButton()).click();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserGranskning.Granskning_Granskning());
		
		driver.findElement(
				PortalLoggedInAsUserGranskning.Granskning_Granskning()).click();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformation()).click();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningArvoden()).click();
	}

	@Test (dependsOnMethods={"ClickGranskning"})
	public void ClickOrganisationsUppgifter() {

		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter()).click();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter_Signera());
		
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter_Signera()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter_Rapportera()).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationsUppgifter"})
	public void ClickOrganisationsKonto() {

		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto()).click();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_AnsökningarOchBidrag());
		
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_AnsökningarOchBidrag()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Nedladdning()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Byt_Hemvist()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Föreslagen_Hemvist()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Rapporteringsöversikt()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Rapporteringsstruktur()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Signeringsöversikt()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Signeringsstruktur()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Organisationsutlysningar()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Organisationsansökningar()).click();
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Utbetalningar()).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationsKonto"})
	public void Logout() {

		driver.findElement(
				PortalLoggedInAsUserLoggaUt.LoggaUt()).click();
	}
}


