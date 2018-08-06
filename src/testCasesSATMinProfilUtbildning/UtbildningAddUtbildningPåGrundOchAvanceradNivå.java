package testCasesSATMinProfilUtbildning;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class UtbildningAddUtbildningPåGrundOchAvanceradNivå extends BeforeAfterTestBrowsers {
	
	@BeforeTest
	public void TestCaseInfo() {
		
		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Utbildning på grund- och avancerad nivå";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginAsUser() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil));
		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickUtbildning() {


		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning(driver).click();
	}

	@Test (dependsOnMethods={"ClickUtbildning"})
	public void ClickUtbildningPåGrundOchAvanceradNivå() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivå(driver).click();
	}

	@Test (dependsOnMethods={"ClickUtbildningPåGrundOchAvanceradNivå"})
	public void UtbildningPåGrundOchAvanceradNivåAdd() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillUtbildningPåGrundOchAvanceradNivå(driver).click();
	}

	@Test (dependsOnMethods={"UtbildningPåGrundOchAvanceradNivåAdd"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation(driver).sendKeys(universitet);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation(driver).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation(driver).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SparaSöktOrganisationKnapp(driver).click();
		
		String NamnPåUniversitet = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_LäggTillForskarutbildning_SökOrganisation(driver).getAttribute("value");
		System.out.println("Namn På Universitet = " + NamnPåUniversitet); 
	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void ÅrFörExamen() {

		Select år = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_UtbildningPåGrundOchAvanceradNivåÅrFörExamen)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = år.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		år.selectByIndex(number);
		
		WebElement Startår = år.getFirstSelectedOption();
		String Value = Startår.getText();
		System.out.println("Start år = " + Value );
	}

	@Test (dependsOnMethods={"ÅrFörExamen"})
	public void ExamensinriktningSelectSubjects() {

		//VÄLJER SLUMPMÄSSIGT I FÖRSTA DROPDOWN
		Select ämne1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne1UtbildningPåGrundOchAvanceradNivå)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = ämne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		ämne1.selectByIndex(number);
		
		WebElement ämneEtt = ämne1.getFirstSelectedOption();
		String Value1 = ämneEtt.getText();
		System.out.println("Ämne 1 = " + Value1 ); 

		//VÄLJER SLUMPMÄSSIGT I ANDRA DROPDOWN
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne2UtbildningPåGrundOchAvanceradNivå));
		Select ämne2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne2UtbildningPåGrundOchAvanceradNivå)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = ämne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		ämne2.selectByIndex(number2);
		
		WebElement ämneTvå = ämne2.getFirstSelectedOption();
		String Value2 = ämneTvå.getText();
		System.out.println("Ämne 2 = " + Value2 ); 

		//VÄLJER SLUMPMÄSSIGT I TREDJE DROPDOWN
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne3UtbildningPåGrundOchAvanceradNivå));
		Select ämne3 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_LäggTillUtbildning_Ämne3UtbildningPåGrundOchAvanceradNivå)));
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = ämne3.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		ämne3.selectByIndex(number3);
		
		WebElement ämneTre = ämne3.getFirstSelectedOption();
		String Value3 = ämneTre.getText();
		System.out.println("Ämne 3 = " + Value3 );
	}

	@Test (dependsOnMethods={"ExamensinriktningSelectSubjects"})
	public void Examen() {

		Select TypAvExamen = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåExamen)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = TypAvExamen.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		TypAvExamen.selectByIndex(number);
		
		WebElement TypAvExamen1 = TypAvExamen.getFirstSelectedOption();
		String Value = TypAvExamen1.getText();
		System.out.println("Typ av examen = " + Value );
	}

	@Test (dependsOnMethods={"Examen"})
	public void Specialistkompetens() {

		Select Specialistkompetens = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSpecialistkompetens)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = Specialistkompetens.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Specialistkompetens.selectByIndex(number);
		
		WebElement Specialistkompetens1 = Specialistkompetens.getFirstSelectedOption();
		String Value = Specialistkompetens1.getText();
		System.out.println("Specialistkompetens = " + Value );
	}

	@Test (dependsOnMethods={"Specialistkompetens"})
	public void SpecialistkompetensÅr() {

		Select SpecialistkompetensÅr = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSpecialistkompetensÅR)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = SpecialistkompetensÅr.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		SpecialistkompetensÅr.selectByIndex(number);

		WebElement SpecialistkompetensAr = SpecialistkompetensÅr.getFirstSelectedOption();
		String Value = SpecialistkompetensAr.getText();
		System.out.println("Specialistkompetens År = " + Value );
		
	}

	@Test (dependsOnMethods={"SpecialistkompetensÅr"})
	public void OmrådeBeskrivning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåOmrådeBeskrivning(driver).sendKeys("Test123");
		
		String OmrådeBeskrivning = PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåOmrådeBeskrivning(driver).getAttribute("value");
		System.out.println("OmrådeBeskrivning = " + OmrådeBeskrivning); 
	}

	@Test (dependsOnMethods={"SpecialistkompetensÅr"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_UtbildningPåGrundOchAvanceradNivåSparaKnapp(driver).click();
	}

}
