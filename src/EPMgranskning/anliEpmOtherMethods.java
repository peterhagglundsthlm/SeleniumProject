package EPMgranskning;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import automationSetup.BeforeAfterTestSetup;
import pageElementsSAT_EPM.EPM_granskningElements;
import reusableMethods.DriverWaitExpectedConditions;

public class anliEpmOtherMethods extends EpmGranskaPrerequisites {

//	static String beredningsgrupp;
//	static String granskningsuppgifter;
//	static String datum;
//
//	@Parameters({"bgURL"})
//	@BeforeClass 
//	public void aktuellBeredningsgrupp (@Optional String bgURL) {
//
//		beredningsgrupp = bgURL;
//		System.out.println("URL för beredningsgrupp: " + beredningsgrupp);
//	}
//
//	@Parameters({"granskningURL"})
//	@BeforeClass 
//	public void aktuellGransknUppgifter (@Optional String granskningURL) {
//
//		granskningsuppgifter = granskningURL;
//	}
//
//	@Parameters({"date"})
//	@BeforeClass 
//	public void datum (@Optional String date) {
//
//		datum = date;
//		System.out.println("Datum är " + datum);
//	}
//
//

	public static WebElement startaGranskning(WebDriver driver) throws AWTException, InterruptedException, IOException {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, EPM_granskningElements.Granskning());
		driver.findElement(EPM_granskningElements.Granskning()).click();
		System.out.println("Klickat på Granskning.");

		WebDriverWait wait1 = new WebDriverWait(driver, 5);		
		driver.get(beredningsgrupp);
		System.out.println("Hittat bg");
		WebDriverWait wait2 = new WebDriverWait(driver, 5);		
		driver.get(granskningsuppgifter);
		System.out.println("Hittat granskningsuppgifter");


		int testSkriv = driver.findElements(By.linkText("Skriv")).size();
		System.out.println(testSkriv + " skriv-knappar"); 
		int testÖppna = driver.findElements(By.linkText("Öppna")).size();
		System.out.println(testÖppna + " öppna-knappar");

		System.out.println("Antal ansökningar att granska = " + testSkriv);

		return null; 
	}
}