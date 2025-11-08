package interviewquestions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Practice {

	public static void main(String[] args) {

		// Launch Driver
		WebDriver driver = new ChromeDriver();
		
		// delete all cookies
		driver.manage().deleteAllCookies();
		
		// maximize the window
		driver.manage().window().maximize();
		
		// launch url
		driver.get("https://www.flipkart.com/");
		
		// compare tile
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		
		Assert.assertEquals( expectedTitle, expectedTitle);
		
		//change url on same tab
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().refresh();
		
		// get window handle id
		String windowHandleID = driver.getWindowHandle();
		System.out.println(windowHandleID);
		
		//open new tab in same window
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.in/");
		
		
		driver.switchTo().window(windowHandleID);
		
		//open new window in browser
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.in/");
		
		driver.quit();
		
	
	}

}
