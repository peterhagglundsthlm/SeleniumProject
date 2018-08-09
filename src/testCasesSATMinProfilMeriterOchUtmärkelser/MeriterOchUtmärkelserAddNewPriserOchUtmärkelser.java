package testCasesSATMinProfilMeriterOchUtm‰rkelser;

import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class MeriterOchUtm‰rkelserAddNewPriserOchUtm‰rkelser extends BeforeAfterTestBrowsers {

	@BeforeClass
	public void TestCaseInfo() {
		
		String TestCaseInfo = "Loggar in som en projektledare och l‰gger till en Priser och Utm‰rkelser";
		System.out.println("Beskrivning av testfall: " + TestCaseInfo);	
	}
	
	@Test
	public void LoginAsUser() {

		PortalLoggedInAsUserMinProfil.MinProfil(driver).click();
	}

	@Test (dependsOnMethods={"LoginAsUser"})
	public void ClickMeriterOchUtm‰rkelser() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser(driver).click();
	}

	@Test (dependsOnMethods={"ClickMeriterOchUtm‰rkelser"})
	public void L‰ggTill() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserL‰ggTill(driver).click();
	}

	@Test (dependsOnMethods={"L‰ggTill"})
	public void ≈r() {

		Select ≈r = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelser≈r)));
		Random randomOption≈r = new Random();  
		int endOption≈r = ≈r.getOptions().size(); 
		int number≈r = randomOption≈r .nextInt(endOption≈r);  
		≈r.selectByIndex(number≈r);
		
		WebElement ≈rSelect = ≈r.getFirstSelectedOption();
		String ≈rSelectValue = ≈rSelect.getText();
		System.out.println("≈r = " + ≈rSelectValue); 
	}

	@Test (dependsOnMethods={"≈r"})
	public void Land() {

		Select Land = new Select (driver.findElement(By.id(PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserLand)));
		Random randomOptionLand = new Random();  
		int startOptionLand = 1;
		int endOptionLand = Land.getOptions().size(); 
		int numberLand = startOptionLand + randomOptionLand .nextInt(endOptionLand - startOptionLand);  
		Land.selectByIndex(numberLand);
		
		WebElement LandSelect = Land.getFirstSelectedOption();
		String LandSelectValue = LandSelect.getText();
		System.out.println("Land = " + LandSelectValue);
	}

	@Test (dependsOnMethods={"Land"})
	public void NamnPÂPriset() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserNamnPÂPriset(driver).sendKeys("Ett bra namn");

		String NamnPÂPrisetString = PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserNamnPÂPriset(driver).getAttribute("value");
		System.out.println("Namn pÂ priset = " + NamnPÂPrisetString); 
	}

	@Test (dependsOnMethods={"NamnPÂPriset"})
	public void Utf‰rdare() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserUtf‰rdare(driver).sendKeys("En bra utf‰rdare");

		String Utf‰rdareString = PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserUtf‰rdare(driver).getAttribute("value");
		System.out.println("Utf‰rdare = " + Utf‰rdareString); 
	}

	@Test (dependsOnMethods={"Utf‰rdare"})
	public void Beskrivning() {

		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserBeskrivning(driver).sendKeys("En bra beskrivning");
		
		String BeskrivningString = PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserBeskrivning(driver).getAttribute("value");
		System.out.println("Beskrivning = " + BeskrivningString); 
	}
	
	@Test (dependsOnMethods={"Beskrivning"})
	public void Spara() {

		((JavascriptExecutor) driver).executeScript("scroll(0,-200)");
		
		PortalLoggedInAsUserMinProfil.MinProfil_MeriterOchUtm‰rkelser_PriserOchUtM‰rkelserSpara(driver).click();
	}
}
