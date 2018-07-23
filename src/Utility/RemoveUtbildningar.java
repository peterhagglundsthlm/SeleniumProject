package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsUserMinProfil;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class RemoveUtbildningar {
	public static WebDriver driver; 



	@Test 
	public void f() throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\Selenium 3.12.0\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome_Xpath(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.jagtestarprismaSATuserName, UserCredentials.jagtestarprismaSATpassword);

		DriverWaitExpectedConditions.WebDriverWaitForExpectedXpathLocator(driver, PortalLoggedInAsUserMinProfil.MinProfil_Xpath);

		PortalLoggedInAsUserMinProfil.MinProfil_Utbildning_Xpath(driver).click();
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
