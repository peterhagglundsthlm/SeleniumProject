package Utility;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import driverAndCommands.DriverWaitExpectedConditions;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class testIE {
	WebDriver driver;
	
	
	
  @Test
  
  
  
  public void f() throws InterruptedException {
	  
	  	System.setProperty("webdriver.ie.driver","C:\\Selenium 3.12.0\\IEDriver\\IEDriverServer_Win32_3.13.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://prismaecmvrsat.ad.vr.se/Platina/frameset.aspx");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(driver.findElement(By.id("frameMenu")));
		
		DriverWaitExpectedConditions.WaitForElementToBeVisible(driver, By.id("Menu_New"));
		
		driver.findElement(By.id("Menu_New")).click();
		
		Thread.sleep(2000);
		
		
		
		driver.switchTo().frame(driver.findElement(By.id("defaultFrame")));
		
	
		
		((JavascriptExecutor)driver).executeScript(
			    "arguments[0].click();", driver.findElement(By.id("CustomMenuContainer")));
		
		
	//HAR KOMMIT SÅ LÅNGT ATT JAG KAN ÖPPNA MENYN MEN INTE MER. 
		

		}
	
  }


