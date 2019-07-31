package testCasesSATMinProfilImmaterialrätt;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class ImmaterialrättAddNewImmaterialRätt extends BeforeAfterTestBrowsers {


	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Immaterialrätt";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickImmaterialrätt() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Immaterialrätt()).click();
	}

	@Test (dependsOnMethods={"ClickImmaterialrätt"})
	public void LäggTill() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättLäggTill()).click();
	}

	@Test (dependsOnMethods={"LäggTill"})
	public void Typ() {

		Select Typ = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättTyp());
		Random randomOptionTyp = new Random();  
		int startOptionTyp = 1;
		int endOptionTyp = Typ.getOptions().size(); 
		int numberTyp = startOptionTyp + randomOptionTyp .nextInt(endOptionTyp - startOptionTyp);  
		Typ.selectByIndex(numberTyp);
	}

	@Test (dependsOnMethods={"Typ"})
	public void Id() {

		String id = "123456";
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättId()).sendKeys(id);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättId()).getAttribute("value") != id)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättId()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättId()).sendKeys(id);
		}	
	}

	@Test (dependsOnMethods={"Id"})
	public void DatumFörBeviljande() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättDatumFörBeviljande()).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättDatumFörBeviljandeKalenderÅrDropDown());

		Select År = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättDatumFörBeviljandeKalenderÅrDropDown());
		Random randomÅr = new Random();  
		int endOption = År.getOptions().size(); 
		int numberÅr = randomÅr .nextInt(endOption);  
		År.selectByIndex(numberÅr);

		Select Månad = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättDatumFörBeviljandeKalenderMånadDropDown());
		Random randomMånad = new Random();  
		int endOptionMånad = Månad.getOptions().size(); 
		int numberMånad = randomMånad .nextInt(endOptionMånad);  
		Månad.selectByIndex(numberMånad);

		int RandomDatum = 1 + (int)(Math.random() * 28); 
		String Datum = Integer.toString(RandomDatum);
		driver.findElement(By.linkText(Datum)).click();
	}

	@Test (dependsOnMethods={"DatumFörBeviljande"})
	public void ProduktKlassificering() {

		Select ProduktKlassificering1 = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättProduktKlassificering1());
		Random randomOptionProduktKlassificering1 = new Random();  
		int startOptionProduktKlassificering1 = 1;
		int endOptionProduktKlassificering1 = ProduktKlassificering1.getOptions().size(); 
		int numberProduktKlassificering1 = startOptionProduktKlassificering1 + randomOptionProduktKlassificering1 .nextInt(endOptionProduktKlassificering1 - startOptionProduktKlassificering1);  
		ProduktKlassificering1.selectByIndex(numberProduktKlassificering1);

		Select ProduktKlassificering2 = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättProduktKlassificering2());
		Random randomOptionProduktKlassificering2 = new Random();  
		int startOptionProduktKlassificering2 = 1;
		int endOptionProduktKlassificering2 = ProduktKlassificering2.getOptions().size(); 
		int numberProduktKlassificering2 = startOptionProduktKlassificering2 + randomOptionProduktKlassificering2 .nextInt(endOptionProduktKlassificering2 - startOptionProduktKlassificering2);  
		ProduktKlassificering2.selectByIndex(numberProduktKlassificering2);
	}

	@Test (dependsOnMethods={"ProduktKlassificering"})
	public void LicensieradTillAnnan() {

		Select LicensieradTillAnnan = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättLicensieradTillAnnan());
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

		Select LicensieradTillAnnanDropDown = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättLicensieradTillAnnanDropwDown());
		Random randomOptionLicensieradTillAnnanDropDown = new Random();  
		int startOptionLicensieradTillAnnanDropDown = 1;
		int endOptionLicensieradTillAnnanDropDown = LicensieradTillAnnanDropDown.getOptions().size(); 
		int numberLicensieradTillAnnanDropDown = startOptionLicensieradTillAnnanDropDown + randomOptionLicensieradTillAnnanDropDown .nextInt(endOptionLicensieradTillAnnanDropDown - startOptionLicensieradTillAnnanDropDown);  
		LicensieradTillAnnanDropDown.selectByIndex(numberLicensieradTillAnnanDropDown);
	}

	@Test (dependsOnMethods={"LicensieradTillAnnan"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättSpara()).click();
	}
}