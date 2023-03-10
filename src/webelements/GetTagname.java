package webelements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTagname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//Mone Jyothirmai//Documents//chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
          driver.get("https://www.google.com");
		  WebElement e = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		   String tag = e.getTagName();
		   if(tag.equals("img"))
		   {
			System.out.println("It is an image");   
		   }
		   else
		   {
			   System.out.println("It is not the image");
		   }
	}

}
