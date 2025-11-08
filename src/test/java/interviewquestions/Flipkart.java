package interviewquestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) {
		       // 1. Launch browser window(Chrome)
				WebDriver driver = new ChromeDriver();

				// 2. Maximize the browser window
				driver.manage().window().maximize();

				// 3. Delete all the cookies
				driver.manage().deleteAllCookies();

				// 4. Enter URL and Launch the application
				// (https://parabank.parasoft.com/parabank/index.htm)
				driver.get("https://www.flipkart.com/");
				
				//click on search  window
				WebElement searchbox =driver.findElement(By.xpath("//input[@class='Pke_EE']"));
				searchbox.sendKeys("iphone15");
				searchbox.click();
			
				Actions mouseHover = new Actions(driver );
				
				
				
	}

}
