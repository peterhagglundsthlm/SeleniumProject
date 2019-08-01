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

public class GranskningAddNewPaymentInformationBankLocatedInEurope extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = 
				"Loggar in som en projektledare och lägger till ny betalningsinformation på sidan Granskning för land i Europa (Frankrike)";
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
			("Frankrike");}

		else if (driver.getPageSource().
				contains
				("Payment information")) 
		{BankensLand.selectByVisibleText
			("France");}
	}

	@Test (dependsOnMethods={"BankensLand"})
	public void BankensNamn() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(
				driver, PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn());
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn()).clear();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn()).sendKeys("Frankrikes bästa bank");
	}

	@Test (dependsOnMethods={"BankensNamn"})
	public void Kontoinnehavare() {

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare()).clear();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare()).sendKeys("BankmanTest");
	}

	@Test (dependsOnMethods={"Kontoinnehavare"})
	public void IBAN() {

		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare()).sendKeys("BankmanTest");
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationIBAN()).clear();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationIBAN()).sendKeys("9943595");
	}

	@Test (dependsOnMethods={"IBAN"})
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

		((JavascriptExecutor) 
				driver).executeScript("scroll(0,-200)");
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSpara()).click();
	}

	@Test (dependsOnMethods={"Spara"})
	public void AccepteraAlert() {

		driver.findElement(
				By.xpath("//button[contains(text(), 'Ok')]")).click();
	}
}