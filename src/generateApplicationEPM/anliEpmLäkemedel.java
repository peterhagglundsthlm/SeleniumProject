package generateApplicationEPM;


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
import pageElementsSAT_EPM.EPM_applicationForm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class anliEpmLäkemedel extends anliEpmFormTitle01 {

	public static WebElement eudraCTnr(WebDriver driver) throws AWTException, InterruptedException, IOException {

		// 15.5.1 EudraCT-nr in med javascript
		WebDriverWait wait4b = new WebDriverWait(driver, 10);
		wait4b.until(ExpectedConditions.elementToBeClickable(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")));
		((JavascriptExecutor) driver).executeScript("scroll(0, 200)"); 
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])",
				driver.findElement(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")), "2019-123456-99");
		Thread.sleep(2000);
		
		System.out.println("Nu har jag kört wait4b");
		
		WebDriverWait wait4c = new WebDriverWait(driver, 10);
		wait4c.until(ExpectedConditions.elementToBeClickable(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])",
				driver.findElement(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")), "2019-123456-99");
		Thread.sleep(2000);
		
		System.out.println("Nu har jag kört wait4c");
				
		// om EudraCT-numret inte stämmer...
		if (driver.findElement(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")).getAttribute("value") != "2019-123456-99") {
			Thread.sleep(2000);
			System.out.println("Det finns inget Eudra-nummer ifyllt.");
			
//			 ...ta bort numret som står och fyll i på nytt. 
			driver.findElement(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")).clear();
			((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", 
					driver.findElement(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")), "2019-123456-99");
		}
		
		// ...annars felmeddelande i Failure Exception.
		else {
			Thread.sleep(3000);
			Assert.fail("Jag hittar inget EudraCT-nummer.");
		}
		
		
		System.out.println("Jag fixar EudraCT från anliEpmLäkemedel");
		return null;

	}

	public static WebElement bilagorLäkemedel (WebDriver driver) throws AWTException, InterruptedException, IOException {

		int test = driver.findElements(By.linkText("Välj fil att ladda upp")).size();
		System.out.println(test); 

		while (test > 0) {
			System.out.println(test);
			driver.findElement(By.linkText("Välj fil att ladda upp")).click();
			Thread.sleep(3000);
			Runtime.getRuntime().exec("C:\\Users\\anli\\Desktop\\FileUpload.exe");
			Thread.sleep(3000);
			System.out.println("Jag har laddat upp en fil.");
			test--;
			System.out.println(test);
		} 

		return null;
		
	} // här avslutas bilagorLäkemedel

}// här avslutas anliEpmLäkemedel