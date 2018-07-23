package Utility;
/*
package testCasesSAT;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utility.UserCredentials;
import driverAndCommands.LoginLogic;
import pageObjectsSAT.PortalLoggedInAsAdminMinProfil;
import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;


public class FindID  {
	public static WebDriver driver;



	@Test
	public void f() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium 3.12.0\\\\Chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://testaprisma.vr.se/");

		//driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/header/div/div[1]/div/a[1]")).click();

		//LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.jagtestarprismaSATuserName, UserCredentials.jagtestarprismaSATpassword);
		

		Thread.sleep(300);
		
		//driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuReview > a")).click();
		
		

		List<WebElement> objID = driver.findElements(By.xpath("//*[@id]"));

		for (WebElement IdOnPage : objID) {

			String Ids = IdOnPage.getAttribute("id");

			System.out.println("ID = " + Ids);

		}

		List<WebElement> objLinks = driver.findElements(By.tagName("a"));
		for (WebElement LinksOnPage : objLinks) {
			String Links = LinksOnPage.getAttribute("href");
			System.out.println("Detta är en länk = " + Links);

		}

		List<WebElement> objName = driver.findElements(By.xpath("//*[@name]"));
		for (WebElement NameOnPage : objName) {
			String Links = NameOnPage.getAttribute("name");
			System.out.println("Namn = " + Links);
		}
		
		List<WebElement> objName2 = driver.findElements(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.menuStakeholder > a"));
		for (WebElement NameOnPage : objName2) {
			String Links = NameOnPage.getAttribute("href");
			System.out.println("Namn = " + Links);
		}
		
		
		
		
		
	




		

		



	







}

}
*/




