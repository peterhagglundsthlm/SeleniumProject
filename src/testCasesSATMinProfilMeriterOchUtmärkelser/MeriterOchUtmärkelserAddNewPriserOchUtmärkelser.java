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

public class MeriterOchUtmärkelserAddNewPriserOchUtmärkelser extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Priser och Utmärkelser";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickMeriterOchUtmärkelser() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser()).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtmärkelser"})
	public void LäggTill() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserLäggTill());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserLäggTill()).click();
	}

	@Test (dependsOnMethods={"LäggTill"})
	public void År() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserÅr());

		Select År = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserÅr());

		RandomDropDownOptionSelect.RandomOptionInDropDown(År, 0, 0);

	}

	@Test (dependsOnMethods={"År"})
	public void Land() {

		Select Land = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserLand());

		RandomDropDownOptionSelect.RandomOptionInDropDown(Land, 3, 0);

	}

	@Test (dependsOnMethods={"Land"})
	public void NamnPåPriset() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserNamnPåPriset()).sendKeys("Ett bra namn");
	}

	@Test (dependsOnMethods={"NamnPåPriset"})
	public void Utfärdare() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserUtfärdare()).sendKeys("En bra utfärdare");
	}

	@Test (dependsOnMethods={"Utfärdare"})
	public void Beskrivning() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserBeskrivning()).sendKeys("En bra beskrivning");
	}

	@Test (dependsOnMethods={"Beskrivning"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserSpara()).click();
	}
}
