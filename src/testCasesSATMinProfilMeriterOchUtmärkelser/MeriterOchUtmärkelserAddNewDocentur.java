package testCasesSATMinProfilMeriterOchUtmärkelser;

import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.RandomDropDownOptionSelect;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class MeriterOchUtmärkelserAddNewDocentur extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Docentur";
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
	public void LäggTillDocentur() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturLäggTill());

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturLäggTill()).click();
	}

	@Test (dependsOnMethods={"LäggTillDocentur"})
	public void SelectOrganization() throws InterruptedException {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturSökOrganisation());

		String universitet = "Uppsala Universitet";
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturSökOrganisation()).sendKeys(universitet);
		Thread.sleep(500);
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturSökOrganisation()).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturSökOrganisation()).sendKeys(Keys.ENTER);
		Thread.sleep(500);
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturSparaSöktOrganisation()).click();
	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void Ämne() {

		Select ämne1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturÄmne1());

		RandomDropDownOptionSelect.RandomOptionInDropDown(ämne1, 1, 0);


		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturÄmne2());

		Select ämne2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturÄmne2());

		RandomDropDownOptionSelect.RandomOptionInDropDown(ämne2, 1, 0);

	}

	@Test (dependsOnMethods={"Ämne"})
	public void År() {

		Select år = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturÅr());

		RandomDropDownOptionSelect.RandomOptionInDropDown(år, 0, 0);

	}

	@Test (dependsOnMethods={"År"})
	public void SparaDocentur() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_DocenturSpara()).click();
	}
}

