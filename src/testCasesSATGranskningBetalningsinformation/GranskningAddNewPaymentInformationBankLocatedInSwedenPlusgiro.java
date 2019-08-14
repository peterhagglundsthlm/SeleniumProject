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

public class GranskningAddNewPaymentInformationBankLocatedInSwedenPlusgiro extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till ny betalningsinformation på sidan Granskning för Sverige (PLUSGIRO)";
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
			BankensLand.selectByVisibleText("Sverige");}

		else if (driver.getPageSource().contains("Payment information")) 
		{
			BankensLand.selectByVisibleText("Sweden");}
	}

	@Test (dependsOnMethods={"BankensLand"})
	public void Betalningstyp() {
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBetalningstyp());

		Select Betalningstyp = driverSelect.DropDown(driver, 
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBetalningstyp());

		if (driver.getPageSource().contains("Betalningstyp"))
		{
			Betalningstyp.selectByVisibleText("Plusgiro");}

		else if (driver.getPageSource().contains("PaymentAccountType")) 
		{
			Betalningstyp.selectByVisibleText("Postal giro");}
	}

	@Test (dependsOnMethods={"Betalningstyp"})
	public void Plusgiro() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, 
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationPlusgiro());
		
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationPlusgiro()).clear();
		driver.findElement(
				PortalLoggedInAsUserGranskning.GranskningBetalningsinformationPlusgiro()).sendKeys("1234-45-67");
	}

	@Test (dependsOnMethods={"Plusgiro"})
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

		((JavascriptExecutor)driver).executeScript("scroll(0,-200)");
		
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

