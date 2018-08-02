package testCasesSATOrganisationskontoStruktur;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;



public class StrukturAddNewHemvist extends BeforeAfterTestBrowsers {
	String EngelsktNamnPåEnhetValue; String SvenskNamnPåEnhetValue;

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

			SvenskNamnPåEnhetValue = PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånSvensktNamnPåNyEnhet(driver).getAttribute("value");
			System.out.println("Svensk namn på enhet är = " + SvenskNamnPåEnhetValue); 
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

			EngelsktNamnPåEnhetValue = PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånEngelsktNamnPåNyEnhet(driver).getAttribute("value");
			System.out.println("Engelskt namn på enhet är = " + EngelsktNamnPåEnhetValue); 
		}
	}

	@Test (dependsOnMethods={"EngelsktNamnPåNyEnhet"})
	public void SparaNyHemvist() throws InterruptedException {

		Thread.sleep(1000);

		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånLäggTillNyEnhetKnapp(driver).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånLäggTillNyEnhetStäng));

		PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånLäggTillNyEnhetStäng(driver).click();

	}

	@Test (dependsOnMethods={"SparaNyHemvist"})
	public void KontrollerAttHemvistenHarLagtsTill() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivån));

		if (driver.getPageSource().contains((SvenskNamnPåEnhetValue)))
		{
			System.out.println("Den nya hemvisten finns nu i strukturen. Testet har lyckats");
		}
		else {
			String FailedTest = "Hemvisten har inte lagts till i strukturen. Testet har misslyckats";
			System.out.println(FailedTest);
			Assert.fail();
		}

	}

}
