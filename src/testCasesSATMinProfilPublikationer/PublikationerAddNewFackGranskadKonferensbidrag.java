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


public class PublikationerAddNewFackGranskadKonferensbidrag extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en fackgranskad Konferensbidrag";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
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
//
//	}
//
//	@Test (dependsOnMethods={"VäljPublikationsTyp"})
//	public void DropDownKonferensbidrag() {
//
//		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());
//		Select Publikationstyp = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());
//
//		if (driver.getPageSource().contains("Publikationer"))
//		{
//			Publikationstyp.selectByVisibleText("Konferensbidrag");
//		}
//		else if (driver.getPageSource().contains("Publications")) 
//		{
//			Publikationstyp.selectByVisibleText("Conference contribution");
//		}	
//	}
//
//	@Test (dependsOnMethods={"DropDownKonferensbidrag"})
	public void KonferensbidragFörfattareKnapp() {

		GemensammaMetoder.LoggainPublikation(driver);
		GemensammaMetoder.PublikationFackgranskad(driver);

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareKnapp()).click();
	}

	@Test (dependsOnMethods={"KonferensbidragFörfattareKnapp"})
	public void KonferensbidragTitel() {

		String KonferensbidragTitel = "Testtitel123";

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(KonferensbidragTitel);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).getAttribute("value") != KonferensbidragTitel)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(KonferensbidragTitel);
		}
	}

	@Test (dependsOnMethods={"KonferensbidragTitel"})
	public void KonferensbidragFörfattareFörnamn() {

		String FörfattareFörnamn = "Förnamn";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).sendKeys(FörfattareFörnamn);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).getAttribute("value") != FörfattareFörnamn)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).sendKeys(FörfattareFörnamn);
		}
	}

	@Test (dependsOnMethods={"KonferensbidragFörfattareFörnamn"})
	public void KonferensbidragFörfattareEfternamn() {

		String FörfattareEfternamn = "Efternamn";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).sendKeys(FörfattareEfternamn);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).getAttribute("value") != FörfattareEfternamn)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).sendKeys(FörfattareEfternamn);
		}
	}

	@Test (dependsOnMethods={"KonferensbidragFörfattareEfternamn"})
	public void KonferensbidragNamnPåTidskrift() {

		String NamnPåTidskrift = "Tidskrift";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnPåTidskrift()).sendKeys(NamnPåTidskrift);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnPåTidskrift()).getAttribute("value") != NamnPåTidskrift)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnPåTidskrift()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnPåTidskrift()).sendKeys(NamnPåTidskrift);
		}
	}

	@Test (dependsOnMethods={"KonferensbidragNamnPåTidskrift"})
	public void KonferensbidragVolym() {

		String Volym = "10";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym()).sendKeys(Volym);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym()).getAttribute("value") != Volym)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym()).sendKeys(Volym);
		}

	}

	@Test (dependsOnMethods={"KonferensbidragVolym"})
	public void KonferensbidragUtfärdandenummer() {

		String Utfärdandenummer = "2786";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtfärdandenummer()).sendKeys(Utfärdandenummer);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtfärdandenummer()).getAttribute("value") != Utfärdandenummer)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtfärdandenummer()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtfärdandenummer()).sendKeys(Utfärdandenummer);
		}
	}

	@Test (dependsOnMethods={"KonferensbidragUtfärdandenummer"})
	public void KonferensbidragFörstaSidnummer() {

		String FörstaSidnummer = "1";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer()).sendKeys(FörstaSidnummer);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer()).getAttribute("value") != FörstaSidnummer)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer()).sendKeys(FörstaSidnummer);
		}
	}

	@Test (dependsOnMethods={"KonferensbidragFörstaSidnummer"})
	public void KonferensbidragSistaSidnummer() {

		String Sistasidnummer = "199";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).sendKeys(Sistasidnummer);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).getAttribute("value") != Sistasidnummer)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).sendKeys(Sistasidnummer);
		}
	}

	@Test (dependsOnMethods={"KonferensbidragSistaSidnummer"})
	public void KonferensbidragDOI() {

		String DOI = "1234";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).sendKeys(DOI);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).getAttribute("value") != DOI)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).sendKeys(DOI);
		}
	}

	@Test (dependsOnMethods={"KonferensbidragDOI"})
	public void KonferensbidragKällaFörPublikation() {

		Select KällaFörPublikation = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaFörPublikation());

		Random randomOption = new Random();  
		int endOption = KällaFörPublikation.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		KällaFörPublikation.selectByIndex(number);
	}

	@Test (dependsOnMethods={"KonferensbidragKällaFörPublikation"})
	public void KonferensbidragStatus() {

		Select Status = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus());
		Status.selectByIndex(0);
	}

	@Test (dependsOnMethods={"KonferensbidragStatus"})
	public void KonferensbidragKällaID() {

		String KällaId = "1234";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).sendKeys(KällaId);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).getAttribute("value") != KällaId)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).sendKeys(KällaId);
		}
	}

	@Test (dependsOnMethods={"KonferensbidragKällaID"})
	public void KonferensbidragVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown());
		TextenPubliceradIOpenAcess.selectByIndex(1);
	}

	@Test (dependsOnMethods={"KonferensbidragVarTextenPubliceradIOpenAcessJa"})
	public void KonferensbidragOpenAccessLänkExternLänkFörPublicering() {

		String LänkFörPublicering = "Testlänk";

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering());

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).sendKeys(LänkFörPublicering);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).getAttribute("value") != LänkFörPublicering)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).sendKeys(LänkFörPublicering);
		}

	}

	@Test (dependsOnMethods={"KonferensbidragOpenAccessLänkExternLänkFörPublicering"})
	public void KonferensbidragOpenAccessFormAvOA() {

		Select FormAvOA = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA());
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);
	}

	@Test (dependsOnMethods={"KonferensbidragOpenAccessFormAvOA"})
	public void KonferensbidragOpenAccessDokumentVersion() {

		Select DokumentVersion = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion());
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);

	}

	@Test (dependsOnMethods={"KonferensbidragOpenAccessDokumentVersion"})
	public void KonferensbidragOpenAcessSammanfattning() {

		String OpenAccessSammanfattning = "Jag skriver en riktigt bra sammanfattning";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).sendKeys(OpenAccessSammanfattning);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).getAttribute("value") != OpenAccessSammanfattning)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).sendKeys(OpenAccessSammanfattning);
		}
	}

	@Test (dependsOnMethods={"KonferensbidragOpenAcessSammanfattning"})
	public void KonferensbidragSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara()).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}
}