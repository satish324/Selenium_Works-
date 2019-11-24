package firstproject;

import java.awt.color.ProfileDataException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Driverslocated\\geckodriver.exe");
      ProfilesIni pr=new ProfilesIni();
      FirefoxProfile fp=pr.getProfile("onlineQA");
      FirefoxDriver driver=new FirefoxDriver(fp);
      driver.get("http://www.spicejet.com");
      List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@text='checkbox']"));
      for(int i=0;i<checkboxes.size();i++)
      {
    	  System.out.println(checkboxes.get(i).getAttribute("names"));
      }
	}

	
}
