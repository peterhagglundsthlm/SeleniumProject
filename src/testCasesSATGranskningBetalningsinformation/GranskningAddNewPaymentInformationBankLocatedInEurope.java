package testCasesSATGranskningBetalningsinformation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsUserGranskning;
import reusableMethods.CombineClearAndSendkeys;
import reusableMethods.CountRowsInTable;
import reusableMethods.DriverWaitExpectedConditions;
import reusableMethods.GetCurrentUrl;
import reusableMethods.RandomDropDownOptionSelect;
import reusableMethods.SearchForOrganizationWhenButtonIdIsUnique;
import reusableMethods.driverSelect;

public class GranskningAddNewPaymentInformationBankLocatedInEurope extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till ny betalningsinformation på sidan Granskning för land i Europa (Frankrike)";
	}

	@Test 
	public void ClickGranskningsfliken() {

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningButton()).click();
		
	}

	@Test (dependsOnMethods={"ClickGranskningsfliken"})
	public void Betalningsinformation() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformation());

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformation()).click();
	}

	@Test (dependsOnMethods={"Betalningsinformation"})
	public void BankensLand() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensLand());

		Select BankensLand = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensLand());

		if (driver.getPageSource().contains("Betalningsinformation"))
		{
			BankensLand.selectByVisibleText("Frankrike");}

		else if (driver.getPageSource().contains("Payment information")) 
		{
			BankensLand.selectByVisibleText("France");}
	}

	@Test (dependsOnMethods={"BankensLand"})
	public void BankensNamn() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn());

		CombineClearAndSendkeys.ClearSend(driver, PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn(), "SvinBraBank");

	}

	@Test (dependsOnMethods={"BankensNamn"})
	public void Kontoinnehavare() {

		CombineClearAndSendkeys.ClearSend(driver, PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare(), "BankmanTest");

	}

	@Test (dependsOnMethods={"Kontoinnehavare"})
	public void IBAN() {

		CombineClearAndSendkeys.ClearSend(driver, PortalLoggedInAsUserGranskning.GranskningBetalningsinformationIBAN(), "9943595");

	}

	@Test (dependsOnMethods={"IBAN"})
	public void SWIFTBIC() {

		CombineClearAndSendkeys.ClearSend(driver, PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSWIFTBIC(), "Abc1234567");

	}

	@Test (dependsOnMethods={"SWIFTBIC"})
	public void TIN() {

		CombineClearAndSendkeys.ClearSend(driver, PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN(), "12134234");

	}

	@Test (dependsOnMethods={"TIN"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSpara()).click();
	}

	@Test (dependsOnMethods={"Spara"})
	public void AccepteraAlert() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				By.xpath("//button[contains(text(), 'Ok')]"));

		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}
}