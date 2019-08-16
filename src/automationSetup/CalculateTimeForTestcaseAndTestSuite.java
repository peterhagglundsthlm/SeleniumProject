package automationSetup;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testng.ITestResult;

public class CalculateTimeForTestcaseAndTestSuite {

	public static WebElement StartDateAndTimeSuitePrint() {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println();
		System.out.println("Testsuiten startade " + dateFormat.format(date));
		System.out.println();

		return null;
	}

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

	public static WebElement EndTimeTest(double durationTest, double startTimeTest, String testCaseName) {

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

		return null;
	}


}