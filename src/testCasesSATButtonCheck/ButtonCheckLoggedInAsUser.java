package testCasesSATButtonCheck;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationsuppgifter;
import pageElementsSAT.PortalLoggedInAsUser;
import pageElementsSAT.PortalLoggedInAsUserAnsökningarOchBidrag;
import pageElementsSAT.PortalLoggedInAsUserGranskning;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class ButtonCheckLoggedInAsUser extends BeforeAfterTestBrowsers {

	@Test 
	public void LoginAsNormalUser() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil));
	}

	@Test (dependsOnMethods={"LoginAsNormalUser"})
	public void ClickStartButton() {

		//KLICKAR PÅ START
		PortalLoggedInAsUserMinProfil.MinProfil_Start(driver).click();
	}

	@Test (dependsOnMethods={"ClickStartButton"})
	public void ClickPersonuppgifterButton() {

		//KLICKAR PÅ PERSONUPPGIFTER
		PortalLoggedInAsUserMinProfil.MinProfil_Personuppgifter(driver).click();

	}

	@Test (dependsOnMethods={"ClickPersonuppgifterButton"})
	public void ClickUtbildningButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER UTBILDNING
		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Forskarutbildning(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivå(driver).click();

	}

	@Test (dependsOnMethods={"ClickUtbildningButton"})
	public void ClickArbetslivButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER ARBETSLIV
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Postdoktorvistelser(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Forskarutbyten(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningen(driver).click();

	}

	@Test (dependsOnMethods={"ClickArbetslivButton"})
	public void ClickPublikationerButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER PUBLIKATIONER
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationer(driver).click();

	}

	@Test (dependsOnMethods={"ClickPublikationerButton"})
	public void ClickMeriterOchUtmärkelserButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER MERITER OCH UTMÄRKELSER
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_Docentur(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersoner(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrens(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelser(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriter(driver).click();

	}

	@Test (dependsOnMethods={"ClickMeriterOchUtmärkelserButton"})
	public void ClickImmaterialrättButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER MERITER OCH UTMÄRKELSER
		PortalLoggedInAsUserMinProfil.MinProfil_Immaterialrätt(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Immaterialrätt_Immaterialrätt(driver).click();

	}


	@Test (dependsOnMethods={"ClickImmaterialrättButton"})
	public void ClickGranskarkompetensIfVisible() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER GRANSKARKOMPETENS
		while (driver.getPageSource().contains("Granskarkompetens")) {
			PortalLoggedInAsUserMinProfil.MinProfil_Granskarkompetens(driver).click();
			break;
		}
	}

	@Test (dependsOnMethods={"ClickGranskarkompetensIfVisible"})
	public void ClickAnsökningarOchBidrag() {

		//Klickar på alla knappar som finns på "Ansökningar och bidrag" sidan
		PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragButton(driver).click();
		PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragUtlysningarButton(driver).click();
		PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragAnsokningarButton(driver).click();
		PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragBidragButton(driver).click();
		PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragAnsökOmEtikprövning(driver).click();
		PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragEtikprövningsansökningar(driver).click();
	}

	@Test (dependsOnMethods={"ClickAnsökningarOchBidrag"})
	public void ClickGranskning() {

		//Klickar på alla knappar som finns på "Granskning" sidan
		PortalLoggedInAsUserGranskning.GranskningButton(driver).click();
		PortalLoggedInAsUserGranskning.Granskning_Granskning(driver).click();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformation(driver).click();
		PortalLoggedInAsUserGranskning.GranskningArvoden(driver).click();
	}

	@Test (dependsOnMethods={"ClickGranskning"})
	public void ClickOrganisationsUppgifter() {

		//Klickar på alla knappar som finns på "ORGANISATIONSUPPGIFTER" SIDAN
		PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter(driver).click();
		PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter_Signera(driver).click();
		PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter_Rapportera(driver).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationsUppgifter"})
	public void ClickOrganisationsKonto() {

		//Klickar på alla knappar som finns på "ORGANISATIONSKONTO" SIDAN
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_AnsökningarOchBidrag(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Nedladdning(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Byt_Hemvist(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Föreslagen_Hemvist(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Rapporteringsöversikt(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Rapporteringsstruktur(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Signeringsöversikt(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Signeringsstruktur(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Organisationsutlysningar(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Organisationsansökningar(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Utbetalningar(driver).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationsKonto"})
	public void Logout() {

		//LOGGAR UT
		PortalLoggedInAsUser.LoggaUt(driver).click();

	}

}


