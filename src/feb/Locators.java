package feb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Locators {
	public static void main(String[] args)
	{
		  System.setProperty("webdriver.chrome.driver", "C://Users//Mone Jyothirmai//Documents//chromedriver.exe");
	   	  WebDriver  driver = new ChromeDriver();
//         driver.get("file:///D:/Selenium%20vedios/test.html");
//        WebElement ele = driver.findElement(By.tagName("INPUT"));             //by tagname locator
//        ele.sendKeys("Mone");
//        WebElement ele = driver.findElement(By.name("xyz"));                  //by name locator
//        ele.click();
//        WebElement ele = driver.findElement(By.id("abc"));                    //by id locator
//        ele.sendKeys("Mone");
//        WebElement ele = driver.findElement(By.className("n1")); 
	   	  //by classname locator
//        ele.sendKeys("Mone");
//        WebElement ele = driver.findElement(By.linkText("amazon"));           //by linkText locator
//        ele.click();
//        WebElement ele = driver.findElement(By.partialLinkText("ama"));        //by PartiallinkText locator
//        ele.click();
//          driver.get("https://www.amazon.com/");
//        WebElement ele = driver.findElement(By.cssSelector("#twotabsearchtextbox"));             //by CSS Selector locator copying from webpage 
//        ele.sendKeys("Mone");
//          driver.get("file:///D:/Selenium%20vedios/test.html");
//        WebElement ele = driver.findElement(By.xpath("html//body//input[1]"));      //by absolute xpath locator  (tree structure) 
//       ele.sendKeys("Mone");
//	   	driver.get("https://www.amazon.com/");
//        WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));      //by relative xpath locator  (tree structure) 
//        ele.sendKeys("Mone");
//        driver.get("https://www.flipkart.com/");
//        WebElement ele = driver.findElement(By.xpath("//button[text()='Request OTP']"));      //by relative xpath locator  using text() function(tree structure) 
//        ele.click();
//        driver.get("https://www.flipkart.com/");
//        WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Request OTP')]"));      //by relative xpath locator  using contains,text() function(tree structure) 
//        ele.click();
//	       driver.get("file:///D:/Selenium%20vedios/table.html");                                        //by independent dependent xpath
//	   	   WebElement ele = driver.findElement(By.xpath("//td[text()='RCB']/../td[2]"));
//	   	   String s = ele.getText();
//         System.out.println(s);
	   	  //Real time example of 22k gold rate by using independent dependent xpath
//           driver.get("https://www.goodreturns.in/gold-rates/bangalore.html#Today+24+Carat+Gold+Rate+Per+Gram+in+Bangalore+%28INR%29");  //real time example                                       //by independent dependent xpath
//	   	   WebElement ele = driver.findElement(By.xpath("//td[text()='Feb 11, 2023']/../td[2]"));
//	       String s1 = driver.findElement(By.xpath("//td[text()='Feb 10, 2023']/../td[2]")).getText();
//	   	   String s = ele.getText();
//           System.out.println("Feb 11th,2023 - 22k gold rate = " +s);
//           System.out.println("Feb 10th,2023 - 22k gold rate = "+s1);
//           driver.get("https://www.goodreturns.in/gold-rates/bangalore.html#Today+24+Carat+Gold+Rate+Per+Gram+in+Bangalore+%28INR%29");  //real time example                                       //by independent dependent xpath
//	   	   WebElement ele = driver.findElement(By.xpath("//td[text()='Feb 11, 2023']/../following-sibling :: tr[2]/td[2]"));                    //xpath using sibling function
// 	       String s1 = driver.findElement(By.xpath("//td[text()='Feb 10, 2023']/../following-sibling :: tr[3]/td[3]")).getText();
//	   	   String s = ele.getText();
//           System.out.println("Feb 11th,2023 - 22k gold rate = " +s);
//           System.out.println("Feb 10th,2023 - 22k gold rate = "+s1);
           driver.get("https://www.goodreturns.in/gold-rates/bangalore.html#Today+24+Carat+Gold+Rate+Per+Gram+in+Bangalore+%28INR%29");  //real time example                                       //by independent dependent xpath
	   	   WebElement ele = driver.findElement(By.xpath("//td[text()='Feb 11, 2023']//ancestor :: table"));                    //xpath using ancestor function
	   	   String s = ele.getText();
           System.out.println("gold rate as per dates " +s);
	}

}
