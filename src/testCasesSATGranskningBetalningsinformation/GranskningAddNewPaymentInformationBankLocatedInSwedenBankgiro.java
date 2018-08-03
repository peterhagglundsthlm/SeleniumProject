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

public class GranskningAddNewPaymentInformationBankLocatedInSwedenBankgiro extends BeforeAfterTestBrowsers {


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
		Betalningstyp.selectByVisibleText("Bankgiro");
		
		WebElement BetalningstypSelect = Betalningstyp.getFirstSelectedOption();
		String BetalningstypValue = BetalningstypSelect.getText();
		System.out.println("Betalningstyp är = " + BetalningstypValue ); 
	}
	
	@Test (dependsOnMethods={"Betalningstyp"})
	public void Bankgiro() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankgiro_Id(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankgiro_Id(driver).sendKeys("1234-1234");
		
		String BankgiroString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationBankgiro_Id(driver).getAttribute("value");
		System.out.println("Bankgiro = " + BankgiroString); 
	}
	
	@Test (dependsOnMethods={"Bankgiro"})
	public void Skatteprocent() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSkatteprocent(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSkatteprocent(driver).sendKeys("35");
		
		String SkatteprocentString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationSkatteprocent(driver).getAttribute("value");
		System.out.println("Skatteprocent = " + SkatteprocentString + "%"); 
	}
	
	@Test (dependsOnMethods={"Skatteprocent"})
	public void TIN() {

		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN(driver).clear();
		PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN(driver).sendKeys("1234567");
		
		String TINString = PortalLoggedInAsUserGranskning.GranskningBetalningsinformationTIN(driver).getAttribute("value");
		System.out.println("Skatteprocent = " + TINString); 
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
