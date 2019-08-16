package testCasesSATMinProfilArbetsliv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import reusableMethods.CountRowsInTable;
import reusableMethods.DriverWaitExpectedConditions;
import reusableMethods.RandomDropDownOptionSelect;
import reusableMethods.SearchForOrganizationWhenButtonIdIsUnique;
import reusableMethods.driverSelect;

public class ArbetslivAddNewForskarutbyten extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till ett Forskarutbyte";
	}

	@Test
	public void LoginAsUser4() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser4"})
	public void ClickArbetsliv() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv());
		
		CountRowsInTable.CountTable(driver, By.xpath("//*[@id=\"ResearchExchangeViewSectionIdFormId\"]/table/tbody/tr"));

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv()).click();
	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void AddForskarUbyten() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenLäggTill());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenLäggTill()).click();
	}

	@Test (dependsOnMethods={"AddForskarUbyten"})
	public void SelectOrganization() throws InterruptedException {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenSökOrganisation());

		SearchForOrganizationWhenButtonIdIsUnique.EnterKeyInputs(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenSökOrganisation(), "Uppsala Universitet");

	}


	@Test (dependsOnMethods={"SelectOrganization"})
	public void Ämne() {

		Select ämne1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbyteÄmne1());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(ämne1, 1, 0);

		Select ämne2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbyteÄmne2());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(ämne2, 1, 0);

		Select ämne3 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbyteÄmne3());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(ämne3, 1, 0);

	}

	@Test (dependsOnMethods={"Ämne"})
	public void Typ() {

		Select Typ = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbyteTyp());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(Typ, 1, 0);
		
	}

	@Test (dependsOnMethods={"Typ"})
	public void PeriodStartOchSlutYear() {

		Select PeriodStartYear = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenPeriodStartYear());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(PeriodStartYear, 1, 1);

		Select PeriodEndYear = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenPeriodSlutYear());
		
		RandomDropDownOptionSelect.RandomOptionInDropdownPreviousDropDownPlusOne(PeriodEndYear);
	
	}

	@Test (dependsOnMethods={"PeriodStartOchSlutYear"})
	public void PeriodStartMonth() {

		Select PeriodStartMonth = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenPeriodStartMonth());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(PeriodStartMonth, 1, 0);
	}

	@Test (dependsOnMethods={"PeriodStartMonth"})
	public void PeriodEndMonth() {

		Select PeriodEndMonth = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenPeriodSlutMonth());
		
		RandomDropDownOptionSelect.RandomOptionInDropDown(PeriodEndMonth, 1, 0);
	}

	@Test (dependsOnMethods={"PeriodEndMonth"})
	public void SparaForskarUbyte() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenSpara()).click();
		
		CountRowsInTable.AddedRow(driver, By.xpath("//*[@id=\"ResearchExchangeViewSectionIdFormId\"]/table/tbody/tr"), PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenLäggTill());
	}
}

