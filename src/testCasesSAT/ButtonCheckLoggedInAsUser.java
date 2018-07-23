package testCasesSAT;



import org.testng.annotations.Test;
import Utility.UserCredentials;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsUser;
import pageObjectsSAT.PortalLoggedInAsOrgUserOrganisationskonto;
import pageObjectsSAT.PortalLoggedInAsOrgUserOrganisationsuppgifter;
import pageObjectsSAT.PortalLoggedInAsUserAnsökningarOchBidrag;
import pageObjectsSAT.PortalLoggedInAsUserGranskning;
import pageObjectsSAT.PortalLoggedInAsUserMinProfil;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class ButtonCheckLoggedInAsUser extends BeforeAfterTestBrowsers {

	String TestCaseInfo = "Loggar in som en organisationsanvändare och testar att alla synliga knappar är klickbara";

	@Test 
	public void LoginAsNormalUser() {

		System.out.println("Testfall = " + TestCaseInfo);

		//Loggar in som användare kkprisma@yahoo.com
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome_Xpath(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.kkprismayahooSATusername, UserCredentials.kkprismayahooSATpassword);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Xpath);
	}

	@Test (dependsOnMethods={"LoginAsNormalUser"})
	public void ClickStartButton() {

		//KLICKAR PÅ START
		PortalLoggedInAsUserMinProfil.MinProfil_Start_Xpath(driver).click();


	}

	@Test (dependsOnMethods={"ClickStartButton"})
	public void ClickPersonuppgifterButton() {

		//KLICKAR PÅ PERSONUPPGIFTER
		PortalLoggedInAsUserMinProfil.MinProfil_Personuppgifter_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickPersonuppgifterButton"})
	public void ClickUtbildningButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER UTBILDNING
		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Forskarutbildning_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivå_CSS(driver).click();

	}

	@Test (dependsOnMethods={"ClickUtbildningButton"})
	public void ClickArbetslivButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER ARBETSLIV
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Postdoktorvistelser_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Forskarutbyten_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningen_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickArbetslivButton"})
	public void ClickPublikationerButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER PUBLIKATIONER
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationer_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickPublikationerButton"})
	public void ClickMeriterOchUtmärkelserButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER MERITER OCH UTMÄRKELSER
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_Docentur_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersoner_Xpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrens_XpathXpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelser_XpathXpath(driver).click();
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriter_Xpath(driver).click();

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
		PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragButton_CSS(driver).click();
		PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragUtlysningarButton_Xpath(driver).click();
		PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragAnsokningarButton_Xpath(driver).click();
		PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragBidragButton_Xpath(driver).click();
		PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragAnsökOmEtikprövning_Xpath(driver).click();
		PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragEtikprövningsansökningar_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickAnsökningarOchBidrag"})
	public void ClickGranskning() {

		//Klickar på alla knappar som finns på "Granskning" sidan
		PortalLoggedInAsUserGranskning.GranskningButton_CSS(driver).click();
		PortalLoggedInAsUserGranskning.Granskning_Granskning_Xpath(driver).click();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformation_Xpath(driver).click();
		PortalLoggedInAsUserGranskning.GranskningArvoden_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickGranskning"})
	public void ClickOrganisationsUppgifter() {

		//Klickar på alla knappar som finns på "ORGANISATIONSUPPGIFTER" SIDAN
		PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter_CSS(driver).click();
		PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter_Signera_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationsuppgifter.Organisationsuppifter_Rapportera_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationsUppgifter"})
	public void ClickOrganisationsKonto() {

		//Klickar på alla knappar som finns på "ORGANISATIONSKONTO" SIDAN
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_CSS(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_AnsökningarOchBidrag_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Nedladdning_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Användare_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Byt_Hemvist_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Föreslagen_Hemvist_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Rapporteringsöversikt_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Rapporteringsstruktur_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Signeringsöversikt_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Signeringsstruktur_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Organisationsutlysningar_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Organisationsansökningar_Xpath(driver).click();
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Utbetalningar_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationsKonto"})
	public void Logout() {

		//LOGGAR UT
		PortalLoggedInAsUser.LoggaUt_Xpath(driver).click();

	}

}


