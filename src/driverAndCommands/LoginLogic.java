package driverAndCommands;

import org.openqa.selenium.JavascriptExecutor;
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


	public static WebElement InputUserNameAndPassWordUsingJavaScript (WebDriver driver, String AnyUsername, String AnyPassword){

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].setAttribute('value', arguments[1])", SAT_Home_Page_Not_Logged_In.EnterUserName(driver), AnyUsername);
		jse.executeScript("arguments[0].setAttribute('value', arguments[1])", SAT_Home_Page_Not_Logged_In.EnterPassword(driver), AnyPassword);

		if (SAT_Home_Page_Not_Logged_In.EnterUserName(driver).getAttribute("value") != AnyUsername)  
		{
			jse.executeScript("arguments[0].setAttribute('value', arguments[1])", SAT_Home_Page_Not_Logged_In.EnterUserName(driver), AnyUsername);
		}
		if (SAT_Home_Page_Not_Logged_In.EnterPassword(driver).getAttribute("value") != AnyPassword);
		{
			jse.executeScript("arguments[0].setAttribute('value', arguments[1])", SAT_Home_Page_Not_Logged_In.EnterPassword(driver), AnyPassword);	
		}

		SAT_Home_Page_Not_Logged_In.SubmitUserNameAndPassword(driver).click();

		return null;
	}
}


