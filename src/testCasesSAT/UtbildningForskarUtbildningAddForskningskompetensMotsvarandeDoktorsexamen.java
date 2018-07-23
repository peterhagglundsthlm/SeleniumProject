package testCasesSAT;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Utility.UserCredentials;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsUserMinProfil;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class UtbildningForskarUtbildningAddForskningskompetensMotsvarandeDoktorsexamen extends BeforeAfterTestBrowsers {

	String TestCaseInfo = "Loggar in som en projektledare och lägger till en Forskningskompetens Motsvarande Doktorsexamen ";

	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome_Xpath(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.jagtestarprismaSATuserName, UserCredentials.jagtestarprismaSATpassword);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Xpath);

	}


	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickUtbildning() {


		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Xpath(driver).click();

	}


	@Test (dependsOnMethods={"ClickUtbildning"})
	public void ClickForskarUtbildning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Forskarutbildning_Xpath(driver).click();
	}


	@Test (dependsOnMethods={"ClickForskarUtbildning"})
	public void AddForskarUtbildning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_CSS(driver).click();
	}


	@Test (dependsOnMethods={"AddForskarUtbildning"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation_Name(driver).sendKeys(universitet);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation_Name(driver).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation_Name(driver).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SparaSöktOrganisationKnapp_Tagname(driver).click();

	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void TypAvForskarUtbildningAddForskningskompetensMotsvarandeDoktorsexamen() {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_TypDropDownForskarUtbildning_ID);
		driver.findElement(By.id("Type")).click();

		Select typ = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_TypDropDownForskarUtbildning_ID)));
		typ.selectByVisibleText("Forskningskompetens motsvarande Doktorsexamen");
	}


	@Test (dependsOnMethods={"TypAvForskarUtbildningAddForskningskompetensMotsvarandeDoktorsexamen"})
	public void Examensdatum() {


		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_DatumNärForskningskompetensUppnåtts_NAME(driver).sendKeys("2018-05-15");

	}

	@Test (dependsOnMethods={"Examensdatum"})
	public void TypAvForskarUtbildningSelectSubjects() throws InterruptedException {

		//VÄLJER SLUMPMÄSSIGT I FÖRSTA DROPDOWN
		Select ämne1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne1DropDownForskarUtbildning_ID)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = ämne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		ämne1.selectByIndex(number);
		
		
		//VÄLJER SLUMPMÄSSIGT I ANDRA DROPDOWN
		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne2DropDownForskarUtbildning_ID);
		Select ämne2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne2DropDownForskarUtbildning_ID)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = ämne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		ämne2.selectByIndex(number2);
		
		
		//VÄLJER SLUMPMÄSSIGT I TREDJE DROPDOWN
		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne3DropDownForskarUtbildning_ID);
		Select ämne3 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Ämne3DropDownForskarUtbildning_ID)));
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = ämne3.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		ämne3.selectByIndex(number3);
	}

	@Test (dependsOnMethods={"TypAvForskarUtbildningSelectSubjects"})
	public void BeskrivningAvKompetensSvenska() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensSV_ID(driver).sendKeys("TestSvenska");

	}

	@Test (dependsOnMethods={"BeskrivningAvKompetensSvenska"})
	public void BeskrivningAvKompetensEngelska() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_ForskningskompetensMotsvarandeDoktorsexamen_BeskrivningAvKompetensEN_ID(driver).sendKeys("TestSvenska");



	}
}