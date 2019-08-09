package driverAndCommands;

import java.io.File;
import java.util.List;
import java.util.Scanner;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;

public class TestNGXMLTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		List<String> suites = Lists.newArrayList();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter path of the XML-file you wish to run: ");
		System.out.flush();
		String filename = scanner.nextLine();
		File file = new File(filename);
		
		suites.add(filename);
		testng.setTestSuites(suites);
		testng.run();
	}

}


