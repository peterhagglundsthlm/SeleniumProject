package testCasesSATMinProfilArbetsliv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import reusableMethods.CountRowsInTable;
import reusableMethods.DriverWaitExpectedConditions;

public class ArbetslivAddNewUppeHålliForskningen extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till ett Uppehåll i forskningen";
	}

	@Test
	public void LoginAsUser() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickArbetsliv() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv());
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv()).click();
	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void UppehållIForskningenLäggTill() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenLäggTill());
		
		CountRowsInTable.CountTable(driver, By.xpath("//*[@id=\"InterruptionInResearchViewSectionIdFormId\"]/table/tbody/tr"));

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenLäggTill()).click();
	}

	@Test (dependsOnMethods={"UppehållIForskningenLäggTill"})
	public void StartDatum() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenStartDatum());

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenStartDatum()).sendKeys("2017-06-18");
	}

	@Test (dependsOnMethods={"StartDatum"})
	public void SlutDatum() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenSlutDatum()).sendKeys("2018-06-18");
	}

	@Test (dependsOnMethods={"SlutDatum"})
	public void Beskrivning() {

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenBeskrivning()).sendKeys("test");
	}

	@Test (dependsOnMethods={"Beskrivning"})
	public void SparaVal() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenSpara()).click();	
		
		CountRowsInTable.AddedRow(driver, By.xpath("//*[@id=\"InterruptionInResearchViewSectionIdFormId\"]/table/tbody/tr"), PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_UppehållIForskningenLäggTill());
		
	}
}
