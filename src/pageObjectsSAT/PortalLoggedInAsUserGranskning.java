package pageObjectsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsUserGranskning {
	private static WebElement element = null;

	//GRANSKNING - KNAPPEN
	public static final String GranskningButton_CSS = "body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuReview"; {
	}
	public static WebElement GranskningButton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuReview"));
		return element;
	}

	//GRANSKNING - GRANSKNING
	public static final String Granskning_Granskning_Xpath = "//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[1]/a"; {
	}
	public static WebElement Granskning_Granskning_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[1]/a"));
		return element;
	}

	//GRANSKNING - BETALNINGSINFORMATION
	public static final String GranskningBetalningsinformation_Xpath = "//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[2]/a"; {
	}
	public static WebElement GranskningBetalningsinformation_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[2]/a"));
		return element;
	}

	//GRANSKNING - ARVODEN
	public static final String GranskningArvoden_Xpath = "//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[3]/a"; {
	}
	public static WebElement GranskningArvoden_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[3]/a"));
		return element;
	}





}
