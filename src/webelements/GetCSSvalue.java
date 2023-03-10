package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSvalue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//Mone Jyothirmai//Documents//chromedriver.exe");     
		  WebDriver  driver = new ChromeDriver();
		  driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&"); 
          WebElement ele = driver.findElement(By.xpath("//input[@id='continue']"));
              String color = ele.getCssValue("background-color");
              System.out.println(color);
              if(color.equals("rgba(0, 0, 0, 0)"))                      //check rgba value from inspect, colors will be computing left part
              {
            	  System.out.println("It is light orange color");
              }
              else
              {
            	  System.out.println("It is different color");
              }
	}

}
