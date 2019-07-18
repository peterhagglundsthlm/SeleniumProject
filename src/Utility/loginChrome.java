package Utility;

import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		LogManager.getLogManager().reset();
		ChromeOptions ChromeOption = new ChromeOptions();
		ChromeOption.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(ChromeOption);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://testaprisma.vr.se/");

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > div > div:nth-child(1) > div > a.btn.btn-discreet.btn-login-left.show-modal")));
		driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > div > div:nth-child(1) > div > a.btn.btn-discreet.btn-login-left.show-modal")).click();

		WebDriverWait wait2 = new WebDriverWait(driver, 40);
		wait2.until(ExpectedConditions.elementToBeClickable(By.id("Email")));

		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", driver.findElement(By.id("Email")), "testaplatina6@gmail.com");
		((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value', arguments[1])", driver.findElement(By.id("Password")), "TestaPlatina1");

		WebDriverWait wait3 = new WebDriverWait(driver, 40);
		wait3.until(ExpectedConditions.elementToBeClickable(By.id("Submitter")));
		driver.findElement(By.id("Submitter")).click();
	}

}
