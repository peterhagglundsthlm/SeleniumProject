package testCasesSATMinProfilMeriterOchUtm‰rkelser;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class MeriterOchUtm‰rkelserAddNewPriserOchUtm‰rkelser extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {
		
		String TestCaseInfo = "Loggar in som en projektledare och l‰gger till en Priser och Utm‰rkelser";
	}
	
	@Test
	public void LoginAsUser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickMeriterOchUtm‰rkelser() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser()).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtm‰rkelser"})
	public void L‰ggTill() {
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserL‰ggTill()).click();
	}

	@Test (dependsOnMethods={"L‰ggTill"})
	public void ≈r() {

		Select ≈r = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelser≈r());
		Random randomOption≈r = new Random();  
		int endOption≈r = ≈r.getOptions().size(); 
		int number≈r = randomOption≈r .nextInt(endOption≈r);  
		≈r.selectByIndex(number≈r);
	}

	@Test (dependsOnMethods={"≈r"})
	public void Land() {

		Select Land = driverSelect.DropDown(driver, PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserLand());
		Random randomOptionLand = new Random();  
		int startOptionLand = 1;
		int endOptionLand = Land.getOptions().size(); 
		int numberLand = startOptionLand + randomOptionLand .nextInt(endOptionLand - startOptionLand);  
		Land.selectByIndex(numberLand);
	}

	@Test (dependsOnMethods={"Land"})
	public void NamnPÂPriset() {

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserNamnPÂPriset()).sendKeys("Ett bra namn");
	}

	@Test (dependsOnMethods={"NamnPÂPriset"})
	public void Utf‰rdare() {
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserUtf‰rdare()).sendKeys("En bra utf‰rdare");
	}

	@Test (dependsOnMethods={"Utf‰rdare"})
	public void Beskrivning() {
		
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserBeskrivning()).sendKeys("En bra beskrivning");
	}
	
	@Test (dependsOnMethods={"Beskrivning"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserSpara()).click();
	}
}
