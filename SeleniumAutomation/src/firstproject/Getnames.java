package firstproject;

import java.util.list;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.firefox.internal.ProfilesIni;

public class {

	public static void main(String[] args) {
		// open browser navigate to page
		System.setProperty("webdriver.gecko.driver", "C:\\Driverslocated\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
	}

}
