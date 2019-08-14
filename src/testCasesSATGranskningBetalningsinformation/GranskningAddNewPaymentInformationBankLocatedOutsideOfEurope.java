package testCasesSATGranskningBetalningsinformation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserGranskning;


public class GranskningAddNewPaymentInformationBankLocatedOutsideOfEurope extends BeforeAfterTestBrowsers {

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
		
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn()).clear();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn()).sendKeys("Chiles bästa bank");
	}

	@Test (dependsOnMethods={"BankensNamn"})
	public void Bankadress() {

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankAdress()).clear();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankAdress()).sendKeys("Bankgata123");
	}

	@Test (dependsOnMethods={"Bankadress"})
	public void BankensPostnummer() {

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensPostnummer()).clear();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensPostnummer()).sendKeys("55555");
	}

	@Test (dependsOnMethods={"BankensPostnummer"})
	public void BankensPostadress() {

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensPostAdress()).clear();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensPostAdress()).sendKeys("GatanIStan");
	}

	@Test (dependsOnMethods={"BankensPostadress"})
	public void Kontoinnehavare() {

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare()).clear();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare()).sendKeys("BankmanTest");
	}

	@Test (dependsOnMethods={"Kontoinnehavare"})
	public void Bankkontonummer() {

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkontonummer()).clear();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkontonummer()).sendKeys("123-4545");
	}

	@Test (dependsOnMethods={"Bankkontonummer"})
	public void Bankkod() {

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkod()).clear();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkod()).sendKeys("1234");
	}

	@Test (dependsOnMethods={"Bankkod"})
	public void SWIFTBIC() {

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSWIFTBIC()).clear();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSWIFTBIC()).sendKeys("Abc1234567");
	}

	@Test (dependsOnMethods={"SWIFTBIC"})
	public void TIN() {

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN()).clear();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN()).sendKeys("12134234");
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
