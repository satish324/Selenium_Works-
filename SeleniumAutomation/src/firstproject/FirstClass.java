package firstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstClass {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		//System.out.println("Welcome to selenium Classes");
		System.setProperty("webdriver.chrome.driver", "C:\\Driverslocated\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Thread.sleep(5000);
		driver.get("https://www.google.com");

	}

}
