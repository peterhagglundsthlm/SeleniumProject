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

public class ArbetslivAddNewAnställningar extends BeforeAfterTestBrowsers {
	
	String TestCaseInfo = "Loggar in som en projektledare och lägger till en Anställning UTAN att kopiera redan tillagd post";


	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);
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
	public void AddAnställning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_LäggTill_CSS(driver).click();
	}

	@Test (dependsOnMethods={"AddAnställning"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SökArbetsgivare_NAME(driver).sendKeys(universitet);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SökArbetsgivare_NAME(driver).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SökArbetsgivare_NAME(driver).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SparaSökArbetsgivare_xpath(driver).click();

	}

	@Test (dependsOnMethods={"AddAnställning"})
	public void AnställningDropDown() {

		Select Anställning = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningDropDown_ID)));
		Random randomOption = new Random();  
		int startOption = 2;
		int endOption = Anställning.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Anställning.selectByIndex(number);
	}

	@Test (dependsOnMethods={"AnställningDropDown"})
	public void AnställningsFormDropDown() {

		Select AnställningsForm = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningsFormDropDown_ID)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = AnställningsForm.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		AnställningsForm.selectByIndex(number);
	}

	@Test (dependsOnMethods={"AnställningDropDown"})
	public void DelAvForskningIAnställningenBaseradPåHeltid() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_DelAvForskningenIAnställningenBaseradPåHeltid_ID(driver).sendKeys("100");
	}

	@Test (dependsOnMethods={"AnställningDropDown"})
	public void AnställningensBörjanOchSlutYear() {

		//ANSTÄLLNINGENS BÖRJAN ÅR. PLOCKAS SLUMPMÄSSIGT
		Select AnställningensBörjanYear = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensBörjanYear_NAME)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = AnställningensBörjanYear.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		AnställningensBörjanYear.selectByIndex(number);

		//ANSTÄLLNINGENS SLUT ÅT. HÄMTAR STARTÅR OCH LÄGGER TILL 1 ÅR 
		Select AnställningensSlutYear = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensSlutYear_NAME))); 
		AnställningensSlutYear.selectByIndex(number + 1);
	}

	@Test (dependsOnMethods={"AnställningensBörjanOchSlutYear"})
	public void AnställningensBörjanMonth() {

		Select AnställningensBörjanMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensBörjanMonth_NAME)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = AnställningensBörjanMonth.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		AnställningensBörjanMonth.selectByIndex(number);
	}

	@Test (dependsOnMethods={"AnställningensBörjanMonth"})
	public void AnställningensSlutMonth() {

		Select AnställningensSlutMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensSlutMonth_NAME)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = AnställningensSlutMonth.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		AnställningensSlutMonth.selectByIndex(number);
	}

	@Test (dependsOnMethods={"AnställningensSlutMonth"})
	public void ÖvrigInformation() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_ÖvrigInformation_ID(driver).sendKeys("Mycket Bra övrig information");

	}
	
	@Test (dependsOnMethods={"ÖvrigInformation"})
	public void SparaAnställning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SparaAnställning_ID(driver).click();

	}


}
