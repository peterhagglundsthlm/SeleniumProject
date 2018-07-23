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

public class ArbetslivAddNewINTEFackGranskadRecensionArtikel extends BeforeAfterTestBrowsers {
	
	String TestCaseInfo = "Loggar in som en projektledare och lägger till en INTE fackgranskad Konferensbidrag";

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
		Publikationstyp.selectByIndex(2);
	}

	@Test (dependsOnMethods={"VäljPublikationsTyp"})
	public void DropDownRecensionArtikel() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown_Id);
		Select Publikationstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationINTEFackgranskadeDropDown_Id)));
		Publikationstyp.selectByIndex(4);
	}

	@Test (dependsOnMethods={"DropDownRecensionArtikel"})
	public void RecensionArtikelFörfattareKnapp() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareKnapp_Id(driver).click();
	}

	@Test (dependsOnMethods={"RecensionArtikelFörfattareKnapp"})
	public void RecensionArtikelTitel() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel_Id);
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationTitel_Id(driver).sendKeys("TestTitel123");

	}

	@Test (dependsOnMethods={"RecensionArtikelTitel"})
	public void RecensionArtikelFörfattareFörnamn() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareFörNamn_Id(driver).sendKeys("Förnamn");
	}

	@Test (dependsOnMethods={"RecensionArtikelFörfattareFörnamn"})
	public void RecensionArtikelFörfattareEfternamn() {


		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörfattareEfterNamn_Id(driver).sendKeys("Efternamn");
	}

	@Test (dependsOnMethods={"RecensionArtikelFörfattareEfternamn"})
	public void RecensionArtikelNamnPåTidskrift() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationNamnPåTidskrift_Id(driver).sendKeys("Tidsskrift");
	}
	
	@Test (dependsOnMethods={"RecensionArtikelNamnPåTidskrift"})
	public void RecensionArtikelVolym() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVolym_Id(driver).sendKeys("10");
	}
	
	@Test (dependsOnMethods={"RecensionArtikelVolym"})
	public void RecensionArtikelUtfärdandenummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationUtfärdandenummer_Id(driver).sendKeys("287");
	}
	
	@Test (dependsOnMethods={"RecensionArtikelUtfärdandenummer"})
	public void RecensionArtikelFörstaSidnummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFörstaSidnummer_Id(driver).sendKeys("1");
	}
	
	@Test (dependsOnMethods={"RecensionArtikelFörstaSidnummer"})
	public void RecensionArtikelSistaSidnummer() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSistaSidnummer_Id(driver).sendKeys("99");
	}

	@Test (dependsOnMethods={"RecensionArtikelSistaSidnummer"})
	public void RecensionArtikelDOI() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDOI_Id(driver).sendKeys("123456");
	}

	@Test (dependsOnMethods={"RecensionArtikelDOI"})
	public void RecensionArtikelKällaFörPublikation() {

		Select KällaFörPublikation = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaFörPublikation_Id)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = KällaFörPublikation.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		KällaFörPublikation.selectByIndex(number);
	}
	
	@Test (dependsOnMethods={"RecensionArtikelKällaFörPublikation"})
	public void RecensionArtikelStatus() {

		Select Status = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationStatus_Id)));
		Status.selectByIndex(0);
	}

	@Test (dependsOnMethods={"RecensionArtikelStatus"})
	public void RecensionArtikelKällaID() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationKällaID_Id(driver).sendKeys("1234");
	}

	@Test (dependsOnMethods={"RecensionArtikelKällaID"})
	public void RecensionArtikelVarTextenPubliceradIOpenAcessJa() {

		Select TextenPubliceradIOpenAcess = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationVarTextenPubliceradIOpenAccessDropdown_Id)));
		TextenPubliceradIOpenAcess.selectByIndex(1);
	}

	@Test (dependsOnMethods={"RecensionArtikelVarTextenPubliceradIOpenAcessJa"})
	public void RecensionArtikelLänkExternLänkFörPublicering() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering_Id);
		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationLänkExternLänkFörPublicering_Id(driver).sendKeys("Testlänk");
	}

	@Test (dependsOnMethods={"RecensionArtikelLänkExternLänkFörPublicering"})
	public void RecensionArtikelOpenAccessFormAvOA() {

		Select FormAvOA= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationFormAvOA_Id)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = FormAvOA.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		FormAvOA.selectByIndex(number);
	}

	@Test (dependsOnMethods={"RecensionArtikelOpenAccessFormAvOA"})
	public void RecensionArtikelOpenAccessDokumentVersion() {

		Select DokumentVersion= new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationDokumentversion_Id)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = DokumentVersion.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		DokumentVersion.selectByIndex(number);
	}

	@Test (dependsOnMethods={"RecensionArtikelOpenAccessDokumentVersion"})
	public void RecensionArtikelOpenAcessSammanfattning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSammanfattning_Id(driver).sendKeys("Jag skriver en riktigt bra sammanfattning");
	}

	@Test (dependsOnMethods={"RecensionArtikelOpenAcessSammanfattning"})
	public void RecensionArtikelSpara() {

		PortalLoggedInAsUserMinProfil.MinProfil_Publikationer_VetenskapligPublikationSpara_Id(driver).click();
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, "//button[contains(text(), 'Ok')]");
		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}

}
