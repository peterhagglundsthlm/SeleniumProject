package testCasesSATMinProfilUtbildning;

import java.util.Random;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class UtbildningAddUtbildningPåGrundOchAvanceradNivå extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Utbildning på grund- och avancerad nivå";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickUtbildning() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning());

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning()).click();
	}

	@Test (dependsOnMethods={"ClickUtbildning"})
	public void ClickUtbildningPåGrundOchAvanceradNivå() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivå());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivå()).click();
	}

	@Test (dependsOnMethods={"ClickUtbildningPåGrundOchAvanceradNivå"})
	public void UtbildningPåGrundOchAvanceradNivåAdd() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillUtbildningPåGrundOchAvanceradNivå());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillUtbildningPåGrundOchAvanceradNivå()).click();
	}

	@Test (dependsOnMethods={"UtbildningPåGrundOchAvanceradNivåAdd"})
	public void SelectOrganization() throws InterruptedException {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation());

		String universitet = "Uppsala Universitet";
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation()).sendKeys(universitet);
		Thread.sleep(500);
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation()).sendKeys(Keys.DOWN);
		Thread.sleep(500);
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation()).sendKeys(Keys.ENTER);
		Thread.sleep(500);
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SparaSöktOrganisationKnapp()).click();
	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void ÅrFörExamen() {

		Select år = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_UtbildningPåGrundOchAvanceradNivåÅrFörExamen());
		
		Random randomOption = new Random();  
		int endOption = år.getOptions().size(); 
		int number =  randomOption .nextInt(endOption);  
		år.selectByIndex(number);
	}

	@Test (dependsOnMethods={"ÅrFörExamen"})
	public void ExamensinriktningSelectSubjects() {

		Select ämne1 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne1UtbildningPåGrundOchAvanceradNivå());
		
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = ämne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		ämne1.selectByIndex(number);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne2UtbildningPåGrundOchAvanceradNivå());
		
		Select ämne2 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne2UtbildningPåGrundOchAvanceradNivå());
		
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = ämne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		ämne2.selectByIndex(number2);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne3UtbildningPåGrundOchAvanceradNivå());
		
		Select ämne3 = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne3UtbildningPåGrundOchAvanceradNivå());
		
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = ämne3.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		ämne3.selectByIndex(number3);
	}

	@Test (dependsOnMethods={"ExamensinriktningSelectSubjects"})
	public void Examen() {

		Select TypAvExamen = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåExamen());
		
		Random randomOption = new Random();  
		int startOption = 2;
		int endOption = TypAvExamen.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		TypAvExamen.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Examen"})
	public void Specialistkompetens() {

		Select Specialistkompetens = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSpecialistkompetens());
		
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = Specialistkompetens.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Specialistkompetens.selectByIndex(number);
	}

	@Test (dependsOnMethods={"Specialistkompetens"})
	public void SpecialistkompetensÅr() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSpecialistkompetensÅR());

		Select SpecialistkompetensÅr = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSpecialistkompetensÅR());
		
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = SpecialistkompetensÅr.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		SpecialistkompetensÅr.selectByIndex(number);
	}

	@Test (dependsOnMethods={"SpecialistkompetensÅr"})
	public void OmrådeBeskrivning() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåOmrådeBeskrivning()).sendKeys("Test123");
	}

	@Test (dependsOnMethods={"SpecialistkompetensÅr"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSparaKnapp()).click();
	}
}
