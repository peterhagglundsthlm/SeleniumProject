package testCasesSATMinProfilImmaterialrätt;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.RandomDropDownOptionSelect;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class ImmaterialrättAddNewImmaterialRätt extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = 
				"Loggar in som en projektledare och lägger till en Immaterialrätt";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickImmaterialrätt() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialrätt());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Immaterialrätt()).click();
	}

	@Test (dependsOnMethods={"ClickImmaterialrätt"})
	public void LäggTill() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättLäggTill());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättLäggTill()).click();
	}

	@Test (dependsOnMethods={"LäggTill"})
	public void Typ() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättTyp());

		Select Typ = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättTyp());

		RandomDropDownOptionSelect.RandomOptionInDropDown(Typ, 1, 0);

	}

	@Test (dependsOnMethods={"Typ"})
	public void Id() {

		String id = "123456";
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättId()).sendKeys(id);

		if (driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättId()).getAttribute("value") != id)
		{
			driver.findElement(
					PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättId()).clear();
			driver.findElement(
					PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättId()).sendKeys(id);
		}	
	}

	@Test (dependsOnMethods={"Id"})
	public void DatumFörBeviljande() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättDatumFörBeviljande()).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättDatumFörBeviljandeKalenderÅrDropDown());

		Select År = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättDatumFörBeviljandeKalenderÅrDropDown());

		RandomDropDownOptionSelect.RandomOptionInDropDown(År, 0, 0);

		Select Månad = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättDatumFörBeviljandeKalenderMånadDropDown());

		RandomDropDownOptionSelect.RandomOptionInDropDown(Månad, 0, 0);

		int RandomDatum = 1 + (int)(Math.random() * 28); 
		String Datum = Integer.toString(RandomDatum);
		driver.findElement(By.linkText(Datum)).click();
	}

	@Test (dependsOnMethods={"DatumFörBeviljande"})
	public void ProduktKlassificering() {

		Select ProduktKlassificering1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättProduktKlassificering1());

		RandomDropDownOptionSelect.RandomOptionInDropDown(ProduktKlassificering1, 1, 0);

		Select ProduktKlassificering2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättProduktKlassificering2());

		RandomDropDownOptionSelect.RandomOptionInDropDown(ProduktKlassificering2, 1, 0);

	}

	@Test (dependsOnMethods={"ProduktKlassificering"})
	public void LicensieradTillAnnan() {

		Select LicensieradTillAnnan = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättLicensieradTillAnnan());

		if (driver.getPageSource().contains("Immaterialrätt"))  
		{
			LicensieradTillAnnan.selectByVisibleText("Ja");
		}
		else if (driver.getPageSource().contains("Intellectual property"))
		{
			LicensieradTillAnnan.selectByVisibleText("Yes");
		}
	}

	@Test (dependsOnMethods={"LicensieradTillAnnan"})
	public void LicensieradTillAnnanDropDown() {

		Select LicensieradTillAnnanDropDown = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättLicensieradTillAnnanDropwDown());

		RandomDropDownOptionSelect.RandomOptionInDropDown(LicensieradTillAnnanDropDown, 1, 0);

	}

	@Test (dependsOnMethods={"LicensieradTillAnnan"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättSpara()).click();
	}
}