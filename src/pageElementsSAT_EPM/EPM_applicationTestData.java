package pageElementsSAT_EPM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageElementsSAT.SAT_Home_Page_Not_Logged_In;

public class EPM_applicationTestData {
	private static WebElement element = null;

	//Text med radbrytningar
	public static final String TextMedRadbrytningar = "Git är ett verktyg för versionshantering. "
			+ "Det gör det möjligt för flera personer att arbeta på samma projekt. Git går att köra genom gränssnittet, genom Eclipse eller genom command promt. "
			+ "Vi har valt att använda command promt eftersom att det var mest stabilt och mycket enklare än Eclipse egen hantering för Git. "
			+ "Mer information om att arbeta med Git kommer senare i dokumentet."
			+ "Eclipse är den utvecklingsmiljö som vi har valt att använda för detta projekt. "
			+ "Det finns ett flertal andra alternativ men vi valde att arbeta med Eclipse eftersom att det är den vanligaste utvecklingsmiljön som används tillsammans med Selenium. "
			+ "Det finns mycket information och tips angående Eclipse och Selenium på Google." 
			+ "En detaljerad guide för att installera Eclipse och Selenium finns på: "
			+ "https://www.guru99.com/installing-selenium-webdriver.html" 
			+ Keys.ENTER + "Git är ett verktyg för versionshantering. Det gör det möjligt för flera personer att arbeta på samma projekt. "
			+ "Git går att köra genom gränssnittet, genom Eclipse eller genom command promt. "
			+ "Vi har valt att använda command promt eftersom att det var mest stabilt och mycket enklare än Eclipse egen hantering för Git. "
			+ "Mer information om att arbeta med Git kommer senare i dokumentet." 
			+ Keys.ENTER + "En detaljerad guide för att installera Eclipse och Selenium finns på: www.guru99.com/installing-selenium-webdriver.html"
			+ Keys.ENTER + Keys.ENTER + "Nu är texten slut."; 
	
	/*public static WebElement InmatningTextJavascript (WebDriver driver){

		WebDriverWait wait3a = new WebDriverWait(driver, 10);
		wait3a.until(ExpectedConditions.elementToBeClickable(By.xpath(("//*[@id=\"tinymce\"]"))));

		driver.switchTo().frame(0);
		((JavascriptExecutor) driver).executeScript	
		("arguments[0].setAttribute('value', arguments[1])",driver.findElement(By.xpath(("//*[@id=\"tinymce\"]"))), "Test.");

		System.out.println("Text med javascript - check.");
		return null;
	}
	*/	

	// Byta teckensnitt och storlek
	public static void BytaTeckensnittOchStorlek (WebDriver driver){

		WebDriverWait wait_s3a = new WebDriverWait (driver, 10);
		wait_s3a.until(ExpectedConditions.elementToBeClickable(By.id("mceu_16-open")));

		// byter till Times New Roman
		driver.findElement(By.id("mceu_16-open")).click();
		driver.findElement(By.id("mceu_164-text")).click();
		// byter till 12 pt
		driver.findElement(By.id("mceu_17-open")).click();
		driver.findElement(By.id("mceu_174-text")).click();
	}	
}
