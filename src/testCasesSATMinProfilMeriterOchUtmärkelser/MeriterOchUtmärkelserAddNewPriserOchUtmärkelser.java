package testCasesSATMinProfilMeriterOchUtm‰rkelser;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import reusableMethods.DriverWaitExpectedConditions;
import reusableMethods.RandomDropDownOptionSelect;
import reusableMethods.driverSelect;

public class MeriterOchUtm‰rkelserAddNewPriserOchUtm‰rkelser extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och l‰gger till en Priser och Utm‰rkelser";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickMeriterOchUtm‰rkelser() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser()).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtm‰rkelser"})
	public void L‰ggTill() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserL‰ggTill());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserL‰ggTill()).click();
	}

	@Test (dependsOnMethods={"L‰ggTill"})
	public void ≈r() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelser≈r());

		Select ≈r = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelser≈r());

		RandomDropDownOptionSelect.RandomOptionInDropDown(≈r, 0, 0);

	}

	@Test (dependsOnMethods={"≈r"})
	public void Land() {

		Select Land = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserLand());

		RandomDropDownOptionSelect.RandomOptionInDropDown(Land, 3, 0);

	}

	@Test (dependsOnMethods={"Land"})
	public void NamnPÂPriset() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserNamnPÂPriset()).sendKeys("Ett bra namn");
	}

	@Test (dependsOnMethods={"NamnPÂPriset"})
	public void Utf‰rdare() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserUtf‰rdare()).sendKeys("En bra utf‰rdare");
	}

	@Test (dependsOnMethods={"Utf‰rdare"})
	public void Beskrivning() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserBeskrivning()).sendKeys("En bra beskrivning");
	}

	@Test (dependsOnMethods={"Beskrivning"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserSpara()).click();
	}
}
