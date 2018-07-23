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

public class ArbetslivAddNewForskarutbyten extends BeforeAfterTestBrowsers {

	String TestCaseInfo = "Loggar in som en projektledare och lägger till ett Forskarutbyte";


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
	public void ClickArbetsliv() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Xpath(driver).click();
	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void AddForskarUbyten() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenLäggTill_CSS(driver).click();
	}

	@Test (dependsOnMethods={"AddForskarUbyten"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenSökOrganisation_Name(driver).sendKeys(universitet);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenSökOrganisation_Name(driver).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenSökOrganisation_Name(driver).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenSparaSöktOrganisation_Tagname(driver).click();
	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void Ämne() {

		//VÄLJER SLUMPMÄSSIGT I FÖRSTA DROPDOWN
		Select ämne1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbyteÄmne1_ID)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = ämne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		ämne1.selectByIndex(number);


		//VÄLJER SLUMPMÄSSIGT I ANDRA DROPDOWN
		Select ämne2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbyteÄmne2_ID)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = ämne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		ämne2.selectByIndex(number2);


		//VÄLJER SLUMPMÄSSIGT I TREDJE DROPDOWN
		Select ämne3 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbyteÄmne3_ID)));
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = ämne3.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		ämne3.selectByIndex(number3);

	}

	@Test (dependsOnMethods={"Ämne"})
	public void Typ() {

		Select Typ = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbyteTyp_ID)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = Typ.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Typ.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Typ"})
	public void PeriodStartOchSlutYear() {

		//VÄLJER SLUMPMÄSSIGT PERIODSTART
		Select PeriodStartYear = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenPeriodStartYear_Name)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = PeriodStartYear.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		PeriodStartYear.selectByIndex(number);

		//PERIODSLUT HÄMTAR STARTÅR OCH LÄGGER TILL 1 ÅR 
		Select PeriodEndYear = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenPeriodSlutYear_Name))); 
		PeriodEndYear.selectByIndex(number + 1);
	}

	@Test (dependsOnMethods={"PeriodStartOchSlutYear"})
	public void PeriodStartMonth() {

		Select PeriodStartMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenPeriodStartMonth_Name)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = PeriodStartMonth.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		PeriodStartMonth.selectByIndex(number);
	}

	@Test (dependsOnMethods={"PeriodStartMonth"})
	public void PeriodEndMonth() {

		Select PeriodEndMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenPeriodSlutMonth_Name)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = PeriodEndMonth.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		PeriodEndMonth.selectByIndex(number);
	}

	@Test (dependsOnMethods={"PeriodEndMonth"})
	public void SparaForskarUbyte() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_ForskarutbytenSpara_ID(driver).click();
	}
}

