package Utility;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;

public class RemoveArbetsliv extends BeforeAfterTestBrowsers {

	
	
	@Test 
	public void f() throws InterruptedException {


		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil()).click();
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv());
		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Arbetsliv()).click();
	}

	
	@Test (dependsOnMethods={"f"})
	public void f2() throws InterruptedException {

	
		while(driver.findElement(By.linkText("Välj")) != null){	

			driver.findElement(By.linkText("Välj")).click();

			driver.findElement(By.linkText("Ta bort")).click();

			Alert alert = driver.switchTo().alert();
			alert.accept();

			Thread.sleep(1000);	
		}
		}
	}