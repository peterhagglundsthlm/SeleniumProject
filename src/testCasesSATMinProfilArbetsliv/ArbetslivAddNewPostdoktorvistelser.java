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

public class ArbetslivAddNewPostdoktorvistelser extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Postdoktorvistelser";
	}

	@Test
	public void LoginAsUser3() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser3"})
	public void ClickArbetsliv() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv()).click();
	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void AddPostdoktorvistelser() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserLäggTill());
		
		CountRowsInTable.CountTable(driver, By.xpath("//*[@id=\"postDoctorialViewSectionIdFormId\"]/table/tbody/tr"));

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserLäggTill()).click();
	}

	@Test (dependsOnMethods={"AddPostdoktorvistelser"})
	public void SelectOrganization() throws InterruptedException {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserSökOrganisation());
		
		SearchForOrganizationWhenButtonIdIsUnique.EnterKeyInputs(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserSökOrganisation(), "Uppsala Universitet");
		
	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void ÄmneDropDown() {

		Select ämne1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserÄmne1());

		RandomDropDownOptionSelect.RandomOptionInDropDown(ämne1, 1, 0);

		Select ämne2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserÄmne2());

		RandomDropDownOptionSelect.RandomOptionInDropDown(ämne2, 1, 0);

		Select ämne3 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserÄmne3());

		RandomDropDownOptionSelect.RandomOptionInDropDown(ämne3, 1, 0);

	}

	@Test (dependsOnMethods={"ÄmneDropDown"})
	public void PeriodStartOchSlutYear() {

		Select PeriodStartYear = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartYear());

		RandomDropDownOptionSelect.RandomOptionInDropDown(PeriodStartYear, 1, 1);

		Select PeriodEndYear = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndYear());

		RandomDropDownOptionSelect.RandomOptionInDropdownPreviousDropDownPlusOne(PeriodEndYear);


	}

	@Test (dependsOnMethods={"PeriodStartOchSlutYear"})
	public void PeriodStartMonth() {

		Select PeriodStartMonth = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartMonth());

		RandomDropDownOptionSelect.RandomOptionInDropDown(PeriodStartMonth, 0, 0);

	}

	@Test (dependsOnMethods={"PeriodStartMonth"})
	public void PeriodEndMonth() {

		Select PeriodEndMonth = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndMonth());

		RandomDropDownOptionSelect.RandomOptionInDropDown(PeriodEndMonth, 0, 0);

	}

	@Test (dependsOnMethods={"PeriodEndMonth"})
	public void SparaPostdoktorvistelser() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserSpara()).click();
		
		CountRowsInTable.AddedRow(driver, By.xpath("//*[@id=\"postDoctorialViewSectionIdFormId\"]/table/tbody/tr"), PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserLäggTill());
	}
}