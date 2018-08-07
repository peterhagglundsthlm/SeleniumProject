package testCasesSATMinProfilPublikationer;

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

public class PublikationerAddNewFackGranskadBok extends BeforeAfterTestBrowsers {


	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en fackgranskad Bok";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginAsUser() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil));
		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();

	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickPublikationer() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer(driver).click();
	}

	@Test (dependsOnMethods={"ClickPublikationer"})
	public void LäggTillPublikationer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_LäggTill(driver).click();
	}

	@Test (dependsOnMethods={"LäggTillPublikationer"})
	public void VäljPublikationsTyp() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp));
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp)));
		Publikationstyp.selectByIndex(1);
	}

	@Test (dependsOnMethods={"VäljPublikationsTyp"})
	public void DropDownBok() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown));
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown)));
		Publikationstyp.selectByIndex(2);
		
		WebElement PublikationstypSelect = Publikationstyp.getFirstSelectedOption();
		String PublikationstypSelectValue = PublikationstypSelect.getText();
		System.out.println("Vetenskaplig publikation = " + PublikationstypSelectValue ); 
	}

	@Test (dependsOnMethods={"DropDownBok"})
	public void BokFörfattareKnapp() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareKnapp(driver).click();
	}

	@Test (dependsOnMethods={"BokFörfattareKnapp"})
	public void BokTitel() {

		String Boktitel = "TestTitel123";
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).sendKeys(Boktitel);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).getAttribute("value") != Boktitel)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).sendKeys(Boktitel);
		}
		String BoktitelValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).getAttribute("value");
		System.out.println("Boktitel = " + BoktitelValue); 

	}

	@Test (dependsOnMethods={"BokTitel"})
	public void BokFörfattareFörnamn() {

		String FörfattareFörnamn = "Förnamn";
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn(driver).sendKeys(FörfattareFörnamn);
		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn(driver).getAttribute("value") != FörfattareFörnamn)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn(driver).sendKeys(FörfattareFörnamn);
		}
		String FörfattareFörnamnValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn(driver).getAttribute("value");
		System.out.println("Förnamn = " + FörfattareFörnamnValue); 
	}

	@Test (dependsOnMethods={"BokFörfattareFörnamn"})
	public void BokFörfattareEfternamn() {

		String FörfattareEfternamn = "Efternamn";
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn(driver).sendKeys(FörfattareEfternamn);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn(driver).getAttribute("value") != FörfattareEfternamn)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn(driver).sendKeys(FörfattareEfternamn);
		}
		String FörfattareEfternamnValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn(driver).getAttribute("value");
		System.out.println("Efternamn = " + FörfattareEfternamnValue); 
	}

	@Test (dependsOnMethods={"BokFörfattareEfternamn"})
	public void BokUtgivareFörlag() {

		String Förlag = "Testförlag";
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag(driver).sendKeys(Förlag);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag(driver).getAttribute("value") != Förlag)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag(driver).sendKeys(Förlag);
		}
		String FörlagValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag(driver).getAttribute("value");
		System.out.println("Förlag = " + FörlagValue); 
	}

	@Test (dependsOnMethods={"BokUtgivareFörlag"})
	public void BokUtgivareFörlagsplats() {

		String Förlagsplats = "Förlagsplatstest";
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats(driver).sendKeys(Förlagsplats);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats(driver).getAttribute("value") != Förlagsplats)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats(driver).sendKeys(Förlagsplats);
		}
		String FörlagsplatsValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats(driver).getAttribute("value");
		System.out.println("Förlagsplats = " + FörlagsplatsValue); 
	}

	@Test (dependsOnMethods={"BokUtgivareFörlagsplats"})
	public void BokUtgivareISBN() {

		String ISBN = "898989";
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN(driver).sendKeys(ISBN);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN(driver).getAttribute("value") != ISBN)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN(driver).sendKeys(ISBN);
		}
		String ISBNValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN(driver).getAttribute("value");
		System.out.println("ISBN = " + ISBNValue); 
	}

	@Test (dependsOnMethods={"BokUtgivareISBN"})
	public void BokUtgivareDOI() {

		String DOI = "1234567";
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).sendKeys(DOI);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).getAttribute("value") != DOI)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).sendKeys(DOI);
		}
		String DOIValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI(driver).getAttribute("value");
		System.out.println("DOI = " + DOIValue); 
	}

	@Test (dependsOnMethods={"BokUtgivareDOI"})
	public void BokUtgivareKällaFörPublikation() {

		Select KällaFörPublikation = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaFörPublikation)));
		Random randomOption = new Random();  
		int endOption = KällaFörPublikation.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		KällaFörPublikation.selectByIndex(number);
		
		WebElement KällaFörPublikationSelect = KällaFörPublikation.getFirstSelectedOption();
		String KällaFörPublikationSelectValue = KällaFörPublikationSelect.getText();
		System.out.println("KällaFörPublikation = " + KällaFörPublikationSelectValue); 
	}

	@Test (dependsOnMethods={"BokUtgivareKällaFörPublikation"})
	public void BokUtgivareKällaID() {

		String KällaId = "1234";
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID(driver).sendKeys(KällaId);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID(driver).getAttribute("value") != KällaId)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID(driver).sendKeys(KällaId);
		}
		String KällaIdValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID(driver).getAttribute("value");
		System.out.println("KällaId = " + KällaIdValue); 
	}

	@Test (dependsOnMethods={"BokUtgivareKällaID"})
	public void BokVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown)));
		TextenPubliceradIOpenAcess.selectByIndex(1);
		
		WebElement TextenPubliceradIOpenAcessSelect = TextenPubliceradIOpenAcess.getFirstSelectedOption();
		String TextenPubliceradIOpenAcessSelectValue = TextenPubliceradIOpenAcessSelect.getText();
		System.out.println("Var texten publicerad i open acess? = " + TextenPubliceradIOpenAcessSelectValue); 
	}
	

	@Test (dependsOnMethods={"BokVarTextenPubliceradIOpenAcessJa"})
	public void BokOpenAccessLänkExternLänkFörPublicering() {

		String LänkFörPublicering = "Testlänk";
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering(driver).sendKeys(LänkFörPublicering);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering(driver).getAttribute("value") != LänkFörPublicering)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering(driver).sendKeys(LänkFörPublicering);
		}
		String LänkFörPubliceringValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering(driver).getAttribute("value");
		System.out.println("Länk för publicering = " + LänkFörPubliceringValue); 
	}

	@Test (dependsOnMethods={"BokOpenAccessLänkExternLänkFörPublicering"})
	public void BokOpenAccessFormAvOA() {

		Select FormAvOA= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);
		
		WebElement FormAvOASelect = FormAvOA.getFirstSelectedOption();
		String FormAvOASelectValue = FormAvOASelect.getText();
		System.out.println("Form av OA = " + FormAvOASelectValue); 
	}

	@Test (dependsOnMethods={"BokOpenAccessFormAvOA"})
	public void BokOpenAccessDokumentVersion() {

		Select DokumentVersion= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);
		
		WebElement DokumentVersionSelect = DokumentVersion.getFirstSelectedOption();
		String DokumentVersionSelectValue = DokumentVersionSelect.getText();
		System.out.println("Dokumentversion = " + DokumentVersionSelectValue); 
	}

	@Test (dependsOnMethods={"BokOpenAccessDokumentVersion"})
	public void BokOpenAcessSammanfattning() {

		String Sammanfattning = "Jag skriver en riktigt bra sammanfattning";
		
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).sendKeys(Sammanfattning);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).getAttribute("value") != Sammanfattning)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).sendKeys(Sammanfattning);
		}
		String SammanfattningValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning(driver).getAttribute("value");
		System.out.println("Sammanfattning = " + SammanfattningValue); 
	}

	@Test (dependsOnMethods={"BokOpenAcessSammanfattning"})
	public void BokSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara(driver).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}

}



