package testCasesSATGranskningBetalningsinformation;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserGranskning;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class GranskningAddNewPaymentInformationBankLocatedInSwedenBankkonto extends BeforeAfterTestBrowsers {

	String TestCaseInfo = "Loggar in som en projektledare och lägger till ny betalningsinformation på sidan Granskning för Sverige (BANKKONTO)";

	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);
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
		Betalningstyp.selectByVisibleText("Bankkonto");
		
		WebElement BetalningstypSelect = Betalningstyp.getFirstSelectedOption();
		String BetalningstypValue = BetalningstypSelect.getText();
		System.out.println("Betalningstyp är = " + BetalningstypValue ); 
	}

	@Test (dependsOnMethods={"Betalningstyp"})
	public void BankensNamn() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn));
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn(driver).sendKeys("Sveriges bästa bank");
		
		String BankensNamnString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn(driver).getAttribute("value");
		System.out.println("Bankens namn är = " + BankensNamnString); 


	}

	@Test (dependsOnMethods={"BankensNamn"})
	public void Kontoinnehavare() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare(driver).sendKeys("Sveriges bästa kontoinnehavare");
		
		String KontoinnehavareString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare(driver).getAttribute("value");
		System.out.println("Kontoinnehavare är = " + KontoinnehavareString); 
	}

	@Test (dependsOnMethods={"Kontoinnehavare"})
	public void Clearingnummer() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationClearingnummer(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationClearingnummer(driver).sendKeys("123456-78");
		
		String ClearingnummerString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationClearingnummer(driver).getAttribute("value");
		System.out.println("Clearingnummer är = " + ClearingnummerString); 
	}

	@Test (dependsOnMethods={"Clearingnummer"})
	public void Bankkontonummer() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkontonummer(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkontonummer(driver).sendKeys("123-4545");
		
		String BankkontonummerString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkontonummer(driver).getAttribute("value");
		System.out.println("Kontonummer är = " + BankkontonummerString); 
	}

	@Test (dependsOnMethods={"Bankkontonummer"})
	public void Skatteprocent() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSkatteprocent(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSkatteprocent(driver).sendKeys("33");
		
		String Skatteprocent = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSkatteprocent(driver).getAttribute("value");
		System.out.println("Skatteprocent är = " + Skatteprocent + "%"); 
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
