package driverAndCommands;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IfStatements {

	@Test
	public static void IfCssSelctorIsNotVisibleThenFail(WebDriver driver, String CssSelectorOnPage) {


		if (driver.findElements(By.cssSelector(CssSelectorOnPage)).size() != 0)

		{ 
			System.out.println("Elementet " + CssSelectorOnPage + " hittades. Testfallet fortsätter");

		} else {

			System.out.println("Elementet " + CssSelectorOnPage + " kunde inte hittas. Testfall abvryts");
			Assert.fail();

		}

	}

	@Test
	public static void IfXpathIsNotVisibleThenFail(WebDriver driver, String XpathOnPage) {


		if (driver.findElements(By.xpath(XpathOnPage)).size() != 0) 
		{ 

			System.out.println("Elementet " + XpathOnPage + " hittades. Testfallet fortsätter");

		} else {

			System.out.println("Elementet " + XpathOnPage + " kunde inte hittas. Testfall abvryts");
			Assert.fail();

		}

	}
	@Test
	public static void IfIDIsNotVisibleThenFail(WebDriver driver, String IDonPage) {


		if (driver.findElements(By.id(IDonPage)).size() != 0)
		{ 
			
			System.out.println("Elementet " + IDonPage + " hittades. Testfallet fortsätter");

		} else {

			System.out.println("Elementet " + IDonPage + " kunde inte hittas. Testfall abvryts");
			Assert.fail();

		}
	}

	@Test
	public static void IfNameIsNotVisibleThenFail(WebDriver driver, String NameOnPage) {


		if (driver.findElements(By.name(NameOnPage)).size() !=0)
		{ 
			
			System.out.println("Elementet " + NameOnPage + " hittades. Testfallet fortsätter");

		} else {

			System.out.println("Elementet " + NameOnPage + " kunde inte hittas. Testfall abvryts");
			Assert.fail();

		}
	}

	@Test
	public static void IfLinkTextIsNotVisibleThenFail(WebDriver driver, String LinkTextOnPage) {


		if (driver.findElements(By.linkText(LinkTextOnPage)).size() !=0)
		{ 
			
			System.out.println("Elementet " + LinkTextOnPage + " hittades. Testfallet fortsätter");

		} else {

			System.out.println("Elementet " + LinkTextOnPage + " kunde inte hittas. Testfall abvryts");
			Assert.fail();
		}




	}
}