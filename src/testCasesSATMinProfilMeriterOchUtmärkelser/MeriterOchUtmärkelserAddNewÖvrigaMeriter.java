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


public class MeriterOchUtmärkelserAddNewÖvrigaMeriter extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Övriga meriter";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil()).click();
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
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterLäggTill());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterLäggTill()).click();
	}

	@Test (dependsOnMethods={"LäggTill"})
	public void StartårAndSlutÅr() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterStartår());

		Select Startår = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterStartår());

		RandomDropDownOptionSelect.RandomOptionInDropDown(Startår, 0, 1);

		Select Slutår = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterSlutår());

		RandomDropDownOptionSelect.RandomOptionInDropdownPreviousDropDownPlusOne(Slutår);

	}

	@Test (dependsOnMethods={"StartårAndSlutÅr"})
	public void TypAvMerit() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterTypAvMerit()).sendKeys("Test123");
	}

	@Test (dependsOnMethods={"TypAvMerit"})
	public void Beskrivning() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterBeskrivning()).sendKeys("En bra beskrivning");
	}

	@Test (dependsOnMethods={"Beskrivning"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_ÖvrigaMeriterSpara()).click();
	}
}
