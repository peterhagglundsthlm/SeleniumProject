package generateApplicationEPM;


import static org.testng.Assert.fail;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

//import com.sun.tools.javac.util.List;

import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsAdminLoggaUt;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;
import pageElementsSAT_EPM.EPM_applicationFormElements;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class anliEpmLäkemedel extends anliEpmFormTitleCategory {

	public static WebElement eudraCTnr(WebDriver driver) throws AWTException, InterruptedException, IOException {

		String eudraCT = "2019-123456-99";
		
		// kontroll att EudraCT-nr inte finns
				if (driver.getPageSource().contains(eudraCT)) {
					System.out.println("Finns EudraCT-nr = AVVIKANDE.");
					Thread.sleep(10000);
				}
				else {
//					Assert.fail("EudraCT har försvunnit");
					System.out.println("Finns inget EudraCT-nr. Som förväntat.");
		}
		
		// 15.5.1 EudraCT-nr in med javascript
		WebDriverWait wait4b = new WebDriverWait(driver, 10);
		wait4b.until(ExpectedConditions.elementToBeClickable(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")));
		((JavascriptExecutor) driver).executeScript("scroll(0, 200)"); 
		Thread.sleep(10000);
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])",
				driver.findElement(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")), eudraCT);
		
		System.out.println("\nEudraCT-nummer är " + eudraCT + ". Nu har jag kört wait4b");
		Thread.sleep(10000);
		
		// kontroll om numret är kvar
		if (driver.getPageSource().contains(eudraCT)) {
			System.out.println("EudraCT är kvar.");
		}
		else {
			Assert.fail("EudraCT har försvunnit");
//			System.out.println("EudraCT har försvunnit.");
		}

//		//		 om EudraCT-numret inte stämmer...
//		if (driver.findElement(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")).getAttribute("value") != eudraCT) {
//			Thread.sleep(2000);
//			System.out.println("Det finns inget Eudra-nummer ifyllt.");
//
//			//			 ...ta bort numret som står och fyll i på nytt. 
//			driver.findElement(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")).clear();
//			Thread.sleep(3000);
//			System.out.println("Kontroll och clear av EudraCT-fältet.");
//			Thread.sleep(3000);
//			((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])",
//					driver.findElement(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")), eudraCT);
//		}
//
//		// ...annars felmeddelande i Failure Exception.
//		else {
//			Thread.sleep(3000);
//			Assert.fail("Jag hittar inget EudraCT-nummer.");
//		}
		return null;
	}

	public static WebElement bilagorLäkemedel (WebDriver driver) throws AWTException, InterruptedException, IOException {

		String eudraCT = "2019-123456-99";
		
		// kontroll om numret är kvar
		if (driver.getPageSource().contains(eudraCT)) {
			System.out.println("EudraCT är kvar.");
		}
		else {
			Assert.fail("EudraCT har försvunnit");
//			System.out.println("EudraCT har försvunnit.");
		}
		
		int test = driver.findElements(By.linkText("Välj fil att ladda upp")).size();
		System.out.println(test); 

		while (test > 0) {
			System.out.println("Antal filer att ladda upp är " + test);
			Thread.sleep(5000);
			driver.findElement(By.linkText("Välj fil att ladda upp")).click();
			Thread.sleep(5000);
			Runtime.getRuntime().exec("C:\\Users\\anli\\Desktop\\FileUpload.exe");
			Thread.sleep(5000);
			System.out.println("Jag har laddat upp en fil.");
			
			// kontroll om numret är kvar
			if (driver.getPageSource().contains(eudraCT)) {
				System.out.println("EudraCT är kvar.");
			}
			else {
				Assert.fail("EudraCT har försvunnit");
//				System.out.println("EudraCT har försvunnit.");
			}
			test--;
//			System.out.println(test);
		} 

		if (driver.getPageSource().contains(eudraCT)) {
			System.out.println("EudraCT är kvar.");
		}
		else {
			Assert.fail("EudraCT har försvunnit");
//			System.out.println("EudraCT har försvunnit.");
		}

		return null;

	} // här avslutas bilagorLäkemedel

}// här avslutas anliEpmLäkemedel