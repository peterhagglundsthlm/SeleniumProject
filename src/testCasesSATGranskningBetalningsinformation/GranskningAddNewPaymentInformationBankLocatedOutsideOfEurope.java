package testCasesSATGranskningBetalningsinformation;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserGranskning;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;


public class GranskningAddNewPaymentInformationBankLocatedOutsideOfEurope extends BeforeAfterTestBrowsers {


	String TestCaseInfo = "Loggar in som en projektledare och lägger till ny betalningsinformation på sidan Granskning för land utanför Europa (Chile)";

	@Test
	public void LoginAsUser() {

		System.out.println("Testfall = " + TestCaseInfo);
		DriverWaitExpectedConditions.WebDriverWaitForExpectedCssSelectorLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil);
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
		BankensLand.selectByVisibleText("Chile");
	}

	@Test (dependsOnMethods={"BankensLand"})
	public void BankensNamn() throws InterruptedException {

		DriverWaitExpectedConditions.WebDriverWaitForExpectedIdLocator(driver, PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn);
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn(driver).sendKeys("Chiles bästa bank2");
	}

	@Test (dependsOnMethods={"BankensNamn"})
	public void Bankadress() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankAdress(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankAdress(driver).sendKeys("Bankgata123");
	}

	@Test (dependsOnMethods={"Bankadress"})
	public void BankensPostnummer() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensPostnummer(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensPostnummer(driver).sendKeys("55555");

	}

	@Test (dependsOnMethods={"BankensPostnummer"})
	public void BankensPostadress() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensPostAdress(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensPostAdress(driver).sendKeys("GatanIStan");
	}

	@Test (dependsOnMethods={"BankensPostadress"})
	public void Kontoinnehavare() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare(driver).sendKeys("Testkontoperson");
	}

	@Test (dependsOnMethods={"Kontoinnehavare"})
	public void Bankkontonummer() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkontonummer(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkontonummer(driver).sendKeys("1234-56");
	}

	@Test (dependsOnMethods={"Bankkontonummer"})
	public void Bankkod() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkod(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkod(driver).sendKeys("1234");
	}

	@Test (dependsOnMethods={"Bankkod"})
	public void SWIFTBIC() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSWIFTBIC(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSWIFTBIC(driver).sendKeys("12345678");
	}

	@Test (dependsOnMethods={"SWIFTBIC"})
	public void TIN() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN(driver).sendKeys("1234567");
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
