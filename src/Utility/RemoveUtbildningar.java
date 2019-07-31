package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import driverAndCommands.BeforeAfterTestBrowsers;
import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageElementsSAT.PortalLoggedInAsUserMinProfil;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class RemoveUtbildningar extends BeforeAfterTestBrowsers {
	



	@Test 
	public void f() throws InterruptedException {


		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, PortalLoggedInAsUserMinProfil.MinProfil());

		driver.findElement(PortalLoggedInAsUserMinProfil.MinProfil_Utbildning()).click();

	}

	
	@Test (dependsOnMethods={"f"})
	public void f2() throws InterruptedException {

	
		while(driver.findElement(By.xpath("//*[@id=\"researchEducationViewSectionIdFormId\"]/div/table[1]/tbody/tr[1]/td[7]/div")) != null){	

			driver.findElement(By.xpath("//*[@id=\"researchEducationViewSectionIdFormId\"]/div/table[1]/tbody/tr[1]/td[7]/div")).click();

			driver.findElement(By.linkText("Ta bort")).click();

			Alert alert = driver.switchTo().alert();
			alert.accept();

			Thread.sleep(1000);

		}
	}
	

		@Test (dependsOnMethods={"f"})
		public void f3() throws InterruptedException {

			
			while(driver.findElement(By.xpath("//*[@id=\"basicEducationViewSectionIdFormId\"]/table/tbody/tr[1]/td[6]/div")) != null){	

				driver.findElement(By.xpath("//*[@id=\"basicEducationViewSectionIdFormId\"]/table/tbody/tr[1]/td[6]/div")).click();

				driver.findElement(By.linkText("Ta bort")).click();

				Alert alert = driver.switchTo().alert();
				alert.accept();

				Thread.sleep(1000);

			}

		}
	}
