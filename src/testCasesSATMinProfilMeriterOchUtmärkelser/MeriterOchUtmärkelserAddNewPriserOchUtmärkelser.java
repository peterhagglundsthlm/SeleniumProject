package testCasesSATMinProfilMeriterOchUtmärkelser;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class MeriterOchUtmärkelserAddNewPriserOchUtmärkelser extends BeforeAfterTestBrowsers {

	@BeforeTest
	public void TestCaseInfo() {
		
		String TestCaseInfo = "Loggar in som en projektledare och lägger till en Priser och Utmärkelser";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}
	
	@Test
	public void LoginAsUser() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.cssSelector(PortalLoggedInAsUserMinProfil.MinProfil));
		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickMeriterOchUtmärkelser() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser(driver).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtmärkelser"})
	public void LäggTill() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserLäggTill(driver).click();
	}

	@Test (dependsOnMethods={"LäggTill"})
	public void År() {

		Select År = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserÅr)));
		Random randomOptionÅr = new Random();  
		int startOptionÅr = 0;
		int endOptionÅr = År.getOptions().size(); 
		int numberÅr = startOptionÅr + randomOptionÅr .nextInt(endOptionÅr - startOptionÅr);  
		År.selectByIndex(numberÅr);
	}

	@Test (dependsOnMethods={"År"})
	public void Land() {

		Select Land = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserLand)));
		Random randomOptionLand = new Random();  
		int startOptionLand = 1;
		int endOptionLand = Land.getOptions().size(); 
		int numberLand = startOptionLand + randomOptionLand .nextInt(endOptionLand - startOptionLand);  
		Land.selectByIndex(numberLand);
	}

	@Test (dependsOnMethods={"Land"})
	public void NamnPåPriset() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserNamnPåPriset(driver).sendKeys("Ett bra namn");

	}

	@Test (dependsOnMethods={"NamnPåPriset"})
	public void Utfärdare() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserUtfärdare(driver).sendKeys("En bra utfärdare");

	}

	@Test (dependsOnMethods={"Utfärdare"})
	public void Beskrivning() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserBeskrivning(driver).sendKeys("En bra beskrivning");
	}
	
	@Test (dependsOnMethods={"Beskrivning"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtmärkelser_PriserOchUtMärkelserSpara(driver).click();
	}
}
