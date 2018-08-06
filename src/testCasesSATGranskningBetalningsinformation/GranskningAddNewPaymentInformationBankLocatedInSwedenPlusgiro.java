package testCasesSATGranskningBetalningsinformation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserGranskning;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class GranskningAddNewPaymentInformationBankLocatedInSwedenPlusgiro extends BeforeAfterTestBrowsers {


	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till ny betalningsinformation på sidan Granskning för Sverige (PLUSGIRO)";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}


	@Test
	public void LoginAsUser() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil));
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickGranskningsfliken() {

		PortalLoggedInAsUserGranskning.GranskningButton(driver).click();
	}

	@Test (dependsOnMethods={"ClickGranskningsfliken"})
	public void Betalningsinformation() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformation(driver).click();
	}

	@Test (dependsOnMethods={"Betalningsinformation"})
	public void BankensLand() {

		Select BankensLand = new Select (driver.findElement(By.id(PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensLand)));
		BankensLand.selectByVisibleText("Sverige");

		WebElement BankensLandSelect = BankensLand.getFirstSelectedOption();
		String BankeslandValue = BankensLandSelect.getText();
		System.out.println("Bankens land är = " + BankeslandValue ); 
	}

	@Test (dependsOnMethods={"BankensLand"})
	public void Betalningstyp() {

		Select Betalningstyp = new Select (driver.findElement(By.id(PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBetalningstyp)));
		Betalningstyp.selectByVisibleText("Plusgiro");

		WebElement BetalningstypSelect = Betalningstyp.getFirstSelectedOption();
		String BetalningstypValue = BetalningstypSelect.getText();
		System.out.println("Betalningstyp är = " + BetalningstypValue ); 
	}

	@Test (dependsOnMethods={"Betalningstyp"})
	public void Plusgiro() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationPlusgiro(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationPlusgiro(driver).sendKeys("1234-45-67");

		String PlusgiroString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationPlusgiro(driver).getAttribute("value");
		System.out.println("Plusgiro är = " + PlusgiroString); 
	}

	@Test (dependsOnMethods={"Plusgiro"})
	public void Skatteprocent() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSkatteprocent(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSkatteprocent(driver).sendKeys("35");

		String SkatteprocentString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSkatteprocent(driver).getAttribute("value");
		System.out.println("Skatteprocent är = " + SkatteprocentString + "%"); 
	}

	@Test (dependsOnMethods={"Skatteprocent"})
	public void TIN() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN(driver).sendKeys("1234567");

		String TINString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN(driver).getAttribute("value");
		System.out.println("Skatteprocent är = " + TINString); 
	}

	@Test (dependsOnMethods={"TIN"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSpara(driver).click();
	}

	@Test (dependsOnMethods={"Spara"})
	public void AcceptAlert() {

		driver.findElement(By.xpath("//button[contains(text(), 'Ok')]")).click();

	}
}

