package driverAndCommands;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

public class EndTimeSuiteAndTest {

	public static WebElement EndTimeSuite(double durationSuite, double startTimeSuite) {

		durationSuite = System.currentTimeMillis() - startTimeSuite;
		double inputSekunder = durationSuite/1000; double inputminuter = inputSekunder/60;

		BigDecimal sekund = new BigDecimal
				(inputSekunder).setScale(2, RoundingMode.HALF_UP);
		
		BigDecimal minut = new BigDecimal
				(inputminuter).setScale(2, RoundingMode.HALF_UP);
		
		double sekunder = sekund.doubleValue();
		double minuter = minut.doubleValue();

		System.out.println();
		System.out.println ("Denna testsuite tog " + sekunder + " sekunder att genomföra vilket motsvarar ca " + minuter + " minuter");

		return null;
	}

	public static void EndTimeTest(double durationTest, double startTimeTest, String testCaseName) {
		
		durationTest = System.currentTimeMillis() - startTimeTest;
		double inputSekunder = durationTest/1000;
		double inputminuter = inputSekunder/60;

		BigDecimal sekund = new BigDecimal
				(inputSekunder).setScale(2, RoundingMode.HALF_UP);
		
		BigDecimal minut = new BigDecimal
				(inputminuter).setScale(2, RoundingMode.HALF_UP);
		
		double minuter = minut.doubleValue();
		double sekunder = sekund.doubleValue();
		
		System.out.println("Testfallet " + testCaseName + " tog " + sekunder + " sekunder att genomföra vilket motsvarar ca " + minuter + " minuter");

		
	}
}