package driverAndCommands;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.WebElement;

public class StartDateAndTimeSuite {


	public static WebElement StartDateAndTimeSuitePrint() {

		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println("Testsuiten startade " + dateFormat.format(date));
		return null;
	}
}
