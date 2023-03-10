package feb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchbrowser {

	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver", "C://Users//Mone Jyothirmai//Documents//chromedriver.exe");     //chromedriver
		  WebDriver  driver = new ChromeDriver();       //Runtime polymorphism
//		  System.setProperty("webdriver.edge.driver", "C://Users//Mone Jyothirmai//Documents//msedgedriver.exe");      //microsoftedge
//		  WebDriver  driver = new EdgeDriver();
//		  System.setProperty("webdriver.gecko.driver", "C://Users//Mone Jyothirmai//Documents//geckodriver.exe");     //Firefox
//		  WebDriver  driver = new FirefoxDriver();
		  driver.get("https://www.amazon.com");
		  driver.manage().window().maximize();
		  
	}

}
