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


public class GranskningAddNewPaymentInformationBankLocatedOutsideOfEurope extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {

		String TestCaseInfo = "Loggar in som en projektledare och lägger till ny betalningsinformation på sidan Granskning för land utanför Europa (Chile)";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}


	@Test
	public void LoginAsUser() {

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
		
		if (driver.getPageSource().contains("Betalningsinformation"))
		{
			BankensLand.selectByVisibleText("Chile");
		}
		else if (driver.getPageSource().contains("Payment information")) 
		{
			BankensLand.selectByVisibleText("Chile");
		}

//		WebElement BankensLandSelect = BankensLand.getFirstSelectedOption();
//		String BankeslandValue = BankensLandSelect.getText();
//		System.out.println("Bankens land är = " + BankeslandValue ); 
	}

	@Test (dependsOnMethods={"BankensLand"})
	public void BankensNamn() throws InterruptedException {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn));
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn(driver).sendKeys("Chiles bästa bank2");

//		String BankensnamnString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensNamn(driver).getAttribute("value");
//		System.out.println("Bankensnamn = " + BankensnamnString); 

	}

	@Test (dependsOnMethods={"BankensNamn"})
	public void Bankadress() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankAdress(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankAdress(driver).sendKeys("Bankgata123");

//		String BankadressString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankAdress(driver).getAttribute("value");
//		System.out.println("Bankadress = " + BankadressString); 
	}

	@Test (dependsOnMethods={"Bankadress"})
	public void BankensPostnummer() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensPostnummer(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensPostnummer(driver).sendKeys("55555");

//		String BankensPostnummerString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensPostnummer(driver).getAttribute("value");
//		System.out.println("Bankens postnummer är = " + BankensPostnummerString); 

	}

	@Test (dependsOnMethods={"BankensPostnummer"})
	public void BankensPostadress() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensPostAdress(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensPostAdress(driver).sendKeys("GatanIStan");

//		String BankensPostadressString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankensPostAdress(driver).getAttribute("value");
//		System.out.println("Bankens postadress är = " + BankensPostadressString); 
	}

	@Test (dependsOnMethods={"BankensPostadress"})
	public void Kontoinnehavare() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare(driver).sendKeys("Testkontoperson");

//		String KontoinnehavareString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationKontoinnehavare(driver).getAttribute("value");
//		System.out.println("Kontoinnehavare är = " + KontoinnehavareString); 
	}

	@Test (dependsOnMethods={"Kontoinnehavare"})
	public void Bankkontonummer() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkontonummer(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkontonummer(driver).sendKeys("1234-56");

//		String BankkontonummerString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkontonummer(driver).getAttribute("value");
//		System.out.println("Bankkontonummer är = " + BankkontonummerString); 
	}

	@Test (dependsOnMethods={"Bankkontonummer"})
	public void Bankkod() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkod(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkod(driver).sendKeys("1234");

//		String BankkodString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankkod(driver).getAttribute("value");
//		System.out.println("Bankkod är = " + BankkodString); 
	}

	@Test (dependsOnMethods={"Bankkod"})
	public void SWIFTBIC() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSWIFTBIC(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSWIFTBIC(driver).sendKeys("12345678");

//		String SWIFTBICString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSWIFTBIC(driver).getAttribute("value");
//		System.out.println("SWIFTBIC är = " + SWIFTBICString); 
	}

	@Test (dependsOnMethods={"SWIFTBIC"})
	public void TIN() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN(driver).sendKeys("9797987");

//		String TINString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN(driver).getAttribute("value");
//		System.out.println("TIN är = " + TINString); 
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
