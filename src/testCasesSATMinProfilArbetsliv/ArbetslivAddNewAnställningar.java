package testCasesSATMinProfilArbetsliv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import reusableMethods.CombineClearAndSendkeys;
import reusableMethods.CountRowsInTable;
import reusableMethods.DriverWaitExpectedConditions;
import reusableMethods.RandomDropDownOptionSelect;
import reusableMethods.SearchForOrganizationWhenButtonIdIsUnique;
import reusableMethods.driverSelect;

public class ArbetslivAddNewAnställningar extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Anställning UTAN att kopiera redan tillagd post.";
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

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv()).click();
	}

	@Test (dependsOnMethods={"ClickArbetsliv"})
	public void AddAnställning() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_LäggTill());

		CountRowsInTable.CountTable(driver, By.xpath("//*[@id=\"employmentViewSectionIdFormId\"]/table/tbody/tr"));

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_LäggTill()).click();
	}

	@Test (dependsOnMethods={"AddAnställning"})
	public void SelectOrganization() throws InterruptedException {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SökArbetsgivare());

		SearchForOrganizationWhenButtonIdIsUnique.EnterKeyInputs(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SökArbetsgivare(), "Uppsala Universitet");

	}

	@Test (dependsOnMethods={"SelectOrganization"})
	public void AnställningDropDown() {

		Select Anställning = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningDropDown()); 

		RandomDropDownOptionSelect.RandomOptionInDropDown(Anställning, 2, 0);
	}

	@Test (dependsOnMethods={"AnställningDropDown"})
	public void AnställningsFormDropDown() {

		Select AnställningsForm = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningsFormDropDown());

		RandomDropDownOptionSelect.RandomOptionInDropDown(AnställningsForm, 1, 0);

	}

	@Test (dependsOnMethods={"AnställningDropDown"})
	public void DelAvForskningIAnställningenBaseradPåHeltid() {

		CombineClearAndSendkeys.ClearSend(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_DelAvForskningenIAnställningenBaseradPåHeltid(), "100");

	}

	@Test (dependsOnMethods={"DelAvForskningIAnställningenBaseradPåHeltid"})
	public void AnställningensStartAndEndYear() {

		Select	AnställningensBörjanYear = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensBörjanYear());

		RandomDropDownOptionSelect.RandomOptionInDropDown(AnställningensBörjanYear, 0, 1);

		Select	AnställningensEndYear = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensSlutYear());

		RandomDropDownOptionSelect.RandomOptionInDropdownPreviousDropDownPlusOne(AnställningensEndYear);
	}

	@Test (dependsOnMethods={"AnställningensStartAndEndYear"})
	public void AnställningensBörjanMonth() {

		Select AnställningensBörjanMonth = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensBörjanMonth());

		RandomDropDownOptionSelect.RandomOptionInDropDown(AnställningensBörjanMonth, 0, 0);
	}

	@Test (dependsOnMethods={"AnställningensBörjanMonth"})
	public void AnställningensSlutMonth() {

		Select AnställningensSlutMonth = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_AnställningensSlutMonth());

		RandomDropDownOptionSelect.RandomOptionInDropDown(AnställningensSlutMonth, 0, 0);
	}

	@Test (dependsOnMethods={"AnställningensSlutMonth"})
	public void ÖvrigInformation() {

		CombineClearAndSendkeys.ClearSend(driver, 
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_ÖvrigInformation(), "Mycket bra övrig information");
	}

	@Test (dependsOnMethods={"ÖvrigInformation"})
	public void SparaAnställning() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		driver.findElement(
				PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_SparaAnställning()).click();
		
		CountRowsInTable.AddedRow(driver, By.xpath("//*[@id=\"employmentViewSectionIdFormId\"]/table/tbody/tr"), PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv_Anställningar_LäggTill());

	}
}









