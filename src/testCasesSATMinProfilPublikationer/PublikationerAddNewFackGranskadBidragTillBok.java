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


public class PublikationerAddNewFackGranskadBidragTillBok extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en fackgranskad Bidrag till Bok";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void DropDownBidragTillEnBok() {

		GemensammaMetoder.LoggainPublikation(driver);
		GemensammaMetoder.PublikationFackgranskad(driver);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());
		Select VetenskapligPublikation = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());

		if (driver.getPageSource().contains("Publikationer"))
		{
			VetenskapligPublikation.selectByVisibleText("Bidrag till en bok");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			VetenskapligPublikation.selectByVisibleText("Contribution to a book");
		}
	}

	@Test (dependsOnMethods = {"DropDownBidragTillEnBok"})
	public void BidragTillBokResten() throws InterruptedException {
		BidragTillBok.RestenAvEnBok(driver);

	}

	//	@Test (dependsOnMethods={"DropDownBidragTillEnBok"})
	//	public void BidragTillEnBokTitel() {
	//
	//		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel());
	//
	//		String Boktitel = "TestTitel123";
	//		
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(Boktitel);
	//		
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).getAttribute("value") != Boktitel)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(Boktitel);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokTitel"})
	//	public void BidragTillEnBokFörfattareKnapp() {
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareKnapp()).click();
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokFörfattareKnapp"})
	//	public void BidragTillEnBokFörfattareFörnamn() {
	//
	//		String Förnamn = "Förnamntest";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).sendKeys(Förnamn);
	//
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).getAttribute("value") != Förnamn)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).sendKeys(Förnamn);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokFörfattareFörnamn"})
	//	public void BidragTillEnBokFörfattareEfternamn() {
	//
	//		String Efternamn = "TestEfternamn";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).sendKeys(Efternamn);
	//		
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).getAttribute("value") != Efternamn)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).sendKeys(Efternamn);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokFörfattareEfternamn"})
	//	public void BidragTillEnBokRedaktörKnapp() {
	//
	//		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedaktörKnapp());
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedaktörKnapp()).click();
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokRedaktörKnapp"})
	//	public void BidragTillEnBokRedaktörNamn() {
	//
	//		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedaktörNamn());
	//		String Redaktörnamn = "Testredaktörnamn";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedaktörNamn()).sendKeys(Redaktörnamn);
	//
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedaktörNamn()).getAttribute("value") != Redaktörnamn)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedaktörNamn()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedaktörNamn()).sendKeys(Redaktörnamn);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokRedaktörNamn"})
	//	public void BidragTillEnBokUtgivareFörlag() {
	//
	//		String Förlag = "Testförlag";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag()).sendKeys(Förlag);
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag()).getAttribute("value") != Förlag)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag()).sendKeys(Förlag);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokUtgivareFörlag"})
	//	public void BidragTillEnBokUtgivareFörlagsplats() {
	//
	//		String Förlagsplats = "FörlagsaplatsTest";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats()).sendKeys(Förlagsplats);
	//
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats()).getAttribute("value") != Förlagsplats)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats()).sendKeys(Förlagsplats);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokUtgivareFörlagsplats"})
	//	public void BidragTillEnBokUtgivareFörstaSidnummer() {
	//
	//		String FörstaSidnummer = "1";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer()).sendKeys(FörstaSidnummer);
	//		
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer()).getAttribute("value") != FörstaSidnummer)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer()).sendKeys(FörstaSidnummer);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokUtgivareFörstaSidnummer"})
	//	public void BidragTillEnBokUtgivareSistaSidnummer() {
	//
	//		String Sistasidnummer = "99";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).sendKeys(Sistasidnummer);
	//		
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).getAttribute("value") != Sistasidnummer)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).sendKeys(Sistasidnummer);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokUtgivareSistaSidnummer"})
	//	public void BidragTillEnBokUtgivareISBN() {
	//
	//		String ISBN = "98989";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN()).sendKeys(ISBN);
	//
	//		if(driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN()).getAttribute("value") != ISBN)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN()).sendKeys(ISBN);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokUtgivareISBN"})
	//	public void BidragTillEnBokUtgivareDOI() {
	//
	//		String DOI = "1234567";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).sendKeys(DOI);
	//
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).getAttribute("value") != DOI)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).sendKeys(DOI);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokUtgivareDOI"})
	//	public void BidragTillEnBokUtgivareStatus() {
	//
	//		Select Status = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus());
	//		Status.selectByIndex(0);
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokUtgivareStatus"})
	//	public void BidragTillEnBokUtgivareKällaFörPublikation() {
	//
	//		Select KällaFörPublikation = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaFörPublikation());
	//		Random randomOption = new Random();  
	//		int endOption = KällaFörPublikation.getOptions().size(); 
	//		int number = randomOption .nextInt(endOption);  
	//		KällaFörPublikation.selectByIndex(number);
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokUtgivareKällaFörPublikation"})
	//	public void BidragTillEnBokUtgivareKällaID() {
	//
	//		String KällaId = "1234";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).sendKeys(KällaId);
	//
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).getAttribute("value") != KällaId)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).sendKeys(KällaId);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokUtgivareKällaID"})
	//	public void BidragTillEnBokVarTextenPubliceradIOpenAcessJa() {
	//
	//		Select TextenPubliceradIOpenAcess = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown());
	//		TextenPubliceradIOpenAcess.selectByIndex(1);
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokVarTextenPubliceradIOpenAcessJa"})
	//	public void BidragTillEnBokOpenAccessLänkExternLänkFörPublicering() {
	//
	//		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering());
	//
	//		String ExternLänkFörPublicering = "Testlänk";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).sendKeys(ExternLänkFörPublicering);
	//		
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).getAttribute("value") != ExternLänkFörPublicering)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).sendKeys(ExternLänkFörPublicering);
	//		}
	//
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokOpenAccessLänkExternLänkFörPublicering"})
	//	public void BidragTillEnBokOpenAccessFormAvOA() {
	//
	//		Select FormAvOA = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA());
	//		Random randomOption = new Random();  
	//		int startOption = 1;
	//		int endOption = FormAvOA.getOptions().size(); 
	//		int number = startOption + randomOption .nextInt(endOption - startOption);  
	//		FormAvOA.selectByIndex(number);
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokOpenAccessFormAvOA"})
	//	public void BidragTillEnBokOpenAccessDokumentVersion() {
	//
	//		Select DokumentVersion = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion());
	//		Random randomOption = new Random();  
	//		int startOption = 1;
	//		int endOption = DokumentVersion.getOptions().size(); 
	//		int number = startOption + randomOption .nextInt(endOption - startOption);  
	//		DokumentVersion.selectByIndex(number);
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokOpenAccessDokumentVersion"})
	//	public void BidragTillEnBokOpenAcessSammanfattning() {
	//
	//		String Sammanfattning = "Jag skriver en riktigt bra sammanfattning";
	//
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).sendKeys(Sammanfattning);
	//		
	//		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).getAttribute("value") != Sammanfattning)
	//		{
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).clear();
	//			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).sendKeys(Sammanfattning);
	//		}
	//	}
	//
	//	@Test (dependsOnMethods={"BidragTillEnBokOpenAcessSammanfattning"})
	//	public void BidragTillEnBokSpara() {
	//		
	//		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
	//		
	//		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara()).click();
	//		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));
	//		
	//		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	//		
	//	}
	//



}