package testCasesSAT;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utility.UserCredentials;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsUserMinProfil;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class ArbetslivAddNewINTEFackGranskadBidragTillBok extends BeforeAfterTestBrowsers {


	String TestCaseInfo = "Loggar in som en projektledare och lägger till en INTE fackgranskad Bidrag till Bok";

	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome_Xpath(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.jagtestarprismaSATuserName, UserCredentials.jagtestarprismaSATpassword);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Xpath);
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickPublikationer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickPublikationer"})
	public void LäggTillPublikationer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_LäggTill_Css(driver).click();
	}

	@Test (dependsOnMethods={"LäggTillPublikationer"})
	public void VäljPublikationsTyp() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp_Id);
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp_Id)));
		Publikationstyp.selectByIndex(2);
	}

	@Test (dependsOnMethods={"VäljPublikationsTyp"})
	public void DropDownBidragTillEnBok() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown_Id);
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown_Id)));
		Publikationstyp.selectByIndex(1);
	}

	@Test (dependsOnMethods={"DropDownBidragTillEnBok"})
	public void BidragTillEnBokTitel() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel_Id);
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel_Id(driver).sendKeys("TestTitel123");

	}

	@Test (dependsOnMethods={"BidragTillEnBokTitel"})
	public void BidragTillEnBokFörfattareKnapp() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareKnapp_Id(driver).click();

	}

	@Test (dependsOnMethods={"BidragTillEnBokFörfattareKnapp"})
	public void BidragTillEnBokFörfattareFörnamn() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn_Id(driver).sendKeys("Förnamn");
	}

	@Test (dependsOnMethods={"BidragTillEnBokFörfattareFörnamn"})
	public void BidragTillEnBokFörfattareEfternamn() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn_Id(driver).sendKeys("Efternamn");
	}

	@Test (dependsOnMethods={"BidragTillEnBokFörfattareEfternamn"})
	public void BidragTillEnBokRedaktörKnapp() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedaktörKnapp_Id);
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedaktörKnapp_Id(driver).click();
	}

	@Test (dependsOnMethods={"BidragTillEnBokRedaktörKnapp"})
	public void BidragTillEnBokRedaktörNamn() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedaktörNamn_Id);
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationRedaktörNamn_Id(driver).sendKeys("NamnTest");
	}

	@Test (dependsOnMethods={"BidragTillEnBokRedaktörNamn"})
	public void BidragTillEnBokUtgivareFörlag() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag_Id(driver).sendKeys("TestFörlag");
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareFörlag"})
	public void BidragTillEnBokUtgivareFörlagsplats() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats_Id(driver).sendKeys("FörlagsaplatsTest");
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareFörlagsplats"})
	public void BidragTillEnBokUtgivareFörstaSidnummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer_Id(driver).sendKeys("1");
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareFörstaSidnummer"})
	public void BidragTillEnBokUtgivareSistaSidnummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer_Id(driver).sendKeys("99");
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareSistaSidnummer"})
	public void BidragTillEnBokUtgivareISBN() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN_Id(driver).sendKeys("1234567");
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareISBN"})
	public void BidragTillEnBokUtgivareDOI() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI_Id(driver).sendKeys("1234567");
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareDOI"})
	public void BidragTillEnBokUtgivareStatus() {

		Select Status = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus_Id)));
		Status.selectByIndex(0);
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareStatus"})
	public void BidragTillEnBokUtgivareKällaFörPublikation() {

		Select KällaFörPublikation = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaFörPublikation_Id)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = KällaFörPublikation.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		KällaFörPublikation.selectByIndex(number);
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareKällaFörPublikation"})
	public void BidragTillEnBokUtgivareKällaID() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID_Id(driver).sendKeys("1234");
	}

	@Test (dependsOnMethods={"BidragTillEnBokUtgivareKällaID"})
	public void BidragTillEnBokVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown_Id)));
		TextenPubliceradIOpenAcess.selectByIndex(1);
	}

	@Test (dependsOnMethods={"BidragTillEnBokVarTextenPubliceradIOpenAcessJa"})
	public void BidragTillEnBokOpenAccessLänkExternLänkFörPublicering() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering_Id);
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering_Id(driver).sendKeys("Testlänk");
	}

	@Test (dependsOnMethods={"BidragTillEnBokOpenAccessLänkExternLänkFörPublicering"})
	public void BidragTillEnBokOpenAccessFormAvOA() {

		Select FormAvOA= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA_Id)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);
	}

	@Test (dependsOnMethods={"BidragTillEnBokOpenAccessFormAvOA"})
	public void BidragTillEnBokOpenAccessDokumentVersion() {

		Select DokumentVersion= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion_Id)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);
	}

	@Test (dependsOnMethods={"BidragTillEnBokOpenAccessDokumentVersion"})
	public void BidragTillEnBokOpenAcessSammanfattning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning_Id(driver).sendKeys("Jag skriver en riktigt bra sammanfattning");
	}

	@Test (dependsOnMethods={"BidragTillEnBokOpenAcessSammanfattning"})
	public void BidragTillEnBokSpara() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara_Id(driver).click();
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, "//button[contains(text(), 'Ok')]");
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}
}


