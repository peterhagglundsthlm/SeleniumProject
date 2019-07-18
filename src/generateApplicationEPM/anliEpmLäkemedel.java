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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
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

	public void eudraCTnr() throws AWTException, InterruptedException, IOException {

		// 15.5.1 EudraCT-nr in med javascript
		WebDriverWait wait4b = new WebDriverWait(driver, 10);
		wait4b.until(ExpectedConditions.elementToBeClickable(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")));
		((JavascriptExecutor) driver).executeScript("scroll(0, 200)"); 
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", driver.findElement(By.id("45972d02-03bd-4879-b6f6-0d75314d66e7")), "2019-123456-99");

	}

	public void bilagorLäkemedel () throws AWTException, InterruptedException, IOException {

		//		driver.switchTo().frame(0);
		//		driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))).sendKeys("1");
		//		driver.switchTo().parentFrame();


		//		//15.5.2 bifoga EU-blankett - obligatorisk för läkemedelsprövning
		//		driver.findElement(By.tagName("div").id("0126d447-4683-4bdc-967c-fc02baba7c87-form-item").id("select-file")).click();
		//		Thread.sleep(1500);
		//		Runtime.getRuntime().exec("C:\\Users\\anli\\Desktop\\FileUpload.exe");
		//		Thread.sleep(1500);

		//15.5.2 bifoga EU-blankett - obligatorisk för läkemedelsprövning
		//		driver.findElement(By.xpath("//label[text()='15.5.2 Gemensam EU-blankett']")).click();
		//		Thread.sleep(1500);
		//		Runtime.getRuntime().exec("C:\\Users\\anli\\Desktop\\FileUpload.exe");
		//		Thread.sleep(1500);

		driver.findElement(By.xpath("//a[contains(@onclick=\'$('#d5a98cab-4e27-4b1b-9fa5-a544f16e5d01_ctrladd').click();;')]")).click();
		Runtime.getRuntime().exec("C:\\Users\\anli\\Desktop\\FileUpload.exe");
		Thread.sleep(1500);

		// klicka på alla Välj fil att ladda upp 
		//		int xpathCount = driver.findElement(By.linkText("Välj fil att ladda upp")).size();

		//		WebElement knappFinns = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Välj fil att ladda upp")));
		//		WebElement antalKnappar = driver.findElement(By.linkText("Välj fil att ladda upp"));
		//				System.out.println("Det finns " + antalKnappar.toString());
		//		

		WebElement knappFinns = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Välj fil att ladda upp")));
		System.out.println("Jag har identifierat en knapp för att ladda upp fil.");

		while (true) {
			driver.findElement(By.linkText("Välj fil att ladda upp")).click();
			Thread.sleep(3000);
			Runtime.getRuntime().exec("C:\\Users\\anli\\Desktop\\FileUpload.exe");
			Thread.sleep(3000);
			System.out.println("Jag har laddat upp en fil.");
		}


		//		String rubrik = driver.findElement(By.tagName("a")).getText();
		//		System.out.println("Jag har hittat a-taggen!" + knapptext);

		//		//15.5.2 bifoga EU-blankett - obligatorisk för läkemedelsprövning
		//		driver.findElement(By.id("select-file")).click();
		//		Thread.sleep(1500);
		//		Runtime.getRuntime().exec("C:\\Users\\anli\\Desktop\\FileUpload.exe");
		//		Thread.sleep(1500);

		//15.5.3 bifoga fo-protokoll - obligatorisk för läkemedelsprövning
		//		driver.findElement(By.id("select-file")).click();
		//		Thread.sleep(1500);
		//		Runtime.getRuntime().exec("C:\\Users\\anli\\Desktop\\FileUpload.exe");
		//		Thread.sleep(1500);
		//
		//		//15.5.4 bifoga bipacksedel etc - obligatorisk för läkemedelsprövning
		//		driver.findElement(By.id("select-file")).click();
		//		Thread.sleep(1500);
		//		Runtime.getRuntime().exec("C:\\Users\\anli\\Desktop\\FileUpload.exe");
		//		Thread.sleep(1500);
	}
}
