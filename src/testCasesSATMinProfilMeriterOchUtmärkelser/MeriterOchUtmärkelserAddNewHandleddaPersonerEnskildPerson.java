package testCasesSATMinProfilMeriterOchUtmärkelser;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import reusableMethods.DriverWaitExpectedConditions;
import reusableMethods.RandomDropDownOptionSelect;
import reusableMethods.driverSelect;

public class MeriterOchUtmärkelserAddNewHandleddaPersonerEnskildPerson extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Enskild handledd person";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickMeriterOchUtmärkelser() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser());

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser()).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtmärkelser"})
	public void LäggTillHandleddaPersonerEnskildPerson() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerLäggTillEnskildPersonKnapp());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerLäggTillEnskildPersonKnapp()).click();
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPerson"})
	public void LäggTillHandleddaPersonerEnskildPersonFörnamn() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerFörnamn());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerFörnamn()).sendKeys("Förnamn3");
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonFörnamn"})
	public void LäggTillHandleddaPersonerEnskildPersonEfternamn() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerEfternamn()).sendKeys("Efternamn3");
	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonEfternamn"})
	public void LäggTillHandleddaPersonerEnskildPersonSlutår() {

		Select Slutår = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSlutår());

		RandomDropDownOptionSelect.RandomOptionInDropDown(Slutår, 0, 0);

	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonSlutår"})
	public void LäggTillHandleddaPersonerEnskildPersonTypAvHandleddaPersoner() {

		Select TypAvHandleddaPersoner = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerTypAvHandleddaPerson());

		RandomDropDownOptionSelect.RandomOptionInDropDown(TypAvHandleddaPersoner, 1, 0);

	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonTypAvHandleddaPersoner"})
	public void LäggTillHandleddaPersonerEnskildPersonRoll() {

		Select Roll = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerRoll());

		RandomDropDownOptionSelect.RandomOptionInDropDown(Roll, 1, 0);

	}

	@Test (dependsOnMethods={"LäggTillHandleddaPersonerEnskildPersonRoll"})
	public void LäggTillHandleddaPersonerEnskildPersonRollSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_HandleddaPersonerSparaEnskildPerson()).click();
	}


}