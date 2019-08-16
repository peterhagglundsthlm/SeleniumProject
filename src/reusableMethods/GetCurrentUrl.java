package reusableMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetCurrentUrl {

	public static WebElement GetUrlAndPrintInConsole(WebDriver driver) {

		String CurrentUrl = driver.getCurrentUrl();
		System.out.println
		("Nuvarande url är " + CurrentUrl);
		
		return null;
	} 
}

