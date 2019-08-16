package reusableMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class CheckIfElementIsPresentOnPage {


	public static WebElement test(WebDriver driver, By By) {

		List<WebElement> ElementPresentList;
		int NumberOfElementPresent;

		ElementPresentList = driver.findElements(By);
		NumberOfElementPresent = ElementPresentList.size();	 

		if (NumberOfElementPresent !=0) {

		} else {

			Assert.fail();	

		}

		return null;




	}
}
