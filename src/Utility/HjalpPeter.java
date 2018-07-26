package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import driverAndCommands.DriverGetWebsite;
import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.IfStatements;
import driverAndCommands.LoginLogic;
import pageElementsSAT.PortalLoggedInAsAdmin;
import pageElementsSAT.PortalLoggedInAsAdminIntressentregister;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class HjalpPeter {
	public static WebDriver driver;

	@Test


	public void f() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium 3.12.0\\Chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		DriverGetWebsite.OpenSatPortal(driver);
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
		LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.KristoferKlarinAdminUserNameSAT, UserCredentials.KristoferKlarinAdminPasswordSAT);
		
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath(PortalLoggedInAsAdmin.LoggaUt));

		
		IfStatements.IfCssSelctorIsNotVisibleThenFail(driver, PortalLoggedInAsAdminIntressentregister.IntressentregisterButton);
		
		
		
		/*
		PortalLoggedInAsAdminIntressentregister.IntressentregisterButton_CSS(driver).click();
		
		driver.findElement(By.cssSelector("#StakeholderGrid > div.fix-grid-scroll > table > thead > tr > th:nth-child(10) > a.k-header-column-menu > span")).click();
		
		Thread.sleep(1000);
	
		Actions builder = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("/html/body/div[7]/div/ul/li[4]"));
		builder.moveToElement(element).build().perform();
		
		driver.findElement(By.cssSelector("body > div.k-animation-container > div > ul > li.k-item.k-filter-item.k-state-default.k-last.k-state-border-left > div > ul > li > div > form > div > input:nth-child(3)")).sendKeys("minimalt konto");
		
		driver.findElement(By.cssSelector("body > div.k-animation-container > div > ul > li.k-item.k-filter-item.k-state-default.k-last.k-state-border-left > div > ul > li > div > form > div > div:nth-child(7) > button:nth-child(1)")).click();
		*/


	}
}
