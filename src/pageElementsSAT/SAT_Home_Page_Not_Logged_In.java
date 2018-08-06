package pageElementsSAT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SAT_Home_Page_Not_Logged_In {
	
	private static WebElement element = null;
	
	
	//LOGGA IN KNAPPEN PÅ STARTSIDAN
	public static final String LoginButtonChrome = "/html/body/div[5]/div[2]/div[2]/header/div/div[1]/div/a[1]"; {
	}
	public static WebElement LoginButtonChrome(WebDriver driver){

		element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/header/div/div[1]/div/a[1]"));
		return element;
	}

	//FÄLTET DÄR MAN SKRIVER IN EMAIL NÄR MAN LOGGAR IN
	public static final String EnterUserName = "Email"; {	
	}
	public static WebElement EnterUserName(WebDriver driver){

		element = driver.findElement(By.id("Email"));
		return element;
	}

	//FÄLTET DÄR MAN SKRIVER IN LÖSENORD NÄR MAN LOGGAR IN
	public static final String EnterPassword = "Password"; {	
	}
	public static WebElement EnterPassword(WebDriver driver){
		
		element = driver.findElement(By.id("Password"));
		return element;
	}
	
	//LOGGA IN KNAPPEN SOM FINNS I MODALEN DÄR MAN SKRIVER EMAIL OCH LÖSENORD.
	public static final String SubmitUserNameAndPassword = "Submitter"; {	
	}
	public static WebElement SubmitUserNameAndPassword(WebDriver driver){

		element = driver.findElement(By.id("Submitter"));
		return element;
	}
	
	//KNAPP FÖR ATT ÄNDRA SPRÅKET TILL ENGELSKA
	public static final String InEnglishButton = "body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(1) > a"; {	
	}
	public static WebElement InEnglishButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(1) > a"));
		return element;
	}
	
	//KNAPP FÖR ATT ÄNDRA SPRÅKET TILL SVENSKA
	public static final String PåSvenskaButton = "body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(1) > a"; {	
	}
	public static WebElement PåSvenskaButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(1) > a"));
		return element;
	}
	
	//KNAPP FÖR ATT ÖPPNA BEHANDLING AV PERSONUPPGIFTER
	public static final String BehandlingAvPersonuppgifterButton = "#processingofpersonaldata"; {	
	}
	public static WebElement BehandlingAvPersonuppgifterButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("#processingofpersonaldata"));
		return element;
	}
	
	//KNAPP FÖR ATT ÖPPNA ANVÄNDARSTÖDET (HJÄLP)
	public static final String HjälpButton = "body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(2) > a"; {	
	}
	public static WebElement HjälpButton(WebDriver driver){

		element = driver.findElement(By.cssSelector("body > div.page-container > div.container > div.row.header-row > div > ul > li:nth-child(2) > a"));
		return element;
	}



}








