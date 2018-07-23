package driverAndCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverWaitExpectedConditions {

	public static WebElement WebDriverWaitForExpectedXpathLocator(WebDriver driver, String XpathLocator){

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathLocator)));
		return null;
	}

	public static WebElement WebDriverWaitForExpectedIdLocator(WebDriver driver, String IdLocator){

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.id(IdLocator)));

		return null;
	}

	public static WebElement WebDriverWaitForExpectedNameLocator(WebDriver driver, String NameLocator){

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.name(NameLocator)));
		return null;
	}

	public static WebElement WebDriverWaitForExpectedLinktextLocator(WebDriver driver, String LinktextLocator){

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText(LinktextLocator)));
		return null;
	}
	
	public static WebElement WebDriverWaitForExpectedCssSelectorLocator(WebDriver driver, String LinktextLocator){

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(LinktextLocator)));
		return null;
	}

}
