package testCasesSATOrganisationskontoStruktur;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsOrgUserOrganisationskonto;

public class StrukturCheckThatYouCantAddHemvistWithSameName extends BeforeAfterTestBrowsers {
	String StrukturHögstaNamn;

	String EngelsktNamnPåEnhetValue; String SvenskNamnPåEnhetValue;

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = 
				"Loggar in som en organisationskontoansvarig och försöker lägga till en hemvist med namn som redan finns. "
						+ "Testet kontrollerar att valideringsmeddelande visas korrekt";
	}

	@Test
	public void LoginAsUser() {

	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickOrganisationskonto() {

		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto()).click();
	}

	@Test (dependsOnMethods={"ClickOrganisationskonto"})
	public void ClickStruktur() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur());
		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur()).click();
	}

	@Test (dependsOnMethods={"ClickStruktur"})
	public void RedigeraHögstaNivån() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivån());

		WebElement StrukturHögstaNamnElement =  driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_HögstaNivåNamn()); 
		StrukturHögstaNamn = StrukturHögstaNamnElement.getText();

		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivån())
		.click();
	}

	@Test (dependsOnMethods={"RedigeraHögstaNivån"})
	public void NamnPåNyEnhet() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånSvensktNamnPåNyEnhet());
		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånSvensktNamnPåNyEnhet())
		.sendKeys(StrukturHögstaNamn);
		if (driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånSvensktNamnPåNyEnhet())
				.getAttribute("value") != StrukturHögstaNamn);{
					driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånSvensktNamnPåNyEnhet())
					.clear();
					driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånSvensktNamnPåNyEnhet())
					.sendKeys(StrukturHögstaNamn);}
	}

	@Test (dependsOnMethods={"NamnPåNyEnhet"})
	public void SparaNyHemvist() {

		driver.findElement(PortalLoggedInAsOrgUserOrganisationskonto.Organisationskonto_Struktur_RedigeraHögstaNivånLäggTillNyEnhetKnapp()).click();
	}

	@Test (dependsOnMethods={"SparaNyHemvist"})
	public void CheckForValidationMessage() throws InterruptedException {

		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.xpath("//*[@id=\"organizationStructureCreate\"]/div/ul/li"));

		if (driver.getPageSource().contains(("Det finns redan ett objekt i strukturen med namnet: " + "'"+StrukturHögstaNamn+"'")) 
				|| (driver.getPageSource().contains(("This object with name " + "'"+StrukturHögstaNamn+"' " + "already exists in the structure"))))  {
		}
		else 
		{
			Assert.fail();
		}
	}


}


