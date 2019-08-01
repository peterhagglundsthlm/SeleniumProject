package pageElementsSAT_EPM;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EPM_granskningElements {

	static By element = null;

	//GRANSKNING - KNAPPEN
	public static By Granskning(){

		//		By element = By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuReview.active > a");
		//		body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuReview > a
		By element = By.xpath("/html/body/div[3]/div[2]/div[2]/header/ul/li[3]/a");  
		return element;
	}

	//GRANSKNING - BEREDNINGSGRUPP
	public static By Granskning_Beredningsgrupp(){

		By element = By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[2]/div/div/ul/li[2]/a");
		//			//*[@id="contentBodyContainer"]
		//		("//*[@id=\"mainContentBody\"]/div/as	ide")
		//		//*[@id="mainContentBody"]/div/aside/section[2]
		return element;
	}



	// BYTA FLIK TILL GRANSKNINGSFORMULÄR
	public static WebElement ChangeTabGranskning (WebDriver driver) throws AWTException, InterruptedException, IOException {

		System.out.println("metod ChangeTabGranskning");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		System.out.println("Jag har bytt flik.");

		if (driver.getPageSource().contains("Spara")) {
			System.out.println("jag ser spara");
		}
		else {
			Assert.fail("Hittar inte spara-knappen");
			driverAndCommands.GetCurrentUrl.GetUrlAndPrintInConsole(driver);
		}
		Thread.sleep(2000);

		return null; 
	}
}