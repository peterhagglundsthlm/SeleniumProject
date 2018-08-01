package testCasesSATOrganisationskontoStruktur;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;

public class StrukturCheckThatYouCantAddHemvistWithSameName extends BeforeAfterTestBrowsers {
	String EngelsktNamnPåEnhet; String SvenskNamnPåEnhet;


	String TestCaseInfo = "Loggar in som en organisationskontoansvarig och förösker lägga till en hemvist med namn som redan finns. Testet kontrollerar att valideringsmeddelande visas korrekt.";

	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto));

	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickOrganisationskonto() {

		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto(driver).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationskonto"})
	public void ClickStruktur() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur));
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur(driver).click();
	}

	@Test (dependsOnMethods={"ClickStruktur"})
	public void RedigeraHögstaNivån() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivån));
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivån(driver).click();
	}

	@Test (dependsOnMethods={"RedigeraHögstaNivån"})
	public void SvensktNamnPåNyEnhet() {

		SvenskNamnPåEnhet = "Jordens Coolaste Hjältar";
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånSvensktNamnPåNyEnhet(driver).sendKeys(SvenskNamnPåEnhet);

		if (PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånSvensktNamnPåNyEnhet(driver).getAttribute("value") != SvenskNamnPåEnhet);
		{
			PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånSvensktNamnPåNyEnhet(driver).clear();
			PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånSvensktNamnPåNyEnhet(driver).sendKeys(SvenskNamnPåEnhet);

			String SvenskNamnPåEnhetString = PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånSvensktNamnPåNyEnhet(driver).getAttribute("value");
			System.out.println("Svensk namn på enhet är = " + SvenskNamnPåEnhetString); 
		}


	}

	@Test (dependsOnMethods={"SvensktNamnPåNyEnhet"})
	public void EngelsktNamnPåNyEnhet() {

		EngelsktNamnPåEnhet = "Earths Coolest Heroes";
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånEngelsktNamnPåNyEnhet(driver).sendKeys(EngelsktNamnPåEnhet);

		if (PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånEngelsktNamnPåNyEnhet(driver).getAttribute("value") != EngelsktNamnPåEnhet);
		{
			PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånEngelsktNamnPåNyEnhet(driver).clear();
			PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånEngelsktNamnPåNyEnhet(driver).sendKeys(EngelsktNamnPåEnhet);

			String EngelsktNamnPåEnhetString = PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånEngelsktNamnPåNyEnhet(driver).getAttribute("value");
			System.out.println("Engelskt namn på enhet är = " + EngelsktNamnPåEnhetString); 
		}
	}

	@Test (dependsOnMethods={"EngelsktNamnPåNyEnhet"})
	public void SparaNyHemvist() {

		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånLäggTillNyEnhetKnapp(driver).click();
	}

	@Test (dependsOnMethods={"SparaNyHemvist"})
	public void CheckForValidationMessage() throws InterruptedException {

		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.cssSelector("#organizationStructureCreate > div > ul > li:nth-child(1)"));
		
		if (driver.getPageSource().contains(("Det finns redan ett objekt i strukturen med namnet: " + "'"+EngelsktNamnPåEnhet+"'")) && (driver.getPageSource().contains(("Det finns redan ett objekt i strukturen med namnet: " + "'"+SvenskNamnPåEnhet+"'"))))  {

			System.out.println("Felmeddelande visas korrekt både på svenska och engelska. Testet har lyckats"); 

		} else {

			Assert.fail("Felmeddelandet visas inte korrekt. Testet har misslyckats");
		}
	}


}


