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

public class ArbetslivAddNewFackGranskadÖvrigLitteratur extends BeforeAfterTestBrowsers {

	String TestCaseInfo = "Loggar in som en projektledare och lägger till en fackgranskad ÖvrigLitteratur";

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

	@Test (dependsOnMethods={"LäggTillPublikationer"})
	public void VäljPublikationsTyp() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp_Id);
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_Publikationstyp_Id)));
		Publikationstyp.selectByIndex(1);
	}

	@Test (dependsOnMethods={"VäljPublikationsTyp"})
	public void DropDownÖvrigLitteratur() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown_Id);
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFackgranskadeDropDown_Id)));
		Publikationstyp.selectByIndex(8);
	}

	@Test (dependsOnMethods={"DropDownÖvrigLitteratur"})
	public void ÖvrigLitteraturTitel() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel_Id);
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel_Id(driver).sendKeys("TestTitel123");
	}

	@Test (dependsOnMethods={"ÖvrigLitteraturTitel"})
	public void ÖvrigLitteraturFörfattareKnapp() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareKnapp_Id(driver).click();
	}

	@Test (dependsOnMethods={"ÖvrigLitteraturFörfattareKnapp"})
	public void ÖvrigLitteraturFörfattareFörnamn() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn_Id(driver).sendKeys("Förnamn");
	}

	@Test (dependsOnMethods={"ÖvrigLitteraturFörfattareFörnamn"})
	public void ÖvrigLitteraturFörfattareEfternamn() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn_Id(driver).sendKeys("Efternamn");
	}

	@Test (dependsOnMethods={"ÖvrigLitteraturFörfattareEfternamn"})
	public void ÖvrigLitteraturFörlag() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlag_Id(driver).sendKeys("TestFörlag");
	}


	@Test (dependsOnMethods={"ÖvrigLitteraturFörlag"})
	public void ÖvrigLitteraturFörlagsplats() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörlagsplats_Id(driver).sendKeys("Förlagsplats");
	}

	@Test (dependsOnMethods={"ÖvrigLitteraturFörlagsplats"})
	public void ÖvrigLitteraturISBN() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationISBN_Id(driver).sendKeys("1234567");
	}

	@Test (dependsOnMethods={"ÖvrigLitteraturISBN"})
	public void ÖvrigLitteraturDOI() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI_Id(driver).sendKeys("123456");
	}

	@Test (dependsOnMethods={"ÖvrigLitteraturDOI"})
	public void ÖvrigLitteraturKällaFörPublikation() {

		Select KällaFörPublikation = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaFörPublikation_Id)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = KällaFörPublikation.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		KällaFörPublikation.selectByIndex(number);
	}

	@Test (dependsOnMethods={"ÖvrigLitteraturKällaFörPublikation"})
	public void ÖvrigLitteraturStatus() {

		Select Status = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus_Id)));
		Status.selectByIndex(0);
	}

	@Test (dependsOnMethods={"ÖvrigLitteraturStatus"})
	public void ÖvrigLitteraturKällaID() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID_Id(driver).sendKeys("1234");
	}

	@Test (dependsOnMethods={"ÖvrigLitteraturKällaID"})
	public void ÖvrigLitteraturVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown_Id)));
		TextenPubliceradIOpenAcess.selectByIndex(1);
	}

	@Test (dependsOnMethods={"ÖvrigLitteraturVarTextenPubliceradIOpenAcessJa"})
	public void ÖvrigLitteraturOpenAccessLänkExternLänkFörPublicering() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering_Id);
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering_Id(driver).sendKeys("Testlänk");
	}

	@Test (dependsOnMethods={"ÖvrigLitteraturOpenAccessLänkExternLänkFörPublicering"})
	public void ÖvrigLitteraturOpenAccessFormAvOA() {

		Select FormAvOA= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA_Id)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);
	}

	@Test (dependsOnMethods={"ÖvrigLitteraturOpenAccessFormAvOA"})
	public void ÖvrigLitteraturOpenAccessDokumentVersion() {

		Select DokumentVersion= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion_Id)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);
	}

	@Test (dependsOnMethods={"ÖvrigLitteraturOpenAccessDokumentVersion"})
	public void ÖvrigLitteraturOpenAcessSammanfattning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning_Id(driver).sendKeys("Jag skriver en riktigt bra sammanfattning");
	}

	@Test (dependsOnMethods={"ÖvrigLitteraturOpenAcessSammanfattning"})
	public void ÖvrigLitteraturSpara() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara_Id(driver).click();
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, "//button[contains(text(), 'Ok')]");
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();


	}
}
