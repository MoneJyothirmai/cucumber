package webelements;



import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//Mone Jyothirmai//Documents//chromedriver.exe");     
		  WebDriver  driver = new ChromeDriver();
		  driver.get("https://www.facebook.com"); 
		           WebElement ele = driver.findElement(By.xpath("//input[@name='email']"));
		         Point p = ele.getLocation();
		         System.out.println(p);
		     int x = p.getX();
		     int y = p.getY();
		        System.out.println(x+" "+y);
	}

}
