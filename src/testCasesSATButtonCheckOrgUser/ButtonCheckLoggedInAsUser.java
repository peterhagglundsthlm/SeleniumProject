package testCasesSATButtonCheckOrgUser;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationsuppgifter;
import pageElementsSAT.PortalLoggedInAsUserLoggaUt;
import pageElementsSAT.PortalLoggedInAsUserAnsökningarOchBidrag;
import pageElementsSAT.PortalLoggedInAsUserGranskning;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class ButtonCheckLoggedInAsUser extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en organisationsanvändare och testar att alla synliga knappar är klickbara";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test 
	public void LoginAsNormalUser() {

	}

	@Test (dependsOnMethods={"LoginAsNormalUser"})
	public void ClickStartButton() {

		//KLICKAR PÅ START
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Start()).click();
	}

	@Test (dependsOnMethods={"ClickStartButton"})
	public void ClickPersonuppgifterButton() {

		//KLICKAR PÅ PERSONUPPGIFTER
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Personuppgifter()).click();
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Start()).click();

	}

	@Test (dependsOnMethods={"ClickPersonuppgifterButton"})
	public void ClickUtbildningButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER UTBILDNING
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning()).click();
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Forskarutbildning()).click();
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivå()).click();


	}

	@Test (dependsOnMethods={"ClickUtbildningButton"})
	public void ClickArbetslivButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER ARBETSLIV
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv()).click();
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar()).click();
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Postdoktorvistelser()).click();
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Forskarutbyten()).click();
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningen()).click();
	}

	@Test (dependsOnMethods={"ClickArbetslivButton"})
	public void ClickPublikationerButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER PUBLIKATIONER
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer()).click();
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationer()).click();
	}

	@Test (dependsOnMethods={"ClickPublikationerButton"})
	public void ClickMeriterOchUtmärkelserButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER MERITER OCH UTMÄRKELSER
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser()).click();
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_Docentur()).click();
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersoner()).click();
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrens()).click();
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelser()).click();
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriter()).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtmärkelserButton"})
	public void ClickImmaterialrättButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER MERITER OCH UTMÄRKELSER
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Immaterialrätt()).click();
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Immaterialrätt_Immaterialrätt()).click();
	}

	@Test (dependsOnMethods={"ClickImmaterialrättButton"})
	public void ClickGranskarkompetensIfVisible() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER GRANSKARKOMPETENS
		while (driver.getPageSource().contains("Granskarkompetens")) {
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Granskarkompetens()).click();
			break;
		}
	}

	@Test (dependsOnMethods={"ClickGranskarkompetensIfVisible"})
	public void ClickAnsökningarOchBidrag() {

		//Klickar på alla knappar som finns på "Ansökningar och bidrag" sidan
		driver.findElement(PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragButton()).click();
		driver.findElement(PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragUtlysningarButton()).click();
		driver.findElement(PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragAnsokningar()).click();
		driver.findElement(PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragBidrag()).click();
		driver.findElement(PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragAnsökOmEtikprövning()).click();
		driver.findElement(PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragEtikprövningsansökningar()).click();
	}

	@Test (dependsOnMethods={"ClickAnsökningarOchBidrag"})
	public void ClickGranskning() {

		//Klickar på alla knappar som finns på "Granskning" sidan
		driver.findElement(PortalLoggedInAsUserGranskning.GranskningButton()).click();
		driver.findElement(PortalLoggedInAsUserGranskning.Granskning_Granskning()).click();
		driver.findElement(PortalLoggedInAsUserGranskning.GranskningBetalningsinformation()).click();
		driver.findElement(PortalLoggedInAsUserGranskning.GranskningArvoden()).click();
	}

	@Test (dependsOnMethods={"ClickGranskning"})
	public void ClickOrganisationsUppgifter() {

		//Klickar på alla knappar som finns på "ORGANISATIONSUPPGIFTER" SIDAN
		driver.findElement(PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter()).click();
		driver.findElement(PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter_Signera()).click();
		driver.findElement(PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter_Rapportera()).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationsUppgifter"})
	public void ClickOrganisationsKonto() {

		//Klickar på alla knappar som finns på "ORGANISATIONSKONTO" SIDAN
		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto()).click();
		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_AnsökningarOchBidrag()).click();
		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_AnsökningarOchBidrag()).click();
		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur()).click();
		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare()).click();
		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Byt_Hemvist()).click();
		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Föreslagen_Hemvist()).click();
		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Rapporteringsöversikt()).click();
		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Rapporteringsstruktur()).click();
		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Signeringsöversikt()).click();
		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Signeringsstruktur()).click();
		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Organisationsutlysningar()).click();
		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Organisationsansökningar()).click();
		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Utbetalningar()).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationsKonto"})
	public void Logout() {

		//LOGGAR UT

		driver.findElement(PortalLoggedInAsUserLoggaUt.LoggaUt()).click();
	}
}


