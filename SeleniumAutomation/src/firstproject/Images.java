package firstproject;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Images {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Driverslocated\\geckodriver.exe");
		ProfilesIni pr = new ProfilesIni();
		FirefoxProfile fp =pr.getProfile("onlineQA");
		FirefoxDriver driver = new FirefoxDriver(fp);
		driver.get("https://www.flipkart.com");
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("no of images are" + " " + images.size());
		
		
	}

}
