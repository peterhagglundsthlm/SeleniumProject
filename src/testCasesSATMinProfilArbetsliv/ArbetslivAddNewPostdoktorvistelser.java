package testCasesSATMinProfilArbetsliv;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class ArbetslivAddNewPostdoktorvistelser extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Postdoktorvistelser";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}

	@Test
	public void LoginAsUser3() {

		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
	}

	@Test (dependsOnMethods={"LoginAsUser3"})
	public void ClickArbetsliv() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv(driver).click();
	}


	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void AddPostdoktorvistelser() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserLäggTill(driver).click();
	}

	@Test (dependsOnMethods={"AddPostdoktorvistelser"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserSökOrganisation(driver).sendKeys(universitet);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserSökOrganisation(driver).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserSökOrganisation(driver).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		if (driver.getPageSource().contains("Postdoktorvistelser"))
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserSparaSöktOrganisation(driver).click();
		}
		else if (driver.getPageSource().contains("Post doctoral assignments")) 
		{
			driver.findElement(By.xpath("//button[contains(text(), 'Save choice')]")).click();	
		}
		
//		String NamnPåUniversitet = PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserSökOrganisation(driver).getAttribute("value");
//		System.out.println("Namn På Universitet = " + NamnPåUniversitet); 
	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void ÄmneDropDown() {

		Select ämne1 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserÄmne1)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = ämne1.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		ämne1.selectByIndex(number);

//		WebElement ämneEtt = ämne1.getFirstSelectedOption();
//		String Value1 = ämneEtt.getText();
//		System.out.println("Ämne 1 = " + Value1 ); 

		Select ämne2 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserÄmne2)));
		Random randomOption2 = new Random();  
		int startOption2 = 1;
		int endOption2 = ämne2.getOptions().size(); 
		int number2 = startOption2 + randomOption2 .nextInt(endOption2 - startOption2);  
		ämne2.selectByIndex(number2);

//		WebElement ämneTvå = ämne2.getFirstSelectedOption();
//		String Value2 = ämneTvå.getText();
//		System.out.println("Ämne 2 = " + Value2 ); 

		Select ämne3 = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserÄmne3)));
		Random randomOption3 = new Random();  
		int startOption3 = 1;
		int endOption3 = ämne3.getOptions().size(); 
		int number3 = startOption3 + randomOption3 .nextInt(endOption3 - startOption3);  
		ämne3.selectByIndex(number3);

//		WebElement ämneTre = ämne3.getFirstSelectedOption();
//		String Value3 = ämneTre.getText();
//		System.out.println("Ämne 3 = " + Value3 ); 
	}

	@Test (dependsOnMethods={"ÄmneDropDown"})
	public void PeriodStartOchSlutYear() {

		//Postdoktorvistelser START ÅR. PLOCKAS SLUMPMÄSSIGT
		Select PeriodStartYear = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartYear)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = PeriodStartYear.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		PeriodStartYear.selectByIndex(number);

//		WebElement PeriodStartAr = PeriodStartYear.getFirstSelectedOption();
//		String Value = PeriodStartAr.getText();
//		System.out.println("Periodstart år = " + Value ); 

		//Postdoktorvistelser SLUT ÅT. HÄMTAR STARTÅR OCH LÄGGER TILL 1 ÅR 
		Select PeriodEndYear = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndYear))); 
		PeriodEndYear.selectByIndex(number + 1);

//		WebElement PeriodEndAr = PeriodEndYear.getFirstSelectedOption();
//		String Value1 = PeriodEndAr.getText();
//		System.out.println("Periodslut år = " + Value1 );
	}

	@Test (dependsOnMethods={"PeriodStartOchSlutYear"})
	public void PeriodStartMonth() {

		Select PeriodStartMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodStartMonth)));
		Random randomOption = new Random();  
		int endOption = PeriodStartMonth.getOptions().size(); 
		int number =  randomOption .nextInt(endOption);  
		PeriodStartMonth.selectByIndex(number);

//		WebElement PeriodStartManad = PeriodStartMonth.getFirstSelectedOption();
//		String Value = PeriodStartManad.getText();
//		System.out.println("Periodstart månad = " + Value );
	}

	@Test (dependsOnMethods={"PeriodStartMonth"})
	public void PeriodEndMonth() {

		Select PeriodEndMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserPeriodEndMonth)));
		Random randomOption = new Random();  
		int endOption = PeriodEndMonth.getOptions().size(); 
		int number =  randomOption .nextInt(endOption);  
		PeriodEndMonth.selectByIndex(number);

//		WebElement PeriodEndManad = PeriodEndMonth.getFirstSelectedOption();
//		String Value = PeriodEndManad.getText();
//		System.out.println("Periodslut månad = " + Value );
	}

	@Test (dependsOnMethods={"PeriodEndMonth"})
	public void SparaPostdoktorvistelser() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_PostdoktorvistelserSpara(driver).click();
	}
}