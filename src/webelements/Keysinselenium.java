package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keysinselenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Users//Mone Jyothirmai//Documents//chromedriver.exe");     
		  WebDriver  driver = new ChromeDriver();
		  driver.get("file:///D:/Selenium%20vedios/test.html"); 
		  WebElement ele = driver.findElement(By.xpath("//input"));
	       ele.sendKeys("Hello");
	       Thread.sleep(3000);
	       ele.sendKeys(Keys.CONTROL+"a");
	       Thread.sleep(2000);
	   //    ele.sendKeys(Keys.BACK_SPACE);
	         ele.sendKeys(Keys.DELETE);
	}

}
