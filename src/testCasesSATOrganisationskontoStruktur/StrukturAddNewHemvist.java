package testCasesSATOrganisationskontoStruktur;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;
import reusableMethods.DriverWaitExpectedConditions;

public class StrukturAddNewHemvist extends BeforeAfterTestSetup {
	String EngelsktNamnPåEnhet; String SvenskNamnPåEnhet;

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en organisationskontoansvarig och lägger till en ny hemvist under fliken organisationskonto, sidan struktur";
	}

	@Test 
	public void ClickOrganisationskonto() {

		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto()).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationskonto"})
	public void ClickStruktur() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur());
		
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur()).click();
	}

	@Test (dependsOnMethods={"ClickStruktur"})
	public void RedigeraHögstaNivån() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivån());
		
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivån()).click();
	}

	@Test (dependsOnMethods={"RedigeraHögstaNivån"})
	public void SvensktNamnPåNyEnhet() {

		int RandomNumber = 1 + (int)(Math.random() * 9999); 
		SvenskNamnPåEnhet = "Autoskapad hemvist svenska: " + RandomNumber;
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånSvensktNamnPåNyEnhet()).sendKeys(SvenskNamnPåEnhet);
		if (driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånSvensktNamnPåNyEnhet()).getAttribute("value") != SvenskNamnPåEnhet); {
			driver.findElement(
					PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånSvensktNamnPåNyEnhet()).clear();
			driver.findElement(
					PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånSvensktNamnPåNyEnhet()).sendKeys(SvenskNamnPåEnhet); }
	}

	@Test (dependsOnMethods={"SvensktNamnPåNyEnhet"})
	public void EngelsktNamnPåNyEnhet() {

		int RandomNumber = 1 + (int)(Math.random() * 9999); 
		EngelsktNamnPåEnhet = "Autoskapad hemvist engelska: " + RandomNumber;
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånEngelsktNamnPåNyEnhet())
		.sendKeys(EngelsktNamnPåEnhet);
		if (driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånEngelsktNamnPåNyEnhet()).getAttribute("value") != EngelsktNamnPåEnhet);
		{
			driver.findElement(
					PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånEngelsktNamnPåNyEnhet()).clear();
			driver.findElement(
					PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånEngelsktNamnPåNyEnhet()).sendKeys(EngelsktNamnPåEnhet);
		}
	}

	@Test (dependsOnMethods={"EngelsktNamnPåNyEnhet"})
	public void SparaNyHemvist() throws InterruptedException  {

		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånLäggTillNyEnhetKnapp()).click();
		
		Thread.sleep(1000);
		
		driver.findElement(
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånLäggTillNyEnhetStäng()).click();
	}

	@Test (dependsOnMethods={"SparaNyHemvist"})
	public void KontrollerAttHemvistenHarLagtsTill() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivån());
		if (driver.getPageSource().contains(SvenskNamnPåEnhet)) {
			
		}
		else if (driver.getPageSource().contains(EngelsktNamnPåEnhet)) {
			
		}
		else {
			Assert.fail(); }
	}
}


