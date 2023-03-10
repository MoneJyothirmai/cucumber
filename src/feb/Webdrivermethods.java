package feb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivermethods {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//Mone Jyothirmai//Documents//chromedriver.exe");     
		  WebDriver  driver = new ChromeDriver();
		  driver.get("https://www.amazon.com");
		 String s= driver.getPageSource();                //getPageSource method
		 System.out.println(s);
		  String s1 = driver.getCurrentUrl();            //getCurrentUrl method
		  System.out.println(s1);
		  String s2 = driver.getTitle();                 //getTitle method
		  System.out.println(s2);
//		  driver.close();                               //close method for actively tab closing
          driver.quit();                                //quit method for closing entire browser
	}
}
