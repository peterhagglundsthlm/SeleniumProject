package Utility;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import driverAndCommands.DriverWaitExpectedConditions;
import driverAndCommands.LoginLogic;
import pageElementsSAT.PortalLoggedInAsUserAnsökningarOchBidrag;
import pageElementsSAT.PortalLoggedInAsUserGranskning;
import pageElementsSAT.SAT_Home_Page_Not_Logged_In;



public class CookieTest {
	Cookie AUTH;
	public WebDriver driver;

	@Test
	public void LoggaIn() {

		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://testaprisma.vr.se/UniqueKeyRow");

		Cookie ck = new Cookie("[ASP.NET_SessionId", "5qfpappihtubwi0g3ny1pgcq");
		driver.manage().addCookie(ck);
		
		/*
		SAT_Home_Page_Not_Logged_In.LoginButtonChrome(driver).click();
	
		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(SAT_Home_Page_Not_Logged_In.EnterUserName));

		LoginLogic.InputUserNameAndPassWordUsingJavaScript(driver, "jagtestarprisma@gmail.com", "Vr1234");

		PortalLoggedInAsUserAnsökningarOchBidrag.AnsökningarOchBidragButton(driver).click();
		*/
	}

	@Test (dependsOnMethods={"LoggaIn"})
	public void Cookies() {

		Set<Cookie> allcookies = driver.manage().getCookies();
		System.out.println(allcookies);

	}

	@Test (dependsOnMethods={"Cookies"})
	public void Logout() {

		driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > div > a")).click();

	}

	@Test (dependsOnMethods={"Logout"})
	public void LoginAsDifferentUser() {

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.xpath("/html/body/div[5]/div[2]/div[2]/header/div/div[1]/div/a[1]"));

		driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/header/div/div[1]/div/a[1]")).click();

		DriverWaitExpectedConditions.WaitForElementToBeClickable(driver, By.id(SAT_Home_Page_Not_Logged_In.EnterUserName));

		LoginLogic.InputUserNameAndPassWordUsingJavaScript(driver, "sventestprod@gmail.com", "Vr1234");

		driver.manage().addCookie(AUTH);
		
		System.out.print(AUTH);
		
		driver.get("https://testaprisma.vr.se/Review");
		
	}
}
