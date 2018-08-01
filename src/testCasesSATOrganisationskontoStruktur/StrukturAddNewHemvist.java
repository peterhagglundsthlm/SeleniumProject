package testCasesSATOrganisationskontoStruktur;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;



public class StrukturAddNewHemvist extends BeforeAfterTestBrowsers {

	String TestCaseInfo = "Loggar in som en organisationskontoansvarig och lägger till en ny hemvist under fliken organisationskonto, sidan struktur.";

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

		int RandomNumber = 1 + (int)(Math.random() * 9999); 

		String SvenskNamnPåEnhet = "Autoskapad hemvist svenska: " + RandomNumber;
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

		int RandomNumber = 1 + (int)(Math.random() * 9999); 

		String EngelsktNamnPåEnhet = "Autoskapad hemvist engelska: " + RandomNumber;
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
	public void SparaNyHemvist() throws InterruptedException {

		Thread.sleep(1000);
		
		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånLäggTillNyEnhetKnapp(driver).click();
	
	}

}
