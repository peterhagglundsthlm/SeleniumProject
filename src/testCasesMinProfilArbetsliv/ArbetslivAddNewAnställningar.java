package testCasesMinProfilArbetsliv;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class ArbetslivAddNewAnställningar extends BeforeAfterTestBrowsers {

	String TestCaseInfo = "Loggar in som en projektledare och lägger till en Anställning UTAN att kopiera redan tillagd post";


	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil));

		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickArbetsliv() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv(driver).click();

	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void AddAnställning() {

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_LäggTill(driver).click();
	}

	@Test (dependsOnMethods={"AddAnställning"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SökArbetsgivare(driver).sendKeys(universitet);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SökArbetsgivare(driver).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SökArbetsgivare(driver).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SparaSökArbetsgivare(driver).click();
		
		String NamnPåUniversitet = PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SökArbetsgivare(driver).getAttribute("value");
		System.out.println("Namn På Universitet = " + NamnPåUniversitet); 

	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void AnställningDropDown() {

		Select Anställning = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningDropDown)));
		Random randomOption = new Random();  
		int startOption = 2;
		int endOption = Anställning.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Anställning.selectByIndex(number);

		WebElement AnställningsNamn = Anställning.getFirstSelectedOption();
		String Value = AnställningsNamn.getText();
		System.out.println("Anställning = " + Value ); 

		
	}

	@Test (dependsOnMethods={"AnställningDropDown"})
	public void AnställningsFormDropDown() {

		Select AnställningsForm = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningsFormDropDown)));
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = AnställningsForm.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		AnställningsForm.selectByIndex(number);
		
		
		WebElement AnställningsForm1 = AnställningsForm.getFirstSelectedOption();
		String Value = AnställningsForm1.getText();
		System.out.println("Anställningsform = " + Value ); 
	}

	@Test (dependsOnMethods={"AnställningDropDown"})
	public void DelAvForskningIAnställningenBaseradPåHeltid() {

		String DelAvForskningIAnställningenBaseradPåHeltid = "100";
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_DelAvForskningenIAnställningenBaseradPåHeltid(driver).sendKeys(DelAvForskningIAnställningenBaseradPåHeltid);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_DelAvForskningenIAnställningenBaseradPåHeltid(driver).getAttribute("value") != DelAvForskningIAnställningenBaseradPåHeltid)
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_DelAvForskningenIAnställningenBaseradPåHeltid(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_DelAvForskningenIAnställningenBaseradPåHeltid(driver).sendKeys(DelAvForskningIAnställningenBaseradPåHeltid);
	
			String DelAvForskningIAnställningenBaseradPåHeltid1 = PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_DelAvForskningenIAnställningenBaseradPåHeltid(driver).getAttribute("value");
			System.out.println("Del av forskning = " + DelAvForskningIAnställningenBaseradPåHeltid1 + "%"); 
		}
	}

	@Test (dependsOnMethods={"DelAvForskningIAnställningenBaseradPåHeltid"})
	public void AnställningensBörjanOchSlutYear() {

		//ANSTÄLLNINGENS BÖRJAN ÅR. PLOCKAS SLUMPMÄSSIGT
		Select AnställningensBörjanYear = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensBörjanYear)));
		Random randomOption = new Random();  
		int endOption = AnställningensBörjanYear.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		AnställningensBörjanYear.selectByIndex(number);
		
		WebElement AnställningensBörjanAr = AnställningensBörjanYear.getFirstSelectedOption();
		String Value = AnställningensBörjanAr.getText();
		System.out.println("Anställning år = " + Value ); 

		//ANSTÄLLNINGENS SLUT ÅT. HÄMTAR STARTÅR OCH LÄGGER TILL 1 ÅR 
		Select AnställningensSlutYear = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensSlutYear))); 
		AnställningensSlutYear.selectByIndex(number + 1);
		
		WebElement AnställningensSlutjanAr = AnställningensSlutYear.getFirstSelectedOption();
		String Value2 = AnställningensSlutjanAr.getText();
		System.out.println("Anställning slut år = " + Value2 ); 
	}

	@Test (dependsOnMethods={"AnställningensBörjanOchSlutYear"})
	public void AnställningensBörjanMonth() {

		Select AnställningensBörjanMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensBörjanMonth)));
		Random randomOption = new Random();  
		int startOption = 0;
		int endOption = AnställningensBörjanMonth.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		AnställningensBörjanMonth.selectByIndex(number);
		
		WebElement AnställningensBörjanManad = AnställningensBörjanMonth.getFirstSelectedOption();
		String Value = AnställningensBörjanManad.getText();
		System.out.println("Anställning månad = " + Value ); 
	}

	@Test (dependsOnMethods={"AnställningensBörjanMonth"})
	public void AnställningensSlutMonth() {

		Select AnställningensSlutMonth = new Select (driver.findElement(By.name(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensSlutMonth)));
		Random randomOption = new Random();  
		int endOption = AnställningensSlutMonth.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		AnställningensSlutMonth.selectByIndex(number);
		
		WebElement AnställningensSlutManad = AnställningensSlutMonth.getFirstSelectedOption();
		String Value = AnställningensSlutManad.getText();
		System.out.println("Anställning slut månad = " + Value ); 
	}

	@Test (dependsOnMethods={"AnställningensSlutMonth"})
	public void ÖvrigInformation() {

		String ÖvrigInformation = "Mycket bra övrig information";
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_ÖvrigInformation(driver).sendKeys(ÖvrigInformation);

		if (PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_ÖvrigInformation(driver).getAttribute("value") != ÖvrigInformation);
		{
			PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_ÖvrigInformation(driver).clear();
			PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_ÖvrigInformation(driver).sendKeys(ÖvrigInformation);
			
			String ÖvrigInformation1 = PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_ÖvrigInformation(driver).getAttribute("value");
			System.out.println("Övrig information = " + ÖvrigInformation1); 
		}

	}

	@Test (dependsOnMethods={"ÖvrigInformation"})
	public void SparaAnställning() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SparaAnställning(driver).click();	

	}
}









