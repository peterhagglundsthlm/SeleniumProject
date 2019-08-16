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

public class UtbildningForskarUtbildningAddForskningskompetensMotsvarandeDoktorsexamen extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Forskningskompetens Motsvarande Doktorsexamen";
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
	public void TypAvForskarUtbildningAddForskningskompetensMotsvarandeDoktorsexamen() {

		Select typ = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_TypDropDownForskarUtbildning());

		if (driver.getPageSource().contains("Forskarutbildning"))  
		{
			typ.selectByVisibleText("Forskningskompetens motsvarande Doktorsexamen");
		}
		else if (driver.getPageSource().contains("Research education"))
		{
			typ.selectByVisibleText("Research competence corresponding to PhD degree");
		}
	}

	@Test (dependsOnMethods={"TypAvForskarUtbildningAddForskningskompetensMotsvarandeDoktorsexamen"})
	public void Examensdatum() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_DatumNärForskningskompetensUppnåtts());
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_DatumNärForskningskompetensUppnåtts()).click();

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_DatumNärForskningskompetensUppnåtts()).sendKeys("2018-05-15");

	}

	@Test (dependsOnMethods={"Examensdatum"})
	public void TypAvForskarUtbildningSelectSubjects() throws InterruptedException {

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
	public void BeskrivningAvKompetensSvenska() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensSV()).sendKeys("TestSvenska");
	}

	@Test (dependsOnMethods={"BeskrivningAvKompetensSvenska"})
	public void BeskrivningAvKompetensEngelska() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensEN()).sendKeys("TestEngelska");
	}
	
	@Test (dependsOnMethods={"BeskrivningAvKompetensEngelska"})
	public void SparaForskarutbildningKnapp() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamenButton()).click();
	}
}