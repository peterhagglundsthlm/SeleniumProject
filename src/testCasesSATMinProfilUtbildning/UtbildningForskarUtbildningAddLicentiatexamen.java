package testCasesSATMinProfilUtbildning;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import reusableMethods.DriverWaitExpectedConditions;
import reusableMethods.RandomDropDownOptionSelect;
import reusableMethods.SearchForOrganizationWhenButtonIdIsUnique;
import reusableMethods.driverSelect;

public class UtbildningForskarUtbildningAddLicentiatexamen extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Licentiatexamen";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();

	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickUtbildning() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning()).click();

	}

	@Test (dependsOnMethods={"ClickUtbildning"})
	public void ClickForskarUtbildning() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Forskarutbildning());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Forskarutbildning()).click();
	}


	@Test (dependsOnMethods={"ClickForskarUtbildning"})
	public void AddForskarUtbildning() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning()).click();
	}


	@Test (dependsOnMethods={"AddForskarUtbildning"})
	public void SelectOrganization() throws InterruptedException {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation());
		
		SearchForOrganizationWhenButtonIdIsUnique.EnterKeyInputs(driver, PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation(), "Uppsala Universitet");

	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void TypAvForskarUtbildningAddLicentiatexamen() {
		
		Select typ = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_TypDropDownForskarUtbildning());

		if (driver.getPageSource().contains("Forskarutbildning"))  
		{
			typ.selectByVisibleText("Licentiatexamen");
		}
		else if (driver.getPageSource().contains("Research education"))
		{
			typ.selectByVisibleText("Licentiate degree");
		}
	}

	@Test (dependsOnMethods={"TypAvForskarUtbildningAddLicentiatexamen"})
	public void Examensdatum() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum());
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum()).click();

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_LicentiatOchDoktorsexamenExamensdatum()).sendKeys("2019-04-21");
	}

	@Test (dependsOnMethods={"TypAvForskarUtbildningAddLicentiatexamen"})
	public void TypAvForskarUtbildningSelectSubjects() {

		Select ämne1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne1DropDownForskarUtbildning());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(ämne1, 1, 0);
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne2DropDownForskarUtbildning());
		
		Select ämne2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne2DropDownForskarUtbildning());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(ämne2, 1, 0);
	
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne3DropDownForskarUtbildning());
		
		Select ämne3 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne3DropDownForskarUtbildning());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(ämne3, 1, 0);

	}


	@Test (dependsOnMethods={"TypAvForskarUtbildningSelectSubjects"})
	public void WriteAvhandlingensTitelOrginalSpråk() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_AvhandlingensTitelOrginalspråk()).sendKeys("Test av avhandling");
	}

	@Test (dependsOnMethods={"WriteAvhandlingensTitelOrginalSpråk"})
	public void WriteAvhandlingensTitelEngelska() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_AvhandlingensTitelEngelska()).sendKeys("Test Dissertation title");
	}


	@Test (dependsOnMethods={"WriteAvhandlingensTitelEngelska"})
	public void ISSNISBNNummer() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_IssIsBnNummer()).sendKeys("12345678");
	}

	@Test (dependsOnMethods={"ISSNISBNNummer"})
	public void FörnamnHandledare() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_FörnamnHandledare()).sendKeys("Per");
	}

	@Test (dependsOnMethods={"FörnamnHandledare"})
	public void EfternamnHandledare() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_EfternamnHandledare()).sendKeys("Persson");
	}

	@Test (dependsOnMethods={"EfternamnHandledare"})
	public void SparaForskarutbildningKnapp() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SparaForskarUtbildningButton()).click();
	}
}
