package testCasesSATGranskningBetalningsinformation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT.PortalLoggedInAsUserGranskning;
import reusableMethods.CombineClearAndSendkeys;
import reusableMethods.DriverWaitExpectedConditions;
import reusableMethods.driverSelect;


public class GranskningAddNewPaymentInformationBankLocatedOutsideOfEurope extends BeforeAfterTestSetup {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till ny betalningsinformation på sidan Granskning för land utanför Europa (Chile)";
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
			BankensLand.selectByVisibleText("Chile");}

		else if (driver.getPageSource().contains("Payment information")) 
		{
			BankensLand.selectByVisibleText("Chile");}
	}

	@Test (dependsOnMethods={"BankensLand"})
	public void BankensNamn() throws InterruptedException {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn());
		
		CombineClearAndSendkeys.ClearSend(driver, PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn(), "Chiles bästa bank");
		
	}

	@Test (dependsOnMethods={"BankensNamn"})
	public void Bankadress() {
		
		CombineClearAndSendkeys.ClearSend(driver, PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankAdress(), "Bankgata123");

	}

	@Test (dependsOnMethods={"Bankadress"})
	public void BankensPostnummer() {
		
		CombineClearAndSendkeys.ClearSend(driver, PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensPostnummer(), "555555");

	}

	@Test (dependsOnMethods={"BankensPostnummer"})
	public void BankensPostadress() {
		
		CombineClearAndSendkeys.ClearSend(driver, PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensPostAdress(), "GatanIStan");

	}

	@Test (dependsOnMethods={"BankensPostadress"})
	public void Kontoinnehavare() {
		
		CombineClearAndSendkeys.ClearSend(driver, PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare(), "BankmanTest");

	}

	@Test (dependsOnMethods={"Kontoinnehavare"})
	public void Bankkontonummer() {
		
		CombineClearAndSendkeys.ClearSend(driver, PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkontonummer(), "123-4545");

	}

	@Test (dependsOnMethods={"Bankkontonummer"})
	public void Bankkod() {
		
		CombineClearAndSendkeys.ClearSend(driver, PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkod(), "1234");

	}

	@Test (dependsOnMethods={"Bankkod"})
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
	public void AcceptAlert() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				By.xpath("//button[contains(text(), 'Ok')]"));

		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}
}
