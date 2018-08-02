package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SAT_Home_Page_Not_Logged_In {
	private static WebElement element = null;
	
	
	public static final String LoginButtonChrome = "/html/body/div[5]/div[2]/div[2]/header/div/div[1]/div/a[1]"; {
	}
	public static WebElement LoginButtonChrome(WebDriver driver){

		element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/header/div/div[1]/div/a[1]"));
		return element;
	}

	public static final String EnterUserName = "Email"; {
	}
	public static WebElement EnterUserName(WebDriver driver){

		element = driver.findElement(By.id("Email"));
		return element;
	}

	public static WebElement EnterPassword(WebDriver Chrome){

		element = Chrome.findElement(By.id("Password"));
		return element;
	}
	
	public static WebElement SubmitUserNameAndPassword(WebDriver Chrome){

		element = Chrome.findElement(By.id("Submitter"));
		return element;

	}



}








