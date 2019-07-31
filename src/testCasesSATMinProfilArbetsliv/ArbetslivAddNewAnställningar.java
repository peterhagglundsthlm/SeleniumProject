package testCasesSATMinProfilArbetsliv;


import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;



public class ArbetslivAddNewAnställningar extends BeforeAfterTestBrowsers {


	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Anställning UTAN att kopiera redan tillagd post.";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickArbetsliv() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv()).click();
	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void AddAnställning() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_LäggTill()).click();
	}

	@Test (dependsOnMethods={"AddAnställning"})
	public void SelectOrganization() throws InterruptedException {

		String universitet = "Uppsala Universitet";

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SökArbetsgivare()).sendKeys(universitet);

		Thread.sleep(500);

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SökArbetsgivare()).sendKeys(Keys.DOWN);

		Thread.sleep(500);

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SökArbetsgivare()).sendKeys(Keys.ENTER);

		Thread.sleep(500);

		if (driver.getPageSource().contains("Anställningar"))
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SparaSökArbetsgivare()).click();
		}
		else if (driver.getPageSource().contains("Employments")) 
		{
			driver.findElement(By.xpath("//button[contains(text(), 'Save choice')]")).click();	
		}
	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void AnställningDropDown() {

		Select Anställning = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningDropDown());
		Random randomOption = new Random();  
		int startOption = 2;
		int endOption = Anställning.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		Anställning.selectByIndex(number);
	}

	@Test (dependsOnMethods={"AnställningDropDown"})
	public void AnställningsFormDropDown() {

		Select AnställningsForm = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningsFormDropDown());
		Random randomOption = new Random();  
		int startOption = 1;
		int endOption = AnställningsForm.getOptions().size(); 
		int number = startOption + randomOption .nextInt(endOption - startOption);  
		AnställningsForm.selectByIndex(number);
	}

	@Test (dependsOnMethods={"AnställningDropDown"})
	public void DelAvForskningIAnställningenBaseradPåHeltid() {

		String DelAvForskningIAnställningenBaseradPåHeltid = "100";
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_DelAvForskningenIAnställningenBaseradPåHeltid()).sendKeys(DelAvForskningIAnställningenBaseradPåHeltid);
		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_DelAvForskningenIAnställningenBaseradPåHeltid()).getAttribute("value") != DelAvForskningIAnställningenBaseradPåHeltid)
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_DelAvForskningenIAnställningenBaseradPåHeltid()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_DelAvForskningenIAnställningenBaseradPåHeltid()).sendKeys(DelAvForskningIAnställningenBaseradPåHeltid);
		}
	}

	@Test (dependsOnMethods={"DelAvForskningIAnställningenBaseradPåHeltid"})
	public void AnställningensStartAndEndYear() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensBörjanYear());
		Select AnställningensBörjanYear = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensBörjanYear());
		Random randomOption = new Random();  
		int endOption = AnställningensBörjanYear.getOptions().size(); 
		int number = randomOption.nextInt(endOption);  
		AnställningensBörjanYear.selectByIndex(number);
		
		Select AnställningensEndYear = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensSlutYear());
		AnställningensEndYear.selectByIndex(number + 1);
	}
	
	@Test (dependsOnMethods={"AnställningensStartAndEndYear"})
	public void AnställningensBörjanMonth() {

		Select AnställningensBörjanMonth = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensBörjanMonth());
		Random randomOption = new Random();  
		int endOption = AnställningensBörjanMonth.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		AnställningensBörjanMonth.selectByIndex(number);
	}

	@Test (dependsOnMethods={"AnställningensBörjanMonth"})
	public void AnställningensSlutMonth() {

		Select AnställningensSlutMonth = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensSlutMonth());
		Random randomOption = new Random();  
		int endOption = AnställningensSlutMonth.getOptions().size(); 
		int number = randomOption .nextInt(endOption);  
		AnställningensSlutMonth.selectByIndex(number);
	}

	@Test (dependsOnMethods={"AnställningensSlutMonth"})
	public void ÖvrigInformation() {

		String ÖvrigInformation = "Mycket bra övrig information";
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_ÖvrigInformation()).sendKeys(ÖvrigInformation);

		if (driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_ÖvrigInformation()).getAttribute("value") != ÖvrigInformation);
		{
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_ÖvrigInformation()).clear();
			driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_ÖvrigInformation()).sendKeys(ÖvrigInformation);
		}
	}

	@Test (dependsOnMethods={"ÖvrigInformation"})
	public void SparaAnställning() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SparaAnställning()).click();
	}
}









