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


public class PublikationerAddNewFackGranskadBidragTillBok extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en fackgranskad Bidrag till Bok";
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
	public void DropDownBidragTillEnBok() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown));
		Select VetenskapligPublikation = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown)));
		VetenskapligPublikation.selectByIndex(1);

		WebElement VetenskapligPublikationSelect = VetenskapligPublikation.getFirstSelectedOption();
		String VetenskapligPublikationSelectValue = VetenskapligPublikationSelect.getText();
		System.out.println("Vetenskaplig publikation = " + VetenskapligPublikationSelectValue);
	}

	@Test (dependsOnMethods={"DropDownBidragTillEnBok"})
	public void BidragTillEnBokTitel() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel));

		String Boktitel = "TestTitel123";

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).sendKeys(Boktitel);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).getAttribute("value") == Boktitel)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).sendKeys(Boktitel);
		}

		String BoktitelValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel(driver).getAttribute("value");
		System.out.println("Boktitel = " + BoktitelValue); 

	}

	@Test (dependsOnMethods={"BidragTillEnBokTitel"})
	public void BidragTillEnBokFörfattareKnapp() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareKnapp(driver).click();
	}

	@Test (dependsOnMethods={"BidragTillEnBokFörfattareKnapp"})
	public void BidragTillEnBokFörfattareFörnamn() {

		String Förnamn = "Förnamntest";

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn(driver).sendKeys(Förnamn);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn(driver).getAttribute("value") != Förnamn)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn(driver).sendKeys(Förnamn);
		}
		String FörnamnValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn(driver).getAttribute("value");
		System.out.println("Författarens förnamn är = " + FörnamnValue);

	}

	@Test (dependsOnMethods={"BidragTillEnBokFörfattareFörnamn"})
	public void BidragTillEnBokFörfattareEfternamn() {

		String Efternamn = "TestEfternamn";

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn(driver).sendKeys(Efternamn);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn(driver).getAttribute("value") != Efternamn)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn(driver).sendKeys(Efternamn);
		}
		String EfternamnValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn(driver).getAttribute("value");
		System.out.println("Författarens efternamn är = " + EfternamnValue);
	}

	@Test (dependsOnMethods={"BidragTillEnBokFörfattareEfternamn"})
	public void BidragTillEnBokRedaktörKnapp() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedaktörKnapp));
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedaktörKnapp(driver).click();
	}

	@Test (dependsOnMethods={"BidragTillEnBokRedaktörKnapp"})
	public void BidragTillEnBokRedaktörNamn() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedaktörNamn));
		String Redaktörnamn = "Testredaktörnamn";

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedaktörNamn(driver).sendKeys(Redaktörnamn);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedaktörNamn(driver).getAttribute("value") != Redaktörnamn)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedaktörNamn(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedaktörNamn(driver).sendKeys(Redaktörnamn);
		}
		String RedaktörnamnValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedaktörNamn(driver).getAttribute("value");
		System.out.println("Redaktör = " + RedaktörnamnValue);
	}

	@Test (dependsOnMethods={"BidragTillEnBokRedaktörNamn"})
	public void BidragTillEnBokUtgivareFörlag() {

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

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareFörlag"})
	public void BidragTillEnBokUtgivareFörlagsplats() {

		String Förlagsplats = "FörlagsaplatsTest";

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats(driver).sendKeys(Förlagsplats);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats(driver).getAttribute("value") != Förlagsplats)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats(driver).sendKeys(Förlagsplats);
		}

		String FörlagsplatsValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats(driver).getAttribute("value");
		System.out.println("Förlagsplatts = " + FörlagsplatsValue);
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareFörlagsplats"})
	public void BidragTillEnBokUtgivareFörstaSidnummer() {

		String FörstaSidnummer = "1";

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer(driver).sendKeys(FörstaSidnummer);
		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer(driver).getAttribute("value") != FörstaSidnummer)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer(driver).sendKeys(FörstaSidnummer);
		}
		String FörstaSidnummerValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer(driver).getAttribute("value");
		System.out.println("Fösta sidnummer = " + FörstaSidnummerValue);
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareFörstaSidnummer"})
	public void BidragTillEnBokUtgivareSistaSidnummer() {

		String Sistasidnummer = "99";

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(driver).sendKeys(Sistasidnummer);
		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(driver).getAttribute("value") != Sistasidnummer)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(driver).sendKeys(Sistasidnummer);
		}
		String SistasidnummerValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer(driver).getAttribute("value");
		System.out.println("Sista sidnummer = " + SistasidnummerValue);
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareSistaSidnummer"})
	public void BidragTillEnBokUtgivareISBN() {

		String ISBN = "98989";

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN(driver).sendKeys(ISBN);

		if(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN(driver).getAttribute("value") != ISBN)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN(driver).sendKeys(ISBN);
		}
		String ISBNValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN(driver).getAttribute("value");
		System.out.println("ISBN = " + ISBNValue);
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareISBN"})
	public void BidragTillEnBokUtgivareDOI() {

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

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareDOI"})
	public void BidragTillEnBokUtgivareStatus() {

		Select Status = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus)));
		Status.selectByIndex(0);

		WebElement StatusSelect = Status.getFirstSelectedOption();
		String StatusSelectValue = StatusSelect.getText();
		System.out.println("Utgivare status = " + StatusSelectValue ); 
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareStatus"})
	public void BidragTillEnBokUtgivareKällaFörPublikation() {

		Select KällaFörPublikation = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaFörPublikation)));
		Random randomOption = new Random();  
		int endOption = KällaFörPublikation.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		KällaFörPublikation.selectByIndex(number);

		WebElement KällaFörPublikationSelect = KällaFörPublikation.getFirstSelectedOption();
		String KällaFörPublikationSelectValue = KällaFörPublikationSelect.getText();
		System.out.println("Källa för publikation = " + KällaFörPublikationSelectValue); 
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareKällaFörPublikation"})
	public void BidragTillEnBokUtgivareKällaID() {

		String KällaId = "1234";

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID(driver).sendKeys(KällaId);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID(driver).getAttribute("value") != KällaId)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID(driver).sendKeys(KällaId);
		}
		String KällaIdValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID(driver).getAttribute("value");
		System.out.println("KällaId = " + KällaIdValue); 
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareKällaID"})
	public void BidragTillEnBokVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown)));
		TextenPubliceradIOpenAcess.selectByIndex(1);

		WebElement TextenPubliceradIOpenAcessSelect = TextenPubliceradIOpenAcess.getFirstSelectedOption();
		String TextenPubliceradIOpenAcessSelectValue = TextenPubliceradIOpenAcessSelect.getText();
		System.out.println("Var poken publicerad i open acess? = " + TextenPubliceradIOpenAcessSelectValue ); 
	}

	@Test (dependsOnMethods={"BidragTillEnBokVarTextenPubliceradIOpenAcessJa"})
	public void BidragTillEnBokOpenAccessLänkExternLänkFörPublicering() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering));

		String ExternLänkFörPublicering = "Testlänk";

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering(driver).sendKeys(ExternLänkFörPublicering);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering(driver).getAttribute("value") != ExternLänkFörPublicering)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering(driver).sendKeys(ExternLänkFörPublicering);
		}
		String ExternLänkFörPubliceringValue = PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering(driver).getAttribute("value");
		System.out.println("Extern länk för publicering = " + ExternLänkFörPubliceringValue); 
	}

	@Test (dependsOnMethods={"BidragTillEnBokOpenAccessLänkExternLänkFörPublicering"})
	public void BidragTillEnBokOpenAccessFormAvOA() {

		Select FormAvOA= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);

		WebElement FormAvOASelect = FormAvOA.getFirstSelectedOption();
		String FormAvOASelectValue = FormAvOASelect.getText();
		System.out.println("Form av OA = " + FormAvOASelectValue ); 

	}

	@Test (dependsOnMethods={"BidragTillEnBokOpenAccessFormAvOA"})
	public void BidragTillEnBokOpenAccessDokumentVersion() {

		Select DokumentVersion= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);

		WebElement DokumentVersionSelect = DokumentVersion.getFirstSelectedOption();
		String DokumentVersionSelectValue = DokumentVersionSelect.getText();
		System.out.println("Dokumentversion = " + DokumentVersionSelectValue ); 
	}

	@Test (dependsOnMethods={"BidragTillEnBokOpenAccessDokumentVersion"})
	public void BidragTillEnBokOpenAcessSammanfattning() {

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

	@Test (dependsOnMethods={"BidragTillEnBokOpenAcessSammanfattning"})
	public void BidragTillEnBokSpara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara(driver).click();
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("//button[contains(text(), 'Ok')]"));
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}




}