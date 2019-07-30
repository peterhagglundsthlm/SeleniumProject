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


public class PublikationerAddNewFackGranskadProceedings extends BeforeAfterTestBrowsers {


	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en fackgranskad Proceedings";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

//	@Test
//	public void LoginAsUser() {
//
//		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
//	}
//
//	@Test (dependsOnMethods={"LoginAsUser"})
//	public void ClickPublikationer() {
//
//		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer(driver).click();
//	}
//
//	@Test (dependsOnMethods={"ClickPublikationer"})
//	public void LäggTillPublikationer() {
//
//		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_LäggTill(driver).click();
//	}

	
	@Test (dependsOnMethods={"LäggTillPublikationer"})
	public void VäljPublikationsTyp() {
		
		GemensammaMetoder.LoggainPublikation(driver);
		GemensammaMetoder.PublikationFackgranskad(driver);
//		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp));
//		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp)));
//
//		if (driver.getPageSource().contains("Publikationer"))
//		{
//			Publikationstyp.selectByVisibleText("Vetenskaplig publikation - fackgranskade");
//		}
//		else if (driver.getPageSource().contains("Publications")) 
//		{
//			Publikationstyp.selectByVisibleText("Scientific publication - peer-reviewed");
//		}
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
	}

	@Test (dependsOnMethods={"VäljPublikationsTyp"})
	public void DropDownProceedings() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown));
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown)));
		
		if (driver.getPageSource().contains("Publikationer"))
		{
			Publikationstyp.selectByVisibleText("Proceedings");
		}
		else if (driver.getPageSource().contains("Publications")) 
		{
			Publikationstyp.selectByVisibleText("Proceedings");
		}
	}

	@Test (dependsOnMethods={"DropDownProceedings"})
	public void ProceedingsFörfattareKnapp() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareKnapp(driver).click();
	}

	@Test (dependsOnMethods={"ProceedingsFörfattareKnapp"})
	public void ProceedingsTitel() {

		String titel = "Testtitel";
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).sendKeys(titel);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).getAttribute("value") != titel)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).sendKeys(titel);
		}

	}

	@Test (dependsOnMethods={"ProceedingsTitel"})
	public void ProceedingsFörfattareFörnamn() {

		String Förnamn = "Förnamn";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn(driver).sendKeys(Förnamn);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn(driver).getAttribute("value") != Förnamn)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn(driver).sendKeys(Förnamn);
		}
	}

	@Test (dependsOnMethods={"ProceedingsFörfattareFörnamn"})
	public void ProceedingsFörfattareEfternamn() {

		String Efternamn = "Efternamn";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn(driver).sendKeys(Efternamn);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn(driver).getAttribute("value") != Efternamn)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn(driver).sendKeys(Efternamn);
		}
	}

	@Test (dependsOnMethods={"ProceedingsFörfattareEfternamn"})
	public void ProceedingsFörlag() {

		String Förlag = "Testförlag";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag(driver).sendKeys(Förlag);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag(driver).getAttribute("value") !=Förlag)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag(driver).sendKeys(Förlag);
		}
	}

	@Test (dependsOnMethods={"ProceedingsFörlag"})
	public void ProceedingsFörlagsplats() {

		String Förlagsplats = "Förlagsaplats";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats(driver).sendKeys(Förlagsplats);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats(driver).getAttribute("value") != Förlagsplats)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats(driver).sendKeys(Förlagsplats);
		}
	}

	@Test (dependsOnMethods={"ProceedingsFörlagsplats"})
	public void ProceedingsDOI() {

		String DOI = "123456";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).sendKeys(DOI);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).getAttribute("value") !=DOI)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).sendKeys(DOI);
		}
	}

	@Test (dependsOnMethods={"ProceedingsDOI"})
	public void ProceedingsKällaFörPublikation() {

		Select KällaFörPublikation = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaFörPublikation)));
		Random randomOption = new Random();  
		int endOption = KällaFörPublikation.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		KällaFörPublikation.selectByIndex(number);
	}

	@Test (dependsOnMethods={"ProceedingsKällaFörPublikation"})
	public void ProceedingsStatus() {

		Select Status = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus)));
		Status.selectByIndex(0);
	}

	@Test (dependsOnMethods={"ProceedingsStatus"})
	public void ProceedingsKällaID() {

		String KällaId = "1234";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID(driver).sendKeys(KällaId);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID(driver).getAttribute("value") != KällaId)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID(driver).sendKeys(KällaId);
		}
	}

	@Test (dependsOnMethods={"ProceedingsKällaID"})
	public void ProceedingsVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown)));
		TextenPubliceradIOpenAcess.selectByIndex(1);
	}

	@Test (dependsOnMethods={"ProceedingsVarTextenPubliceradIOpenAcessJa"})
	public void ProceedingsOpenAccessLänkExternLänkFörPublicering() {

		String LänkFörPublicering = "Testlänk";
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering(driver).sendKeys(LänkFörPublicering);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering(driver).getAttribute("value") != LänkFörPublicering)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering(driver).sendKeys(LänkFörPublicering);
		}
	}

	@Test (dependsOnMethods={"ProceedingsOpenAccessLänkExternLänkFörPublicering"})
	public void ProceedingsOpenAccessFormAvOA() {

		Select FormAvOA= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);
	}

	@Test (dependsOnMethods={"ProceedingsOpenAccessFormAvOA"})
	public void ProceedingsOpenAccessDokumentVersion() {

		Select DokumentVersion= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);
	}

	@Test (dependsOnMethods={"ProceedingsOpenAccessDokumentVersion"})
	public void ProceedingsOpenAcessSammanfattning() {

		String Sammanfattning = "En riktigt bra sammanfattning";
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).sendKeys(Sammanfattning);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).getAttribute("value") != Sammanfattning)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).sendKeys(Sammanfattning);
		}
	}

	@Test (dependsOnMethods={"ProceedingsOpenAcessSammanfattning"})
	public void ProceedingsSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara(driver).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}

}