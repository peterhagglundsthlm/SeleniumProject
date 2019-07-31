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


public class PublikationerAddNewFackGranskadOriginellaBidragTillVetenskapligaTidskriften extends BeforeAfterTestBrowsers {


	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en fackgranskad Originella bidrag till vetenskapliga tidskriften";
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
//	}
//
//	@Test (dependsOnMethods={"VäljPublikationsTyp"})
	public void DropDownOriginellaBidragTillVetenskapligaTidskriften() {

		GemensammaMetoder.LoggainPublikation(driver);
		GemensammaMetoder.PublikationFackgranskad(driver);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());
		Select Publikationstyp = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown());

		if (driver.getPageSource().contains("Publikationer"))
		{
			Publikationstyp.selectByVisibleText("Originella bidrag till vetenskapliga tidskriften");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			Publikationstyp.selectByVisibleText("Original contribution to science journal");
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenFörfattareKnapp"})
	public void OriginellaBidragTillVetenskapligaTidskriftenTitel() {

		String Titel = "TestTitel123";
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(Titel);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).getAttribute("value") != Titel)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel()).sendKeys(Titel);
		}
	}
	
	@Test (dependsOnMethods={"DropDownOriginellaBidragTillVetenskapligaTidskriften"})
	public void OriginellaBidragTillVetenskapligaTidskriftenFörfattareKnapp() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareKnapp()).click();
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenTitel"})
	public void OriginellaBidragTillVetenskapligaTidskriftenFörfattareFörnamn() {

		String Förnamn = "Förnamn";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).sendKeys(Förnamn);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).getAttribute("value") != Förnamn)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn()).sendKeys(Förnamn);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenFörfattareFörnamn"})
	public void OriginellaBidragTillVetenskapligaTidskriftenFörfattareEfternamn() {

		String Efternamn = "Efternamn";
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).sendKeys(Efternamn);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).getAttribute("value") != Efternamn)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn()).sendKeys(Efternamn);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenFörfattareEfternamn"})
	public void OriginellaBidragTillVetenskapligaTidskriftenNamnPåTidskrift() {

		String NamnPåTidskrift = "Tidskrift";
				
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnPåTidskrift()).sendKeys(NamnPåTidskrift);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnPåTidskrift()).getAttribute("value") != NamnPåTidskrift)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnPåTidskrift()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnPåTidskrift()).sendKeys(NamnPåTidskrift);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenNamnPåTidskrift"})
	public void OriginellaBidragTillVetenskapligaTidskriftenVolym() {

		String Volym = "145";
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym()).sendKeys(Volym);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym()).getAttribute("value") != Volym)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym()).sendKeys(Volym);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenVolym"})
	public void OriginellaBidragTillVetenskapligaTidskriftenUtfärdandenummer() {

		String Utfärdandenummer = "276";
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtfärdandenummer()).sendKeys(Utfärdandenummer);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtfärdandenummer()).getAttribute("value") != Utfärdandenummer)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtfärdandenummer()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtfärdandenummer()).sendKeys(Utfärdandenummer);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenUtfärdandenummer"})
	public void OriginellaBidragTillVetenskapligaTidskriftenFörstaSidnummer() {

		String FörstaSidnummer = "1";
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer()).sendKeys(FörstaSidnummer);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer()).getAttribute("value") != FörstaSidnummer)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer()).sendKeys(FörstaSidnummer);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenFörstaSidnummer"})
	public void OriginellaBidragTillVetenskapligaTidskriftenSistaSidnummer() {

		String SistaSidnummer = "999";
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).sendKeys(SistaSidnummer);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).getAttribute("value") != SistaSidnummer)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer()).sendKeys(SistaSidnummer);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenSistaSidnummer"})
	public void OriginellaBidragTillVetenskapligaTidskriftenDOI() {

		String DOI = "123456";
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).sendKeys(DOI);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).getAttribute("value") != DOI)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI()).sendKeys(DOI);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenKällaFörPublikation"})
	public void OriginellaBidragTillVetenskapligaTidskriftenStatus() {

		Select Status = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus());
		Status.selectByIndex(0);
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenDOI"})
	public void OriginellaBidragTillVetenskapligaTidskriftenKällaFörPublikation() {

		Select KällaFörPublikation = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaFörPublikation());

		Random randomOption = new Random();  
		int endOption = KällaFörPublikation.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		KällaFörPublikation.selectByIndex(number);
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenStatus"})
	public void OriginellaBidragTillVetenskapligaTidskriftenKällaID() {

		String KällaId = "1234";
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).sendKeys(KällaId);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).getAttribute("value") != KällaId)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID()).sendKeys(KällaId);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenKällaID"})
	public void OriginellaBidragTillVetenskapligaTidskriftenVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown());
		TextenPubliceradIOpenAcess.selectByIndex(1);
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenVarTextenPubliceradIOpenAcessJa"})
	public void OriginellaBidragTillVetenskapligaTidskriftenOpenAccessLänkExternLänkFörPublicering() {

		String LänkFörPublicering = "Testlänk";
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering());

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).sendKeys(LänkFörPublicering);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).getAttribute("value") != LänkFörPublicering)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering()).sendKeys(LänkFörPublicering);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenOpenAccessLänkExternLänkFörPublicering"})
	public void OriginellaBidragTillVetenskapligaTidskriftenOpenAccessFormAvOA() {

		Select FormAvOA = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA());
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenOpenAccessFormAvOA"})
	public void OriginellaBidragTillVetenskapligaTidskriftenOpenAccessDokumentVersion() {

		Select DokumentVersion = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion());
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);

	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenOpenAccessDokumentVersion"})
	public void OriginellaBidragTillVetenskapligaTidskriftenOpenAcessSammanfattning() {

		String Sammanfattning = "En riktigt bra sammanfattning";
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).sendKeys(Sammanfattning);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).getAttribute("value") != Sammanfattning)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning()).sendKeys(Sammanfattning);
		}
	}

	@Test (dependsOnMethods={"OriginellaBidragTillVetenskapligaTidskriftenOpenAcessSammanfattning"})
	public void OriginellaBidragTillVetenskapligaTidskriftenSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara()).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}
}