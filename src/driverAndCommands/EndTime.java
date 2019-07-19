package driverAndCommands;


import org.openqa.selenium.WebElement;


public class EndTime {
	
	
	public static WebElement EndTimeSuite(long durationSuite, long startTimeSuite) {

		durationSuite = System.currentTimeMillis() - startTimeSuite;
		float sekunder = durationSuite/1000;
		float minuter = sekunder/60;
		System.out.println("Denna testsuite tog " + minuter + " minuter att genomföra" );
		return null;
	}
}