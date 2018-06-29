package testCasesSAT;



import org.testng.annotations.Test;
import Utility.UserCredentials;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsUser;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class ButtonCheckLoggedInAsUser extends BeforeAfterTestBrowsers {

	@Test 
	public void LoginAsNormalUser() {

		//Loggar in som användare kkprisma@yahoo.com
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.kkprismayahooSATusername, UserCredentials.kkprismayahooSATpassword);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, PortalLoggedInAsUser.MinProfil_Start_Xpath);
	}

	@Test (dependsOnMethods={"LoginAsNormalUser"})
	public void ClickStartButton() {

		//KLICKAR PÅ START
		PortalLoggedInAsUser.MinProfil_Start_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickStartButton"})
	public void ClickPersonuppgifterButton() {

		//KLICKAR PÅ PERSONUPPGIFTER
		PortalLoggedInAsUser.MinProfil_Personuppgifter_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickPersonuppgifterButton"})
	public void ClickUtbildningButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER UTBILDNING
		PortalLoggedInAsUser.MinProfil_Utbildning_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_Utbildning_Forskarutbildning_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_Utbildning_UtbildningPåGrundOch_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickUtbildningButton"})
	public void ClickArbetslivButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER ARBETSLIV
		PortalLoggedInAsUser.MinProfil_Arbetsliv_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_Arbetsliv_Anställningar_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_Arbetsliv_Postdoktorvistelser_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_Arbetsliv_Forskarutbyten_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_Arbetsliv_UppehållIForskningen_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickArbetslivButton"})
	public void ClickPublikationerButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER PUBLIKATIONER
		PortalLoggedInAsUser.MinProfil_Publikationer_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_Publikationer_Publikationer_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickPublikationerButton"})
	public void ClickMeriterOchUtmärkelserButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER MERITER OCH UTMÄRKELSER
		PortalLoggedInAsUser.MinProfil_MeriterOchUtmärkelser_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_MeriterOchUtmärkelser_Docentur_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_MeriterOchUtmärkelser_HandleddaPersoner_Xpath(driver).click();
		PortalLoggedInAsUser.MinProfil_MeriterOchUtmärkelser_BidragErHållnaiKonkurrens_XpathXpath(driver).click();
		PortalLoggedInAsUser.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelser_XpathXpath(driver).click();
		PortalLoggedInAsUser.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriter_Xpath(driver).click();

	}

	@Test (dependsOnMethods={"ClickMeriterOchUtmärkelserButton"})
	public void ClickImmaterialrättButton() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER MERITER OCH UTMÄRKELSER
		PortalLoggedInAsUser.MinProfil_Immaterialrätt(driver).click();
		PortalLoggedInAsUser.MinProfil_Immaterialrätt_Immaterialrätt(driver).click();

	}


	@Test (dependsOnMethods={"ClickImmaterialrättButton"})
	public void ClickGranskarkompetens() {

		//KLICKAR PÅ ALLA RUBRIKER UNDER GRANSKARKOMPETENS
		while (driver.getPageSource().contains("Granskarkompetens")) {
			PortalLoggedInAsUser.MinProfil_Granskarkompetens(driver).click();
			break;
		}
	}

	@Test (dependsOnMethods={"ClickGranskarkompetens"})
	public void ClickAnsökningarOchBidrag() {

		//Klickar på alla knappar som finns på "Ansökningar och bidrag" sidan
		PortalLoggedInAsUser.AnsokningarOchBidragButton_Xpath(driver).click();
		PortalLoggedInAsUser.AnsokningarOchBidragUtlysningarButton_Xpath(driver).click();
		PortalLoggedInAsUser.AnsokningarOchBidragAnsokningarButton_Xpath(driver).click();
		PortalLoggedInAsUser.AnsokningarOchBidragBidragButton_Xpath(driver).click();
		PortalLoggedInAsUser.AnsokningarOchBidragAnsökOmEtikprövning_Xpath(driver).click();
		PortalLoggedInAsUser.AnsokningarOchBidragEtikprövningsansökningar_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickAnsökningarOchBidrag"})
	public void ClickGranskning() {

		//Klickar på alla knappar som finns på "Granskning" sidan
		PortalLoggedInAsUser.GranskningButton_Xpath(driver).click();
		PortalLoggedInAsUser.Granskning_Granskning_Xpath(driver).click();
		PortalLoggedInAsUser.GranskningBetalningsinformation_Xpath(driver).click();
		PortalLoggedInAsUser.GranskningArvoden_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickGranskning"})
	public void ClickOrganisationsUppgifter() {

		//Klickar på alla knappar som finns på "ORGANISATIONSUPPGIFTER" SIDAN
		PortalLoggedInAsUser.Organisationsuppifter_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationsuppifter_Signera_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationsuppifter_Rapportera_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationsUppgifter"})
	public void ClickOrganisationsKonto() {

		//Klickar på alla knappar som finns på "ORGANISATIONSKONTO" SIDAN
		PortalLoggedInAsUser.Organisationskonto_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_AnsökningarOchBidrag_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Nedladdning_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Struktur_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Användare_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Byt_Hemvist_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Föreslagen_Hemvist_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Rapporteringsöversikt_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Rapporteringsstruktur_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Signeringsöversikt_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Signeringsstruktur_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Organisationsutlysningar_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Organisationsansökningar_Xpath(driver).click();
		PortalLoggedInAsUser.Organisationskonto_Utbetalningar_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationsKonto"})
	public void Logout() {

		//LOGGAR UT
		PortalLoggedInAsUser.LoggaUt_Xpath(driver).click();

	}

}


