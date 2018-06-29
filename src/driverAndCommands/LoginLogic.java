package driverAndCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageObjectsSAT.SAT_Home_Page_Not_Logged_In;

public class LoginLogic {
	
	public static WebElement InputUntilUsernameAndPasswordIsFilled(WebDriver driver, String AnyUsername, String AnyPassword){

		driver.findElement(By.id("Email")).sendKeys(AnyUsername);

		if (driver.getPageSource().contains(AnyUsername))
		{ 
			SAT_Home_Page_Not_Logged_In.EnterPassword(driver).sendKeys(AnyPassword);
		} 
		else {
			SAT_Home_Page_Not_Logged_In.EnterUserName(driver).clear();
			SAT_Home_Page_Not_Logged_In.EnterPassword(driver).clear();
			SAT_Home_Page_Not_Logged_In.EnterUserName(driver).sendKeys(AnyUsername);
			SAT_Home_Page_Not_Logged_In.EnterPassword(driver).sendKeys(AnyPassword);
		} 
		SAT_Home_Page_Not_Logged_In.SubmitUserNameAndPassword(driver).click();

		return null;

	}
}
