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

public class ArbetslivAddNewINTEFackGranskadBok extends BeforeAfterTestBrowsers {
	
	String TestCaseInfo = "Loggar in som en projektledare och lägger till en INTE fackgranskad Bok";

	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);
		driver.manage().window().maximize();
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

	@Test (dependsOnMethods={"ClickPublikationer"})
	public void VäljPublikationsTyp() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp_Id);
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp_Id)));
		Publikationstyp.selectByIndex(2);
	}

	@Test (dependsOnMethods={"VäljPublikationsTyp"})
	public void DropDownBok() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown_Id);
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown_Id)));
		Publikationstyp.selectByIndex(2);
	}

	@Test (dependsOnMethods={"DropDownBok"})
	public void BokFörfattareKnapp() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareKnapp_Id(driver).click();
	}

	@Test (dependsOnMethods={"BokFörfattareKnapp"})
	public void BokTitel() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel_Id);
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel_Id(driver).sendKeys("TestTitel123");

	}

	@Test (dependsOnMethods={"BokTitel"})
	public void BokFörfattareFörnamn() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn_Id(driver).sendKeys("Förnamn");
	}

	@Test (dependsOnMethods={"BokFörfattareFörnamn"})
	public void BokFörfattareEfternamn() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn_Id(driver).sendKeys("Efternamn");
	}

	@Test (dependsOnMethods={"BokFörfattareEfternamn"})
	public void BokUtgivareFörlag() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag_Id(driver).sendKeys("TestFörlag");
	}

	@Test (dependsOnMethods={"BokUtgivareFörlag"})
	public void BokUtgivareFörlagsplats() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats_Id(driver).sendKeys("FörlagsaplatsTest");
	}

	@Test (dependsOnMethods={"BokUtgivareFörlagsplats"})
	public void BokUtgivareISBN() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN_Id(driver).sendKeys("1234567");
	}

	@Test (dependsOnMethods={"BokUtgivareISBN"})
	public void BokUtgivareDOI() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI_Id(driver).sendKeys("1234567");
	}

	@Test (dependsOnMethods={"BokUtgivareDOI"})
	public void BokUtgivareKällaFörPublikation() {

		Select KällaFörPublikation = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaFörPublikation_Id)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = KällaFörPublikation.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		KällaFörPublikation.selectByIndex(number);
	}

	@Test (dependsOnMethods={"BokUtgivareKällaFörPublikation"})
	public void BokUtgivareKällaID() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID_Id(driver).sendKeys("1234");
	}

	@Test (dependsOnMethods={"BokUtgivareKällaID"})
	public void BokVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown_Id)));
		TextenPubliceradIOpenAcess.selectByIndex(1);
	}

	@Test (dependsOnMethods={"BokVarTextenPubliceradIOpenAcessJa"})
	public void BokOpenAccessLänkExternLänkFörPublicering() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering_Id);
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering_Id(driver).sendKeys("Testlänk");
	}

	@Test (dependsOnMethods={"BokOpenAccessLänkExternLänkFörPublicering"})
	public void BokOpenAccessFormAvOA() {

		Select FormAvOA= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA_Id)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);
	}

	@Test (dependsOnMethods={"BokOpenAccessFormAvOA"})
	public void BokOpenAccessDokumentVersion() {

		Select DokumentVersion= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion_Id)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);
	}

	@Test (dependsOnMethods={"BokOpenAccessDokumentVersion"})
	public void BokOpenAcessSammanfattning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning_Id(driver).sendKeys("Jag skriver en riktigt bra sammanfattning");
	}

	@Test (dependsOnMethods={"BokOpenAcessSammanfattning"})
	public void BokSpara() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara_Id(driver).click();
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, "//button[contains(text(), 'Ok')]");
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}

}
