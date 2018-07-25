package driverAndCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class LoginLogic {

	public static WebElement InputUntilUsernameAndPasswordIsFilled(WebDriver driver, String AnyUsername, String AnyPassword){

		SAT_Home_Page_Not_Logged_In.EnterUserName(driver).sendKeys(AnyUsername);
		
		if  (SAT_Home_Page_Not_Logged_In.EnterUserName(driver).getAttribute("value") == AnyUsername)                       
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
