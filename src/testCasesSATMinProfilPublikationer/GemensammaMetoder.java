package testCasesSATMinProfilPublikationer;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;

import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class GemensammaMetoder extends BeforeAfterTestBrowsers {

	public static void LoggainPublikation (WebDriver driver) {
		//	ersätter public void LoginAsUser(), public void ClickPublikationer(), public void LäggTillPublikationer()

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
		System.out.println("Klickat Min profil");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer()).click();
		System.out.println("Klickat Publikationer");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_LäggTill()).click();
		System.out.println("Klickat Lägg till publikationer.");
	}

	@Test
	public static void PublikationFackgranskad (WebDriver driver) {

		Select Publikationstyp = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp());
		System.out.println("Dropdown Publikationstyp");

		if (driver.getPageSource().contains("Publikationer")){
			Publikationstyp.selectByVisibleText("Vetenskaplig publikation - fackgranskade");
		}
		else if (driver.getPageSource().contains("Publications")) {
			Publikationstyp.selectByVisibleText("Scientific publication - peer-reviewed");
		}
		System.out.println("Valt Vetenskaplig publikation - fackgranskad.");
	}

	@Test (dependsOnMethods={"ProceedingsTitel"})
	public static void TitelOchFörfattare(WebDriver driver){
		// ersätter metoderna för klicka författare-knapp samt för- och efternamn

		String FörfattareFörnamn = "Förnamn";
		String FörfattareEfternamn = "Efternamn";
		String titel = "Testtitel";

		// sätter titeln
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(titel);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).getAttribute("value") != titel)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(titel);
		}

		// anger författare för- och efternamn
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareKnapp()).click();
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).sendKeys(FörfattareFörnamn);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).getAttribute("value") != FörfattareFörnamn)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).sendKeys(FörfattareFörnamn);
		}

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).sendKeys(FörfattareEfternamn);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).getAttribute("value") != FörfattareEfternamn)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).sendKeys(FörfattareEfternamn);
		}
	}

	public static void FörlagOchPlats(WebDriver driver) {

		String Förlag = "Testförlag";
		String Förlagsplats = "FörlagsaplatsTest";

		// anger förlag
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag()).sendKeys(Förlag);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag()).getAttribute("value") != Förlag)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag()).sendKeys(Förlag);
		}

		// anger förlagsplats
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats()).sendKeys(Förlagsplats);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats()).getAttribute("value") != Förlagsplats)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats()).sendKeys(Förlagsplats);
		}
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareISBN"})
	public static void Utgivare(WebDriver driver) {
		// ersätter DOI, Status, Källa för publikation, KällaID

		String DOI = "1234567";
		String KällaId = "1234";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).sendKeys(DOI);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).getAttribute("value") != DOI)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).sendKeys(DOI);
		}

		Select Status = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus());
		Status.selectByIndex(0);

		Select KällaFörPublikation = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaFörPublikation());
		Random randomOption = new Random();  
		int endOption = KällaFörPublikation.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		KällaFörPublikation.selectByIndex(number);

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).sendKeys(KällaId);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).getAttribute("value") != KällaId)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).sendKeys(KällaId);
		}
	}

	public static void OpenAccess(WebDriver driver) {
		// ersätter Publicerad open access JA, Extern länk för publicering, Form av OA, Dokumentversion och OASammanfattning

		String ExternLänkFörPublicering = "Testlänk";
		String Sammanfattning = "Jag skriver en riktigt bra sammanfattning";

		Select TextenPubliceradIOpenAcess = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown());
		TextenPubliceradIOpenAcess.selectByIndex(1);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).sendKeys(ExternLänkFörPublicering);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).getAttribute("value") != ExternLänkFörPublicering)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).sendKeys(ExternLänkFörPublicering);
		}

		Select FormAvOA = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA());
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);

		Select DokumentVersion = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion());
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = DokumentVersion.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		DokumentVersion.selectByIndex(number2);

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).sendKeys(Sammanfattning);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).getAttribute("value") != Sammanfattning)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).sendKeys(Sammanfattning);
		}
	}
}
