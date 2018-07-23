package pageObjectsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class PortalLoggedInAsAdminBeredningsgrupper {
	private static WebElement element = null;


	//BEREDNINGSGRUPPERKNAPPEN
	public static final String BeredningsgrupperButton_CSS = "body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuReview > a"; {
	}
	public static WebElement BeredningsgrupperButton_CSS(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > header > ul > li.mainMenuReview > a"));
		return element;
	}

	//BEREDNINGSGRUPPER - ADMINISTRERA BEREDNINGSGRUPPER
	public static final String BeredningsgrupperButton_AdministreraBeredningsgrupper_Xpath = "//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[1]/a"; {
	}
	public static WebElement BeredningsgrupperButton_AdministreraBeredningsgrupper_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[1]/a"));
		return element;
	}

	//BEREDNINGSGRUPPER - BEREDNINGSGRUPPER
	public static final String BeredningsgrupperButton_Beredningsgrupper_Xpath = "//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[2]/a"; {
	}
	public static WebElement BeredningsgrupperButton_Beredningsgrupper_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[2]/a"));
		return element;
	}

	//BEREDNINGSGRUPPER - ARVODESHANTERING
	public static final String BeredningsgrupperButton_Arvodeshantering_Xpath = "//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[3]/a"; {
	}
	public static WebElement BeredningsgrupperButton_Arvodeshantering_Xpath(WebDriver driver){

		element = driver.findElement(By.xpath("//*[@id=\"mainContentBody\"]/div/aside/section[1]/div/div/ul/li[3]/a"));
		return element;
	}


}

