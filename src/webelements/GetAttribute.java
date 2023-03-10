package webelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//Mone Jyothirmai//Documents//chromedriver.exe");     
		  WebDriver  driver = new ChromeDriver();
		  driver.get("https://www.amazon.com"); 
		  List<WebElement> links = driver.findElements(By.xpath("//a"));
		  for(int i=0; i<links.size();i++)
		  {
			  WebElement we = links.get(i);
			  String url = we.getAttribute("href");
			  System.out.println(url);
		  }
	}

}
