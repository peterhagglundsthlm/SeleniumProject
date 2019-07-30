package testCasesSATMinProfilPublikationer;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;

import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class GemensammaMetoder extends BeforeAfterTestBrowsers {
	@Test
	public static void LoggainPublikation (WebDriver driver) {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer()).click();
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_LäggTill()).click();
	}

	@Test
	public static void PublikationFackgranskad (WebDriver driver) {

		Select Publikationstyp = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp());

		if (driver.getPageSource().contains("Publikationer")){
			Publikationstyp.selectByVisibleText("Vetenskaplig publikation - fackgranskade");
		}
		else if (driver.getPageSource().contains("Publications")) {
			Publikationstyp.selectByVisibleText("Scientific publication - peer-reviewed");
		}
	}
	//	@Test
	//	public void LoginAsUser() {
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
	//	}
	//
	//	@Test (dependsOnMethods={"LoginAsUser"})
	//	public void ClickPublikationer() {
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer()).click();
	//	}
	//
	//	@Test (dependsOnMethods={"ClickPublikationer"})
	//	public void LäggTillPublikationer() {
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_LäggTill()).click();
	//	}

}
