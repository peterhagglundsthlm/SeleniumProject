package reusableMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverWaitExpectedConditions {
	
	public static void WaitForElementToBeClickable(WebDriver driver, By By){

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By));	
	}

	public static void WaitForElementToBeVisible(WebDriver driver, By By){

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By));
	}









}
