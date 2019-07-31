package testCasesSATGranskningBetalningsinformation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserGranskning;


public class GranskningAddNewPaymentInformationBankLocatedInSwedenBankgiro extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till ny betalningsinformation på sidan Granskning för Sverige (BANKGIRO)";
	}

	@Test
	public void LoginAsUser() {

	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickGranskningsfliken() {

		driver.findElement(PortalLoggedInAsUserGranskning.GranskningButton()).click();
	}

	@Test (dependsOnMethods={"ClickGranskningsfliken"})
	public void Betalningsinformation() {

		driver.findElement(PortalLoggedInAsUserGranskning.GranskningBetalningsinformation()).click();
	}

	@Test (dependsOnMethods={"Betalningsinformation"})
	public void BankensLand() {

		Select BankensLand = driverSelect.DropDown(driver, PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensLand());

		if (driver.getPageSource().contains("Betalningsinformation"))
		{
			BankensLand.selectByVisibleText("Sverige");
		}
		else if (driver.getPageSource().contains("Payment information")) 
		{
			BankensLand.selectByVisibleText("Sweden");
		}
	}

	@Test (dependsOnMethods={"BankensLand"})
	public void Betalningstyp() {

		Select Betalningstyp = driverSelect.DropDown(driver, PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBetalningstyp());

		if (driver.getPageSource().contains("Betalningstyp"))
		{
			Betalningstyp.selectByVisibleText("Bankgiro");
		}
		else if (driver.getPageSource().contains("Payment account type")) 
		{
			Betalningstyp.selectByVisibleText("Bank giro");
		}
	}

	@Test (dependsOnMethods={"Betalningstyp"})
	public void Bankgiro() {

		driver.findElement(PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankgiro_Id()).clear();
		driver.findElement(PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankgiro_Id()).sendKeys("1234-1234");
	}

	@Test (dependsOnMethods={"Bankgiro"})
	public void Skatteprocent() {

		driver.findElement(PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSkatteprocent()).clear();
		driver.findElement(PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSkatteprocent()).sendKeys("35");
	}

	@Test (dependsOnMethods={"Skatteprocent"})
	public void TIN() {

		driver.findElement(PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN()).clear();
		driver.findElement(PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN()).sendKeys("1234567");
	}

	@Test (dependsOnMethods={"TIN"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSpara()).click();
	}

	@Test (dependsOnMethods={"Spara"})
	public void AcceptAlert() {

		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();
	}
}
