package testCasesSATMinProfilPublikationer;

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

public class PublikationerAddNewFackGranskadBok extends BeforeAfterTestBrowsers  {


	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en fackgranskad Bok";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
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
//
//	@Test (dependsOnMethods={"LäggTillPublikationer"})
//	public void VäljPublikationsTyp() {
//
//		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp());
//		Select Publikationstyp = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp());
//
//		if (driver.getPageSource().contains("Publikationer"))	 
//		{
//			Publikationstyp.selectByVisibleText("Vetenskaplig publikation - fackgranskade");
//		}
//		else if (driver.getPageSource().contains("Publications")) 
//		{
//			Publikationstyp.selectByVisibleText("Scientific publication - peer-reviewed");
//		}
//	}

	@Test 
	public void DropDownBok() {

		GemensammaMetoder.LoggainPublikation(driver);
		GemensammaMetoder.PublikationFackgranskad(driver);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());
		Select Publikationstyp = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());

		if (driver.getPageSource().contains("Publikationer"))
		{
			Publikationstyp.selectByVisibleText("Bok");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			Publikationstyp.selectByVisibleText("Book");
		}
	}

	@Test (dependsOnMethods={"DropDownBok"})
	public void BokFörfattareKnapp() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareKnapp()).click();
	}

	@Test (dependsOnMethods={"BokFörfattareKnapp"})
	public void BokTitel() {

		String Boktitel = "TestTitel123";

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel());

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(Boktitel);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).getAttribute("value") != Boktitel)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(Boktitel);
		}
	}

	@Test (dependsOnMethods={"BokTitel"})
	public void BokFörfattareFörnamn() {

		String FörfattareFörnamn = "Förnamn";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).sendKeys(FörfattareFörnamn);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).getAttribute("value") != FörfattareFörnamn)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).sendKeys(FörfattareFörnamn);
		}
	}

	@Test (dependsOnMethods={"BokFörfattareFörnamn"})
	public void BokFörfattareEfternamn() {

		String FörfattareEfternamn = "Efternamn";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).sendKeys(FörfattareEfternamn);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).getAttribute("value") != FörfattareEfternamn)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).sendKeys(FörfattareEfternamn);
		}
	}

	@Test (dependsOnMethods={"BokFörfattareEfternamn"})
	public void BokUtgivareFörlag() {

		String Förlag = "Testförlag";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag()).sendKeys(Förlag);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag()).getAttribute("value") != Förlag)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag()).sendKeys(Förlag);
		}
	}
	
	@Test (dependsOnMethods={"BokUtgivareFörlag"})
	public void BokUtgivareFörlagsplats() {

		String Förlagsplats = "FörlagsaplatsTest";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats()).sendKeys(Förlagsplats);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats()).getAttribute("value") != Förlagsplats)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats()).sendKeys(Förlagsplats);
		}
	}
	
	@Test (dependsOnMethods={"BokUtgivareFörlagsplats"})
	public void BokUtgivareISBN() {

		String ISBN = "98989";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN()).sendKeys(ISBN);

		if(driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN()).getAttribute("value") != ISBN)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN()).sendKeys(ISBN);
		}
	}
	
	@Test (dependsOnMethods={"BokUtgivareISBN"})
	public void BokUtgivareDOI() {

		String DOI = "1234567";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).sendKeys(DOI);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).getAttribute("value") != DOI)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).sendKeys(DOI);
		}
	}
	
	@Test (dependsOnMethods={"BokUtgivareDOI"})
	public void BokUtgivareKällaFörPublikation() {

		Select KällaFörPublikation = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaFörPublikation());
		Random randomOption = new Random();  
		int endOption = KällaFörPublikation.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		KällaFörPublikation.selectByIndex(number);
	}

	@Test (dependsOnMethods={"BokUtgivareKällaFörPublikation"})
	public void BokUtgivareKällaID() {

		String KällaId = "1234";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).sendKeys(KällaId);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).getAttribute("value") != KällaId)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).sendKeys(KällaId);
		}
	}
	
	@Test (dependsOnMethods={"BokUtgivareKällaID"})
	public void BokVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown());
		TextenPubliceradIOpenAcess.selectByIndex(1);
	}
	
	@Test (dependsOnMethods={"BokVarTextenPubliceradIOpenAcessJa"})
	public void BokOpenAccessLänkExternLänkFörPublicering() {

		String LänkFörPublicering = "Testlänk";

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering());
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).sendKeys(LänkFörPublicering);
		
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).getAttribute("value") != LänkFörPublicering)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).sendKeys(LänkFörPublicering);
		}
	}
	
	@Test (dependsOnMethods={"BokOpenAccessLänkExternLänkFörPublicering"})
	public void BokOpenAccessFormAvOA() {

		Select FormAvOA = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA());
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);
	}
	
	@Test (dependsOnMethods={"BokOpenAccessFormAvOA"})
	public void BokOpenAccessDokumentVersion() {

		Select DokumentVersion = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion());
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);

	}
	
	@Test (dependsOnMethods={"BokOpenAccessDokumentVersion"})
	public void BokOpenAcessSammanfattning() {

		String Sammanfattning = "Jag skriver en riktigt bra sammanfattning";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).sendKeys(Sammanfattning);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).getAttribute("value") != Sammanfattning)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).sendKeys(Sammanfattning);
		}
	}

	@Test (dependsOnMethods={"BokOpenAcessSammanfattning"})
	public void BokSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara()).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}
}