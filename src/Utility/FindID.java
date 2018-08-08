package Utility;


import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import driverAndCommands.LoginLogic;




public class FindID  {
	public static WebDriver driver;



	@Test
	public void f() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\\\Selenium 3.12.0\\\\Chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://testaprisma.vr.se/");

		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/header/div/div[1]/div/a[1]")).click();

		//LoginLogic.InputUntilUsernameAndPasswordIsFilled(driver, UserCredentials.jagtestarprismaSATuserName, UserCredentials.jagtestarprismaSATpassword);
		
		List<WebElement> objID = driver.findElements(By.tagName("input"));

		for (WebElement IdOnPage : objID) {

			String Ids = IdOnPage.getAttribute("id");

			System.out.println("ID = " + Ids);
			
			
			
		
		Thread.sleep(300);
		
		//driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuReview > a")).click();
		
		Set<Cookie> allcookies = driver.manage().getCookies();
		
		
		
		


/*
		}

		List<WebElement> objLinks = driver.findElements(By.tagName("a"));
		for (WebElement LinksOnPage : objLinks) {
			String Links = LinksOnPage.getAttribute("href");
			System.out.println("Detta är en länk = " + Links);

		}

		List<WebElement> objName = driver.findElements(By.xpath("//*[@name]"));
		for (WebElement NameOnPage : objName) {
			String Names = NameOnPage.getAttribute("name");
			System.out.println("Namn = " + Names);
		}
		

*/
		
		

}

	}
}





