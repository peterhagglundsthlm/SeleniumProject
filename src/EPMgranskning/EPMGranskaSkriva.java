package EPMgranskning;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.driverSelect;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import pageElementsSAT_EPM.EPM_applicationTestData;
import pageElementsSAT_EPM.EPM_granskningElements;

public class EPMGranskaSkriva extends EpmGranskaPrerequisites {

	@Test
	public void granskaApplication () throws AWTException, InterruptedException, IOException  {

		EPMgranskning.anliEpmOtherMethods.startaGranskning(driver);
		
		if (testSkriv >= 1 ) {
			performGranskning();

			while (testSkriv < 1) {
				System.out.println("Då har jag inget att granska.");
				break;
			}
		}
	}

	@Test (dependsOnMethods = {"startGranskning"})
	public void performGranskning () throws AWTException, InterruptedException, IOException {

		Thread.sleep(1000);
		driver.findElement(By.linkText("Skriv")).click();

		System.out.println("Jag har klickat på en Skriv-knapp.");

		pageElementsSAT_EPM.EPM_granskningElements.ChangeTabGranskning(driver);

		/*
		int antalTextarea = driver.findElements(By.tagName("textarea")).size();
		System.out.println(antalTextarea + " stora fält att fylla i");
		 */
		// inmatning
		driver.findElement(By.id(("4367fbf2-3e42-4220-a1f1-c00c509e6b0f"))).sendKeys(datum + "Test Testenstein skriver utlåtande, fält 1.");
		driver.findElement(By.id(("ff438f9b-b6cb-4dfe-a4e1-bbbfabe50f90"))).sendKeys("Test Testenstein skriver utlåtande, fält 2.");
		driver.findElement(By.id(("1891748c-bda5-4742-ba56-adbdf330dc42"))).sendKeys("Test Testenstein skriver utlåtande, fält 3.");
		driver.findElement(By.id(("be84184f-f1f9-42ef-bbee-ef6bbb6e55e2"))).sendKeys("Test Testenstein skriver utlåtande, fält 4.");
		driver.findElement(By.id(("253cf862-baae-48c5-b647-28c3c2ab50b0"))).sendKeys("Test Testenstein skriver utlåtande, fält 5.");
		driver.findElement(By.id(("aa00ae04-42ec-4ded-9b14-6ac862b2b5f4"))).sendKeys("Test Testenstein skriver utlåtande, fält 6.");

		Select DropdownBeslut = driverSelect.DropDown(driver, By.id("54231598-1832-4649-a139-b25be0b4486b"));
		DropdownBeslut.selectByIndex(5);
		driver.findElement(By.id("54231598-1832-4649-a139-b25be0b4486b_ctrladd_")).click();

		driver.findElement(By.id(("eb484e65-00cf-4971-9e3c-16e76b528cd9"))).sendKeys("Test Testenstein skriver utlåtande, sista fältet.");
	}

	@Test (dependsOnMethods={"performGranskning"})
	public void Register() {

		driver.findElement(By.id("Submitter_Submit"));
		System.out.println("Jag har hittat knappen 'Skicka in'.");
		driver.findElement(By.id("Submitter_Submit")).click();
		System.out.println("Jag har klickat på knappen.");

		WebDriverWait wait = new WebDriverWait(driver, 2);

		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		alert.accept();
	} 
}