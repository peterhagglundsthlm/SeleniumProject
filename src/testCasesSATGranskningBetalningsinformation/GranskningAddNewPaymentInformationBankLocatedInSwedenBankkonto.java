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

public class GranskningAddNewPaymentInformationBankLocatedInSwedenBankkonto extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = 
				"Loggar in som en projektledare och lägger till ny betalningsinformation på sidan Granskning för Sverige (BANKKONTO)";
	}

	@Test 
	public void ClickGranskningsfliken() {

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningButton()).click();
	}

	@Test (dependsOnMethods={"ClickGranskningsfliken"})
	public void Betalningsinformation() {

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformation()).click();
	}

	@Test (dependsOnMethods={"Betalningsinformation"})
	public void BankensLand() {

		Select BankensLand = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensLand());

		if (driver.getPageSource().contains
				("Betalningsinformation"))
		{BankensLand.selectByVisibleText
			("Sverige");}

		else if (driver.getPageSource().contains
				("Payment information")) 
		{BankensLand.selectByVisibleText
			("Sweden");}
	}

	@Test (dependsOnMethods={"BankensLand"})
	public void Betalningstyp() {

		Select Betalningstyp = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBetalningstyp());

		if (driver.getPageSource().contains
				("Betalningstyp"))
		{Betalningstyp.selectByVisibleText
			("Bankkonto");}

		else if (driver.getPageSource().contains
				("Payment account type")) 
		{Betalningstyp.selectByVisibleText
			("Bank account");}
	}

	@Test (dependsOnMethods={"Betalningstyp"})
	public void BankensNamn() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn());
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn()).clear();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn()).sendKeys("Sveriges bästa bank");
	}

	@Test (dependsOnMethods={"BankensNamn"})
	public void Kontoinnehavare() {

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare()).clear();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare()).sendKeys("BankmanTest");
	}

	@Test (dependsOnMethods={"Kontoinnehavare"})
	public void Clearingnummer() {

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationClearingnummer()).clear();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationClearingnummer()).sendKeys("123456-78");
	}

	@Test (dependsOnMethods={"Clearingnummer"})
	public void Bankkontonummer() {

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkontonummer()).clear();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkontonummer()).sendKeys("123-4545");
	}

	@Test (dependsOnMethods={"Bankkontonummer"})
	public void Skatteprocent() {

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSkatteprocent()).clear();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSkatteprocent()).sendKeys("35");
	}

	@Test (dependsOnMethods={"Skatteprocent"})
	public void TIN() {

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN()).clear();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN()).sendKeys("1234567");
	}

	@Test (dependsOnMethods={"TIN"})
	public void Spara() {

		((JavascriptExecutor) 
				driver).executeScript("scroll(0,-200)");
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSpara()).click();
	}

	@Test (dependsOnMethods={"Spara"})
	public void AcceptAlert() {

		driver.findElement(
				By.xpath("//button[contains(text(), 'Ok')]")).click();
	}
}
