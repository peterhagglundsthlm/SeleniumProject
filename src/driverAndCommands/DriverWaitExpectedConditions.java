package driverAndCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverWaitExpectedConditions {

	public static WebElement WaitForElementToBeClickable(WebDriver driver, By By){

		WebDriverWait wait = new WebDriverWait(driver, 40);
	    WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By));
	    return element;
	}
	
	public static WebElement WaitForElementToBeVisible(WebDriver driver, By By){

		WebDriverWait wait = new WebDriverWait(driver, 40);
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By));
	    return element;
	}
	

	
	
	




}
