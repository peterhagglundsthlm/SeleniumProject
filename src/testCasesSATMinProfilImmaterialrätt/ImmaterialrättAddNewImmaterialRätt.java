package testCasesSATMinProfilImmaterialrätt;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class ImmaterialrättAddNewImmaterialRätt extends BeforeAfterTestBrowsers {
	
	String TestCaseInfo = "Loggar in som en projektledare och lägger till en Immaterialrätt";

	@Test
	public void LoginAsUser() {
		
		System.out.println("Testfall = " + TestCaseInfo);
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil));
		
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
	}
	
	@Test (dependsOnMethods={"Typ"})
	public void Id() {

		PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättId(driver).sendKeys("123456");
	}
	
	@Test (dependsOnMethods={"Id"})
	public void DatumFörBeviljande() {

		PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättDatumFörBeviljande(driver).sendKeys("2018-05-09");
	}
	
	@Test (dependsOnMethods={"DatumFörBeviljande"})
	public void ProduktKlassificering() {

		Select ProduktKlassificering1 = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättProduktKlassificering1)));
		Random randomOptionProduktKlassificering1 = new Random();  
		int startOptionProduktKlassificering1 = 1;
		int endOptionProduktKlassificering1 = ProduktKlassificering1.getOptions().size(); 
		int numberProduktKlassificering1 = startOptionProduktKlassificering1 + randomOptionProduktKlassificering1 .nextInt(endOptionProduktKlassificering1 - startOptionProduktKlassificering1);  
		ProduktKlassificering1.selectByIndex(numberProduktKlassificering1);
		
		
		Select ProduktKlassificering2 = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättProduktKlassificering2)));
		Random randomOptionProduktKlassificering2 = new Random();  
		int startOptionProduktKlassificering2 = 1;
		int endOptionProduktKlassificering2 = ProduktKlassificering2.getOptions().size(); 
		int numberProduktKlassificering2 = startOptionProduktKlassificering2 + randomOptionProduktKlassificering2 .nextInt(endOptionProduktKlassificering2 - startOptionProduktKlassificering2);  
		ProduktKlassificering2.selectByIndex(numberProduktKlassificering2);
	}
	
	@Test (dependsOnMethods={"ProduktKlassificering"})
	public void LicensieradTillAnnan() {
		
		Select LicensieradTillAnnan = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättLicensieradTillAnnan)));
		LicensieradTillAnnan.selectByIndex(0);

	}
	
	@Test (dependsOnMethods={"LicensieradTillAnnan"})
	public void LicensieradTillAnnanDropDown() {
		
		Select LicensieradTillAnnanDropDown = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättLicensieradTillAnnanDropwDown)));
		Random randomOptionLicensieradTillAnnanDropDown = new Random();  
		int startOptionLicensieradTillAnnanDropDown = 1;
		int endOptionLicensieradTillAnnanDropDown = LicensieradTillAnnanDropDown.getOptions().size(); 
		int numberLicensieradTillAnnanDropDown = startOptionLicensieradTillAnnanDropDown + randomOptionLicensieradTillAnnanDropDown .nextInt(endOptionLicensieradTillAnnanDropDown - startOptionLicensieradTillAnnanDropDown);  
		LicensieradTillAnnanDropDown.selectByIndex(numberLicensieradTillAnnanDropDown);

	}
	
	@Test (dependsOnMethods={"LicensieradTillAnnan"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		PortalLoggedInAsUserMinProfil.MinProfil_ImmaterialrättSpara(driver).click();
	}
}