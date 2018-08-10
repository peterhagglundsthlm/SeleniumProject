package testCasesSATMinProfilImmaterialrätt;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class ImmaterialrättAddNewImmaterialRätt extends BeforeAfterTestBrowsers {


	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Immaterialrätt";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginAsUser() {

		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickImmaterialrätt() {

		PortalLoggedInAsUserMinProfil.MinProfil_Immaterialrätt(driver).click();
	}

	@Test (dependsOnMethods={"ClickImmaterialrätt"})
	public void LäggTill() {

		PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättLäggTill(driver).click();
	}

	@Test (dependsOnMethods={"LäggTill"})
	public void Typ() {

		Select Typ = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättTyp)));
		Random randomOptionTyp = new Random();  
		int startOptionTyp = 1;
		int endOptionTyp = Typ.getOptions().size(); 
		int numberTyp = startOptionTyp + randomOptionTyp .nextInt(endOptionTyp - startOptionTyp);  
		Typ.selectByIndex(numberTyp);

		WebElement TypSelect = Typ.getFirstSelectedOption();
		String TypValue = TypSelect.getText();
		System.out.println("Typ = " + TypValue ); 
	}

	@Test (dependsOnMethods={"Typ"})
	public void Id() {

		String id = "123456";
		PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättId(driver).sendKeys(id);
		if (PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättId(driver).getAttribute("value") != id)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättId(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättId(driver).sendKeys(id);
		}	

		String IdString = PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättId(driver).getAttribute("value");
		System.out.println("Id = " + IdString); 
	}

	@Test (dependsOnMethods={"Id"})
	public void DatumFörBeviljande() {

		PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättDatumFörBeviljande(driver).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättDatumFörBeviljandeKalenderÅrDropDown));

		Select År = new Select (driver.findElement(By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättDatumFörBeviljandeKalenderÅrDropDown)));
		Random randomÅr = new Random();  
		int endOption = År.getOptions().size(); 
		int numberÅr = randomÅr .nextInt(endOption);  
		År.selectByIndex(numberÅr);

		Select Månad = new Select (driver.findElement(By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättDatumFörBeviljandeKalenderMånadDropDown)));
		Random randomMånad = new Random();  
		int endOptionMånad = Månad.getOptions().size(); 
		int numberMånad = randomMånad .nextInt(endOptionMånad);  
		Månad.selectByIndex(numberMånad);

		int RandomDatum = 1 + (int)(Math.random() * 28); 
		String Datum = Integer.toString(RandomDatum);
		driver.findElement(By.linkText(Datum)).click();

		String DatumFörBeviljandeString = PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättDatumFörBeviljande(driver).getAttribute("value");
		System.out.println("Datum för beviljande = " + DatumFörBeviljandeString); 
	}

	@Test (dependsOnMethods={"DatumFörBeviljande"})
	public void ProduktKlassificering() {

		Select ProduktKlassificering1 = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättProduktKlassificering1)));
		Random randomOptionProduktKlassificering1 = new Random();  
		int startOptionProduktKlassificering1 = 1;
		int endOptionProduktKlassificering1 = ProduktKlassificering1.getOptions().size(); 
		int numberProduktKlassificering1 = startOptionProduktKlassificering1 + randomOptionProduktKlassificering1 .nextInt(endOptionProduktKlassificering1 - startOptionProduktKlassificering1);  
		ProduktKlassificering1.selectByIndex(numberProduktKlassificering1);

		WebElement ProduktKlassificering1Select = ProduktKlassificering1.getFirstSelectedOption();
		String ProduktKlassificering1StringValue1 = ProduktKlassificering1Select.getText();
		System.out.println("ProduktKlassificering 1 = " + ProduktKlassificering1StringValue1 ); 

		Select ProduktKlassificering2 = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättProduktKlassificering2)));
		Random randomOptionProduktKlassificering2 = new Random();  
		int startOptionProduktKlassificering2 = 1;
		int endOptionProduktKlassificering2 = ProduktKlassificering2.getOptions().size(); 
		int numberProduktKlassificering2 = startOptionProduktKlassificering2 + randomOptionProduktKlassificering2 .nextInt(endOptionProduktKlassificering2 - startOptionProduktKlassificering2);  
		ProduktKlassificering2.selectByIndex(numberProduktKlassificering2);

		WebElement ProduktKlassificering2Select = ProduktKlassificering2.getFirstSelectedOption();
		String ProduktKlassificering2StringValue2 = ProduktKlassificering2Select.getText();
		System.out.println("ProduktKlassificering 2 = " + ProduktKlassificering2StringValue2 ); 
	}

	@Test (dependsOnMethods={"ProduktKlassificering"})
	public void LicensieradTillAnnan() {

		Select LicensieradTillAnnan = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättLicensieradTillAnnan)));
		LicensieradTillAnnan.selectByIndex(0);

		if (driver.getPageSource().contains("Immaterialrätt"))  
		{
			LicensieradTillAnnan.selectByVisibleText("Ja");
		}
		else if (driver.getPageSource().contains("Intellectual property"))
		{
			LicensieradTillAnnan.selectByVisibleText("Yes");
		}

		WebElement LicensieradTillAnnanSelect = LicensieradTillAnnan.getFirstSelectedOption();
		String LicensieradTillAnnanValue = LicensieradTillAnnanSelect.getText();
		System.out.println("LicensieradTillAnnan = " + LicensieradTillAnnanValue); 

	}

	@Test (dependsOnMethods={"LicensieradTillAnnan"})
	public void LicensieradTillAnnanDropDown() {

		Select LicensieradTillAnnanDropDown = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättLicensieradTillAnnanDropwDown)));
		Random randomOptionLicensieradTillAnnanDropDown = new Random();  
		int startOptionLicensieradTillAnnanDropDown = 1;
		int endOptionLicensieradTillAnnanDropDown = LicensieradTillAnnanDropDown.getOptions().size(); 
		int numberLicensieradTillAnnanDropDown = startOptionLicensieradTillAnnanDropDown + randomOptionLicensieradTillAnnanDropDown .nextInt(endOptionLicensieradTillAnnanDropDown - startOptionLicensieradTillAnnanDropDown);  
		LicensieradTillAnnanDropDown.selectByIndex(numberLicensieradTillAnnanDropDown);

		WebElement LicensieradTillAnnanDropDownSelect = LicensieradTillAnnanDropDown.getFirstSelectedOption();
		String LicensieradTillAnnanDropDownValue = LicensieradTillAnnanDropDownSelect.getText();
		System.out.println("LicensieradTillAnnanDropDown = " + LicensieradTillAnnanDropDownValue); 
	}

	@Test (dependsOnMethods={"LicensieradTillAnnan"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättSpara(driver).click();
	}
}