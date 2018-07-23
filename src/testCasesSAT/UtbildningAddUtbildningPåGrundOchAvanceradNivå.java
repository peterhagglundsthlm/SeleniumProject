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

public class UtbildningAddUtbildningPåGrundOchAvanceradNivå extends BeforeAfterTestBrowsers {

	String TestCaseInfo = "Loggar in som en projektledare och lägger till en Utbildning på grund- och avancerad nivå";


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
	public void ClickUtbildningPåGrundOchAvanceradNivå() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivå_CSS(driver).click();
	}

	@Test (dependsOnMethods={"ClickUtbildningPåGrundOchAvanceradNivå"})
	public void UtbildningPåGrundOchAvanceradNivåAdd() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillUtbildningPåGrundOchAvanceradNivå_CSS(driver).click();
	}

	@Test (dependsOnMethods={"UtbildningPåGrundOchAvanceradNivåAdd"})
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
	public void ÅrFörExamen() {

		Select år = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_UtbildningPåGrundOchAvanceradNivåÅrFörExamen_ID)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = år.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		år.selectByIndex(number);
	}

	@Test (dependsOnMethods={"ÅrFörExamen"})
	public void ExamensinriktningSelectSubjects() {

		//VÄLJER SLUMPMÄSSIGT I FÖRSTA DROPDOWN
		Select ämne1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne1UtbildningPåGrundOchAvanceradNivå_ID)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = ämne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		ämne1.selectByIndex(number);

		//VÄLJER SLUMPMÄSSIGT I ANDRA DROPDOWN
		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne2UtbildningPåGrundOchAvanceradNivå_ID);
		Select ämne2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne2UtbildningPåGrundOchAvanceradNivå_ID)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = ämne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		ämne2.selectByIndex(number2);

		//VÄLJER SLUMPMÄSSIGT I TREDJE DROPDOWN
		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne3UtbildningPåGrundOchAvanceradNivå_ID);
		Select ämne3 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne3UtbildningPåGrundOchAvanceradNivå_ID)));
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = ämne3.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		ämne3.selectByIndex(number3);
	}

	@Test (dependsOnMethods={"ExamensinriktningSelectSubjects"})
	public void Examen() {

		Select TypAvExamen = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåExamen_ID)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = TypAvExamen.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		TypAvExamen.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Examen"})
	public void Specialistkompetens() {

		Select Specialistkompetens = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSpecialistkompetens_ID)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = Specialistkompetens.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Specialistkompetens.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Specialistkompetens"})
	public void SpecialistkompetensÅr() {

		Select SpecialistkompetensÅr = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSpecialistkompetensÅR_ID)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = SpecialistkompetensÅr.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		SpecialistkompetensÅr.selectByIndex(number);
	}

	@Test (dependsOnMethods={"SpecialistkompetensÅr"})
	public void OmrådeBeskrivning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåOmrådeBeskrivning_NAME(driver).sendKeys("Test123");
	}

	@Test (dependsOnMethods={"SpecialistkompetensÅr"})
	public void Spara() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSparaKnapp_ID(driver).click();
	}

}
